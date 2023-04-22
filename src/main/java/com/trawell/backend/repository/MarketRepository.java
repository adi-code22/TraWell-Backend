package com.trawell.backend.repository;

import com.trawell.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MarketRepository extends JpaRepository<Product, String> {
}
