package edu.cibrertec.sistemaVentas.repository;

import edu.cibrertec.sistemaVentas.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer>{
}