package usersadmin

/**
 * This controller class is used to control the flow of the filters of User data
 * @author Armando Jaramillo Magallon
 */
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
