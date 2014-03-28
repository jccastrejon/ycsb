package fr.imag.qdbenchmark.operations;

import fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_;

/**
 * 
 * @author jccastrejon
 * 
 */
public interface ConnectionOperations {
	/**
	 * 
	 * @param relationship
	 * @return
	 */
	public int read(Relationship_ relationship);

	/**
	 * 
	 * @param relationship
	 * @return
	 */
	public int insert(Relationship_ relationship);

	/**
	 * 
	 * @param oldRelationship
	 * @param newRelationship
	 * @return
	 */
	public int update(Relationship_ oldRelationship, Relationship_ newRelationship);

	/**
	 * 
	 * @param relationship
	 * @return
	 */
	public int delete(Relationship_ relationship);
}
