package fr.fms;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

import javax.persistence.EntityManager;
import java.util.List;

@SpringBootApplication
public class SpringShopJpaApplication implements CommandLineRunner {
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpaApplication.class, args);
		Article article1 = new Article("S9","Samsung",250 );
		Article article2 = new Article( "S8","Samsung", 250);
	}

	@Override
	public void run(String... args) throws Exception {
		Category smartphone = categoryRepository.save(new Category("Smartphone"));
		Category tablet = categoryRepository.save(new Category("Tablet"));
		Category pc = categoryRepository.save(new Category("PC"));


		articleRepository.save(new Article("S10","Samsung",500,smartphone));
		articleRepository.save(new Article("S9","Samsung",350,smartphone));
		articleRepository.save(new Article("S8","Xiaomi",100,smartphone));

		articleRepository.save(new Article("GalaxyTab","Samsung",450,tablet));
		articleRepository.save(new Article("Ipad","Apple",350,tablet));

		articleRepository.save(new Article("R510","Asus",600,pc));


		//for(Article article : articleRepository.findByBrandAndPrice("Samsung",250)) {
			//System.out.println(article);
		//}


		//1.2 Trouver 2 moyens pour récupérer et afficher sur la console un article en base
		//puis, dans un second temps, afficher tous les articles en base.

		//System.out.println(articleRepository.findById(11L));
		//Article article4 = new Article("S9","Samsung",250 );

		//System.out.println(article4.brand);
		//articleRepository.save(article4);

		// Toujours 1.2 pour retourner tous les articles
		// public List<Article> getAllArticles() {
			//return articleRepository.findAll();
		//}

		 /*Affichage d'un article par ses marque et description
		System.out.println(articleRepository.findByBrandAndDescription("Apple", "iPad"));



		//1.4
		// Supprimer un article par ID
    	//public void deleteArticleById(Long id) {
        	//articleRepository.deleteById(id);
        	//System.out.println(article);
    		//}


    	//1.5 : Ajouter une méthode qui permet de mettre à jour un article à partir de l’id

    	//public void updateArticle(Long id) {
        updatedArticle.setId(id); // récupère le setter
        return articleRepository.save(updatedArticle);
    }


		//1.7 Méthode de mon choix
		 // Méthode pour compter le nombre total d'articles

    		public long countArticles() {
        		return articleRepository.count();
    		}


		//Object articleId = null;
		Article article = articleRepository.find(Article.class, articleId);
		System.out.println(article);

		//1.2 avec OneTooMany @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
		//private List<Brands> brands; */


	}
}
