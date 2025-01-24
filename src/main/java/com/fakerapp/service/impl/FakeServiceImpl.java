package com.fakerapp.service.impl;

import com.fakerapp.service.FakeService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class FakeServiceImpl implements FakeService {

    private final Faker faker;

    public FakeServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public String getRandomName() {
        return faker.name().fullName();
    }

}
