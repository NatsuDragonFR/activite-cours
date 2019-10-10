public class Voiture {

	private String marque;
	private String modele;

	public Voiture(String marque, String modele) {
		super();
		this.marque = marque;
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + "]";
	}
}