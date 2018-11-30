package fr.eni.formation.Bo;

public class Piste {
	private Integer longeur;
	private String [][]piste;
	
	
	
	public Piste(Integer longeur) {
		super();
		this.longeur = longeur;
		setPiste();
	}
	public Integer getLongeur() {
		return longeur;
	}
	public void setLongeur(Integer longeur) {
		this.longeur = longeur;
	}
	public String[][] getPiste() {
		return piste;
	}
	public void setPiste() {
		if(piste==null){
		this.piste = new String[Course.getNbAdversaires()][getLongeur()];
		}
	}
	
}
