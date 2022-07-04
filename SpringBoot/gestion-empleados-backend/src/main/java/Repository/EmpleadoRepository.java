package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Empleados;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleados, Long>{

	
}
