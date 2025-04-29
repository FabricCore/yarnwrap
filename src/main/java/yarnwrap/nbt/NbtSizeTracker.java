package yarnwrap.nbt;
public class NbtSizeTracker { public net.minecraft.nbt.NbtSizeTracker wrapperContained; public NbtSizeTracker(net.minecraft.nbt.NbtSizeTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public long allocatedBytes() { return wrapperContained.allocatedBytes; }
// public void allocatedBytes(long value) { wrapperContained.allocatedBytes = value; }
// public static long allocatedBytes() { return net.minecraft.nbt.NbtSizeTracker.allocatedBytes; }
// public static void allocatedBytes(long value, ) { net.minecraft.nbt.NbtSizeTracker.allocatedBytes = value; }

// public long maxBytes() { return wrapperContained.maxBytes; }
// public void maxBytes(long value) { wrapperContained.maxBytes = value; }
// public static long maxBytes() { return net.minecraft.nbt.NbtSizeTracker.maxBytes; }
// public static void maxBytes(long value, ) { net.minecraft.nbt.NbtSizeTracker.maxBytes = value; }

// public int DEFAULT_MAX_DEPTH() { return wrapperContained.DEFAULT_MAX_DEPTH; }
// public void DEFAULT_MAX_DEPTH(int value) { wrapperContained.DEFAULT_MAX_DEPTH = value; }
// public static int DEFAULT_MAX_DEPTH() { return net.minecraft.nbt.NbtSizeTracker.DEFAULT_MAX_DEPTH; }
// public static void DEFAULT_MAX_DEPTH(int value, ) { net.minecraft.nbt.NbtSizeTracker.DEFAULT_MAX_DEPTH = value; }

// public int maxDepth() { return wrapperContained.maxDepth; }
// public void maxDepth(int value) { wrapperContained.maxDepth = value; }
// public static int maxDepth() { return net.minecraft.nbt.NbtSizeTracker.maxDepth; }
// public static void maxDepth(int value, ) { net.minecraft.nbt.NbtSizeTracker.maxDepth = value; }

// public int depth() { return wrapperContained.depth; }
// public void depth(int value) { wrapperContained.depth = value; }
// public static int depth() { return net.minecraft.nbt.NbtSizeTracker.depth; }
// public static void depth(int value, ) { net.minecraft.nbt.NbtSizeTracker.depth = value; }

public NbtSizeTracker(long maxBytes,int maxDepth) { this.wrapperContained = new net.minecraft.nbt.NbtSizeTracker(maxBytes,maxDepth); }
public long getAllocatedBytes() { return wrapperContained.getAllocatedBytes(); }
// public static long getAllocatedBytes() { return net.minecraft.nbt.NbtSizeTracker.getAllocatedBytes(); }
public void add(long bytes) { wrapperContained.add(bytes); }
// public static void add(long bytes, ) { net.minecraft.nbt.NbtSizeTracker.add(bytes); }
// public yarnwrap.nbt.NbtSizeTracker ofUnlimitedBytes() { return new yarnwrap.nbt.NbtSizeTracker(wrapperContained.ofUnlimitedBytes()); }
public static yarnwrap.nbt.NbtSizeTracker ofUnlimitedBytes() { return new yarnwrap.nbt.NbtSizeTracker(net.minecraft.nbt.NbtSizeTracker.ofUnlimitedBytes()); }
// public yarnwrap.nbt.NbtSizeTracker of(long maxBytes) { return new yarnwrap.nbt.NbtSizeTracker(wrapperContained.of(maxBytes)); }
// public static yarnwrap.nbt.NbtSizeTracker of(long maxBytes, ) { return new yarnwrap.nbt.NbtSizeTracker(net.minecraft.nbt.NbtSizeTracker.of(maxBytes)); }
public void pushStack() { wrapperContained.pushStack(); }
// public static void pushStack() { net.minecraft.nbt.NbtSizeTracker.pushStack(); }
public void popStack() { wrapperContained.popStack(); }
// public static void popStack() { net.minecraft.nbt.NbtSizeTracker.popStack(); }
public int getDepth() { return wrapperContained.getDepth(); }
// public static int getDepth() { return net.minecraft.nbt.NbtSizeTracker.getDepth(); }
public void add(long multiplier,long bytes) { wrapperContained.add(multiplier,bytes); }
// public static void add(long multiplier,long bytes, ) { net.minecraft.nbt.NbtSizeTracker.add(multiplier,bytes); }

}