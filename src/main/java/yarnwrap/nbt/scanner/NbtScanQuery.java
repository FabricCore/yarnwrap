package yarnwrap.nbt.scanner;
public class NbtScanQuery { public net.minecraft.nbt.scanner.NbtScanQuery wrapperContained; public NbtScanQuery(net.minecraft.nbt.scanner.NbtScanQuery wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String key() { return wrapperContained.key; }
// public void key(java.lang.String value) { wrapperContained.key = value; }
// public static java.lang.String key() { return net.minecraft.nbt.scanner.NbtScanQuery.key; }
// public static void key(java.lang.String value, ) { net.minecraft.nbt.scanner.NbtScanQuery.key = value; }

public NbtScanQuery(java.lang.String path1,java.lang.String path2,yarnwrap.nbt.NbtType type,java.lang.String key) { this.wrapperContained = new net.minecraft.nbt.scanner.NbtScanQuery(path1,path2,type.wrapperContained,key); }
public NbtScanQuery(java.lang.String path,yarnwrap.nbt.NbtType type,java.lang.String key) { this.wrapperContained = new net.minecraft.nbt.scanner.NbtScanQuery(path,type.wrapperContained,key); }
public NbtScanQuery(yarnwrap.nbt.NbtType type,java.lang.String key) { this.wrapperContained = new net.minecraft.nbt.scanner.NbtScanQuery(type.wrapperContained,key); }
// public java.lang.String key() { return wrapperContained.key(); }
// // public static java.lang.String key() { return net.minecraft.nbt.scanner.NbtScanQuery.key(); }

}