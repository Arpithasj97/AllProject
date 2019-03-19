
public class Customer {
private String userId;
private String pwd;
public String getuserId() {
	return userId;
}
public void setuserId(String userId) {
	this.userId=userId;
	
}
public String getpwd() {
	return pwd;
}
public void setpwd(String pwd) {
	this.pwd=pwd;
}
public String toString() {
	return "userId"+userId+"pwd"+pwd;
}
}
