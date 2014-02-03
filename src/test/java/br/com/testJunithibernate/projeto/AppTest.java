package br.com.testJunithibernate.projeto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.testJunithibernate.projeto.model.HibernateUtil;
import br.com.testJunithibernate.projeto.model.Produto;

/**
 * Unit test for simple App.
 */
public class AppTest

{
	Session session = null;
	Transaction tx;

	@Before
	public void inicializa() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
	}

	@Test
	public void run() {
		System.out.println("teste");
		List<Produto> produtos = new ArrayList<Produto>();
		 produtos = session.createQuery("Select p from Produto p").list();
		 assertNotNull("falho no carregamento",produtos);
	}

	@After
	public void termina() {
		session.close();
		System.gc();
	}
}
