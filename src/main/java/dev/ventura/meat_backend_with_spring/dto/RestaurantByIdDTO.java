package dev.ventura.meat_backend_with_spring.dto;

import java.util.List;
import java.util.stream.Collectors;

import dev.ventura.meat_backend_with_spring.model.Menu;
import dev.ventura.meat_backend_with_spring.model.Restaurant;

public record RestaurantByIdDTO(
    Long id,
    String name,
    String category,
    double rating,
    String about,
    String imagePath,
    List<MenuDTO> menuItens) {

  public static RestaurantByIdDTO getByIdDto(Restaurant restaurant) {
    return new RestaurantByIdDTO(
        restaurant.getId(),
        restaurant.getName(),
        restaurant.getCategory(),
        restaurant.getRating(),
        restaurant.getAbout(),
        restaurant.getImagePath(),
        // Convertendo cada Menu em MenuDTO
        restaurant.getMenuItems().stream()
            .map(MenuDTO::getMenuDTO)
            .collect(Collectors.toList()));
  }
}
