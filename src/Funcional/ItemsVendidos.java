package Funcional;

import Interfaz.ConsultaDeVentas;

public class ItemsVendidos {
	public ItemsVendidos() {
		
	}
	
	int ResVendido = 0;
	int PolloVendido = 0;
	int CerdoVendido = 0;
	int PescadoVendido = 0;
	int SopaVendido = 0;
	int PrincipioVendido = 0;
	int JugoVendido = 0;
	int DesechableVendido = 0;
	
	ItemsRegistrados ItemsRegistrados;
	ConsultaDeVentas ConsultaDeVentas;
	
	public void Vendido(int[] Registrados) {
		String[] Vendidos = new String[8];
		
		ResVendido += Registrados[0];
		PolloVendido += Registrados[1];
		CerdoVendido += Registrados[2];
		PescadoVendido += Registrados[3];
		SopaVendido += Registrados[4];
		PrincipioVendido += Registrados[5];
		JugoVendido += Registrados[6];
		DesechableVendido += Registrados[7];
		
		Vendidos[0] = Integer.toString(ResVendido);
		Vendidos[1] = Integer.toString(PolloVendido);
		Vendidos[2] = Integer.toString(CerdoVendido);
		Vendidos[3] = Integer.toString(PescadoVendido);
		Vendidos[4] = Integer.toString(SopaVendido);
		Vendidos[5] = Integer.toString(PrincipioVendido);
		Vendidos[6] = Integer.toString(JugoVendido);
		Vendidos[7] = Integer.toString(DesechableVendido);
		
		ConsultaDeVentas.CampoResVendido.setText(Vendidos[0]);
		ConsultaDeVentas.CampoPolloVendido.setText(Vendidos[1]);
		ConsultaDeVentas.CampoCerdoVendido.setText(Vendidos[2]);
		ConsultaDeVentas.CampoPescadoVendido.setText(Vendidos[3]);
		ConsultaDeVentas.CampoSopaVendido.setText(Vendidos[4]);
		ConsultaDeVentas.CampoPrincipioVendido.setText(Vendidos[5]);
		ConsultaDeVentas.CampoJugoVendido.setText(Vendidos[6]);
		ConsultaDeVentas.CampoDesechableVendido.setText(Vendidos[7]);
	}
	
}
