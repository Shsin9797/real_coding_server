package com.cnu.real_coding_server.repository;

import com.cnu.real_coding_server.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
//    Project save(Project post);
//    List<Project> findAll();
//    Optional<Project> findById(Integer projectId);
//    void delete(Project projectId);
}
