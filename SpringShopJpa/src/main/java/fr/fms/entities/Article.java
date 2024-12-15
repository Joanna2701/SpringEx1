package fr.fms.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    public final String marque;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String brand;
    private String description;
    private double price;

    @ManyToOne
    private Category category;

    public Article(String marque) {
        this.marque = marque;
    }

    //Ce constructeur pour le TP Shop
    public Article(String description,String marque, double price, Category category) {
        this.description = description;
        this.marque = marque;
        this.price = price;
        this.category = category;

    }


    public Article(String s10, String samsung, int i, Category smartphone, String marque) {
        this.marque = marque;
    }

    public Article(long l, String samsung, String s9, int i, String marque) {
        this.marque = marque;
    }

    public Article(String marque) {

        this.marque = marque;
    }


    // Accesseurs


    @Override
    public String toString() {
        Article article1 = new Article(1L,"Samsung", "S9",250, );
        Article article2 = new Article(2L,"Samsung", "S8", 250, );
        return "";
    }


}



