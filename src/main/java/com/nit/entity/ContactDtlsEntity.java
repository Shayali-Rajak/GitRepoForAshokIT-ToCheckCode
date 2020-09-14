package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="contact_details")
public class ContactDtlsEntity {

	@Id
	@Column(name="contact_id")
	@GeneratedValue
	private Integer cid;
	@Column(name="contact_name")
	private String cname;
	@Column(name="contact_number")
	private Long cnum;
	@Column(name="contact_mail")
	private String email;
}
