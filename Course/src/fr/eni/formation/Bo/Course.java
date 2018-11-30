package fr.eni.formation.Bo;

import java.util.ArrayList;
import java.util.List;

public class Course {
Piste piste;
Escargot escargot;
private static Integer nbAdversaires;
static List <Adversaire> adversaires;



public static Integer getNbAdversaires() {
	return nbAdversaires;
}



public Course(Integer longeur,Integer nbAdversaires) {
	super();
	Course.nbAdversaires=nbAdversaires;
	this.piste = new Piste(longeur);
	this.escargot = new Escargot();
	
	Course.adversaires =new ArrayList<Adversaire>();
}





}
