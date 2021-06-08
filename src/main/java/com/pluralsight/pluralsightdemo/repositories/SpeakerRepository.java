package com.pluralsight.pluralsightdemo.repositories;

import com.pluralsight.pluralsightdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
