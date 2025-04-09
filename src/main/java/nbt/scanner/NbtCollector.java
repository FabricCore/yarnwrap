package yarnwrap.nbt.scanner;
public class NbtCollector { public net.minecraft.nbt.scanner.NbtCollector wrapperContained; public NbtCollector(net.minecraft.nbt.scanner.NbtCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String currentKey() { return wrapperContained.currentKey; }
// public yarnwrap.nbt.NbtElement root() { return new yarnwrap.nbt.NbtElement(wrapperContained.root); }
// public java.util.Deque stack() { return wrapperContained.stack; }
// public void append(yarnwrap.nbt.NbtElement nbt) { wrapperContained.append(nbt.wrapperContained); }
// public void pushStack(yarnwrap.nbt.NbtType type) { wrapperContained.pushStack(type.wrapperContained); }
public yarnwrap.nbt.NbtElement getRoot() { return new yarnwrap.nbt.NbtElement(wrapperContained.getRoot()); }
// public int getDepth() { return wrapperContained.getDepth(); }

}