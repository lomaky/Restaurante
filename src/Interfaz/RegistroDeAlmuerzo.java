package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Funcional.CalculoPago;
import Funcional.ItemsRegistrados;
import Funcional.ItemsVendidos;

public class RegistroDeAlmuerzo extends JFrame {

	private JPanel contentPane;
	public static JSpinner SpinnerSopa;
	public static JSpinner SpinnerRes;
	public static JSpinner SpinnerPollo;
	public static JSpinner SpinnerCerdo;
	public static JSpinner SpinnerPescado;
	public static JSpinner SpinnerJugo;
	public static JSpinner SpinnerDesechable;
	public static JSpinner SpinnerPrincipio;

	/**
	 * Create the frame.
	 */
	public RegistroDeAlmuerzo() {
		setTitle("Registro de Almuerzo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 343);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(11, 2, 5, 5));
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setForeground(new Color(255, 102, 0));
		lblItem.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblItem.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblItem);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setForeground(new Color(255, 102, 0));
		lblCantidad.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCantidad);
		
		JLabel lblRes = new JLabel("   Res");
		lblRes.setForeground(new Color(204, 0, 51));
		lblRes.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblRes);
		
		SpinnerRes = new JSpinner();
		SpinnerRes.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		SpinnerRes.setForeground(new Color(204, 0, 51));
		contentPane.add(SpinnerRes);
		
		JLabel lblPollo = new JLabel("   Pollo");
		lblPollo.setForeground(new Color(204, 0, 51));
		lblPollo.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblPollo);
		
		SpinnerPollo = new JSpinner();
		SpinnerPollo.setForeground(new Color(204, 0, 51));
		SpinnerPollo.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(SpinnerPollo);
		
		JLabel lblCerdo = new JLabel("   Cerdo");
		lblCerdo.setForeground(new Color(204, 0, 51));
		lblCerdo.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblCerdo);
		
		SpinnerCerdo = new JSpinner();
		SpinnerCerdo.setForeground(new Color(204, 0, 51));
		SpinnerCerdo.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(SpinnerCerdo);
		
		JLabel lblPescado = new JLabel("   Pescado");
		lblPescado.setForeground(new Color(204, 0, 51));
		lblPescado.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblPescado);
		
		SpinnerPescado = new JSpinner();
		SpinnerPescado.setForeground(new Color(204, 0, 51));
		SpinnerPescado.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(SpinnerPescado);
		
		JLabel lblSopa = new JLabel("   Sopa");
		lblSopa.setForeground(new Color(204, 0, 51));
		lblSopa.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblSopa);
		
		SpinnerSopa = new JSpinner();
		SpinnerSopa.setForeground(new Color(204, 0, 51));
		SpinnerSopa.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(SpinnerSopa);
		
		JLabel lblPrincipio = new JLabel("   Principio");
		lblPrincipio.setForeground(new Color(204, 0, 51));
		lblPrincipio.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblPrincipio);
		
		SpinnerPrincipio = new JSpinner();
		SpinnerPrincipio.setForeground(new Color(204, 0, 51));
		SpinnerPrincipio.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(SpinnerPrincipio);
		
		JLabel lblJugo = new JLabel("   Jugo");
		lblJugo.setForeground(new Color(204, 0, 51));
		lblJugo.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblJugo);
		
		SpinnerJugo = new JSpinner();
		SpinnerJugo.setForeground(new Color(204, 0, 51));
		SpinnerJugo.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(SpinnerJugo);
		
		JLabel lblDesechable = new JLabel("   Desechable");
		lblDesechable.setForeground(new Color(204, 0, 51));
		lblDesechable.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblDesechable);
		
		SpinnerDesechable = new JSpinner();
		SpinnerDesechable.setForeground(new Color(204, 0, 51));
		SpinnerDesechable.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(SpinnerDesechable);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		final ItemsRegistrados ItemsRegistrados = new ItemsRegistrados();
		final RegistroDePago RegistroDePago = new RegistroDePago();
		final CalculoPago CalculoPago = new CalculoPago();
		
		JButton BotonRegistrar = new JButton("Registrar");
		BotonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoPago.CalcularTotal();
				RegistroDePago.setVisible(true);
			}
		});
		BotonRegistrar.setBackground(new Color(245, 245, 245));
		BotonRegistrar.setForeground(new Color(255, 102, 0));
		BotonRegistrar.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		contentPane.add(BotonRegistrar);
		
		JButton BotonCancelarAlmuerzo = new JButton("Cancelar");
		BotonCancelarAlmuerzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItemsRegistrados.LimpiarRegistro();
				dispose();
			}
		});
		BotonCancelarAlmuerzo.setForeground(new Color(255, 102, 0));
		BotonCancelarAlmuerzo.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		contentPane.add(BotonCancelarAlmuerzo);
	}
}
