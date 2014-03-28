package fr.imag.qdbenchmark.operations;

import fr.imag.qdbenchmark.qdBenchmarkDsl.Struct_;

/**
 * 
 * @author jccastrejon
 * 
 */
public interface AggregateOperations {

	/**
	 * 
	 * @param pattern
	 * @return
	 */
	public int read(Struct_ pattern);

	/**
	 * 
	 * @param value
	 * @return
	 */
	public int insert(Struct_ value);

	/**
	 * 
	 * @param pattern
	 * @param value
	 * @return
	 */
	public int update(Struct_ pattern, Struct_ value);

	/**
	 * 
	 * @param pattern
	 * @return
	 */
	public int delete(Struct_ pattern);
}
