package com.concretepage.dao;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.concretepage.entity.Person;

@Transactional
@Component
public class PersonDao implements IPersonDao {
	@Inject
	private HibernateTemplate  hibernateTemplate;
	
	public void savePerson() {
		Person person = new Person();
//		person.setId(1);
		person.setName("Ram");
		hibernateTemplate.save(person);
	}
}
