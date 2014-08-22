package com.techtalk

class User {
	String password
	String username
    static constraints = {
		password (blank: false)
		username blank: false
    }
}
