/**
 * 
 */
package org.kanisorn.tdd.mockup;

/**
 * @author kanisorn
 *
 */
public class Customer {
	private int id;
	private String name;
	private String address;
	private Boolean preferEmail;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getPreferEmail() {
		return preferEmail;
	}
	public void setPreferEmail(Boolean preferEmail) {
		this.preferEmail = preferEmail;
	}
}
