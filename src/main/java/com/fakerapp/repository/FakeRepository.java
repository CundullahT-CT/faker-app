package com.fakerapp.repository;

import com.fakerapp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FakeRepository extends JpaRepository<Person, Long> {
}
