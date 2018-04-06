package info.accubus.repository;

import info.accubus.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Brian");
        customer.setLastName("Adams");

        customers.add(customer);

        return customers;
    }
}
