package Funcional;

import Interfaz.RegistroDePago;

public class CalculoPago {
	
	public CalculoPago() {
		
	}
	
	ItemsRegistrados ItemsRegistrados;
	
	double Total = 0.0;
	double Efectivo = 0.0;
	double Saldo = 0.0;
	
	double Res = 3000;
	double Pollo = 3000;
	double Cerdo = 3000;
	double Pescado = 3000;
	double Sopa = 2000;
	double Principio = 2000;
	double Jugo = 1000;
	double Desechable = 500;
	
	RegistroDePago RegistroDePago;
	
	public void CalcularTotal() {
		for (int i = 1; i < 100; i++) {
			if (ItemsRegistrados.ResRegistrado == i) {
				Total += Res * i;
			} else if (ItemsRegistrados.PolloRegistrado == i) {
				Total += Pollo * i;
			} else if (ItemsRegistrados.CerdoRegistrado == i) {
				Total += Cerdo * i;
			} else if (ItemsRegistrados.PescadoRegistrado == i) {
				Total += Pescado * i;
			} else if (ItemsRegistrados.SopaRegistrado == i) {
				Total += Sopa * i;
			} else if (ItemsRegistrados.PrincipioRegistrado == i) {
				Total += Principio * i;
			} else if (ItemsRegistrados.JugoRegistrado == i) {
				Total += Jugo * i;
			} else if (ItemsRegistrados.DesechableRegistrado == i) {
				Total += Desechable * i;
			}
		}
		RegistroDePago.CampoTotal.setText(String.valueOf(Total));
	}
	
	public void CalcularSaldo() {
		Efectivo = Double.parseDouble(RegistroDePago.CampoEfectivo.getText());		
		Saldo = Efectivo - Total;

		RegistroDePago.CampoSaldo.setText(String.valueOf(Saldo));
		
	}
}
