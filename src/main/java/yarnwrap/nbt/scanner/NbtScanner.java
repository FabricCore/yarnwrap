package yarnwrap.nbt.scanner;
public class NbtScanner { public net.minecraft.nbt.scanner.NbtScanner wrapperContained; public NbtScanner(net.minecraft.nbt.scanner.NbtScanner wrapperContained) { this.wrapperContained = wrapperContained; }

public Object visitEnd() { return wrapperContained.visitEnd(); }
// public static Object visitEnd() { return net.minecraft.nbt.scanner.NbtScanner.visitEnd(); }
public Object visitByte(byte value) { return wrapperContained.visitByte(value); }
// public static Object visitByte(byte value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitByte(value); }
public Object visitDouble(double value) { return wrapperContained.visitDouble(value); }
// public static Object visitDouble(double value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitDouble(value); }
public Object visitFloat(float value) { return wrapperContained.visitFloat(value); }
// public static Object visitFloat(float value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitFloat(value); }
public Object visitInt(int value) { return wrapperContained.visitInt(value); }
// public static Object visitInt(int value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitInt(value); }
public Object visitLong(long value) { return wrapperContained.visitLong(value); }
// public static Object visitLong(long value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitLong(value); }
public Object visitString(java.lang.String value) { return wrapperContained.visitString(value); }
// public static Object visitString(java.lang.String value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitString(value); }
public Object visitSubNbtType(yarnwrap.nbt.NbtType type) { return wrapperContained.visitSubNbtType(type.wrapperContained); }
// public static Object visitSubNbtType(yarnwrap.nbt.NbtType type, ) { return net.minecraft.nbt.scanner.NbtScanner.visitSubNbtType(type.wrapperContained); }
public Object visitListMeta(yarnwrap.nbt.NbtType entryType,int length) { return wrapperContained.visitListMeta(entryType.wrapperContained,length); }
// public static Object visitListMeta(yarnwrap.nbt.NbtType entryType,int length, ) { return net.minecraft.nbt.scanner.NbtScanner.visitListMeta(entryType.wrapperContained,length); }
public Object startSubNbt(yarnwrap.nbt.NbtType type,java.lang.String key) { return wrapperContained.startSubNbt(type.wrapperContained,key); }
// public static Object startSubNbt(yarnwrap.nbt.NbtType type,java.lang.String key, ) { return net.minecraft.nbt.scanner.NbtScanner.startSubNbt(type.wrapperContained,key); }
public Object visitShort(short value) { return wrapperContained.visitShort(value); }
// public static Object visitShort(short value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitShort(value); }
// public Object visitByteArray(byte value) { return wrapperContained.visitByteArray(value); }
// public static Object visitByteArray(byte value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitByteArray(value); }
// public Object visitIntArray(int value) { return wrapperContained.visitIntArray(value); }
// public static Object visitIntArray(int value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitIntArray(value); }
// public Object visitLongArray(long value) { return wrapperContained.visitLongArray(value); }
// public static Object visitLongArray(long value, ) { return net.minecraft.nbt.scanner.NbtScanner.visitLongArray(value); }
public Object endNested() { return wrapperContained.endNested(); }
// public static Object endNested() { return net.minecraft.nbt.scanner.NbtScanner.endNested(); }
public Object start(yarnwrap.nbt.NbtType rootType) { return wrapperContained.start(rootType.wrapperContained); }
// public static Object start(yarnwrap.nbt.NbtType rootType, ) { return net.minecraft.nbt.scanner.NbtScanner.start(rootType.wrapperContained); }
public Object startListItem(yarnwrap.nbt.NbtType type,int index) { return wrapperContained.startListItem(type.wrapperContained,index); }
// public static Object startListItem(yarnwrap.nbt.NbtType type,int index, ) { return net.minecraft.nbt.scanner.NbtScanner.startListItem(type.wrapperContained,index); }

}