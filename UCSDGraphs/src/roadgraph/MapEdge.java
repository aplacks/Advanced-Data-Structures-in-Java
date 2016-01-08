package roadgraph;

import geography.GeographicPoint;

/**
 * 
 * 
 * A class which represents a directed edge in the map.
 * Edges have geographic start location and
 *  geographic stop location. Also,
 *  some properties like name, length, type
 *  
 *
 */
public class MapEdge {
	//MapNode start point
	private MapNode start;
	//MapNode stop point
	private MapNode stop;
	//Name of the edge
	private String streetName;
	//Length of the edge
	private double streetLength;
	//Type of the edge
	private String streetType;
	
	/**
	 * Constructor's MapEdge
	 * 
	 * @param start  The edge's start location
	 * @param stop The edge's stop location
	 * @param streetName Name of the edge
	 * @param streetLength Length of the edge
	 * @param streetType Type of the edge
	 */
	public MapEdge(MapNode start, MapNode stop,
			String streetName, double streetLength, String streetType) {
		this.start = start;
		this.stop = stop;
		this.streetName = streetName;
		this.streetLength = streetLength;
		this.streetType = streetType;
	}
	
	/**
	 * 
	 * @return the MapNode start location
	 */
	public MapNode getStart() {
		return start;
	}
	
	/**
	 * 
	 * @return the MapNode stop location
	 */
	public MapNode getStop() {
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
