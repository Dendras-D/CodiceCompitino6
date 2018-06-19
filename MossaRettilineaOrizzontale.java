package compitino6;

public class MossaRettilineaOrizzontale extends Mossa {

	@Override
	public PuntoXY esegui(PuntoXY puntoDiPartenza) {
		PuntoXY raggiunto = new PuntoXY(puntoDiPartenza.getX()+this.getPassi(), puntoDiPartenza.getY());
		//+getPassi(), non - (è il segno dei passi [i.e. il loro verso] a decidere il segno del numero)
		return raggiunto;
	}
	public MossaRettilineaOrizzontale(int passi) {
		super(passi); //riuso del codice
	}

}
