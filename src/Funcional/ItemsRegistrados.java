package Funcional;

import Interfaz.RegistroDeAlmuerzo;

public class ItemsRegistrados 
{
	public ItemsRegistrados() {
		
	}
	
	int ResRegistrado = 0;
	int PolloRegistrado = 0;
	int CerdoRegistrado = 0;
	int PescadoRegistrado = 0;
	int SopaRegistrado = 0;
	int PrincipioRegistrado = 0;
	int JugoRegistrado = 0;
	int DesechableRegistrado = 0;
	
	public int[] RegistroAlmuerzo() {
		int[] Registrados = new int[8];
		
		Registrados[0] = ResRegistrado = (Integer) RegistroDeAlmuerzo.SpinnerRes.getValue();
		Registrados[1] = PolloRegistrado = (Integer) RegistroDeAlmuerzo.SpinnerPollo.getValue();
		Registrados[2] = CerdoRegistrado = (Integer) RegistroDeAlmuerzo.SpinnerCerdo.getValue();
		Registrados[3] = PescadoRegistrado = (Integer) RegistroDeAlmuerzo.SpinnerPescado.getValue();
		Registrados[4] = SopaRegistrado = (Integer) RegistroDeAlmuerzo.SpinnerSopa.getValue();
		Registrados[5] = PrincipioRegistrado = (Integer) RegistroDeAlmuerzo.SpinnerPrincipio.getValue();
		Registrados[6] = JugoRegistrado = (Integer) RegistroDeAlmuerzo.SpinnerJugo.getValue();
		Registrados[7] = DesechableRegistrado = (Integer) RegistroDeAlmuerzo.SpinnerDesechable.getValue();
		
		return Registrados;
	}
	
	public void LimpiarRegistro() {
		RegistroDeAlmuerzo.SpinnerRes.setValue(0);
		RegistroDeAlmuerzo.SpinnerPollo.setValue(0);
		RegistroDeAlmuerzo.SpinnerCerdo.setValue(0);
		RegistroDeAlmuerzo.SpinnerPescado.setValue(0);
		RegistroDeAlmuerzo.SpinnerSopa.setValue(0);
		RegistroDeAlmuerzo.SpinnerPrincipio.setValue(0);
		RegistroDeAlmuerzo.SpinnerJugo.setValue(0);
		RegistroDeAlmuerzo.SpinnerDesechable.setValue(0);
	}
}
