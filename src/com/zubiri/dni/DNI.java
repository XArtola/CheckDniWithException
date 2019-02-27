package com.zubiri.dni;

public class DNI {

	private String dni = "";

	public String getDni() {

		return dni;

	}

	public void setDni(String dni) throws Exception {
		
		
		try {checkDni(dni);
			this.dni = dni;}catch(Exception e) {
				
				
				throw new Exception("unable to set ");
			}
	}
				
	public void checkDni(String dni) throws Exception {

		if (dni.length() == 9 && dni.substring(0, 7).matches("[0-9]+") && dni.substring(8).matches("[A-Za-z]")) {
		} else {

			throw new Exception("invalid DNI");

		}
	}

}