package usersadmin

class UserController {

	def scaffold = true
	
  
	def index = {
		redirect(action: list)
	}
	def home = {
		render "<h1>Hello there!</h1>"
	}
}
