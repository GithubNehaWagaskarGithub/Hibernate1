package Provider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider 
{
	public static SessionFactory factory;
	public static SessionFactory factory() 
	{
		if(factory==null)
		{
			factory=new Configuration().configure("/resources/hibernate.cfg.xml").buildSessionFactory();
			return factory;
		}
		return factory;
	}
}