package br.com.testJunithibernate.projeto;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import br.com.testJunithibernate.projeto.model.HibernateUtil;
import br.com.testJunithibernate.projeto.model.Produto;

public class App {
	public void run() {
		Session session = null;
		Transaction tx;
		session = HibernateUtil.getSessionFactory().openSession();
		List<Produto> selecao = new ArrayList<Produto>();
		selecao = session.createQuery("Select p from Produto p").list();

		// System.out.println(selecao);
		session.close();

		System.out.println(selecao.size());
	}

	public static void main(String[] args) {

		App ap = new App();
		ap.run();
	}
}
