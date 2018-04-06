package info.accubus.repository;

import info.accubus.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
