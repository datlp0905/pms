package pms.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pms.com.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
