package dev.ventura.meat_backend_with_spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ventura.meat_backend_with_spring.entity.Restaurant;
import dev.ventura.meat_backend_with_spring.service.RestaurantService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/restaurant")
public class RestaurantController {

  private final RestaurantService service;

  public RestaurantController(RestaurantService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<Restaurant>> getRestaurants() {
    return ResponseEntity.ok(service.getRestaurants());
  }

  @PostMapping
  public ResponseEntity<Restaurant> create(@RequestBody Restaurant restaurant) {
    Restaurant saved = service.save(restaurant);
    return ResponseEntity.status(HttpStatus.CREATED).body(saved);
  }

}
