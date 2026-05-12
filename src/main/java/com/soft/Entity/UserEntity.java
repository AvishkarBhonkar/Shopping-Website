package com.soft.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Flipcartdata")
public class UserEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String name;
	private String email;
	private String phoneno;
	private String password;
	private String Role;
	
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserEntity(Integer id, String name, String email, String phoneno, String password, String Role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.password = password;
		this.Role=Role;
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
