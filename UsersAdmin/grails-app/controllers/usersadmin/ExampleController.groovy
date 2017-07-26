package usersadmin

/**
 * This controller class is used to control the flow of the filters of User data
 * @author Armando Jaramillo Magallon
 */
class ExampleController {

    def index() { }
	
	def userDAOService
	
	//this action is for showing the under age users, children and teens
	def minor = 
	{
		List userList = null ;
		
		// the service class is used to retrieve underage users
		userList = userDAOService.getUnderAgeUsers()
		
		// the list userInstanceList is sent to the view
		[userInstanceList:userList]
		
		//thanks to convention over configuration magic, it goes automatically to minor.gsp
	}

	//this action is for showing the adults users, driving users that´s it
	def major =
	{
		List userList = null ;		
		
		// the service class is used to retrieve adults users
		userList = userDAOService.getAdultUsers()
		
		// the list userInstanceList is sent to the view
		[userInstanceList:userList]
		
		//thanks to convention over configuration magic, it goes automatically to major.gsp
	}
	
	
}
