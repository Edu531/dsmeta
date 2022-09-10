package com.ferreiratech.dsmeta.services;

import com.ferreiratech.dsmeta.entities.Sale;
import com.ferreiratech.dsmeta.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SalesRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }
}
