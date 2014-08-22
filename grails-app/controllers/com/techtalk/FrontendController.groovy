package com.techtalk

class FrontendController {
	//static allowedMethods = [putsomething:'POST']
	//static defaultAction ='deleteSomething'
	static namespace='users'
    def index() {
		//render(view: 'doSomething')
	}
	
	def doSomething(){}
	
	def putsomething(){}
	
	def deleteSomething(){
		//forward action: "index"
	}
	
}
