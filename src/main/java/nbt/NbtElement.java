package yarnwrap.nbt;
public class NbtElement { public net.minecraft.nbt.NbtElement wrapperContained; public NbtElement(net.minecraft.nbt.NbtElement wrapperContained) { this.wrapperContained = wrapperContained; }

public byte END_TYPE() { return wrapperContained.END_TYPE; }
public byte BYTE_TYPE() { return wrapperContained.BYTE_TYPE; }
public byte SHORT_TYPE() { return wrapperContained.SHORT_TYPE; }
public byte INT_TYPE() { return wrapperContained.INT_TYPE; }
public byte LONG_TYPE() { return wrapperContained.LONG_TYPE; }
public byte FLOAT_TYPE() { return wrapperContained.FLOAT_TYPE; }
public byte DOUBLE_TYPE() { return wrapperContained.DOUBLE_TYPE; }
public byte BYTE_ARRAY_TYPE() { return wrapperContained.BYTE_ARRAY_TYPE; }
public byte STRING_TYPE() { return wrapperContained.STRING_TYPE; }
public byte LIST_TYPE() { return wrapperContained.LIST_TYPE; }
public byte COMPOUND_TYPE() { return wrapperContained.COMPOUND_TYPE; }
public byte INT_ARRAY_TYPE() { return wrapperContained.INT_ARRAY_TYPE; }
public byte LONG_ARRAY_TYPE() { return wrapperContained.LONG_ARRAY_TYPE; }
public byte NUMBER_TYPE() { return wrapperContained.NUMBER_TYPE; }
public int MAX_DEPTH() { return wrapperContained.MAX_DEPTH; }
public yarnwrap.nbt.NbtElement copy() { return new yarnwrap.nbt.NbtElement(wrapperContained.copy()); }
public byte getType() { return wrapperContained.getType(); }
// public void write(java.io.DataOutput output) { wrapperContained.write(output); }
public java.lang.String asString() { return wrapperContained.asString(); }
public yarnwrap.nbt.NbtType getNbtType() { return new yarnwrap.nbt.NbtType(wrapperContained.getNbtType()); }
public void accept(yarnwrap.nbt.visitor.NbtElementVisitor visitor) { wrapperContained.accept(visitor.wrapperContained); }
public Object doAccept(yarnwrap.nbt.scanner.NbtScanner visitor) { return wrapperContained.doAccept(visitor.wrapperContained); }
public void accept(yarnwrap.nbt.scanner.NbtScanner visitor) { wrapperContained.accept(visitor.wrapperContained); }
public int getSizeInBytes() { return wrapperContained.getSizeInBytes(); }

}