package com.sena.tiendabeats.IRepository.Seguridad;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.tiendabeats.Dto.LoginDto;
import com.sena.tiendabeats.Entity.Seguridad.Usuario;
import com.sena.tiendabeats.IRepository.IBaseRepository;

@Repository
public interface IUsuarioRepository extends IBaseRepository<Usuario, Long> {
    @Query(value = "SELECT " + 
            "u.username AS Username, " + 
            "m.nombre AS Modulo, " + 
            "v.nombre AS Formulario " + 
            "   FROM rol_vista rv " + 
            "       INNER JOIN vista v ON rv.vista_id = v.id " + 
            "       INNER JOIN rol r ON rv.rol_id = r.id " + 
            "       INNER JOIN modulo m ON v.modulo_id = m.id " + 
            "       INNER JOIN rol_usuario ur ON rv.rol_id = ur.rol_id " + 
            "       INNER JOIN usuario u ON ur.usuario_id = u.id " + 
            "   WHERE (u.username LIKE CONCAT('%', :username, '%')) " + 
            "       AND (u.password LIKE CONCAT('%', :password, '%')) " + 
            "   GROUP BY v.nombre " + 
            "   ORDER BY m.nombre ASC ;", nativeQuery = true)
    List<LoginDto> getLogin(@Param("username") String username,
                        @Param("password") String password);
}
