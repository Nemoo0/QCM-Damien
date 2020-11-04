package models;

public abstract class Question extends QCM {

	protected String nomQuestion;
	protected String reponse; 
	
	public Question(String nomQuestion) {
		this.nomQuestion = nomQuestion;
	}
	
	public abstract String afficher();
	public abstract Boolean estValide();
	
	@Override
	public void poser() {
		// TODO Auto-generated method stub
	}
	
	
	// GETTER AND SETTER
	
	protected String getNomQuestion() {
		return nomQuestion;
	}
	protected void setNomQuestion(String nomQuestion) {
		this.nomQuestion = nomQuestion;
	}
	protected String getReponse() {
		return reponse;
	}
	protected void setReponse(String reponse) {
		this.reponse = reponse;
	}
	
}
