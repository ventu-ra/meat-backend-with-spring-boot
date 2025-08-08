package dev.ventura.meat_backend_with_spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ventura.meat_backend_with_spring.entity.Restaurant;
import dev.ventura.meat_backend_with_spring.repository.RestaurantRepository;

@Service
public class RestaurantService {

  @Autowired
  private final RestaurantRepository repository;

  RestaurantService(RestaurantRepository repository) {
    this.repository = repository;
  }

  public List<Restaurant> getRestaurants() {
    return repository.findAll();
  }

  public Restaurant save(Restaurant restaurant) {

    System.out.println(restaurant);
    return repository.save(restaurant);
  }
}
