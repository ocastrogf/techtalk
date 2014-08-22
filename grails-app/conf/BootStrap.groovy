import com.techtalk.User
import com.techtalk.UserRole
class BootStrap {

    def init = { servletContext ->
		def roleM=new UserRole(name: 'Admin')
		def user=new User(username:'oliver',password:'12345',role:roleM)
		roleM.save()
		user.save()
    }
    def destroy = {
		//User.where { }.deleteAll()
    }
}
