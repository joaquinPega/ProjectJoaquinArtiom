package db;

import model.Aderezo;

import org.hibernate.Session;

public class EventManager {

	public static void createAndStoreAderezo(String nombre, String descripcion) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Aderezo aderezo = new Aderezo();
		aderezo.setNombre(nombre);
		aderezo.setDescripcion(descripcion);
		session.save(aderezo);
		session.getTransaction().commit();
	}

}
