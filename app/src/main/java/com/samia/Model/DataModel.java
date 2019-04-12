package com.samia.Model;

public class DataModel {
    String id, cin, num_bac, nom, naissance,
    gouvernorat, telephone, email, faculte, date_inscription, promotion_bac;

    public DataModel(String id, String cin, String num_bac, String nom, String naissance, String gouvernorat, String telephone,
                     String email, String faculte, String date_inscription, String promotion_bac) {
        this.id = id;
        this.cin = cin;
        this.num_bac = num_bac;
        this.nom = nom;
        this.naissance = naissance;
        this.gouvernorat = gouvernorat;
        this.telephone = telephone;
        this.email = email;
        this.faculte = faculte;
        this.date_inscription = date_inscription;
        this.promotion_bac = promotion_bac;
    }

    public String getId() {
        return id;
    }

    public String getCin() {
        return cin;
    }

    public String getNum_bac() {
        return num_bac;
    }

    public String getNom() {
        return nom;
    }

    public String getNaissance() {
        return naissance;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getFaculte() {
        return faculte;
    }

    public String getDate_inscription() {
        return date_inscription;
    }

    public String getPromotion_bac() {
        return promotion_bac;
    }
}
