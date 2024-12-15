package fr.fms.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity

public class Category implements Serializable{
     private static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String name;

     @OneToMany(mappedBy = "category")
     private Collection<Article> articles;

     public Category (String name) {
         this.name = name;
     }


     public Category() {

     }

     // Accesseurs


     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }
     public String getName() {
         return name;
     }
 }
