package Vista;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	private static final long serialVersionUID = 1L;
	//private JLabel labEntrada;
	private JLabel labEntradaInteres;
	private JLabel labEntradaPeriodo;
	private JLabel labEntradaInversion;
	private JTextField txtNumero;
	private JTextField txtPeriodo;
	private JTextField txtInversion;
	private JTextField txtInteres;
	private JButton butConvertir;
	public static final String CONVERTIR = "CALCULAR";
	
	public PanelEntrada() {
		setLayout(new GridLayout(4,2));
		TitledBorder border = BorderFactory.createTitledBorder("CREDITO");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		labEntradaPeriodo= new JLabel("Periodo");
		txtPeriodo = new JTextField("");
		txtPeriodo.setForeground(Color.BLACK);
		txtPeriodo.setBackground(Color.WHITE);
		add(labEntradaPeriodo);
		add(txtPeriodo);
		
		labEntradaInteres= new JLabel("Interes");
		txtInteres = new JTextField("");
		txtInteres.setForeground(Color.BLACK);
		txtInteres.setBackground(Color.WHITE);
		add(labEntradaInteres);
		add(txtInteres);
		
		labEntradaInversion = new JLabel("Inversion");
		txtInversion = new JTextField("");
		txtInversion.setForeground(Color.BLACK);
		txtInversion.setBackground(Color.WHITE);
		add(labEntradaInversion);
		add(txtInversion);
		
		butConvertir = new JButton("Calcular");
		butConvertir.setActionCommand(CONVERTIR);
//		butConvertir.setBackground(Color.BLUE);
//		butConvertir.setForeground(Color.BLACK);
		add(new JLabel(""));
		add(butConvertir);		
	}
	public JLabel getLabEntradaInteres() {
		return labEntradaInteres;
	}
	public void setLabEntradaInteres(JLabel labEntradaInteres) {
		this.labEntradaInteres = labEntradaInteres;
	}
	public JLabel getLabEntradaPeriodo() {
		return labEntradaPeriodo;
	}
	public void setLabEntradaPeriodo(JLabel labEntradaPeriodo) {
		this.labEntradaPeriodo = labEntradaPeriodo;
	}
	public JLabel getLabEntradoInversion() {
		return labEntradaInversion;
	}
	public void setLabEntradaInversion(JLabel labEntradaInversion) {
		this.labEntradaInversion = labEntradaInversion;
	}
	public JTextField getTxtNumero() {
		return txtNumero;
	}
	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}
	public JTextField getTxtPeriodo() {
		return txtPeriodo;
	}
	public void setTxtPeriodo(JTextField txtPeriodo) {
		this.txtPeriodo = txtPeriodo;
	}
	public JTextField getTxtInversion() {
		return txtInversion;
	}
	public void setTxtInversion(JTextField txtInversion) {
		this.txtInversion = txtInversion;
	}
	public JTextField getTxtInteres() {
		return txtInteres;
	}
	public void setTxtInteres(JTextField txtInteres) {
		this.txtInteres = txtInteres;
	}
	public JButton getButConvertir() {
		return butConvertir;
	}
	public void setButConvertir(JButton butConvertir) {
		this.butConvertir = butConvertir;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static String getConvertir() {
		return CONVERTIR;
	}
}