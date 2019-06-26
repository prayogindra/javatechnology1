package com.xsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="barang")
public class Barang {
	
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nama_barang", nullable=false, length = 50)
	private String nama_barang;
	
	@Column(name="jenis_barang", length = 30)
	private String jenis_barang;
	
	@Column(name="kota_pembuat", length = 30)
	private String kota_pembuat;
	
	@Column(name="jumlah_barang")
	private int jumlah_barang; 
	
	@Column(name="harga_barang")
	private int harga_barang;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama_barang() {
		return nama_barang;
	}

	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}

	public String getJenis_barang() {
		return jenis_barang;
	}

	public void setJenis_barang(String jenis_barang) {
		this.jenis_barang = jenis_barang;
	}

	public String getKota_pembuat() {
		return kota_pembuat;
	}

	public void setKota_pembuat(String kota_pembuat) {
		this.kota_pembuat = kota_pembuat;
	}

	public int getJumlah_barang() {
		return jumlah_barang;
	}

	public void setJumlah_barang(int jumlah_barang) {
		this.jumlah_barang = jumlah_barang;
	}

	public int getHarga_barang() {
		return harga_barang;
	}

	public void setHarga_barang(int harga_barang) {
		this.harga_barang = harga_barang;
	}

	
	
}
