import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class CalculAction extends AbstractAction {
	private CalculatriceFenetre fenetre;
	
	public CalculAction(CalculatriceFenetre fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) { 
		//Action lors du clic sur le bouton calculer
	} 
}
