package yarnwrap.nbt;
public class NbtSizeTracker { public net.minecraft.nbt.NbtSizeTracker wrapperContained; public NbtSizeTracker(net.minecraft.nbt.NbtSizeTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public long allocatedBytes() { return wrapperContained.allocatedBytes; }
// public void allocatedBytes(long value) { wrapperContained.allocatedBytes = value; }
// public long maxBytes() { return wrapperContained.maxBytes; }
// public void maxBytes(long value) { wrapperContained.maxBytes = value; }
// public int DEFAULT_MAX_DEPTH() { return wrapperContained.DEFAULT_MAX_DEPTH; }
// public void DEFAULT_MAX_DEPTH(int value) { wrapperContained.DEFAULT_MAX_DEPTH = value; }
// public int maxDepth() { return wrapperContained.maxDepth; }
// public void maxDepth(int value) { wrapperContained.maxDepth = value; }
// public int depth() { return wrapperContained.depth; }
// public void depth(int value) { wrapperContained.depth = value; }
public long getAllocatedBytes() { return wrapperContained.getAllocatedBytes(); }
public void add(long bytes) { wrapperContained.add(bytes); }
public yarnwrap.nbt.NbtSizeTracker ofUnlimitedBytes() { return new yarnwrap.nbt.NbtSizeTracker(wrapperContained.ofUnlimitedBytes()); }
public yarnwrap.nbt.NbtSizeTracker of(long maxBytes) { return new yarnwrap.nbt.NbtSizeTracker(wrapperContained.of(maxBytes)); }
public void pushStack() { wrapperContained.pushStack(); }
public void popStack() { wrapperContained.popStack(); }
public int getDepth() { return wrapperContained.getDepth(); }
public void add(long multiplier,long bytes) { wrapperContained.add(multiplier,bytes); }

}