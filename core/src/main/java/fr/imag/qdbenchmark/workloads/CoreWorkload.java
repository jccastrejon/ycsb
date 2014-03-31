package fr.imag.qdbenchmark.workloads;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.Workload;

import fr.imag.qdbenchmark.operations.OperationType.InsertOperation;
import fr.imag.qdbenchmark.operations.OperationType.ReadOperation;
import fr.imag.qdbenchmark.operations.OperationType.UpdateOperation;

/**
 * 
 * @author jccastrejon
 * 
 */
public class CoreWorkload extends Workload {

	@Override
	public boolean doInsert(DB db, Object threadstate) {
		Set<Method> insertMethods;

		// Select operation to invoke
		insertMethods = CoreWorkload.getMethodsAnnotatedWith(db.getClass(), InsertOperation.class);

		return false;
	}

	@Override
	public boolean doTransaction(DB db, Object threadstate) {
		Set<Method> insertMethods;
		Set<Method> updateMethods;
		Set<Method> readMethods;

		// Select operation to invoke
		insertMethods = CoreWorkload.getMethodsAnnotatedWith(db.getClass(), InsertOperation.class);
		updateMethods = CoreWorkload.getMethodsAnnotatedWith(db.getClass(), UpdateOperation.class);
		readMethods = CoreWorkload.getMethodsAnnotatedWith(db.getClass(), ReadOperation.class);

		return false;
	}

	@Override
	public boolean doRead(DB db, Object threadstate) {
		Set<Method> readMethods;

		// Select operation to invoke
		readMethods = CoreWorkload.getMethodsAnnotatedWith(db.getClass(), ReadOperation.class);
		return false;
	}

	/**
	 * 
	 * @param clazz
	 * @param annotation
	 * @return
	 */
	private static Set<Method> getMethodsAnnotatedWith(Class<?> clazz, final Class<? extends Annotation> annotation) {
		Set<Method> returnValue;

		returnValue = new HashSet<Method>();
		final Method[] declaredMethods = clazz.getDeclaredMethods();
		for (final Method method : declaredMethods) {
			if (method.isAnnotationPresent(annotation)) {
				returnValue.add(method);
			}
		}

		return returnValue;
	}
}
