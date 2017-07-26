package usersadmin

/**
 * This domain class stores basic user data, it is using H2 in memory database for now
 * I use scaffolding lovely feature for populate the table each time  
 * http://localhost:8080/UsersAdmin/user/list
 * @author Armando Jaramillo Magallon

 */
class User {

	String id
	String nombre
	String password
	int age
	Date dateCreated
    static constraints = {
		id(size:3..10, unique: true)
		password(size: 5..8)
		age(nullable:true)
    }
}
