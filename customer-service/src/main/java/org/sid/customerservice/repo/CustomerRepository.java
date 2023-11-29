package org.sid.customerservice.repo;

import org.sid.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Pour exposer le Web Service RestFull qui permet de gerer les customers
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
