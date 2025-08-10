package dev.ventura.meat_backend_with_spring.dto;

import dev.ventura.meat_backend_with_spring.entity.Restaurant;

public record RestaurantByIdDTO(Long id, String name, String category, double rating, String about,
    String imagePath) {
  public static RestaurantByIdDTO getByIdDto(Restaurant restaurant) {
    return new RestaurantByIdDTO(
        restaurant.getId(),
        restaurant.getName(),
        restaurant.getCategory(),
        restaurant.getRating(),
        restaurant.getAbout(),
        restaurant.getImagePath());
  }
}
