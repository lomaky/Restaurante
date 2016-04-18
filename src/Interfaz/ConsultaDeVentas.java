package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaDeVentas extends JFrame {

	private JPanel contentPane;
	public static JTextField CampoResVendido;
	public static JTextField CampoPolloVendido;
	public static JTextField CampoCerdoVendido;
	public static JTextField CampoPescadoVendido;
	public static JTextField CampoSopaVendido;
	public static JTextField CampoPrincipioVendido;
	public static JTextField CampoJugoVendido;
	public static JTextField CampoDesechableVendido;

	/**
	 * Create the frame.
	 */
	public ConsultaDeVentas() {
		setTitle("Consulta de Ventas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 318);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(10, 2, 5, 5));
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setForeground(new Color(204, 0, 51));
		lblItem.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblItem.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblItem);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblCantidad.setForeground(new Color(204, 0, 51));
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCantidad);
		
		JLabel lblRes = new JLabel("   Res");
		lblRes.setForeground(new Color(255, 102, 0));
		lblRes.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblRes);
		
		CampoResVendido = new JTextField();
		CampoResVendido.setForeground(new Color(255, 102, 0));
		CampoResVendido.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		CampoResVendido.setEditable(false);
		contentPane.add(CampoResVendido);
		CampoResVendido.setColumns(10);
		
		JLabel lblPollo = new JLabel("   Pollo");
		lblPollo.setForeground(new Color(255, 102, 0));
		lblPollo.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblPollo);
		
		CampoPolloVendido = new JTextField();
		CampoPolloVendido.setForeground(new Color(255, 102, 0));
		CampoPolloVendido.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		CampoPolloVendido.setEditable(false);
		contentPane.add(CampoPolloVendido);
		CampoPolloVendido.setColumns(10);
		
		JLabel lblCerdo = new JLabel("   Cerdo");
		lblCerdo.setForeground(new Color(255, 102, 0));
		lblCerdo.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblCerdo);
		
		CampoCerdoVendido = new JTextField();
		CampoCerdoVendido.setForeground(new Color(255, 102, 0));
		CampoCerdoVendido.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		CampoCerdoVendido.setEditable(false);
		contentPane.add(CampoCerdoVendido);
		CampoCerdoVendido.setColumns(10);
		
		JLabel lblPescado = new JLabel("   Pescado");
		lblPescado.setForeground(new Color(255, 102, 0));
		lblPescado.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblPescado);
		
		CampoPescadoVendido = new JTextField();
		CampoPescadoVendido.setForeground(new Color(255, 102, 0));
		CampoPescadoVendido.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		CampoPescadoVendido.setEditable(false);
		contentPane.add(CampoPescadoVendido);
		CampoPescadoVendido.setColumns(10);
		
		JLabel lblSopa = new JLabel("   Sopa");
		lblSopa.setForeground(new Color(255, 102, 0));
		lblSopa.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblSopa);
		
		CampoSopaVendido = new JTextField();
		CampoSopaVendido.setForeground(new Color(255, 102, 0));
		CampoSopaVendido.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		CampoSopaVendido.setEditable(false);
		contentPane.add(CampoSopaVendido);
		CampoSopaVendido.setColumns(10);
		
		JLabel lblPrincipio = new JLabel("   Principio");
		lblPrincipio.setForeground(new Color(255, 102, 0));
		lblPrincipio.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblPrincipio);
		
		CampoPrincipioVendido = new JTextField();
		CampoPrincipioVendido.setForeground(new Color(255, 102, 0));
		CampoPrincipioVendido.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		CampoPrincipioVendido.setEditable(false);
		contentPane.add(CampoPrincipioVendido);
		CampoPrincipioVendido.setColumns(10);
		
		JLabel lblJugo = new JLabel("   Jugo");
		lblJugo.setForeground(new Color(255, 102, 0));
		lblJugo.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblJugo);
		
		CampoJugoVendido = new JTextField();
		CampoJugoVendido.setForeground(new Color(255, 102, 0));
		CampoJugoVendido.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		CampoJugoVendido.setEditable(false);
		contentPane.add(CampoJugoVendido);
		CampoJugoVendido.setColumns(10);
		
		JLabel lblDesechable = new JLabel("   Desechable");
		lblDesechable.setForeground(new Color(255, 102, 0));
		lblDesechable.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblDesechable);
		
		CampoDesechableVendido = new JTextField();
		CampoDesechableVendido.setForeground(new Color(255, 102, 0));
		CampoDesechableVendido.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		CampoDesechableVendido.setEditable(false);
		contentPane.add(CampoDesechableVendido);
		CampoDesechableVendido.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JButton BotonRegresar = new JButton("Regresar");
		BotonRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		BotonRegresar.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BotonRegresar.setForeground(new Color(204, 0, 51));
		contentPane.add(BotonRegresar);
	}

}
