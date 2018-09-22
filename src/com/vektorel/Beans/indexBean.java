package com.vektorel.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.Models.tbldefault;

@SuppressWarnings("deprecation")
@ManagedBean(name="AnasayfaBean")
@SessionScoped
public class indexBean {

	private String ekranyazisi = "Ýlk JSF";

	private List<tbldefault> liste = new ArrayList<>();
	
	public indexBean() {
		tbldefault tb;
		
		for (Long i = 0L; i < 10; i++) {
			tb = new tbldefault();
			tb.setId(i);
			tb.setAd("Kiþi-"+i);
			liste.add(tb);			
		}
		
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
