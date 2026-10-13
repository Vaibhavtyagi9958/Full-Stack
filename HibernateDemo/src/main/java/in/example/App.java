package in.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.example.model.User;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
    	config.configure("in/example/config/hibernate.cfg.xml");
    	
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction t = session.beginTransaction();
    	
    	User user = new User();
    	try {
    		user = session.get(User.class, 1);
    		user.setName("Mohit");
    		t.commit();
    	} catch(Exception e) {
    		t.markRollbackOnly();
    		System.out.println("Exception occur " + e.getMessage());
    	}
    	
        System.out.println( "Hello World!" );
    }
}
