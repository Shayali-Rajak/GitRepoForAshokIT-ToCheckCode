package com.it.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.entity.ContactDtlsEntity;

public interface ContactDtlsRepository extends JpaRepository<ContactDtlsEntity, Serializable> {

}
