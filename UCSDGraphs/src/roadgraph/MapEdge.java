package roadgraph;

import geography.GeographicPoint;

public class MapEdge {
	GeographicPoint start;
	GeographicPoint stop;
	String streetName;
	double streetLength;
	String streetType;
	
	/**
	 * Constructor's MapEdge
	 * 
	 * @param start  The edge's start location
	 * @param stop The edge's stop location
	 * @param streetName Name of the edge
	 * @param streetLength Length of the edge
	 * @param streetType Type of the edge
	 */
	public MapEdge(GeographicPoint start, GeographicPoint stop,
			String streetName, double streetLength, String streetType) {
		this.start = start;
		this.stop = stop;
	}
	
	/**
	 * 
	 * @return the start location
	 */
	public GeographicPoint getStart() {
		return start;
	}
	
	/**
	 * 
	 * @return the stop location
	 */
	public GeographicPoint getStop() {
		return stop;
	}
	
	/**
	 * 
	 * @return The name of the edge
	 */
	public String getStreetName() {
		return streetName;
	}
	
	/**
	 * 
	 * @return The length of the street
	 */
	public double getStreetLength() {
		return streetLength;
	}
	
	/**
	 * 
	 * @return The type of the street
	 */
	public String getStreetType() {
		return streetType;
	}
}
