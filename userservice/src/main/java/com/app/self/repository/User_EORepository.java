package com.app.self.repository;

import com.app.self.entity.User_EO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_EORepository extends JpaRepository<User_EO, Integer> {
}
