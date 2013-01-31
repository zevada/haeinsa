package kr.co.vcnc.haeinsa;

import java.util.NavigableSet;
import java.util.TreeSet;

import org.apache.hadoop.hbase.util.Bytes;


public class HaeinsaIntraScan {
	private final byte[] row;
	private final byte[] minColumn;
	private final boolean minColumnInclusive;
	private final byte[] maxColumn;
	private final boolean maxColumnInclusive;
	private int batch = 32;
	
	private final NavigableSet<byte[]> families = new TreeSet<byte[]>(Bytes.BYTES_COMPARATOR);

	public HaeinsaIntraScan(final byte[] row, final byte[] minColumn,
			boolean minColumnInclusive, final byte[] maxColumn,
			boolean maxColumnInclusive) {
		this.row = row;
		this.minColumn = minColumn;
		this.minColumnInclusive = minColumnInclusive;
		this.maxColumn = maxColumn;
		this.maxColumnInclusive = maxColumnInclusive;
	}
	
	public byte[] getMaxColumn() {
		return maxColumn;
	}
	
	public byte[] getMinColumn() {
		return minColumn;
	}
	
	public byte[] getRow() {
		return row;
	}
	
	public boolean isMinColumnInclusive() {
		return minColumnInclusive;
	}
	
	public boolean isMaxColumnInclusive() {
		return maxColumnInclusive;
	}
	
	public HaeinsaIntraScan addFamily(byte[] family){
		families.add(family);
		return this;
	}
	
	public void setBatch(int batch) {
		this.batch = batch;
	}
	
	public int getBatch() {
		return batch;
	}
	
	public NavigableSet<byte[]> getFamilies() {
		return families;
	}
}