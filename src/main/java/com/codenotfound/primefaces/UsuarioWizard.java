package com.codenotfound.primefaces;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;
import com.codenotfound.primefaces.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioWizard implements Serializable {

	private Usuario usuario = new Usuario();

	private boolean skip;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void save() {
		FacesMessage mensaje = new FacesMessage("Successful", "Bienvenido :" + usuario.getNombre());
		FacesContext.getCurrentInstance().addMessage(null, mensaje);
	}

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public String onFlowProcess(FlowEvent event) {
		if (skip) {
			skip = false; // reset in case user goes back
			return "confirm";
		} else {
			return event.getNewStep();
		}
	}
}
