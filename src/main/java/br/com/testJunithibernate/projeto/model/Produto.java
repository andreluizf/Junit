package br.com.testJunithibernate.projeto.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PRODUTO")
public class Produto  implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="COD_PRODUTO")
	private Integer id;
	@Column(name="DESCRICAO")
	private String descricao;
	@Column(name="VALOR")
	private BigDecimal valor;
	@Column(name="MODULOS")
	private String modulos;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getModulos() {
		return modulos;
	}
	public void setModulos(String modulos) {
		this.modulos = modulos;
	}
	
	

}
