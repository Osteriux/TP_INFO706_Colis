package fr.xavier_maziere.jee;

import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
@Remote
public class OperationBean implements Operation {

    @PersistenceContext(unitName = "colis")
    private EntityManager em;

    public OperationBean() {
        super();
    }

    @Override
    public Colis creeColis(float poids, String destination, String origine, float valeur, double longitude, double latitude) {
        Colis colis = new Colis(poids, destination, origine, valeur, longitude, latitude, origine, Colis.EN_COURS);
        em.persist(colis);
        return colis;
    }

    @Override
    public Colis getColis(long id) {
        return em.find(Colis.class, id);
    }

    @Override
    public Colis updatePositionColis(long id, double longitude, double latitude, String emplacement, String etat) {
        Colis colis = getColis(id);
        colis.setLongitude(longitude);
        colis.setLatitude(latitude);
        colis.setEmplacement(emplacement);
        colis.setEtat(etat);
        return colis;
    }

    @Override
    public void deleteColis(long id) {
        Colis colis = getColis(id);
        em.remove(colis);
    }

}
