package com.samia.Model;

public class DataModel {
    String id, cin, num_bac, nom, naissance,
    gouvernorat, telephone, email, faculte, date_inscription, promotion_bac;
    String simetreUn,
            simestreDeux,
            simestreTrois,
            caution,
            id_etudiant,
    photo;
    String bloc_chambre, num_chambre, etat, capacite;

    public DataModel(String id, String cin, String num_bac, String nom, String naissance, String gouvernorat, String telephone, String email, String faculte, String date_inscription, String promotion_bac, String simetreUn, String simestreDeux, String simestreTrois, String caution, String id_etudiant, String photo, String bloc_chambre, String num_chambre, String etat, String capacite) {
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
        this.simetreUn = simetreUn;
        this.simestreDeux = simestreDeux;
        this.simestreTrois = simestreTrois;
        this.caution = caution;
        this.id_etudiant = id_etudiant;
        this.photo = photo;
        this.bloc_chambre = bloc_chambre;
        this.num_chambre = num_chambre;
        this.etat = etat;
        this.capacite = capacite;
    }

    public String getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }

    public String getSimetreUn() {
        return simetreUn;
    }

    public String getSimestreDeux() {
        return simestreDeux;
    }

    public String getSimestreTrois() {
        return simestreTrois;
    }

    public String getCaution() {
        return caution;
    }

    public String getId_etudiant() {
        return id_etudiant;
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

    public String getBloc_chambre() {
        return bloc_chambre;
    }

    public String getNum_chambre() {
        return num_chambre;
    }

    public String getEtat() {
        return etat;
    }

    public String getCapacite() {
        return capacite;
    }

    public String getDate_inscription() {
        return date_inscription;
    }

    public String getPromotion_bac() {
        return promotion_bac;
    }
}
