package main.java.sf.codingcomp.blocks;


/**
 * Like a PolyBlock, except that it also manages a value.
 *
 */
public interface StoragePolyBlock<T> extends sf.codingcomp.blocks.PolyBlock {
	
	T getValue();

	void setValue(T value);
}
