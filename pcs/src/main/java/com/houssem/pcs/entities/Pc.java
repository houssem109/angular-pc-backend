package com.houssem.pcs.entities; 
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Pc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPC;
	
	@ManyToOne
	private Marque marque;
	
	private String modele ;
	private String processeur ;
	private int memoireRAM;
	private int capaciteStockage;
	private String carteGraphique ;
	private String systemeExploitation ;
	private double prix;
	private Date dateAchat;
	private String email ;
	
	public long getIdPC() {
		return idPC;
	}
	public void setIdPC(long idPC) {
		this.idPC = idPC;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getProcesseur() {
		return processeur;
	}
	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}
	public int getMemoireRAM() {
		return memoireRAM;
	}
	public void setMemoireRAM(int memoireRAM) {
		this.memoireRAM = memoireRAM;
	}
	public int getCapaciteStockage() {
		return capaciteStockage;
	}
	public void setCapaciteStockage(int capaciteStockage) {
		this.capaciteStockage = capaciteStockage;
	}
	public String getCarteGraphique() {
		return carteGraphique;
	}
	public void setCarteGraphique(String carteGraphique) {
		this.carteGraphique = carteGraphique;
	}
	public String getSystemeExploitation() {
		return systemeExploitation;
	}
	public void setSystemeExploitation(String systemeExploitation) {
		this.systemeExploitation = systemeExploitation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Pc() {
		super();
	}
	public Pc(String modele, String processeur, int memoireRAM, int capaciteStockage, String carteGraphique,
			String systemeExploitation, double prix, Date dateAchat, String email) {
		super();
		this.modele = modele;
		this.processeur = processeur;
		this.memoireRAM = memoireRAM;
		this.capaciteStockage = capaciteStockage;
		this.carteGraphique = carteGraphique;
		this.systemeExploitation = systemeExploitation;
		this.prix = prix;
		this.dateAchat = dateAchat;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Pc [idPC=" + idPC + ", modele=" + modele + ", processeur=" + processeur + ", memoireRAM=" + memoireRAM
				+ ", capaciteStockage=" + capaciteStockage + ", carteGraphique=" + carteGraphique
				+ ", systemeExploitation=" + systemeExploitation + ", prix=" + prix + ", dateAchat=" + dateAchat
				+ ", email=" + email + "]";
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}


}
