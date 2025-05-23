package yarnwrap.nbt;
public class NbtElement { public net.minecraft.nbt.NbtElement wrapperContained; public NbtElement(net.minecraft.nbt.NbtElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte END_TYPE() { return wrapperContained.END_TYPE; }
// public void END_TYPE(byte value) { wrapperContained.END_TYPE = value; }
public static byte END_TYPE() { return net.minecraft.nbt.NbtElement.END_TYPE; }
// public static void END_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.END_TYPE = value; }

// public byte BYTE_TYPE() { return wrapperContained.BYTE_TYPE; }
// public void BYTE_TYPE(byte value) { wrapperContained.BYTE_TYPE = value; }
public static byte BYTE_TYPE() { return net.minecraft.nbt.NbtElement.BYTE_TYPE; }
// public static void BYTE_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.BYTE_TYPE = value; }

// public byte SHORT_TYPE() { return wrapperContained.SHORT_TYPE; }
// public void SHORT_TYPE(byte value) { wrapperContained.SHORT_TYPE = value; }
public static byte SHORT_TYPE() { return net.minecraft.nbt.NbtElement.SHORT_TYPE; }
// public static void SHORT_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.SHORT_TYPE = value; }

// public byte INT_TYPE() { return wrapperContained.INT_TYPE; }
// public void INT_TYPE(byte value) { wrapperContained.INT_TYPE = value; }
public static byte INT_TYPE() { return net.minecraft.nbt.NbtElement.INT_TYPE; }
// public static void INT_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.INT_TYPE = value; }

// public byte LONG_TYPE() { return wrapperContained.LONG_TYPE; }
// public void LONG_TYPE(byte value) { wrapperContained.LONG_TYPE = value; }
public static byte LONG_TYPE() { return net.minecraft.nbt.NbtElement.LONG_TYPE; }
// public static void LONG_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.LONG_TYPE = value; }

// public byte FLOAT_TYPE() { return wrapperContained.FLOAT_TYPE; }
// public void FLOAT_TYPE(byte value) { wrapperContained.FLOAT_TYPE = value; }
public static byte FLOAT_TYPE() { return net.minecraft.nbt.NbtElement.FLOAT_TYPE; }
// public static void FLOAT_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.FLOAT_TYPE = value; }

// public byte DOUBLE_TYPE() { return wrapperContained.DOUBLE_TYPE; }
// public void DOUBLE_TYPE(byte value) { wrapperContained.DOUBLE_TYPE = value; }
public static byte DOUBLE_TYPE() { return net.minecraft.nbt.NbtElement.DOUBLE_TYPE; }
// public static void DOUBLE_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.DOUBLE_TYPE = value; }

// public byte BYTE_ARRAY_TYPE() { return wrapperContained.BYTE_ARRAY_TYPE; }
// public void BYTE_ARRAY_TYPE(byte value) { wrapperContained.BYTE_ARRAY_TYPE = value; }
public static byte BYTE_ARRAY_TYPE() { return net.minecraft.nbt.NbtElement.BYTE_ARRAY_TYPE; }
// public static void BYTE_ARRAY_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.BYTE_ARRAY_TYPE = value; }

// public byte STRING_TYPE() { return wrapperContained.STRING_TYPE; }
// public void STRING_TYPE(byte value) { wrapperContained.STRING_TYPE = value; }
public static byte STRING_TYPE() { return net.minecraft.nbt.NbtElement.STRING_TYPE; }
// public static void STRING_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.STRING_TYPE = value; }

// public byte LIST_TYPE() { return wrapperContained.LIST_TYPE; }
// public void LIST_TYPE(byte value) { wrapperContained.LIST_TYPE = value; }
public static byte LIST_TYPE() { return net.minecraft.nbt.NbtElement.LIST_TYPE; }
// public static void LIST_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.LIST_TYPE = value; }

// public byte COMPOUND_TYPE() { return wrapperContained.COMPOUND_TYPE; }
// public void COMPOUND_TYPE(byte value) { wrapperContained.COMPOUND_TYPE = value; }
public static byte COMPOUND_TYPE() { return net.minecraft.nbt.NbtElement.COMPOUND_TYPE; }
// public static void COMPOUND_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.COMPOUND_TYPE = value; }

// public byte INT_ARRAY_TYPE() { return wrapperContained.INT_ARRAY_TYPE; }
// public void INT_ARRAY_TYPE(byte value) { wrapperContained.INT_ARRAY_TYPE = value; }
public static byte INT_ARRAY_TYPE() { return net.minecraft.nbt.NbtElement.INT_ARRAY_TYPE; }
// public static void INT_ARRAY_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.INT_ARRAY_TYPE = value; }

// public byte LONG_ARRAY_TYPE() { return wrapperContained.LONG_ARRAY_TYPE; }
// public void LONG_ARRAY_TYPE(byte value) { wrapperContained.LONG_ARRAY_TYPE = value; }
public static byte LONG_ARRAY_TYPE() { return net.minecraft.nbt.NbtElement.LONG_ARRAY_TYPE; }
// public static void LONG_ARRAY_TYPE(byte value, ) { net.minecraft.nbt.NbtElement.LONG_ARRAY_TYPE = value; }

// public int MAX_DEPTH() { return wrapperContained.MAX_DEPTH; }
// public void MAX_DEPTH(int value) { wrapperContained.MAX_DEPTH = value; }
public static int MAX_DEPTH() { return net.minecraft.nbt.NbtElement.MAX_DEPTH; }
// public static void MAX_DEPTH(int value, ) { net.minecraft.nbt.NbtElement.MAX_DEPTH = value; }

public yarnwrap.nbt.NbtElement copy() { return new yarnwrap.nbt.NbtElement(wrapperContained.copy()); }
// public static yarnwrap.nbt.NbtElement copy() { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtElement.copy()); }
public byte getType() { return wrapperContained.getType(); }
// public static byte getType() { return net.minecraft.nbt.NbtElement.getType(); }
// public void write(java.io.DataOutput output) { wrapperContained.write(output); }
// public static void write(java.io.DataOutput output, ) { net.minecraft.nbt.NbtElement.write(output); }
public yarnwrap.nbt.NbtType getNbtType() { return new yarnwrap.nbt.NbtType(wrapperContained.getNbtType()); }
// public static yarnwrap.nbt.NbtType getNbtType() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtElement.getNbtType()); }
public void accept(yarnwrap.nbt.visitor.NbtElementVisitor visitor) { wrapperContained.accept(visitor.wrapperContained); }
// public static void accept(yarnwrap.nbt.visitor.NbtElementVisitor visitor, ) { net.minecraft.nbt.NbtElement.accept(visitor.wrapperContained); }
public Object doAccept(yarnwrap.nbt.scanner.NbtScanner visitor) { return wrapperContained.doAccept(visitor.wrapperContained); }
// public static Object doAccept(yarnwrap.nbt.scanner.NbtScanner visitor, ) { return net.minecraft.nbt.NbtElement.doAccept(visitor.wrapperContained); }
public void accept(yarnwrap.nbt.scanner.NbtScanner visitor) { wrapperContained.accept(visitor.wrapperContained); }
// public static void accept(yarnwrap.nbt.scanner.NbtScanner visitor, ) { net.minecraft.nbt.NbtElement.accept(visitor.wrapperContained); }
public int getSizeInBytes() { return wrapperContained.getSizeInBytes(); }
// public static int getSizeInBytes() { return net.minecraft.nbt.NbtElement.getSizeInBytes(); }
public java.util.Optional asByteArray() { return wrapperContained.asByteArray(); }
// public static java.util.Optional asByteArray() { return net.minecraft.nbt.NbtElement.asByteArray(); }
public java.util.Optional asCompound() { return wrapperContained.asCompound(); }
// public static java.util.Optional asCompound() { return net.minecraft.nbt.NbtElement.asCompound(); }
public java.util.Optional asIntArray() { return wrapperContained.asIntArray(); }
// public static java.util.Optional asIntArray() { return net.minecraft.nbt.NbtElement.asIntArray(); }
public java.util.Optional asNbtList() { return wrapperContained.asNbtList(); }
// public static java.util.Optional asNbtList() { return net.minecraft.nbt.NbtElement.asNbtList(); }
public java.util.Optional asLongArray() { return wrapperContained.asLongArray(); }
// public static java.util.Optional asLongArray() { return net.minecraft.nbt.NbtElement.asLongArray(); }
public java.util.Optional asNumber() { return wrapperContained.asNumber(); }
// public static java.util.Optional asNumber() { return net.minecraft.nbt.NbtElement.asNumber(); }
public java.util.Optional asByte() { return wrapperContained.asByte(); }
// public static java.util.Optional asByte() { return net.minecraft.nbt.NbtElement.asByte(); }
public java.util.Optional asShort() { return wrapperContained.asShort(); }
// public static java.util.Optional asShort() { return net.minecraft.nbt.NbtElement.asShort(); }
public java.util.Optional asInt() { return wrapperContained.asInt(); }
// public static java.util.Optional asInt() { return net.minecraft.nbt.NbtElement.asInt(); }
public java.util.Optional asLong() { return wrapperContained.asLong(); }
// public static java.util.Optional asLong() { return net.minecraft.nbt.NbtElement.asLong(); }
public java.util.Optional asFloat() { return wrapperContained.asFloat(); }
// public static java.util.Optional asFloat() { return net.minecraft.nbt.NbtElement.asFloat(); }
public java.util.Optional asDouble() { return wrapperContained.asDouble(); }
// public static java.util.Optional asDouble() { return net.minecraft.nbt.NbtElement.asDouble(); }
public java.util.Optional asBoolean() { return wrapperContained.asBoolean(); }
// public static java.util.Optional asBoolean() { return net.minecraft.nbt.NbtElement.asBoolean(); }
public java.util.Optional asString() { return wrapperContained.asString(); }
// public static java.util.Optional asString() { return net.minecraft.nbt.NbtElement.asString(); }
// public java.lang.Boolean method_68661(java.lang.Byte b) { return wrapperContained.method_68661(b); }
// public static java.lang.Boolean method_68661(java.lang.Byte b, ) { return net.minecraft.nbt.NbtElement.method_68661(b); }

}