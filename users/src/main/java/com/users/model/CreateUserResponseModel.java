package com.users.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CreateUserResponseModel {

	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	
	@Override
	public String toString() {
		return "CreateUserResponseModel [firstName=" + getFirstName() + ", lastName=" + lastName + ", email=" + email
				+ ", userId=" + userId + "]";
	}
	
}
