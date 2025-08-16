package dev.ventura.meat_backend_with_spring.dto;

import dev.ventura.meat_backend_with_spring.model.Menu;

public record MenuDTO(Long id,
    String name,
    String description,
    double price,
    String imagePath) {
  public static MenuDTO getMenuDTO(Menu menu) {
    return new MenuDTO(
        menu.getId(),
        menu.getName(),
        menu.getDescription(),
        menu.getPrice(),
        menu.getImagePath());
  }
}
