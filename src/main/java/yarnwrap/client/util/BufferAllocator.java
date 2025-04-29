package yarnwrap.client.util;
public class BufferAllocator { public net.minecraft.client.util.BufferAllocator wrapperContained; public BufferAllocator(net.minecraft.client.util.BufferAllocator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.util.BufferAllocator.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.util.BufferAllocator.LOGGER = value; }

// public Object allocator() { return wrapperContained.allocator; }
// // public void allocator(Object value) { wrapperContained.allocator = value; }
// // public static Object allocator() { return net.minecraft.client.util.BufferAllocator.allocator; }
// // public static void allocator(Object value, ) { net.minecraft.client.util.BufferAllocator.allocator = value; }

// public int MIN_GROWTH() { return wrapperContained.MIN_GROWTH; }
// public void MIN_GROWTH(int value) { wrapperContained.MIN_GROWTH = value; }
// public static int MIN_GROWTH() { return net.minecraft.client.util.BufferAllocator.MIN_GROWTH; }
// public static void MIN_GROWTH(int value, ) { net.minecraft.client.util.BufferAllocator.MIN_GROWTH = value; }

// public int CLOSED() { return wrapperContained.CLOSED; }
// public void CLOSED(int value) { wrapperContained.CLOSED = value; }
// public static int CLOSED() { return net.minecraft.client.util.BufferAllocator.CLOSED; }
// public static void CLOSED(int value, ) { net.minecraft.client.util.BufferAllocator.CLOSED = value; }

// public long pointer() { return wrapperContained.pointer; }
// public void pointer(long value) { wrapperContained.pointer = value; }
// public static long pointer() { return net.minecraft.client.util.BufferAllocator.pointer; }
// public static void pointer(long value, ) { net.minecraft.client.util.BufferAllocator.pointer = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.client.util.BufferAllocator.size; }
// public static void size(int value, ) { net.minecraft.client.util.BufferAllocator.size = value; }

// public int offset() { return wrapperContained.offset; }
// public void offset(int value) { wrapperContained.offset = value; }
// public static int offset() { return net.minecraft.client.util.BufferAllocator.offset; }
// public static void offset(int value, ) { net.minecraft.client.util.BufferAllocator.offset = value; }

// public int prevOffset() { return wrapperContained.prevOffset; }
// public void prevOffset(int value) { wrapperContained.prevOffset = value; }
// public static int prevOffset() { return net.minecraft.client.util.BufferAllocator.prevOffset; }
// public static void prevOffset(int value, ) { net.minecraft.client.util.BufferAllocator.prevOffset = value; }

// public int refCount() { return wrapperContained.refCount; }
// public void refCount(int value) { wrapperContained.refCount = value; }
// public static int refCount() { return net.minecraft.client.util.BufferAllocator.refCount; }
// public static void refCount(int value, ) { net.minecraft.client.util.BufferAllocator.refCount = value; }

// public int clearCount() { return wrapperContained.clearCount; }
// public void clearCount(int value) { wrapperContained.clearCount = value; }
// public static int clearCount() { return net.minecraft.client.util.BufferAllocator.clearCount; }
// public static void clearCount(int value, ) { net.minecraft.client.util.BufferAllocator.clearCount = value; }

public BufferAllocator(int size) { this.wrapperContained = new net.minecraft.client.util.BufferAllocator(size); }
public Object getAllocated() { return wrapperContained.getAllocated(); }
// public static Object getAllocated() { return net.minecraft.client.util.BufferAllocator.getAllocated(); }
public long allocate(int size) { return wrapperContained.allocate(size); }
// public static long allocate(int size, ) { return net.minecraft.client.util.BufferAllocator.allocate(size); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.util.BufferAllocator.clear(); }
// public void growIfNecessary(int targetSize) { wrapperContained.growIfNecessary(targetSize); }
// public static void growIfNecessary(int targetSize, ) { net.minecraft.client.util.BufferAllocator.growIfNecessary(targetSize); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.util.BufferAllocator.reset(); }
// public void grow(int targetSize) { wrapperContained.grow(targetSize); }
// public static void grow(int targetSize, ) { net.minecraft.client.util.BufferAllocator.grow(targetSize); }
// public void clearIfUnreferenced() { wrapperContained.clearIfUnreferenced(); }
// public static void clearIfUnreferenced() { net.minecraft.client.util.BufferAllocator.clearIfUnreferenced(); }
// public boolean clearCountEquals(int clearCount) { return wrapperContained.clearCountEquals(clearCount); }
// public static boolean clearCountEquals(int clearCount, ) { return net.minecraft.client.util.BufferAllocator.clearCountEquals(clearCount); }
// public void forceClear() { wrapperContained.forceClear(); }
// public static void forceClear() { net.minecraft.client.util.BufferAllocator.forceClear(); }
// public void ensureNotFreed() { wrapperContained.ensureNotFreed(); }
// public static void ensureNotFreed() { net.minecraft.client.util.BufferAllocator.ensureNotFreed(); }

}