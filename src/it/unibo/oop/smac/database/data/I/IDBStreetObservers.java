package it.unibo.oop.smac.database.data.I;

import java.sql.SQLException;

import it.unibo.oop.smac.datatype.I.IInfoStreetObserver;
import it.unibo.oop.smac.datatype.I.ISighting;
import it.unibo.oop.smac.datatype.I.IStreetObserver;

public interface IDBStreetObservers {
	
	public static IStreetObserver getInstance() {return null;}
	
	public void addStreetObserver(IStreetObserver streetObserver) throws SQLException;

	public void addSighting(ISighting sighting) throws Exception;
	
	public IInfoStreetObserver getDataGathered(IStreetObserver streetObserver) throws Exception;

}