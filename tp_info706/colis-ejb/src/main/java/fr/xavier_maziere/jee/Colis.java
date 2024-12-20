package fr.xavier_maziere.jee;
import java.io.Serializable;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class Colis implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
	private long version;
    private float poids;
    private String destination;
    private String origine;
    private float valeur;

    private double longitude;
    private double latitude;
    private ArrayList<String> emplacement;
    private String etat;

    public static final String EN_COURS = "EN_COURS";
    public static final String LIVRE = "LIVRE";
    public static final String PERDU = "PERDU";
    public static final String ANNULE = "ANNULE";

    public long getId() {
        return id;
    }
    private void setId(long id) {
        this.id = id;
    }
    
    public long getVersion() {
        return version;
    }
    public void setVersion(long version) {
        this.version = version;
    }
    public float getPoids() {
        return poids;
    }
    public void setPoids(float poids) {
        this.poids = poids;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getOrigine() {
        return origine;
    }
    public void setOrigine(String origine) {
        this.origine = origine;
    }
    public float getValeur() {
        return valeur;
    }
    public void setValeur(float valeur) {
        this.valeur = valeur;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public ArrayList<String> getEmplacement() {
        return emplacement;
    }
    public void addEmplacement(String emplacement) {
        this.emplacement.add(emplacement);
    }
    public String getEtat() {
        return etat;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Colis() {
        super();
    }

    public Colis(float poids, String destination, String origine, float valeur, double longitude, double latitude, String emplacement, String etat) {
        super();
        this.poids = poids;
        this.destination = destination;
        this.origine = origine;
        this.valeur = valeur;
        this.longitude = longitude;
        this.latitude = latitude;
        this.emplacement = new ArrayList<String>();
        this.emplacement.add(emplacement);
        this.etat = etat;
    }
}