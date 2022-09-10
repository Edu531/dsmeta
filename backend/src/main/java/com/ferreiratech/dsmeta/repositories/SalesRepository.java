package com.ferreiratech.dsmeta.repositories;

import com.ferreiratech.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sale, Long> {
}
