package com.example.wypozyczalnia.dao.enc;

import com.sun.javafx.geom.transform.Identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class WypozyczalniaInfo {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    String model;
    String rokProdukcji;

    public WypozyczalniaInfo(Long id, String model, String rokProdukcji) {
        this.id = id;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public WypozyczalniaInfo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(String rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
}
