package com.fiap.appnac2.repository;

import com.fiap.appnac2.entity.IntentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntentRepository extends JpaRepository<IntentEntity, Long> {
}
