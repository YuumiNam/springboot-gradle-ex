package com.bitacademy.cocktailex.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="signature")
@Getter @Setter
public class SignatureDomain {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="cocktail_name")
	private String cocktailName;
	
	@Column(name="reg_date")
	private String date;
	
	@Column(name="cocktail_contents")
	private String cocktailContents;
	
	@Column(name="recipe_contents")
	private String recipeContents;
	
	@Column(name="cocktail_type")
	private String cocktailType;
}
