package usersadmin

class User {

	String id
	String nombre
	String password
	int age
	Date dateCreated
    static constraints = {
		id(size:3..20, unique: true)
		password(size: 5..8)
		age(nullable:true)
    }
}
