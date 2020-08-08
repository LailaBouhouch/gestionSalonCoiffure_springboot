package com.gestion.salon.client;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gestion.salon.person.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data 
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@DiscriminatorColumn(name="Client")
public class Client extends Person {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
}
