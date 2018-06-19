package compitino6;

import java.util.ArrayList;
import java.util.List;

public class RobotProgrammabile {
	private List<Mossa> programma; //la cardinalità è molteplice, sotto specifica il tipo di collezione (ArrayList)
	private PuntoXY posizione;
	private ISupervisore supervisore;
	
	public RobotProgrammabile(ISupervisore supervisore) throws RobotException {
		this.programma = new ArrayList(0);
		if((supervisore == null) || (supervisore.posizioneValida(posizione))) //IL CONTROLLO CON SUPERVISORE
			//DELLA POSIZIONE VA FATTO PRIMA DI ASSEGNARE QUALUNQUE DEI DUE AL ROBOT
			throw new RobotException();
		else {
			this.supervisore = supervisore;
			this.posizione = new PuntoXY(0,0);
		}
	}

	public PuntoXY getPosizione() {
		return posizione;
	}

	public void aggiungiMossa(Mossa mossa) {
		if (mossa != null)
			this.programma.add(mossa); //è praticamente add con un controllo
	}
	
	public void aggiungiMossa(Mossa[] mosse) {
		for (Mossa mossa : mosse) 
				aggiungiMossa(mossa); //fa lui il controllo poi, non è necessario metterlo come condizione
	}
	
	public int numeroMosse() {
		return programma.size();
	}
	
	public boolean eseguiProgramma() throws RobotException {
		for (Mossa mossa : programma) {
			posizione = mossa.esegui(posizione);
			if (!(supervisore.posizioneValida(posizione)))
				throw new RobotException();
		}
		if (supervisore.obiettivoRaggiunto(posizione))
			return true;
		return false;
	}

}
