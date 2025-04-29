package yarnwrap.nbt.scanner;
public class NbtCollector { public net.minecraft.nbt.scanner.NbtCollector wrapperContained; public NbtCollector(net.minecraft.nbt.scanner.NbtCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String currentKey() { return wrapperContained.currentKey; }
// public void currentKey(java.lang.String value) { wrapperContained.currentKey = value; }
// public static java.lang.String currentKey() { return net.minecraft.nbt.scanner.NbtCollector.currentKey; }
// public static void currentKey(java.lang.String value, ) { net.minecraft.nbt.scanner.NbtCollector.currentKey = value; }

// public yarnwrap.nbt.NbtElement root() { return new yarnwrap.nbt.NbtElement(wrapperContained.root); }
// public void root(yarnwrap.nbt.NbtElement value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.nbt.NbtElement root() { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.scanner.NbtCollector.root); }
// public static void root(yarnwrap.nbt.NbtElement value, ) { net.minecraft.nbt.scanner.NbtCollector.root = value.wrapperContained; }

// public java.util.Deque stack() { return wrapperContained.stack; }
// public void stack(java.util.Deque value) { wrapperContained.stack = value; }
// public static java.util.Deque stack() { return net.minecraft.nbt.scanner.NbtCollector.stack; }
// public static void stack(java.util.Deque value, ) { net.minecraft.nbt.scanner.NbtCollector.stack = value; }

// public void method_39882(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.method_39882(nbt.wrapperContained); }
// public static void method_39882(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.nbt.scanner.NbtCollector.method_39882(nbt.wrapperContained); }
// public void append(yarnwrap.nbt.NbtElement nbt) { wrapperContained.append(nbt.wrapperContained); }
// public static void append(yarnwrap.nbt.NbtElement nbt, ) { net.minecraft.nbt.scanner.NbtCollector.append(nbt.wrapperContained); }
// public void method_39884(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.method_39884(nbt.wrapperContained); }
// public static void method_39884(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.nbt.scanner.NbtCollector.method_39884(nbt.wrapperContained); }
// public void method_39885(yarnwrap.nbt.NbtElement nbt) { wrapperContained.method_39885(nbt.wrapperContained); }
// public static void method_39885(yarnwrap.nbt.NbtElement nbt, ) { net.minecraft.nbt.scanner.NbtCollector.method_39885(nbt.wrapperContained); }
// public void pushStack(yarnwrap.nbt.NbtType type) { wrapperContained.pushStack(type.wrapperContained); }
// public static void pushStack(yarnwrap.nbt.NbtType type, ) { net.minecraft.nbt.scanner.NbtCollector.pushStack(type.wrapperContained); }
public yarnwrap.nbt.NbtElement getRoot() { return new yarnwrap.nbt.NbtElement(wrapperContained.getRoot()); }
// public static yarnwrap.nbt.NbtElement getRoot() { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.scanner.NbtCollector.getRoot()); }
// public int getDepth() { return wrapperContained.getDepth(); }
// public static int getDepth() { return net.minecraft.nbt.scanner.NbtCollector.getDepth(); }

}