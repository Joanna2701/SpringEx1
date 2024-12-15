package fr.fms.dao;

import fr.fms.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long>{

    // 1.6 Ajouter des moyens pour afficher les noms des catégories classés par ordre
    //croissant puis décroissant
    <Categorie> List<Categorie> findAllByOrderByNameAsc();

    // Trier les catégories par nom en ordre décroissant
    <Categorie> List<Categorie> findAllByOrderByNameDesc();
}
