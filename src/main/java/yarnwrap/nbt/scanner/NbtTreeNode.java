package yarnwrap.nbt.scanner;
public class NbtTreeNode { public net.minecraft.nbt.scanner.NbtTreeNode wrapperContained; public NbtTreeNode(net.minecraft.nbt.scanner.NbtTreeNode wrapperContained) { this.wrapperContained = wrapperContained; }

// public NbtTreeNode(int depth) { this.wrapperContained = new net.minecraft.nbt.scanner.NbtTreeNode(depth); }
// public yarnwrap.nbt.scanner.NbtTreeNode method_39880(java.lang.String path) { return new yarnwrap.nbt.scanner.NbtTreeNode(wrapperContained.method_39880(path)); }
public void add(yarnwrap.nbt.scanner.NbtScanQuery query) { wrapperContained.add(query.wrapperContained); }
public yarnwrap.nbt.scanner.NbtTreeNode createRoot() { return new yarnwrap.nbt.scanner.NbtTreeNode(wrapperContained.createRoot()); }
public boolean isTypeEqual(yarnwrap.nbt.NbtType type,java.lang.String key) { return wrapperContained.isTypeEqual(type.wrapperContained,key); }

}