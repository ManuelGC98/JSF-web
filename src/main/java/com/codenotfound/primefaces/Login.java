package com.codenotfound.primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Login {

	private String usuario = "";
	private String password = "";

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String navega() {
		if (usuario.equals("FPDual") && password.equals("1234")) {
			return "menu";
		}
		return "";
	}
}
