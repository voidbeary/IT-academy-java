package com.academy.service;

public abstract class Validator<T> {
    public abstract void validate(T attribute);

//    public abstract void validate(String countryCode);
}
