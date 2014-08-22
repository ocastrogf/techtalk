package com.techtalk

class User {
	String firstname
	String username
	UserRole role
    static constraints = {
		firstname (blank: false)
		username blank: false
		role nullable:true
    }
}
