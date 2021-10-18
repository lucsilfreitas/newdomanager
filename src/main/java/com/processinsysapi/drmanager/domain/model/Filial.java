package com.processinsysapi.drmanager.domain.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="filial")

public class Filial {
	
	
	private Long id;
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String nomeSigla;
	private String nomeFilial;
	private String nomeResponsavel;
	private String telefone;
	private String celular;
	private String email;
	private String tipoClinica;
	private String tipoPessoa;
	private String IE;
	private String IM;
	private Empresa empresa;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getNomeSigla() {
		return nomeSigla;
	}
	public void setNomeSigla(String nomeSigla) {
		this.nomeSigla = nomeSigla;
	}
	public String getNomeFilial() {
		return nomeFilial;
	}
	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipoClinica() {
		return tipoClinica;
	}
	public void setTipoClinica(String tipoClinica) {
		this.tipoClinica = tipoClinica;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public String getIE() {
		return IE;
	}
	public void setIE(String iE) {
		IE = iE;
	}
	public String getIM() {
		return IM;
	}
	public void setIM(String iM) {
		IM = iM;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Empresa getEmpresas() {
		return empresa;
	}
	public void setEmpresas(Empresa empresas) {
		this.empresa = empresas;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IE == null) ? 0 : IE.hashCode());
		result = prime * result + ((IM == null) ? 0 : IM.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result + ((nomeFilial == null) ? 0 : nomeFilial.hashCode());
		result = prime * result + ((nomeResponsavel == null) ? 0 : nomeResponsavel.hashCode());
		result = prime * result + ((nomeSigla == null) ? 0 : nomeSigla.hashCode());
		result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((tipoClinica == null) ? 0 : tipoClinica.hashCode());
		result = prime * result + ((tipoPessoa == null) ? 0 : tipoPessoa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filial other = (Filial) obj;
		if (IE == null) {
			if (other.IE != null)
				return false;
		} else if (!IE.equals(other.IE))
			return false;
		if (IM == null) {
			if (other.IM != null)
				return false;
		} else if (!IM.equals(other.IM))
			return false;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (nomeFilial == null) {
			if (other.nomeFilial != null)
				return false;
		} else if (!nomeFilial.equals(other.nomeFilial))
			return false;
		if (nomeResponsavel == null) {
			if (other.nomeResponsavel != null)
				return false;
		} else if (!nomeResponsavel.equals(other.nomeResponsavel))
			return false;
		if (nomeSigla == null) {
			if (other.nomeSigla != null)
				return false;
		} else if (!nomeSigla.equals(other.nomeSigla))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (tipoClinica == null) {
			if (other.tipoClinica != null)
				return false;
		} else if (!tipoClinica.equals(other.tipoClinica))
			return false;
		if (tipoPessoa == null) {
			if (other.tipoPessoa != null)
				return false;
		} else if (!tipoPessoa.equals(other.tipoPessoa))
			return false;
		return true;
	}

	
	
	
	

}
