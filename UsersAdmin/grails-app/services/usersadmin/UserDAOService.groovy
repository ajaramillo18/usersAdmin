package usersadmin

class UserDAOService {

		
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

