package com.spe.workwise.repository;
import com.spe.workwise.bean.Risk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskRepository extends JpaRepository<Risk,Long> {
}
