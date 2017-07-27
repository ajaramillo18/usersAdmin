package usersadmin

/**
 * This service class has the logic to get the user data from the database
 * using some filters
 * @author Armando Jaramillo Magallon
 */
class UserDAOService {

		
	/**
	 * retrieves the list of users under 18 years old, using very basic criteria
	 * @author Armando Jaramillo Magallon
	 */
	def getUnderAgeUsers()
	{
		//with dynamic finders
		//User.findAllByAgeLessThan(18)
		
		//with criteria
		def crit = User.createCriteria()		
		crit.list {
			lt("age", 18)
			maxResults(10)
			order("age", "asc")
		}
	}
	
	/**
	 * retrieves the list of users over 18 years old, using very basic criteria
	 * @author Armando Jaramillo Magallon
	 */
	def getAdultUsers()
	{
		//with dynamic finders
		//User.findAllByAgeGreaterThan(18)
		
		//with criteria
		def crit = User.createCriteria()
		crit.list {
			gt("age", 18)
			maxResults(10)
			order("age", "asc")
		}
		
	}
	
	/**
	 * populate the user table with records of users under 18 years old
	 * @author Armando Jaramillo Magallon
	 */
	def prePopulateMinorUsers()
	{
		//checks if there are users already 
		if(User.findAllByAgeLessThan(18).isEmpty())
		{
			1.upto(3) {
				
				User newUser = new User()
				newUser.nombre = "User${it}"
				newUser.password = "33333${it}"
				newUser.age = Math.abs(new Random().nextInt() % 17) + 1
				newUser.save()
			 }

		}
	}
	
	/**
	 * populate the user table with records of users over 18 years old
	 * @author Armando Jaramillo Magallon
	 */
	def prePopulateMajorUsers()
	{
		//checks if there are users already
		if(User.findAllByAgeGreaterThan(18).isEmpty())
		{
			4.upto(7) {
				
				User newUser = new User()
				newUser.nombre = "User${it}"
				newUser.password = "4444${it}"
				newUser.age = Math.abs(new Random().nextInt() % 90) + 18
				newUser.save()
			 }

		}
	}
}

