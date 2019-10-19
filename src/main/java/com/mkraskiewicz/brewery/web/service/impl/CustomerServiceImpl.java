package com.mkraskiewicz.brewery.web.service.impl;

import com.mkraskiewicz.brewery.web.model.CustomerDTO;
import com.mkraskiewicz.brewery.web.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Maciej on 18/10/2019
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customerDto) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDto) {
        //todo impl
        log.debug("Updating....");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting.... ");
    }
}
