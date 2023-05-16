package com.example.wypozyczalnia.dao;

import com.example.wypozyczalnia.dao.enc.WypozyczalniaInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WypozyczalniaRepo extends CrudRepository <WypozyczalniaInfo, Long> {
}
