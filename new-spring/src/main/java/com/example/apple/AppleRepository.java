package com.example.apple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppleRepository extends PagingAndSortingRepository<Apple, Long> {
    List<Apple> findAll();
}
