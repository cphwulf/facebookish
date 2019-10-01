package facebookish;
import java.util.ArrayList;
public class UserFactory {
	public User makeNewUser(ArrayList<String> paramString) {
		User newUser = null;
		String userType = paramString.get(0);
		if (userType.equals("C")){
			return new CommonUser(paramString.get(1),paramString.get(2));
		} else if (userType.equals("E")){
			return new Editor(paramString.get(1),paramString.get(2));
		} else if (userType.equals("A")){
			return new CommonUser(paramString.get(1),paramString.get(2));
		}else {
			return newUser;
		}
	}
	
}
