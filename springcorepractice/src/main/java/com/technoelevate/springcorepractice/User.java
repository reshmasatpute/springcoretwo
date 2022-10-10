package com.technoelevate.springcorepractice;

public class User {
	private String username;
	private String password;
	private long contact;
	private String email;
	private SocialMedia socialMedia;
	

	public User(String username, String password, long contact, String email, SocialMedia socialMedia) {
		super();
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.email = email;
		this.socialMedia = socialMedia;
	}


	public String getUsername() {
		return username;
	}
	

	public SocialMedia getSocialMedia() {
		return socialMedia;
	}


	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", contact=" + contact + ", email=" + email
				+ ", socialMedia=" + socialMedia + "]";
	}

	
}
