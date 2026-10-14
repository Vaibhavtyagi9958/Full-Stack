package in.example;

import java.util.List;

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
    	try {
    		User user = session.get(User.class,4);
    		if(user==null) {
    			System.out.println("No user Found with given id");
    		} else {
    			session.remove(user);
    		}
//    		User user = new User("Shivam", 40000);
//    		session.persist(user);
    		List<User> users = session.createQuery("From User", User.class).list();
    		if(users.isEmpty()) {
    			System.out.println("No user Found");
    		} else {
    			for(User u : users) {
    				System.out.println("Name: " + u);
    			}
    		}
    		t.commit();
    	} catch(Exception e) {
    		t.markRollbackOnly();
    		System.out.println("Exception occur " + e.getMessage());
    	}

    }
}
