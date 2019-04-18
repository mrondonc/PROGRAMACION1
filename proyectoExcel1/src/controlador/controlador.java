package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.InterfazGUI;
import modelo.Metodos;

public class controlador implements ActionListener{

	private Metodos md;
	private InterfazGUI gui;
	
	public controlador() {
		md = new Metodos();
		gui = new InterfazGUI(this);
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if(evento.getActionCommand().equalsIgnoreCase(gui.getPanelEntrada().CONVERTIR)) {
			
			gui.getPanelResultados().getTxtTasaEfectiva().setText(String.valueOf(md.calcularTasaEfectiva(Double.parseDouble(gui.getPanelEntrada().getTxtInteres().getText()))) + "%");
			
			gui.getPanelResultados().getTxtValorAnualidad().setText(String.valueOf(md.calcularValorAnualidad(md.getTasaEfectiva(), Integer.parseInt(gui.getPanelEntrada().getTxtPeriodo().getText()))));
			
			gui.getPanelResultados().getTxtValorCuota().setText(String.valueOf(md.calcularValorCuota(Double.parseDouble(gui.getPanelEntrada().getTxtInversion().getText()), md.getValorAnualidad())));
			}
	}
}