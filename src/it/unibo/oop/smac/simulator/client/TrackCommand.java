package it.unibo.oop.smac.simulator.client;

import it.unibo.oop.smac.datatypes.Coordinates;

/**
 * POJO del modello dati contenuto nel JSON che descrive un azione del track.
 */
public class TrackCommand {

  /**
   * Tempo per cui la macchina deve dormire prima di generare il prossimo sighting.
   */
  private Integer sleep;

  /**
   * Coordinate del punto in cui la macchina genererà il passaggio.
   */
  private Coordinates coordinate;

  /**
   * Restituisce il time di sleep della macchina.
   * 
   * @return tempo di sleep
   */
  public Integer getSleep() {
    return sleep;
  }

  /**
   * Imposta il time di sleep della macchina.
   * 
   * @param sleep
   *          tempo per cui si dovrà far dormire il simulatore
   */
  public void setSleep(final Integer sleep) {
    this.sleep = sleep;
  }

  /**
   * Restituisce le coordinate del sighting.
   * 
   * @return tempo di sleep
   */
  public Coordinates getCoordinate() {
    return coordinate;
  }

  /**
   * Imposta le coordinate del sighting.
   * 
   * @param coordinate
   *          punto in cui il simulatore dovrà segnalare il nuovo sighting
   */
  public void setCoordinate(final Coordinates coordinate) {
    this.coordinate = coordinate;
  }

}