package br.com.wsdev.maintenance.Repositorys;

import br.com.wsdev.maintenance.Models.OrdemManutencao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemManutencaoRepository extends JpaRepository<OrdemManutencao, Long>
{
}
