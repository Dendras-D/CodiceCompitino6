package compitino6;

public abstract class Mossa {
	private int passi;

	public Mossa(int passi) throws RobotException {
		super();
		if (passi != 0)
			this.passi = passi;
		else
			throw new RobotException();
	}

	public int getPassi() {
		return passi;
	}
	
	public abstract PuntoXY esegui(PuntoXY puntoDiPartenza); //abstract perchénon possiamo darne 
	//un'implementazione finchè non sappiamo se lo spostamento sia orizzontale o verticale
	//(in più è in corsivo in UML eheheh)
	
	
}
