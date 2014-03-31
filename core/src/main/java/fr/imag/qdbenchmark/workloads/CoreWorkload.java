package fr.imag.qdbenchmark.workloads;

import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.Workload;

/**
 * 
 * @author jccastrejon
 *
 */
public class CoreWorkload extends Workload {

	@Override
	public boolean doInsert(DB db, Object threadstate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doTransaction(DB db, Object threadstate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRead(DB db, Object threadstate) {
		// TODO Auto-generated method stub
		return false;
	}
}
