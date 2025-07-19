package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDTO;

import jakarta.validation.constraints.Pattern;

public interface ICustomerService {

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @param mobileNumber2 
     * @return Customer Details based on a given mobileNumber
     */
    CustomerDetailsDTO	 fetchCustomerDetails(String correlationId, @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String mobileNumber2);
}