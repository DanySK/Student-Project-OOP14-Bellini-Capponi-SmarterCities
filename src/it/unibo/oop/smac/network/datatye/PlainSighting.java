package it.unibo.oop.smac.network.datatye;

import it.unibo.oop.smac.datatype.Coordinates;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe di scambio, prima di essere tradotto in Sighting
 * 
 * @author Francesco Capponi
 *
 */
public class PlainSighting implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6098237635297318104L;
	private Coordinates coordinates;
	private Date date;
	private String licensePlate;

	private Float speed;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Float getSpeed() {
		return speed;
	}

	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

}