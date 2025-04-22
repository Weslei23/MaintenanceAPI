package br.com.wsdev.maintenance.Repositorys;

import br.com.wsdev.maintenance.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{
}
