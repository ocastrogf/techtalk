package com.handler
import com.techtalk.*
class UserController {

    def index() { 
		def p=User.get(1)
		render (view:'otherindex',model: [user:p])
	}
}
