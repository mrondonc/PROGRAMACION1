package Vista;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultado extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel labResultadoTasaEfectiva;
	private JLabel labResultadoValorAnualidad;
	private JLabel labResultadoValorCuota;
	private JTextField txtTasaEfectiva;
	private JTextField txtValorAnualidad;
	private JTextField txtValorCuota;
	
	public PanelResultado() {
		setLayout(new GridLayout(3,2));
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labResultadoTasaEfectiva = new JLabel("Tasa Efectiva es:");
		txtTasaEfectiva = new JTextField("");
		txtTasaEfectiva.setForeground(Color.ORANGE);
		txtTasaEfectiva.setBackground(Color.BLACK);
		add(labResultadoTasaEfectiva);
		add(txtTasaEfectiva);
		
		labResultadoValorAnualidad = new JLabel("Valor de anualidad es:");
		txtValorAnualidad = new JTextField("");
		txtValorAnualidad.setForeground(Color.ORANGE);
		txtValorAnualidad.setBackground(Color.BLACK);
		add(labResultadoValorAnualidad);
		add(txtValorAnualidad);
		
		labResultadoValorCuota = new JLabel("Valor cuota es: ");
		txtValorCuota = new JTextField("");
		txtValorCuota.setForeground(Color.ORANGE);
		txtValorCuota.setBackground(Color.BLACK);
		add(labResultadoValorCuota);
		add(txtValorCuota);
	}
	public JTextField getTxtTasaEfectiva() {
		return txtTasaEfectiva;
	}

	public void setTxtTasaEfectiva(JTextField txtTasaEfectiva) {
		this.txtTasaEfectiva = txtTasaEfectiva;
	}

	public JTextField getTxtValorAnualidad() {
		return txtValorAnualidad;
	}

	public void setTxtValorAnualidad(JTextField txtValorAnualidad) {
		this.txtValorAnualidad = txtValorAnualidad;
	}

	public JTextField getTxtValorCuota() {
		return txtValorCuota;
	}

	public void setTxtValorCuota(JTextField txtValorCuota) {
		this.txtValorCuota = txtValorCuota;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}