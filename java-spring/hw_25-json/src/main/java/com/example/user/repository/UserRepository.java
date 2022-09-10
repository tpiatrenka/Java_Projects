package com.example.user.repository;

import com.example.user.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository  extends PagingAndSortingRepository<User, Long> {
}
