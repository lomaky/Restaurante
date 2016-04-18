package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Funcional.DatosUsuario;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EscogerAccion extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public EscogerAccion() {
		setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		setTitle("Restaurante Portos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 214);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblBienvenid = new JLabel("Bienvenid@ " + Autenticacion.CampoUsuario.getText() + "!");
		lblBienvenid.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		lblBienvenid.setForeground(new Color(255, 102, 0));
		lblBienvenid.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenid.setBounds(90, 16, 201, 28);
		contentPane.add(lblBienvenid);
		
		JLabel lblquDeseasHacer = new JLabel("¿Qué deseas hacer?");
		lblquDeseasHacer.setForeground(new Color(204, 0, 51));
		lblquDeseasHacer.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblquDeseasHacer.setBounds(116, 56, 156, 20);
		contentPane.add(lblquDeseasHacer);
		
		final RegistroDeAlmuerzo RegistroDeAlmuerzo = new RegistroDeAlmuerzo();
		
		JButton BotonRegistrarAlmuerzo = new JButton("Registrar Almuerzo");
		BotonRegistrarAlmuerzo.setBackground(new Color(255, 255, 255));
		BotonRegistrarAlmuerzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroDeAlmuerzo.setVisible(true);
			}
		});
		BotonRegistrarAlmuerzo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		BotonRegistrarAlmuerzo.setForeground(new Color(255, 102, 0));
		BotonRegistrarAlmuerzo.setBounds(90, 88, 210, 44);
		contentPane.add(BotonRegistrarAlmuerzo);
		
		final ConsultaDeVentas ConsultaDeVentas = new ConsultaDeVentas();
		
		JButton BotonConsultarVentas = new JButton("Consultar Ventas");
		BotonConsultarVentas.setForeground(new Color(255, 102, 0));
		BotonConsultarVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaDeVentas.setVisible(true);
			}
		});
		BotonConsultarVentas.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		BotonConsultarVentas.setBounds(99, 139, 189, 44);
		contentPane.add(BotonConsultarVentas);
		
		JButton BotonSalir = new JButton("Salir");
		BotonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BotonSalir.setForeground(new Color(204, 0, 51));
		BotonSalir.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		BotonSalir.setBounds(311, 0, 58, 28);
		contentPane.add(BotonSalir);
	}
}
