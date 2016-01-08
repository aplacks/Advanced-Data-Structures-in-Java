package roadgraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.javafx.geom.Edge;

import geography.GeographicPoint;

/**
 * 
 * 
 * A class which represents a node in the map.
 * Nodes have geographic locations and 
 * connections with others nodes through
 * the edges 
 *
 *
 */
public class MapNode {
	//Geographic location of the node
	private GeographicPoint location;
	//List of the out edges, the adjacency list
	private HashSet<MapEdge> outEdges;
	
	/**
	 * MapNode's constructor
	 * @param location GeographicPoint indicating geographic location
	 */
	public MapNode(GeographicPoint location) {
		this.location = location;
		this.outEdges = new HashSet<>();
	}
	
	/**
	 * 
	 * @return MapNode's geographic location
	 */
	public GeographicPoint getLocation() {
		return location;
	}
	
	/**
	 * Look up in the adjacency list for the neighbor nodes
	 *  and get your geographic location
	 * 
	 * @return List with the geographic locations of the neighbors nodes
	 */
	public Set<MapNode> getNeighbors() {
		Set<MapNode> neighbors = new HashSet<>();
		for(MapEdge edge : outEdges){
			neighbors.add(edge.getStop());
		}
		return neighbors;
	}
	
	/**
	 * Add an out edge to the node if this not exist
	 * in the adjacency list.
	 * 
	 * @param mapEdge The out edge to the neighbor
	 * @return true if the out edge was added.
	 */
	public boolean addOutEdge(MapEdge mapEdge){
		return outEdges.add(mapEdge);
	}
	
	/**
	 * Delete a out edge if this exist in 
	 * the adjacency list.
	 * 
	 * @param mapEdge The out edge to the neighbor
	 * @return true if the out edge was deleted.
	 */
	public boolean delOutEdge(MapEdge mapEdge){
		return outEdges.remove(mapEdge);
	}

	@Override
	public int hashCode() {
		return location.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapNode other = (MapNode) obj;
		return other.location.equals(this.location);
	}
	
	
}
