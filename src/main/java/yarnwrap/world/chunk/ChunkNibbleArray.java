package yarnwrap.world.chunk;
public class ChunkNibbleArray { public net.minecraft.world.chunk.ChunkNibbleArray wrapperContained; public ChunkNibbleArray(net.minecraft.world.chunk.ChunkNibbleArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] bytes() { return wrapperContained.bytes; }
// public void bytes(byte[] value) { wrapperContained.bytes = value; }
public int BYTES_LENGTH() { return wrapperContained.BYTES_LENGTH; }
// public void BYTES_LENGTH(int value) { wrapperContained.BYTES_LENGTH = value; }
public int COPY_BLOCK_SIZE() { return wrapperContained.COPY_BLOCK_SIZE; }
// public void COPY_BLOCK_SIZE(int value) { wrapperContained.COPY_BLOCK_SIZE = value; }
// public int NIBBLE_BITS() { return wrapperContained.NIBBLE_BITS; }
// public void NIBBLE_BITS(int value) { wrapperContained.NIBBLE_BITS = value; }
public int COPY_TIMES() { return wrapperContained.COPY_TIMES; }
// public void COPY_TIMES(int value) { wrapperContained.COPY_TIMES = value; }
// public int defaultValue() { return wrapperContained.defaultValue; }
// public void defaultValue(int value) { wrapperContained.defaultValue = value; }
public byte[] asByteArray() { return wrapperContained.asByteArray(); }
// public int getArrayIndex(int i) { return wrapperContained.getArrayIndex(i); }
public int get(int x,int y,int z) { return wrapperContained.get(x,y,z); }
// public int getIndex(int x,int y,int z) { return wrapperContained.getIndex(x,y,z); }
// public int get(int index) { return wrapperContained.get(index); }
// public void set(int index,int value) { wrapperContained.set(index,value); }
public yarnwrap.world.chunk.ChunkNibbleArray copy() { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.copy()); }
public void set(int x,int y,int z,int value) { wrapperContained.set(x,y,z,value); }
public boolean isUninitialized() { return wrapperContained.isUninitialized(); }
public java.lang.String bottomToString(int unused) { return wrapperContained.bottomToString(unused); }
// public int occupiesSmallerBits(int i) { return wrapperContained.occupiesSmallerBits(i); }
public boolean isUninitialized(int expectedDefaultValue) { return wrapperContained.isUninitialized(expectedDefaultValue); }
public boolean isArrayUninitialized() { return wrapperContained.isArrayUninitialized(); }
// public byte pack(int value) { return wrapperContained.pack(value); }
public void clear(int defaultValue) { wrapperContained.clear(defaultValue); }

}