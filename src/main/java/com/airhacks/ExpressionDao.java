package com.airhacks;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author smccollum
 */
@Stateless
public class ExpressionDao {
	@PersistenceContext
	EntityManager em;

	public void saveToDb(String exp){
		em.persist(new Expression(exp));
	}

	public List<Expression> getAll(){
		return em.createQuery("SELECT e FROM Expression e").getResultList();
	}
}
