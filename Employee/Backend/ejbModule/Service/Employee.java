package Service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Employee
 */
@Stateless
@LocalBean
public class Employee {

	@PersistenceContext(name = "EmployeeApp")
	private EntityManager em;
 
	@Override
	public void addEmployee(Employee emp) {
 
		em.persist(emp);
    }

}
