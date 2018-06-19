package compitino6;

public class MossaRettilineaVerticale extends Mossa {

	@Override
	public PuntoXY esegui(PuntoXY puntoDiPartenza) {
		PuntoXY raggiunto = new PuntoXY(puntoDiPartenza.getX(), puntoDiPartenza.getY()+this.getPassi());
		//+getPassi(), non - (è il segno dei passi [i.e. il loro verso] a decidere il segno del numero)
		return raggiunto;
	}
	
	public MossaRettilineaVerticale(int passi)  {
		super(passi); //riuso del codice
	}
	

}
