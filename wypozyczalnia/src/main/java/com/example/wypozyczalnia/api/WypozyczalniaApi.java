package com.example.wypozyczalnia.api;

import com.example.wypozyczalnia.dao.WypozyczalniaRepo;
import com.example.wypozyczalnia.dao.enc.WypozyczalniaInfo;
import com.example.wypozyczalnia.manager.WypozyczalniaManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping()
public class WypozyczalniaApi {
    private WypozyczalniaManager samochody;

    @Autowired
    public WypozyczalniaApi(WypozyczalniaManager samochody) {
        this.samochody = samochody;
        samochody.fillDB();
    }
    @GetMapping("/samochody")
    public Iterable<WypozyczalniaInfo> getSamochody() {
        return samochody.findAll();
    }
    @GetMapping
    public Optional<WypozyczalniaInfo> getSamochod(@RequestParam Long id){
        return samochody.findById(id);
    }

    @PostMapping
    public WypozyczalniaInfo addSamochod(@RequestBody WypozyczalniaInfo wypozyczalniaInfo) {return samochody.save(wypozyczalniaInfo);}
    @DeleteMapping
    public void deleteSamochod(@RequestParam Long id) {samochody.delete(id);}

}

