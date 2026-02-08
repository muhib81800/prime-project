package com.realestate.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.realestate.app.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {
}
