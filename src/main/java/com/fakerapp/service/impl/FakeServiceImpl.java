package com.fakerapp.service.impl;

import com.fakerapp.repository.FakeRepository;
import com.fakerapp.service.FakeService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FakeServiceImpl implements FakeService {

    private final Faker faker;
    private final FakeRepository fakeRepository;

    public FakeServiceImpl(Faker faker, FakeRepository fakeRepository) {
        this.faker = faker;
        this.fakeRepository = fakeRepository;
    }

    @Override
    public String getRandomName() {
        return faker.name().fullName();
    }

    @Override
    public String getNameFromDB() {
        Long id = (long) new Random().nextInt(10) + 1;
        return fakeRepository.findById(id).get().getName();
    }

}
