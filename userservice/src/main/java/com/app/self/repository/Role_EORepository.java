package com.app.self.repository;

import com.app.self.entity.Role_EO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface Role_EORepository extends JpaRepository<Role_EO, Integer> {

    Collection<Role_EO> findByIdIn(Collection<Integer> ids);
}
