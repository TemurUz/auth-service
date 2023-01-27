package uztioma.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uztioma.authservice.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
