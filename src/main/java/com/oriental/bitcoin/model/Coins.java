package com.oriental.bitcoin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "COINS")
@Getter
@Setter
@ToString
public class Coins {
	
	@Id
	private String coincode;

	private String coinname;
	
}
