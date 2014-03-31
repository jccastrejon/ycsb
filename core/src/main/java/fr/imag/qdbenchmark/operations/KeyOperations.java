package fr.imag.qdbenchmark.operations;

import fr.imag.qdbenchmark.operations.OperationType.InsertOperation;
import fr.imag.qdbenchmark.operations.OperationType.ReadOperation;
import fr.imag.qdbenchmark.operations.OperationType.UpdateOperation;
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
	@ReadOperation
	public int read(Attribute key);

	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	@InsertOperation
	public int insert(Attribute key, Struct_ value);

	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	@UpdateOperation
	public int update(Attribute key, Struct_ value);
}