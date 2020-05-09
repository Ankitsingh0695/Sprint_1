package login;
public class Manager {
	private String userName="user";
	private String password="user";
	private String answer;
	
	public Manager(String userName, String password, String answer) {
		super();
		this.userName = userName;
		this.password = password;
		this.answer = answer;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
