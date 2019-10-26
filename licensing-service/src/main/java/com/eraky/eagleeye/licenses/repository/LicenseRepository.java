package com.eraky.eagleeye.licenses.repository;

import com.eraky.eagleeye.licenses.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends CrudRepository<License,String> {

}
