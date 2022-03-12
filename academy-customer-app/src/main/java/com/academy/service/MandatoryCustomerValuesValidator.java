package com.academy.service;

import com.academy.entity.Customer;
import com.academy.exception.ValidationException;

import static utils.StringValidator.isValidString;

public class MandatoryCustomerValuesValidator extends Validator<Customer> {
    @Override
    public void validate(Customer attribute) {
        if (!isValidString(attribute.getFirstName())) {
            throw new ValidationException("Missing first name");
        }

        if (!isValidString(attribute.getLastName())) {
            throw new ValidationException("Missing last name");
        }

        if (!isValidString(attribute.getPersonalNumber())) {
            throw new ValidationException("Missing personal number");
        }

    }
}

