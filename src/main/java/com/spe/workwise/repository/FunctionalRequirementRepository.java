package com.spe.workwise.repository;

import com.spe.workwise.bean.FunctionalRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionalRequirementRepository extends JpaRepository<FunctionalRequirement,Long> {
}
