package yarnwrap.nbt.scanner;
public class NbtScanner { public net.minecraft.nbt.scanner.NbtScanner wrapperContained; public NbtScanner(net.minecraft.nbt.scanner.NbtScanner wrapperContained) { this.wrapperContained = wrapperContained; }

public Object visitEnd() { return wrapperContained.visitEnd(); }
public Object visitByte(byte value) { return wrapperContained.visitByte(value); }
public Object visitDouble(double value) { return wrapperContained.visitDouble(value); }
public Object visitFloat(float value) { return wrapperContained.visitFloat(value); }
public Object visitInt(int value) { return wrapperContained.visitInt(value); }
public Object visitLong(long value) { return wrapperContained.visitLong(value); }
public Object visitString(java.lang.String value) { return wrapperContained.visitString(value); }
public Object visitSubNbtType(yarnwrap.nbt.NbtType type) { return wrapperContained.visitSubNbtType(type.wrapperContained); }
public Object visitListMeta(yarnwrap.nbt.NbtType entryType,int length) { return wrapperContained.visitListMeta(entryType.wrapperContained,length); }
public Object startSubNbt(yarnwrap.nbt.NbtType type,java.lang.String key) { return wrapperContained.startSubNbt(type.wrapperContained,key); }
public Object visitShort(short value) { return wrapperContained.visitShort(value); }
// public Object visitByteArray(byte value) { return wrapperContained.visitByteArray(value); }
// public Object visitIntArray(int value) { return wrapperContained.visitIntArray(value); }
// public Object visitLongArray(long value) { return wrapperContained.visitLongArray(value); }
public Object endNested() { return wrapperContained.endNested(); }
public Object start(yarnwrap.nbt.NbtType rootType) { return wrapperContained.start(rootType.wrapperContained); }
public Object startListItem(yarnwrap.nbt.NbtType type,int index) { return wrapperContained.startListItem(type.wrapperContained,index); }

}