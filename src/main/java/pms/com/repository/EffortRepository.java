package pms.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pms.com.entities.Effort;

@Repository
public interface EffortRepository extends JpaRepository<Effort, Integer> {
}
