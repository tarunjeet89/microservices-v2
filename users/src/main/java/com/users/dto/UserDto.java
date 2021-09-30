package com.users.dto;

import java.io.Serializable;
import java.util.List;

import com.users.model.AlbumResponseModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class UserDto implements Serializable {
	
	private static final long serialVersionUID = 2590648749487588360L;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userId;
	private String encryptedPassword;
	private List<AlbumResponseModel> albums;
	
	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", userId=" + userId + ", encryptedPassword=" + encryptedPassword + "]";
	}

	
}
