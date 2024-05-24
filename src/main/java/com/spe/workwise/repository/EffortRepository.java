package com.spe.workwise.repository;

import com.spe.workwise.bean.EffortTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EffortRepository extends JpaRepository<EffortTable,Long> {
    EffortTable findByEffortTableId(Long etId);
}
