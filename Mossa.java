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
	
	public abstract PuntoXY esegui(PuntoXY puntoDiPartenza); //abstract perch�non possiamo darne 
	//un'implementazione finch� non sappiamo se lo spostamento sia orizzontale o verticale
	//(in pi� � in corsivo in UML eheheh)
	
	
}
