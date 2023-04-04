package com.example.springboottest.repositories;

import com.example.springboottest.entities.CarCity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface CarCityRepository extends JpaRepository<CarCity, Long> {

//    List<CarCity> findAllByCar_yearGreaterThanOrderByPriceDesc(int year);

    CarCity findByIdAndPriceGreaterThan(Long id, int price);
}
