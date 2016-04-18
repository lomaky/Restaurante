package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Funcional.CalculoPago;
import Funcional.ItemsRegistrados;
import Funcional.ItemsVendidos;

public class RegistroDePago extends JFrame {

	private JPanel contentPane;
	public static JTextField CampoTotal;
	public static JTextField CampoEfectivo;
	public static JTextField CampoSaldo;

	/**
	 * Create the frame.
	 */
	public RegistroDePago() {
		setTitle("Pago");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 209);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setForeground(new Color(255, 102, 0));
		lblTotal.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		lblTotal.setBounds(23, 16, 106, 32);
		contentPane.add(lblTotal);
		
		CampoTotal = new JTextField();
		CampoTotal.setForeground(new Color(255, 102, 0));
		CampoTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		CampoTotal.setEditable(false);
		CampoTotal.setBounds(132, 20, 175, 26);
		contentPane.add(CampoTotal);
		CampoTotal.setColumns(10);
		
		JLabel lblEfectivo = new JLabel("Efectivo");
		lblEfectivo.setForeground(new Color(204, 0, 51));
		lblEfectivo.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblEfectivo.setBounds(33, 60, 96, 26);
		contentPane.add(lblEfectivo);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setForeground(new Color(204, 0, 51));
		lblSaldo.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblSaldo.setBounds(33, 98, 64, 21);
		contentPane.add(lblSaldo);
		
		CampoEfectivo = new JTextField();
		CampoEfectivo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		CampoEfectivo.setBounds(133, 60, 130, 26);
		contentPane.add(CampoEfectivo);
		CampoEfectivo.setColumns(10);
		
		CampoSaldo = new JTextField();
		CampoSaldo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		CampoSaldo.setEditable(false);
		CampoSaldo.setBounds(133, 95, 130, 26);
		contentPane.add(CampoSaldo);
		CampoSaldo.setColumns(10);
		
		final ItemsRegistrados ItemsRegistrados = new ItemsRegistrados();
		final ItemsVendidos ItemsVendidos = new ItemsVendidos();
		final RegistroDeAlmuerzo RegistroDeAlmuerzo = new RegistroDeAlmuerzo();
		
		JButton BotonRecibido = new JButton("Recibido");
		BotonRecibido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItemsRegistrados.RegistroAlmuerzo();
				ItemsVendidos.Vendido(ItemsRegistrados.RegistroAlmuerzo());
				ItemsRegistrados.LimpiarRegistro();
				dispose();
				RegistroDeAlmuerzo.setVisible(false);
			}
		});
		BotonRecibido.setForeground(new Color(255, 102, 0));
		BotonRecibido.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BotonRecibido.setBounds(33, 141, 131, 29);
		contentPane.add(BotonRecibido);
		
		final CalculoPago CalculoPago = new CalculoPago();
		
		JButton BotonOk = new JButton("OK");
		BotonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Double.parseDouble(CampoEfectivo.getText()) == 0) {
					JOptionPane.showMessageDialog(null, "Error, el valor efectivo debe ser mayor que cero.");
				} else if (Double.parseDouble(CampoEfectivo.getText()) < Double.parseDouble(CampoTotal.getText())) {
					JOptionPane.showMessageDialog(null, "Error, el valor efectivo debe ser mayor que el Valor Total.");
				} else {
					CalculoPago.CalcularSaldo();
				}
			}
		});
		BotonOk.setForeground(new Color(204, 0, 51));
		BotonOk.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		BotonOk.setBounds(258, 62, 49, 29);
		contentPane.add(BotonOk);
		
		JButton BotonCancelarPago = new JButton("Cancelar");
		BotonCancelarPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		BotonCancelarPago.setForeground(new Color(255, 102, 0));
		BotonCancelarPago.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BotonCancelarPago.setBounds(169, 141, 117, 29);
		contentPane.add(BotonCancelarPago);
	}
	
	public void FormatearValores (double valor) {
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###,###.##");
		String strvalor = df.format(valor);
		CampoTotal.setText(strvalor);
		CampoEfectivo.setText(strvalor);
		CampoSaldo.setText(strvalor);
	}
}
