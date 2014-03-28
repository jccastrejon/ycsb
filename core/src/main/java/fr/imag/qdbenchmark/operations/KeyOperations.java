package fr.imag.qdbenchmark.operations;

import fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute;
import fr.imag.qdbenchmark.qdBenchmarkDsl.Struct_;

/**
 * 
 * @author jccastrejon
 * 
 */
public interface KeyOperations {

	/**
	 * 
	 * @param key
	 * @return
	 */
	public int read(Attribute key);

	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public int insert(Attribute key, Struct_ value);

	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public int update(Attribute key, Struct_ value);
}