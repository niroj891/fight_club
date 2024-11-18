package com.fight_club.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

	public class UserRole implements Serializable {

		private static final long serialVersionUID = -2468942966114150876L;
		private int id;
		private String role;  //ROLE_ADMIN/ ROLE_User/ ROLE_Instructor
		

		
}
