package yarnwrap.world.chunk;
public class ChunkNibbleArray { public net.minecraft.world.chunk.ChunkNibbleArray wrapperContained; public ChunkNibbleArray(net.minecraft.world.chunk.ChunkNibbleArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] bytes() { return wrapperContained.bytes; }
// public void bytes(byte[] value) { wrapperContained.bytes = value; }
// public static byte[] bytes() { return net.minecraft.world.chunk.ChunkNibbleArray.bytes; }
// public static void bytes(byte[] value, ) { net.minecraft.world.chunk.ChunkNibbleArray.bytes = value; }

// public int BYTES_LENGTH() { return wrapperContained.BYTES_LENGTH; }
// public void BYTES_LENGTH(int value) { wrapperContained.BYTES_LENGTH = value; }
public static int BYTES_LENGTH() { return net.minecraft.world.chunk.ChunkNibbleArray.BYTES_LENGTH; }
// public static void BYTES_LENGTH(int value, ) { net.minecraft.world.chunk.ChunkNibbleArray.BYTES_LENGTH = value; }

// public int COPY_BLOCK_SIZE() { return wrapperContained.COPY_BLOCK_SIZE; }
// public void COPY_BLOCK_SIZE(int value) { wrapperContained.COPY_BLOCK_SIZE = value; }
public static int COPY_BLOCK_SIZE() { return net.minecraft.world.chunk.ChunkNibbleArray.COPY_BLOCK_SIZE; }
// public static void COPY_BLOCK_SIZE(int value, ) { net.minecraft.world.chunk.ChunkNibbleArray.COPY_BLOCK_SIZE = value; }

// public int NIBBLE_BITS() { return wrapperContained.NIBBLE_BITS; }
// public void NIBBLE_BITS(int value) { wrapperContained.NIBBLE_BITS = value; }
// public static int NIBBLE_BITS() { return net.minecraft.world.chunk.ChunkNibbleArray.NIBBLE_BITS; }
// public static void NIBBLE_BITS(int value, ) { net.minecraft.world.chunk.ChunkNibbleArray.NIBBLE_BITS = value; }

// public int COPY_TIMES() { return wrapperContained.COPY_TIMES; }
// public void COPY_TIMES(int value) { wrapperContained.COPY_TIMES = value; }
public static int COPY_TIMES() { return net.minecraft.world.chunk.ChunkNibbleArray.COPY_TIMES; }
// public static void COPY_TIMES(int value, ) { net.minecraft.world.chunk.ChunkNibbleArray.COPY_TIMES = value; }

// public int defaultValue() { return wrapperContained.defaultValue; }
// public void defaultValue(int value) { wrapperContained.defaultValue = value; }
// public static int defaultValue() { return net.minecraft.world.chunk.ChunkNibbleArray.defaultValue; }
// public static void defaultValue(int value, ) { net.minecraft.world.chunk.ChunkNibbleArray.defaultValue = value; }

public ChunkNibbleArray(int defaultValue) { this.wrapperContained = new net.minecraft.world.chunk.ChunkNibbleArray(defaultValue); }
public ChunkNibbleArray(byte bytes) { this.wrapperContained = new net.minecraft.world.chunk.ChunkNibbleArray(bytes); }
public byte[] asByteArray() { return wrapperContained.asByteArray(); }
// public static byte[] asByteArray() { return net.minecraft.world.chunk.ChunkNibbleArray.asByteArray(); }
// public int getArrayIndex(int i) { return wrapperContained.getArrayIndex(i); }
// public static int getArrayIndex(int i, ) { return net.minecraft.world.chunk.ChunkNibbleArray.getArrayIndex(i); }
public int get(int x,int y,int z) { return wrapperContained.get(x,y,z); }
// public static int get(int x,int y,int z, ) { return net.minecraft.world.chunk.ChunkNibbleArray.get(x,y,z); }
// public int getIndex(int x,int y,int z) { return wrapperContained.getIndex(x,y,z); }
// public static int getIndex(int x,int y,int z, ) { return net.minecraft.world.chunk.ChunkNibbleArray.getIndex(x,y,z); }
// public int get(int index) { return wrapperContained.get(index); }
// public static int get(int index, ) { return net.minecraft.world.chunk.ChunkNibbleArray.get(index); }
// public void set(int index,int value) { wrapperContained.set(index,value); }
// public static void set(int index,int value, ) { net.minecraft.world.chunk.ChunkNibbleArray.set(index,value); }
public yarnwrap.world.chunk.ChunkNibbleArray copy() { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.copy()); }
// public static yarnwrap.world.chunk.ChunkNibbleArray copy() { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.ChunkNibbleArray.copy()); }
public void set(int x,int y,int z,int value) { wrapperContained.set(x,y,z,value); }
// public static void set(int x,int y,int z,int value, ) { net.minecraft.world.chunk.ChunkNibbleArray.set(x,y,z,value); }
public boolean isUninitialized() { return wrapperContained.isUninitialized(); }
// public static boolean isUninitialized() { return net.minecraft.world.chunk.ChunkNibbleArray.isUninitialized(); }
public java.lang.String bottomToString(int unused) { return wrapperContained.bottomToString(unused); }
// public static java.lang.String bottomToString(int unused, ) { return net.minecraft.world.chunk.ChunkNibbleArray.bottomToString(unused); }
// public int occupiesSmallerBits(int i) { return wrapperContained.occupiesSmallerBits(i); }
// public static int occupiesSmallerBits(int i, ) { return net.minecraft.world.chunk.ChunkNibbleArray.occupiesSmallerBits(i); }
public boolean isUninitialized(int expectedDefaultValue) { return wrapperContained.isUninitialized(expectedDefaultValue); }
// public static boolean isUninitialized(int expectedDefaultValue, ) { return net.minecraft.world.chunk.ChunkNibbleArray.isUninitialized(expectedDefaultValue); }
public boolean isArrayUninitialized() { return wrapperContained.isArrayUninitialized(); }
// public static boolean isArrayUninitialized() { return net.minecraft.world.chunk.ChunkNibbleArray.isArrayUninitialized(); }
// public byte pack(int value) { return wrapperContained.pack(value); }
// public static byte pack(int value, ) { return net.minecraft.world.chunk.ChunkNibbleArray.pack(value); }
public void clear(int defaultValue) { wrapperContained.clear(defaultValue); }
// public static void clear(int defaultValue, ) { net.minecraft.world.chunk.ChunkNibbleArray.clear(defaultValue); }

}