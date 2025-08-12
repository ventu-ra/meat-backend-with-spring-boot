package dev.ventura.meat_backend_with_spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import dev.ventura.meat_backend_with_spring.dto.RestaurantByIdDTO;
import dev.ventura.meat_backend_with_spring.dto.RestaurantDTO;
import dev.ventura.meat_backend_with_spring.exceptions.NotFoundResourceException;
import dev.ventura.meat_backend_with_spring.model.Restaurant;
import dev.ventura.meat_backend_with_spring.repository.RestaurantRepository;

@Service
public class RestaurantService {

  @Autowired
  private final RestaurantRepository repository;

  RestaurantService(RestaurantRepository repository) {
    this.repository = repository;
  }

  public List<RestaurantDTO> getRestaurants() {
    return repository.findAll(PageRequest.of(0, 10))
        .stream()
        .map(RestaurantDTO::getRestaurantDTO)
        .collect(Collectors.toList());
  }

  public Restaurant save(Restaurant restaurant) {
    System.out.println(restaurant);
    return repository.save(restaurant);
  }

  public RestaurantByIdDTO getByID(Long id) {
    return repository.findById(id).stream().map(RestaurantByIdDTO::getByIdDto).findFirst()
        .orElseThrow(() -> new NotFoundResourceException("Restaurante com ID " + id + "não encontrado!"));
  }
}
