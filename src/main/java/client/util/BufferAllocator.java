package yarnwrap.client.util;
public class BufferAllocator { public net.minecraft.client.util.BufferAllocator wrapperContained; public BufferAllocator(net.minecraft.client.util.BufferAllocator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public Object allocator() { return wrapperContained.allocator; }
// public int MIN_GROWTH() { return wrapperContained.MIN_GROWTH; }
// public int CLOSED() { return wrapperContained.CLOSED; }
// public long pointer() { return wrapperContained.pointer; }
// public int size() { return wrapperContained.size; }
// public int offset() { return wrapperContained.offset; }
// public int prevOffset() { return wrapperContained.prevOffset; }
// public int refCount() { return wrapperContained.refCount; }
// public int clearCount() { return wrapperContained.clearCount; }
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