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
	
	private tblokullar okulgiris = new tblokullar();
	
	public void okulekle() {
		okullistesi.add(okulgiris);
	}
	
	
	public indexBean() {
		tblokullar okul;
		
		okul = new tblokullar();
		okul.setId(1L);
		okul.setOkuladi("A. Kalpler Anaokulu");
		okul.setOkuladresi("Öveçler Dikmen");
		okul.setOkulwebsiteadresi("https://okul.com.tr/anaokulu/ankara/ozel-asil-kalpler-anaokulu-82");
		okul.setResimurl("https://cdn.okul.com.tr/schools/82/360x310/ozel-asil-kalpler-anaokulu-1.jpg");
		okullistesi.add(okul);
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
