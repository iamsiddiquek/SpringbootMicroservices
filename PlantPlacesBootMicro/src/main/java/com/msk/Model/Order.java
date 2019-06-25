package com.msk.Model;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data 
public class Order {

	private Long id;
	
	private Date placedAt;
	
	@NotBlank(message="Enter valid name")
	private String name;
	
	@NotBlank(message="Enter Street information")
	private String street;

	@NotBlank(message="Enter your city")
	private String city;
	
	@NotBlank(message="Enter your state")
	private String state;

	@NotBlank(message="Enter valid Code")
	private String zip;

	@CreditCardNumber(message = "Credit Card Number is not valid")
	private String ccNumber;
	
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="Must be formatted MM/YY")

	private String ccExpiration;
	
	@Digits(integer=3, fraction=0, message="Invalid CVV (Card Varification Value)")
	private String ccCVV;

	
}
