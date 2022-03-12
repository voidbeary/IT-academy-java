package com.academy.service;

import com.academy.exception.ValidationException;

public class CustomerAdultValidator extends Validator<Integer> {
    @Override
    public void validate(Integer attribute) {
        if (attribute < 18) {
            throw new ValidationException("Customer is not adult");
        }
    }
}
