package UserService.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;





@Document(collection = "userdb")
@Builder

public class Users {
	private String userType;
	@Id
	private BigInteger userId;
	private String userName;
	private String userPassword;
	private BigInteger userPhone;
	private String userEmail;
 

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public BigInteger getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(BigInteger userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * Unparameterized Constructor of User
	 */
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized Constructors of Users
	 */
	public Users(String userType, BigInteger userId, String userName, String userPassword, BigInteger userPhone,
			String userEmail) {
		super();
		this.userType = userType;
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}
 
	
	
}
