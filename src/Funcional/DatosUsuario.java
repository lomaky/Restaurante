package Funcional;

import Interfaz.Autenticacion;

public class DatosUsuario 
{	
	public DatosUsuario()
	{
		
	}
	
	String Usuario1 = "";
	String Contrasena1 = "";
	
	public int AutenticarUsuario()
	{
		Usuario1 = Autenticacion.CampoUsuario.getText();
		Contrasena1 = Autenticacion.CampoContrasena.getText();
		
		if (Usuario1.equals("Laura") && Contrasena1.equals("poli123"))
		{
			return 1;
		} else if (Usuario1.equals("Visitante") && Contrasena1.equals("poli123")) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	public String DarUsuario() {
		return Usuario1;
	}
}
