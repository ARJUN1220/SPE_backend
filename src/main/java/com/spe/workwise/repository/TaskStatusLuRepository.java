package com.spe.workwise.repository;

import com.spe.workwise.bean.TaskStatusLu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskStatusLuRepository extends CrudRepository<TaskStatusLu,Long> {
    TaskStatusLu findByTaskStatusLuId(Long id);
}
