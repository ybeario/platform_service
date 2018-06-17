package client.api.command;
/**
 * 
 * @date 2018年2月3日下午1:29:28
 *
 * @description  注册区块账户
 */
public class UserRegisterCommand {
	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
