package com.example.sort;

public class User {
	private String name;
	private String address;
	private String phone;
	private int no; 

	public User() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("name=").append(name).append(", ");
		str.append("address=").append(address).append(", ");
		str.append("phone=").append(phone).append(", ");
		str.append("no=").append(no);

		return str.toString();
	}

}
