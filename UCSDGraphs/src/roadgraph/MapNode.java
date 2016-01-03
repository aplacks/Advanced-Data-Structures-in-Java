package roadgraph;

import java.util.ArrayList;
import java.util.List;

import geography.GeographicPoint;

public class MapNode {
	private GeographicPoint location;
	private List<MapEdge> neighbors;
	
	/**
	 * MapNode's constructor
	 * @param location GeographicPoint indicating location
	 */
	public MapNode(GeographicPoint location) {
		this.location = location;
		this.neighbors = new ArrayList<>();
	}
	
	/**
	 * 
	 * @return MapNode's location
	 */
	public GeographicPoint getLocation() {
		return location;
	}
	
	/**
	 * 
	 * @return List with the neighbor nodes
	 */
	public List<GeographicPoint> getNeighbors() {
		List<GeographicPoint> neighborsGP = new ArrayList<>();
		for(MapEdge edge : neighbors){
			neighborsGP.add(edge.getStop());
		}
		return neighborsGP;
	}
	
	/**
	 * Add one out edge if this not exist
	 * @param mapEdge The edge to the neighbor
	 * @return true if the neighbor was added.
	 */
	public boolean addOutEdge(MapEdge mapEdge){
		if(!neighbors.contains(mapEdge)){
			this.neighbors.add(mapEdge);
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Delete one neighbor if this exist
	 * @param mapEdge The edge to the neighbor
	 * @return true if the neighbor was deleted.
	 */
	public boolean delNeighbord(MapEdge mapEdge){
		if(neighbors.contains(mapEdge)){
			this.neighbors.remove(mapEdge);
			return true;
		}else{
			return false;
		}
	}
	
}
