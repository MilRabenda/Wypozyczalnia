package com.example.wypozyczalnia.manager;

import com.example.wypozyczalnia.dao.WypozyczalniaRepo;
import com.example.wypozyczalnia.dao.enc.WypozyczalniaInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WypozyczalniaManager {
    private WypozyczalniaRepo wypozyczalniaRepo;

    @Autowired
    public WypozyczalniaManager(WypozyczalniaRepo wypozyczalniaRepo) {
        this.wypozyczalniaRepo = wypozyczalniaRepo;
    }

    public Optional<WypozyczalniaInfo> findById(Long id){
        return wypozyczalniaRepo.findById(id);
    }

    public Iterable<WypozyczalniaInfo> findAll(){
        return wypozyczalniaRepo.findAll();
    }

    public WypozyczalniaInfo save(WypozyczalniaInfo wypozyczalniaInfo){
        return wypozyczalniaRepo.save(wypozyczalniaInfo);
    }

    public void delete(Long id){
        wypozyczalniaRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new WypozyczalniaInfo(1L,"volkswagen arteon","2022-10-10"));
        save(new WypozyczalniaInfo(2L,"volkswagen up","2022-12-10"));
    }
}
