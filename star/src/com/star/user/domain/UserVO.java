package com.star.user.domain;

public class UserVO {
	private Long userNumber;
	private String userId;
	private String userPassword;
	private String userName;
	private String userAddress1;
	private String userAddress2;
	private String userAddress3;
	private String userPhonenumber;
	private int userAge;
	private String userGender;
	private String userEmail;
	private String userStatus;
	private String userTitle;
	private String userContent;
	private int userStar;
	
	public UserVO() {;}

	public final Long getUserNumber() {
		return userNumber;
	}

	public final void setUserNumber(Long userNumber) {
		this.userNumber = userNumber;
	}

	public final String getUserId() {
		return userId;
	}

	public final void setUserId(String userId) {
		this.userId = userId;
	}

	public final String getUserPassword() {
		return userPassword;
	}

	public final void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public final String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) {
		this.userName = userName;
	}

	public final String getUserAddress1() {
		return userAddress1;
	}

	public final void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}

	public final String getUserAddress2() {
		return userAddress2;
	}

	public final void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}

	public final String getUserAddress3() {
		return userAddress3;
	}

	public final void setUserAddress3(String userAddress3) {
		this.userAddress3 = userAddress3;
	}

	public final String getUserPhonenumber() {
		return userPhonenumber;
	}

	public final void setUserPhonenumber(String userPhonenumber) {
		this.userPhonenumber = userPhonenumber;
	}

	public final int getUserAge() {
		return userAge;
	}

	public final void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public final String getUserGender() {
		return userGender;
	}

	public final void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public final String getUserEmail() {
		return userEmail;
	}

	public final void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public final String getUserStatus() {
		return userStatus;
	}

	public final void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public final String getUserTitle() {
		return userTitle;
	}

	public final void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public final String getUserContent() {
		return userContent;
	}

	public final void setUserContent(String userContent) {
		this.userContent = userContent;
	}

	public final int getUserStar() {
		return userStar;
	}

	public final void setUserStar(int userStar) {
		this.userStar = userStar;
	}

	@Override
	public String toString() {
		return "UserVO [userNumber=" + userNumber + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userAddress1=" + userAddress1 + ", userAddress2=" + userAddress2
				+ ", userAddress3=" + userAddress3 + ", userPhonenumber=" + userPhonenumber + ", userAge=" + userAge
				+ ", userGender=" + userGender + ", userEmail=" + userEmail + ", userStatus=" + userStatus
				+ ", userTitle=" + userTitle + ", userContent=" + userContent + ", userStar=" + userStar + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userNumber == null) ? 0 : userNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO other = (UserVO) obj;
		if (userNumber == null) {
			if (other.userNumber != null)
				return false;
		} else if (!userNumber.equals(other.userNumber))
			return false;
		return true;
	}

	
	

}
