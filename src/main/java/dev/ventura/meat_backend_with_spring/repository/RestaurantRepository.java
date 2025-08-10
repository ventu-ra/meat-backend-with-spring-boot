package dev.ventura.meat_backend_with_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ventura.meat_backend_with_spring.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
