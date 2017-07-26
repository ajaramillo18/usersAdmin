package usersadmin

class ExampleController {

    def index() { }
	
	def userDAOService
	
	def minor = 
	{
		List userList = null ;
		
		userList = userDAOService.getUnderAgeUsers()
		[userInstanceList:userList]
	}

	def major =
	{
		List userList = null ;		
		
		userList = userDAOService.getAdultUsers()
		[userInstanceList:userList]
	}
	
	
}
