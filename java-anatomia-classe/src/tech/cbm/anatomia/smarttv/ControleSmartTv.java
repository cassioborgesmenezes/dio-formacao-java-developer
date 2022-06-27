package tech.cbm.anatomia.smarttv;

public class ControleSmartTv {
	
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();

		smartTv.ligar();
		smartTv.aumentarCanal();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.diminuirVolume();

		smartTv.desligar();
	}
}
