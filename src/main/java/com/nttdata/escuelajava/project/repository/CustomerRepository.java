package com.nttdata.escuelajava.project.repository;


import com.nttdata.escuelajava.project.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
