package dev.ventura.meat_backend_with_spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import dev.ventura.meat_backend_with_spring.dto.RestaurantByIdDTO;
import dev.ventura.meat_backend_with_spring.dto.RestaurantDTO;
import dev.ventura.meat_backend_with_spring.entity.Restaurant;
import dev.ventura.meat_backend_with_spring.repository.RestaurantRepository;
import jakarta.persistence.EntityNotFoundException;

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
    Restaurant restaurant = repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Restaurante não encontrado com id: " + id));

    return RestaurantByIdDTO.getByIdDto(restaurant);
  }
}
