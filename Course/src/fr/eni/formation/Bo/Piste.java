package fr.eni.formation.Bo;

public class Piste {
	private Integer nbParticipants;
	private Integer longeur;
	private String [][]piste;
	
	
	
	public Piste(Integer nbParticipants, Integer longeur) {
		super();
		this.nbParticipants = nbParticipants;
		this.longeur = longeur;
		setPiste();
	}
	public Integer getNbParticipants() {
		return nbParticipants;
	}
	public void setNbParticipants(Integer nbParticipants) {
		this.nbParticipants = nbParticipants;
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
		this.piste = new String[getNbParticipants()][getLongeur()];
		}
	}
	
}
