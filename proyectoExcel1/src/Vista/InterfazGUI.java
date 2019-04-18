package Vista;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import controlador.controlador;

public class InterfazGUI extends JFrame{
	private PanelEntrada panelEntrada;
	private PanelResultado panelResultados;
	
	public InterfazGUI(controlador control) {	
		setSize(500,400);
		setResizable(false);
		setTitle("Calculo de creditos de cuota fija");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		panelResultados = new PanelResultado();
		add(panelResultados, BorderLayout.CENTER);
		panelEntrada.getButConvertir().addActionListener(control);
	}
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}
	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}
	public PanelResultado getPanelResultados() {
		return panelResultados;
	}
	public void setPanelResultados(PanelResultado panelResultados) {
		this.panelResultados = panelResultados;
	}
}