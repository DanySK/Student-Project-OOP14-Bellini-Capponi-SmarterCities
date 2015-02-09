package it.unibo.oop.smac.view.stolencarspanel;

import it.unibo.oop.smac.controller.IStolenCarsObserver;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.border.TitledBorder;

/**
 * Classe che implementa un pannello che mostra la tabella delle macchine rubate
 * 
 */
public class TablePanel extends JPanel {

	private static final long serialVersionUID = -7140640507027357573L;

	/**
	 * E' il modello dei dati visualizzati nella tabella
	 */
	private final StolenCarTableModel stolenCarTableModel;

	/**
	 * parent che contiene i metodi d'accesso (e gestione degli errori) al model
	 */
	private final IStolenCarsPanel stolenCarsPanel;

	/**
	 * Costruttore pubblico della classe.
	 * 
	 * @param stolenCarsPanel
	 */
	public TablePanel(StolenCarsPanel stolenCarsPanel) {
		super();
		// imposto il layout
		this.setBorder(new TitledBorder("Dati"));
		this.setLayout(new FlowLayout());

		// salvo il model per un utilizzo successivo
		this.stolenCarsPanel = stolenCarsPanel;
		this.add(new JLabel("informaioni sulle macchine rubate"));

		// inizializzo la classe che andrà a gestire i dati nel model
		stolenCarTableModel = new StolenCarTableModel();
		// creo la tabella con i dati
		JTable table = new JTable(stolenCarTableModel);
		table.setEnabled(false);
		this.add(new JScrollPane(table));

		// imposto un timer che ogni X mi aggiorna i dati nella tabella
		Timer timer = new Timer(2000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					IStolenCarsObserver sco = getStolenCarsPanel()
							.getStolenCarsObserver();
					stolenCarTableModel.updateList(sco.getStolenCarsInfoList());
				} catch (IllegalStateException exception) {
					// not an error
				}
			}
		});
		timer.setRepeats(true);
		timer.setDelay(2000);
		timer.start();
	}

	public IStolenCarsPanel getStolenCarsPanel() {
		return stolenCarsPanel;
	}

}