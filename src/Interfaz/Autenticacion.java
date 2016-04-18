package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Funcional.DatosUsuario;

public class Autenticacion extends JFrame {

	private JPanel contentPane;
	public static JTextField CampoUsuario;
	public static JPasswordField CampoContraseña;

	/**
	 * Create the frame.
	 */
	public Autenticacion() {
		setTitle("Incio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 229);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRestaurantePortos = new JLabel("Restaurante Portos");
		lblRestaurantePortos.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestaurantePortos.setForeground(new Color(255, 102, 0));
		lblRestaurantePortos.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		lblRestaurantePortos.setBounds(44, 15, 254, 28);
		contentPane.add(lblRestaurantePortos);
		
		JLabel lblPorFavorIngresa = new JLabel("Por favor ingresa tus datos");
		lblPorFavorIngresa.setForeground(new Color(204, 0, 51));
		lblPorFavorIngresa.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPorFavorIngresa.setBounds(25, 46, 226, 25);
		contentPane.add(lblPorFavorIngresa);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(255, 102, 0));
		lblUsuario.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblUsuario.setBounds(35, 83, 85, 25);
		contentPane.add(lblUsuario);
		
		JLabel lblConrasea = new JLabel("Conraseña");
		lblConrasea.setForeground(new Color(255, 102, 0));
		lblConrasea.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblConrasea.setBounds(34, 115, 122, 28);
		contentPane.add(lblConrasea);
		
		CampoUsuario = new JTextField();
		CampoUsuario.setForeground(new Color(204, 0, 0));
		CampoUsuario.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		CampoUsuario.setBounds(168, 83, 130, 26);
		contentPane.add(CampoUsuario);
		CampoUsuario.setColumns(10);
		
		CampoContraseña = new JPasswordField();
		CampoContraseña.setForeground(new Color(204, 0, 0));
		CampoContraseña.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		CampoContraseña.setBounds(168, 117, 130, 26);
		contentPane.add(CampoContraseña);
		
		final DatosUsuario Datos = new DatosUsuario();
		final EscogerAccion EscogerAcción = new EscogerAccion();
		
		JButton BotonIngresar = new JButton("Ingresar");
		BotonIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Datos.AutenticarUsuario() == 1) {
					EscogerAcción.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Error, usuario o contraseña inválidos.");
				}
			}
		});
		BotonIngresar.setBackground(new Color(255, 255, 255));
		BotonIngresar.setForeground(new Color(204, 0, 51));
		BotonIngresar.setBounds(71, 161, 85, 29);
		contentPane.add(BotonIngresar);
		
		JButton BotonCancelarInicio = new JButton("Cancelar");
		BotonCancelarInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BotonCancelarInicio.setForeground(new Color(204, 0, 51));
		BotonCancelarInicio.setBounds(166, 161, 85, 29);
		contentPane.add(BotonCancelarInicio);
	}
}
