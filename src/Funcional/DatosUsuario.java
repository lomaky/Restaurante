package Funcional;

import Interfaz.Autenticacion;

public class DatosUsuario 
{	
	public DatosUsuario()
	{
		
	}
	
	String Usuario1 = "";
	String Contraseña1 = "";
	
	public int AutenticarUsuario()
	{
		Usuario1 = Autenticacion.CampoUsuario.getText();
		Contraseña1 = Autenticacion.CampoContraseña.getText();
		
		if (Usuario1.equals("Laura") && Contraseña1.equals("poli123"))
		{
			return 1;
		} else if (Usuario1.equals("Visitante") && Contraseña1.equals("poli123")) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	public String DarUsuario() {
		return Usuario1;
	}
}
