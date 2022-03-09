package com.academy.service;

import com.academy.entity.CountryCode;
import com.academy.exception.ValidationException;

public class CountryCodeValidator extends Validator<String> {

    @Override
    public void validate(String attribute) {
        if (attribute != null && !attribute.isEmpty()) {
            try {
                CountryCode.valueOf(attribute);
            } catch (IllegalArgumentException e) {
                throw new ValidationException("Country code in bot excepted");
            }
        }
    }
}

