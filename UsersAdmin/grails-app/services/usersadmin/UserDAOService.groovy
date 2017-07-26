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
}

