package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
