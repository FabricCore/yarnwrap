package yarnwrap.nbt.scanner;
public class NbtCollector { public net.minecraft.nbt.scanner.NbtCollector wrapperContained; public NbtCollector(net.minecraft.nbt.scanner.NbtCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Deque queue() { return wrapperContained.queue; }
// public void queue(java.util.Deque value) { wrapperContained.queue = value; }
// public static java.util.Deque queue() { return net.minecraft.nbt.scanner.NbtCollector.queue; }
// public static void queue(java.util.Deque value, ) { net.minecraft.nbt.scanner.NbtCollector.queue = value; }

// public void append(yarnwrap.nbt.NbtElement nbt) { wrapperContained.append(nbt.wrapperContained); }
// public static void append(yarnwrap.nbt.NbtElement nbt, ) { net.minecraft.nbt.scanner.NbtCollector.append(nbt.wrapperContained); }
// public void pushStack(yarnwrap.nbt.NbtType type) { wrapperContained.pushStack(type.wrapperContained); }
// public static void pushStack(yarnwrap.nbt.NbtType type, ) { net.minecraft.nbt.scanner.NbtCollector.pushStack(type.wrapperContained); }
public yarnwrap.nbt.NbtElement getRoot() { return new yarnwrap.nbt.NbtElement(wrapperContained.getRoot()); }
// public static yarnwrap.nbt.NbtElement getRoot() { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.scanner.NbtCollector.getRoot()); }
// public int getDepth() { return wrapperContained.getDepth(); }
// public static int getDepth() { return net.minecraft.nbt.scanner.NbtCollector.getDepth(); }

}