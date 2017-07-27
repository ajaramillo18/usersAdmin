package usersadmin



class PopulateUsersFilters {

    def filters = {
        majorUsers(controller:'example', action:'major') {
            before = {
				
				println "populating major users"
				UserDAOService userDAO = new UserDAOService()
				
				userDAO.prePopulateMajorUsers()
			
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
		
		majorUsers(controller:'example', action:'minor') {
			before = {
				println "populating minor users"
				UserDAOService userDAO = new UserDAOService()
				
				userDAO.prePopulateMinorUsers()
			
			}
			after = { Map model ->

			}
			afterView = { Exception e ->

			}
		}
    }
}
