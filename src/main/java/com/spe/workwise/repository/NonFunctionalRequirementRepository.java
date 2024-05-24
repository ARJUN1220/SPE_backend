package com.spe.workwise.repository;

import com.spe.workwise.bean.NonFunctionalRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonFunctionalRequirementRepository extends JpaRepository<NonFunctionalRequirement,Long> {
}
