package tech.cbm.anatomia.smarttv;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SmartTv {
	private final Logger 		logger;

	private boolean				ligada;
	private int					canal;
	private int					volume;

	public SmartTv() {
		logger = Logger.getLogger(this.getClass().getCanonicalName());
	}

	public boolean isLigada() {
		return ligada;
	}
	
	public void ligar() {
		this.ligada = true;

		logger.info("Televisao ligada.");
	}

	public void desligar() {
		this.ligada = false;

		logger.info("Televisao desligada.");
	}

	public void aumentarVolume() {
		this.volume++;

		logger.log(Level.INFO, "volume {0}", volume);
	}

	public void diminuirVolume() {
		this.volume--;

		logger.log(Level.INFO, "volume {0}", volume);
	}

	public void aumentarCanal() {
		this.canal++;

		logger.log(Level.INFO, "canal {0}", canal);
	}

	public void diminuirCanal() {
		this.canal--;

		logger.log(Level.INFO, "canal {0}", canal);
	}

	public void mudarCanal(int canal) {
		this.canal = canal;

		logger.log(Level.INFO, "canal {0}", canal);
	}
}
