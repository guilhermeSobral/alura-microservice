package alura.microservice.fornecedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alura.microservice.fornecedor.domain.InfoFornecedor;

@Repository
public interface InfoRepository extends JpaRepository<InfoFornecedor, Integer>{

	InfoFornecedor findByEstado(String estado);
}
