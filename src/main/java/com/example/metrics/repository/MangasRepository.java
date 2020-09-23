package com.example.metrics.repository;

import com.example.metrics.entity.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangasRepository extends JpaRepository<Manga, String> {
}
