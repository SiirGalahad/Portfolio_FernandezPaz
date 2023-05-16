
package com.portfolio.FPA.Security.Repository;

/**
 *
 * @author aleep
 */
import com.portfolio.FPA.Security.Entity.Rol;
import com.portfolio.FPA.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
