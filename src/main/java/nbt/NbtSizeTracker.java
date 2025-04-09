package yarnwrap.nbt;
public class NbtSizeTracker { public net.minecraft.nbt.NbtSizeTracker wrapperContained; public NbtSizeTracker(net.minecraft.nbt.NbtSizeTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public long allocatedBytes() { return wrapperContained.allocatedBytes; }
// public long maxBytes() { return wrapperContained.maxBytes; }
// public int DEFAULT_MAX_DEPTH() { return wrapperContained.DEFAULT_MAX_DEPTH; }
// public int maxDepth() { return wrapperContained.maxDepth; }
// public int depth() { return wrapperContained.depth; }
public long getAllocatedBytes() { return wrapperContained.getAllocatedBytes(); }
public void add(long bytes) { wrapperContained.add(bytes); }
public yarnwrap.nbt.NbtSizeTracker ofUnlimitedBytes() { return new yarnwrap.nbt.NbtSizeTracker(wrapperContained.ofUnlimitedBytes()); }
public yarnwrap.nbt.NbtSizeTracker of(long maxBytes) { return new yarnwrap.nbt.NbtSizeTracker(wrapperContained.of(maxBytes)); }
public void pushStack() { wrapperContained.pushStack(); }
public void popStack() { wrapperContained.popStack(); }
public int getDepth() { return wrapperContained.getDepth(); }
public void add(long multiplier,long bytes) { wrapperContained.add(multiplier,bytes); }

}