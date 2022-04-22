package com.api.greedog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.greendog.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
