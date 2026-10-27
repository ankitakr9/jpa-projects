package org.jsp.jpademo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQuery(name="findAllMerchant", query="select m from Merchant m")
@NamedQuery(name = "findMerchantByPhoneAndPassword",query = "select m from Merchant m where m.phone=?1 and m.password=?2")
@NamedQuery(
	    name = "findMerchantByIdAndPassword",
	    query = "select m from Merchant m where m.id=?1 and m.password=?2"
	)
@NamedQuery(name="findMerchantByEmailAndPassword", query="select m from Merchant m where m.email=?1 and m.password=?2")
@Entity
@Table(name="Merchant_info")
public class Merchant 
{
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", name=" + name + ", gst_num=" + gst_num + ", email=" + email + ", phone="
				+ phone + ", password=" + password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGst_num() {
		return gst_num;
	}
	public void setGst_num(String gst_num) {
		this.gst_num = gst_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="sname",nullable=false)
	private String name;
	private String gst_num;
	private String email;
	private long phone;
	private String password;
}
