package dao;

import java.util.List;

import entities.Produit;

public class TestDao {

	public static void main(String[] args) {
		ProduitDaoImpl pdao= new ProduitDaoImpl();
		Produit prod= pdao.save(new Produit("iphone 8 plus",2800)); 
		System.out.println(prod);
		List<Produit> prods =pdao.produitsParMC("8");
		for (Produit p : prods) 
		System.out.println(p);
		}


	

}
