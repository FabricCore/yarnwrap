package yarnwrap.client.util;
public class BufferAllocator { public net.minecraft.client.util.BufferAllocator wrapperContained; public BufferAllocator(net.minecraft.client.util.BufferAllocator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public Object allocator() { return wrapperContained.allocator; }
// // public void allocator(Object value) { wrapperContained.allocator = value; }
// public int MIN_GROWTH() { return wrapperContained.MIN_GROWTH; }
// public void MIN_GROWTH(int value) { wrapperContained.MIN_GROWTH = value; }
// public int CLOSED() { return wrapperContained.CLOSED; }
// public void CLOSED(int value) { wrapperContained.CLOSED = value; }
// public long pointer() { return wrapperContained.pointer; }
// public void pointer(long value) { wrapperContained.pointer = value; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public int offset() { return wrapperContained.offset; }
// public void offset(int value) { wrapperContained.offset = value; }
// public int prevOffset() { return wrapperContained.prevOffset; }
// public void prevOffset(int value) { wrapperContained.prevOffset = value; }
// public int refCount() { return wrapperContained.refCount; }
// public void refCount(int value) { wrapperContained.refCount = value; }
// public int clearCount() { return wrapperContained.clearCount; }
// public void clearCount(int value) { wrapperContained.clearCount = value; }
public Object getAllocated() { return wrapperContained.getAllocated(); }
public long allocate(int size) { return wrapperContained.allocate(size); }
public void clear() { wrapperContained.clear(); }
// public void growIfNecessary(int targetSize) { wrapperContained.growIfNecessary(targetSize); }
public void reset() { wrapperContained.reset(); }
// public void grow(int targetSize) { wrapperContained.grow(targetSize); }
// public void clearIfUnreferenced() { wrapperContained.clearIfUnreferenced(); }
// public boolean clearCountEquals(int clearCount) { return wrapperContained.clearCountEquals(clearCount); }
// public void forceClear() { wrapperContained.forceClear(); }
// public void ensureNotFreed() { wrapperContained.ensureNotFreed(); }

}