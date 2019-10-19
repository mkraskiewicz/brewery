package com.mkraskiewicz.brewery.web.service;

import com.mkraskiewicz.brewery.web.model.CustomerDTO;

import java.util.UUID;

/**
 * Created by Maciej on 17/10/2019
 */
public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveNewCustomer(CustomerDTO customerDto);

    void updateCustomer(UUID customerId, CustomerDTO customerDto);

    void deleteById(UUID customerId);
}
