package com.it.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContactDTO implements Serializable {

	private Integer cid;
	private String cname;
	private Long cnum;
	private String email;
}
