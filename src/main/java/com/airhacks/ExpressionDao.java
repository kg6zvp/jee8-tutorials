package com.airhacks;

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
}
