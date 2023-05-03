package com.car.backendservice.controller;

import com.car.backendservice.DTO.CarControlRequest;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class CarController {

    @GetMapping("/stream")
    public ResponseEntity<InputStreamResource> streamVideo() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        FileInputStream stream = new FileInputStream(new File("path/to/camera/feed"));

        return new ResponseEntity<>(new InputStreamResource(stream), headers, HttpStatus.OK);
    }

    @PostMapping("/control")
    public ResponseEntity<String> controlCar(@RequestBody CarControlRequest request) {
        // Implement logic to control the car based on the input in the request object
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}