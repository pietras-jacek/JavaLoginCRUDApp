package com.loginCrudApp.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int id;

	@Column(name = "firstname")
	@NotEmpty(message = "*wprowadź imię pracownika")
	@Pattern(regexp = "^[A-ZĄĆĘŁŃÓŚŹŻ][a-ząćęłńóśźż]{1,}$", message = "Imię musi zaczynać się od dużej litery")
	private String firstName;

	@Column(name = "lastname")
	@NotEmpty(message = "*wprowadź nazwisko pracownika")
	@Pattern(regexp = "^[A-ZĄĆĘŁŃÓŚŹŻ][a-ząćęłńóśźż]{1,}[[\\\\s]{0,1}[\\\\-]{0,1}[\\\\s]{0,1}[A-ZĄĆĘŁŃÓŚŹŻ]{0,1}[a-ząćęłńóśźż]{0,}]{0,}$", message = "Nazwisko musi zaczynać się od dużej litery")
	private String lastName;

	@Column(name = "email")
	@Email(message = "*Proszę o podanie poprawnego adresu email")
	@NotEmpty(message = "*Wprowadź swój adres email")
	private String email;

	@Column(name = "street")
	@NotEmpty(message = "*Wprowadź ulicę zamieszkania pracownika")
	//@Pattern(regexp = "^[A-ZĄĆĘŁŃÓŚŹŻ][a-ząćęłńóśźż]{1,}$", message = "Ulica musi zaczynać się od dużej litery")
	private String street;

	@Column(name = "city")
	@NotEmpty(message = "*Wprowadź miasto zamieszkania pracownika")
	//@Pattern(regexp = "^[A-ZĄĆĘŁŃÓŚŹŻ][a-ząćęłńóśźż][0-9]{1,}$", message = "Miasto musi zaczynać się od dużej litery")
	private String city;

	@Column(name = "postcode")
	@NotEmpty(message = "*Wprowadź kod pocztowy pracownika")
	@Pattern(regexp = "^[0-9]{2}-[0-9]{3}$", message = "Niepoprawny format kodu pocztowego (xxx-xxx)")
	private String postcode;

	@Autowired
	@Column(name = "birthdate")
	@NotNull(message = "*Wprowadź datę urodzenia pracownika zgodnie ze wzorcem (yyyy-MM-dd)")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Past
	private Date birthdate;

	@Column(name = "telephone")
	@NotEmpty(message = "*Wprowadź numer telefeonu pracownika")
	private String telephone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
