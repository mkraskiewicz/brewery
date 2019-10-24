package com.mkraskiewicz.brewery.web.mappers;

import com.mkraskiewicz.brewery.domain.Customer;
import com.mkraskiewicz.brewery.web.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * Created by Maciej on 24/10/2019
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
