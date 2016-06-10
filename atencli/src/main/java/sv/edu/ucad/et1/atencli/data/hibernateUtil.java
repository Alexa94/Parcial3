package sv.edu.ucad.et1.atencli.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class hibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try{
			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata mdata = new MetadataSources(ssr).getMetadataBuilder().build();
			return mdata.getSessionFactoryBuilder().build();
		}
		catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("Ocurrio un error en la construcction de la Sesion Factory");
		}
	}//fin de buildSessionfactory
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}//fin de HibernateUitl