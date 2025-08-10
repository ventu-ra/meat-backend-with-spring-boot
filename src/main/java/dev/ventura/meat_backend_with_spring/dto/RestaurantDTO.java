package dev.ventura.meat_backend_with_spring.dto;

import dev.ventura.meat_backend_with_spring.entity.Restaurant;

public record RestaurantDTO(Long id, String name, String category, double rating, String deliveryEstimate,
        String imagePath) {

    public static RestaurantDTO listAllDto(Restaurant restaurant) {
        return new RestaurantDTO(
                restaurant.getId(),
                restaurant.getName(),
                restaurant.getCategory(),
                restaurant.getRating(),
                restaurant.getDeliveryEstimate(),
                restaurant.getImagePath());
    }
}
