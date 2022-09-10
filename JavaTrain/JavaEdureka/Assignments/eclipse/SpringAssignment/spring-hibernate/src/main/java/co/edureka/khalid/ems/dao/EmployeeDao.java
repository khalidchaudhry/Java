package co.edureka.khalid.ems.dao;

import java.util.List;
import co.edureka.khalid.ems.entity.Employee;
import java.util.ArrayList;

import org.hibernate.Hibernate;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDao {
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional(readOnly = false)
	public void saveEmployee(Employee e) {
		template.save(e);
	}

	@Transactional(readOnly = false)
	public void updateEmployee(Employee e) {
		template.update(e);
	}

	@Transactional(readOnly = false)
	public void deleteEmployee(Employee e) {
		template.delete(e);
	}

	public Employee getById(int id) {
		Employee e = (Employee) template.get(Employee.class, id);
		return e;
	}

	public Employee getByName(String name) {

		Query<?> query = template.getSessionFactory().openSession().createQuery("from Employee where employeeName =:name");
		query.setParameter("name", name);
		return (Employee) (query.getResultList().get(0));
		
	}

	public List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list = template.loadAll(Employee.class);
		return list;
	}
}
