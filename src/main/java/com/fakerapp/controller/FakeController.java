package com.fakerapp.controller;

import com.fakerapp.service.FakeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FakeController {

    private final FakeService fakeService;

    public FakeController(FakeService fakeService) {
        this.fakeService = fakeService;
    }

    @GetMapping("/no-db/random")
    public ResponseEntity<String> getRandomName() {
        return ResponseEntity.ok(fakeService.getRandomName());
    }

    @GetMapping("/with-db/random")
    public ResponseEntity<String> getNameDromDB() {
        return ResponseEntity.ok(fakeService.getNameFromDB());
    }

}
