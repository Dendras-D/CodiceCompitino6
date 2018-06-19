package compitino6;

public class Mappa implements ISupervisore {
	
	PuntoXY obiettivo; //perché è packaged (la tilde). Visibile da tutto il package
	private int maxX;
	private int minX;
	private int maxY;
	private int minY;
	
	public Mappa(int minX, int maxX, int minY, int maxY, PuntoXY obiettivo) throws RobotException {
		if (obiettivo != null) {
			if (this.posizioneValida(obiettivo)) {
				if (((minX<maxX) && (minY<maxY))) {
					this.maxX = maxX;
					this.maxY = maxY;
					this.minX = minX;
					this.minY = minY;
					this.obiettivo = obiettivo;
				}
			}
		}
		else
			throw new RobotException();
		
			
	}
	
	
	@Override
	public boolean posizioneValida(PuntoXY posizione) {
		if (posizione != null) {
			if (((posizione.getX()>=minX) && (posizione.getX()<=maxX)) && ((posizione.getY()>= minY) && 
					(posizione.getY()<=maxY))) {
				return true;
			}
			else
				return false;
		}
		return false;
	}

	@Override
	public boolean obiettivoRaggiunto(PuntoXY posizione) {
		if (this.obiettivo.equals(posizione))
			return true;
		return false;
	}

}
