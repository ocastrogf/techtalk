import com.techtalk.User
class BootStrap {

    def init = { servletContext ->
		def user=new User(username:'oliver',password:'12345')
    }
    def destroy = {
    }
}
