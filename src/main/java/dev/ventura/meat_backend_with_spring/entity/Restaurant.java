package dev.ventura.meat_backend_with_spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_restaurant")
public class Restaurant {

  @Id
  @SequenceGenerator(name = "restaurant_sequence", sequenceName = "restaurant_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restaurant_sequence")
  public Long id;
  public String name;
  public String category;
  public String deliveryEstimate;
  public double rating;
  public String imagePath;
  public String about;
  public String hours;

  public Restaurant() {
  }

  public Restaurant(Long id, String name, String category, String deliveryEstimate, double rating, String imagePath,
      String about, String hours) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.deliveryEstimate = deliveryEstimate;
    this.rating = rating;
    this.imagePath = imagePath;
    this.about = about;
    this.hours = hours;
  }

  public Restaurant(String name, String category, String deliveryEstimate, double rating, String imagePath,
      String about, String hours) {
    this.name = name;
    this.category = category;
    this.deliveryEstimate = deliveryEstimate;
    this.rating = rating;
    this.imagePath = imagePath;
    this.about = about;
    this.hours = hours;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDeliveryEstimate() {
    return deliveryEstimate;
  }

  public void setDeliveryEstimate(String deliveryEstimate) {
    this.deliveryEstimate = deliveryEstimate;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

}
