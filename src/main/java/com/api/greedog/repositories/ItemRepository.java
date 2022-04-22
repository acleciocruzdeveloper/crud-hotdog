package com.api.greedog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.greendog.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	
	

}
