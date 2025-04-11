package yarnwrap.nbt;
public class NbtElement { public net.minecraft.nbt.NbtElement wrapperContained; public NbtElement(net.minecraft.nbt.NbtElement wrapperContained) { this.wrapperContained = wrapperContained; }

public byte END_TYPE() { return wrapperContained.END_TYPE; }
// public void END_TYPE(byte value) { wrapperContained.END_TYPE = value; }
public byte BYTE_TYPE() { return wrapperContained.BYTE_TYPE; }
// public void BYTE_TYPE(byte value) { wrapperContained.BYTE_TYPE = value; }
public byte SHORT_TYPE() { return wrapperContained.SHORT_TYPE; }
// public void SHORT_TYPE(byte value) { wrapperContained.SHORT_TYPE = value; }
public byte INT_TYPE() { return wrapperContained.INT_TYPE; }
// public void INT_TYPE(byte value) { wrapperContained.INT_TYPE = value; }
public byte LONG_TYPE() { return wrapperContained.LONG_TYPE; }
// public void LONG_TYPE(byte value) { wrapperContained.LONG_TYPE = value; }
public byte FLOAT_TYPE() { return wrapperContained.FLOAT_TYPE; }
// public void FLOAT_TYPE(byte value) { wrapperContained.FLOAT_TYPE = value; }
public byte DOUBLE_TYPE() { return wrapperContained.DOUBLE_TYPE; }
// public void DOUBLE_TYPE(byte value) { wrapperContained.DOUBLE_TYPE = value; }
public byte BYTE_ARRAY_TYPE() { return wrapperContained.BYTE_ARRAY_TYPE; }
// public void BYTE_ARRAY_TYPE(byte value) { wrapperContained.BYTE_ARRAY_TYPE = value; }
public byte STRING_TYPE() { return wrapperContained.STRING_TYPE; }
// public void STRING_TYPE(byte value) { wrapperContained.STRING_TYPE = value; }
public byte LIST_TYPE() { return wrapperContained.LIST_TYPE; }
// public void LIST_TYPE(byte value) { wrapperContained.LIST_TYPE = value; }
public byte COMPOUND_TYPE() { return wrapperContained.COMPOUND_TYPE; }
// public void COMPOUND_TYPE(byte value) { wrapperContained.COMPOUND_TYPE = value; }
public byte INT_ARRAY_TYPE() { return wrapperContained.INT_ARRAY_TYPE; }
// public void INT_ARRAY_TYPE(byte value) { wrapperContained.INT_ARRAY_TYPE = value; }
public byte LONG_ARRAY_TYPE() { return wrapperContained.LONG_ARRAY_TYPE; }
// public void LONG_ARRAY_TYPE(byte value) { wrapperContained.LONG_ARRAY_TYPE = value; }
public byte NUMBER_TYPE() { return wrapperContained.NUMBER_TYPE; }
// public void NUMBER_TYPE(byte value) { wrapperContained.NUMBER_TYPE = value; }
public int MAX_DEPTH() { return wrapperContained.MAX_DEPTH; }
// public void MAX_DEPTH(int value) { wrapperContained.MAX_DEPTH = value; }
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