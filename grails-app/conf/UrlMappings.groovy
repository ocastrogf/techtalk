class UrlMappings {

	static mappings = {
		'/userfrontend'{
			controller ='frontend'
			namespace ='users'
			action ='deleteSomething'
		}
		
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
