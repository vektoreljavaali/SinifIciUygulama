package com.vektorel.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.Models.tbldefault;
import com.vektorel.Models.tblokullar;

@SuppressWarnings("deprecation")
@ManagedBean(name="AnasayfaBean")
@SessionScoped
public class indexBean {

	private String ekranyazisi = "Ýlk JSF";

	private List<tbldefault> liste = new ArrayList<>();
	private List<tblokullar> okullistesi = new ArrayList<>();
	
	private tblokullar okulduzenle = new tblokullar();
	
	private tblokullar okulgiris = new tblokullar();
	
	public void okulekle() {
		tblokullar tmp = new tblokullar();
		tmp.setId(okullistesi.size()+1L);
		tmp.setOkuladi(okulgiris.getOkuladi());
		tmp.setOkuladresi(okulgiris.getOkuladresi());
		tmp.setOkulwebsiteadresi(okulgiris.getOkulwebsiteadresi());
		tmp.setResimurl(okulgiris.getResimurl());
		okullistesi.add(tmp);
	}
	
	public void duzenle() {
			okullistesi.set(okulduzenle.getId().intValue(), okulduzenle);	
	}
	
	public indexBean() {
		
	}
	
	
	
	
	public tblokullar getOkulduzenle() {
		return okulduzenle;
	}


	public void setOkulduzenle(tblokullar okulduzenle) {
		this.okulduzenle = okulduzenle;
	}


	public tblokullar getOkulgiris() {
		return okulgiris;
	}




	public void setOkulgiris(tblokullar okulgiris) {
		this.okulgiris = okulgiris;
	}




	public List<tblokullar> getOkullistesi() {
		return okullistesi;
	}




	public void setOkullistesi(List<tblokullar> okullistesi) {
		this.okullistesi = okullistesi;
	}




	public String getEkranyazisi() {
		return ekranyazisi;
	}

	public void setEkranyazisi(String ekranyazisi) {
		this.ekranyazisi = ekranyazisi;
	}

	public List<tbldefault> getListe() {
		return liste;
	}

	public void setListe(List<tbldefault> liste) {
		this.liste = liste;
	}
	
	
	
	
}
