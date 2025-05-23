package yarnwrap.nbt;
public class NbtList { public net.minecraft.nbt.NbtList wrapperContained; public NbtList(net.minecraft.nbt.NbtList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List value() { return wrapperContained.value; }
// public void value(java.util.List value) { wrapperContained.value = value; }
// public static java.util.List value() { return net.minecraft.nbt.NbtList.value; }
// public static void value(java.util.List value, ) { net.minecraft.nbt.NbtList.value = value; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtList.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtList.TYPE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtList.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtList.SIZE = value; }

// public java.lang.String HOMOGENIZED_ENTRY_KEY() { return wrapperContained.HOMOGENIZED_ENTRY_KEY; }
// public void HOMOGENIZED_ENTRY_KEY(java.lang.String value) { wrapperContained.HOMOGENIZED_ENTRY_KEY = value; }
// public static java.lang.String HOMOGENIZED_ENTRY_KEY() { return net.minecraft.nbt.NbtList.HOMOGENIZED_ENTRY_KEY; }
// public static void HOMOGENIZED_ENTRY_KEY(java.lang.String value, ) { net.minecraft.nbt.NbtList.HOMOGENIZED_ENTRY_KEY = value; }

// public NbtList(java.util.List value) { this.wrapperContained = new net.minecraft.nbt.NbtList(value); }
// public void add(int index,java.lang.Object element) { wrapperContained.add(index,element); }
// public static void add(int index,java.lang.Object element, ) { net.minecraft.nbt.NbtList.add(index,element); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtList.equals(o); }
public java.lang.Object get(int index) { return wrapperContained.get(index); }
// public static java.lang.Object get(int index, ) { return net.minecraft.nbt.NbtList.get(index); }
public java.util.Optional getInt(int index) { return wrapperContained.getInt(index); }
// public static java.util.Optional getInt(int index, ) { return net.minecraft.nbt.NbtList.getInt(index); }
public java.util.Optional getCompound(int index) { return wrapperContained.getCompound(index); }
// public static java.util.Optional getCompound(int index, ) { return net.minecraft.nbt.NbtList.getCompound(index); }
public java.util.Optional getList(int index) { return wrapperContained.getList(index); }
// public static java.util.Optional getList(int index, ) { return net.minecraft.nbt.NbtList.getList(index); }
public java.util.Optional getFloat(int index) { return wrapperContained.getFloat(index); }
// public static java.util.Optional getFloat(int index, ) { return net.minecraft.nbt.NbtList.getFloat(index); }
public java.util.Optional getString(int index) { return wrapperContained.getString(index); }
// public static java.util.Optional getString(int index, ) { return net.minecraft.nbt.NbtList.getString(index); }
public java.util.Optional getShort(int index) { return wrapperContained.getShort(index); }
// public static java.util.Optional getShort(int index, ) { return net.minecraft.nbt.NbtList.getShort(index); }
public java.util.Optional getDouble(int index) { return wrapperContained.getDouble(index); }
// public static java.util.Optional getDouble(int index, ) { return net.minecraft.nbt.NbtList.getDouble(index); }
public java.util.Optional getIntArray(int index) { return wrapperContained.getIntArray(index); }
// public static java.util.Optional getIntArray(int index, ) { return net.minecraft.nbt.NbtList.getIntArray(index); }
public java.util.Optional getLongArray(int index) { return wrapperContained.getLongArray(index); }
// public static java.util.Optional getLongArray(int index, ) { return net.minecraft.nbt.NbtList.getLongArray(index); }
// public yarnwrap.nbt.NbtElement wrapIfNeeded(byte type,yarnwrap.nbt.NbtElement value) { return new yarnwrap.nbt.NbtElement(wrapperContained.wrapIfNeeded(type,value.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement wrapIfNeeded(byte type,yarnwrap.nbt.NbtElement value, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtList.wrapIfNeeded(type,value.wrapperContained)); }
public double getDouble(int index,double fallback) { return wrapperContained.getDouble(index,fallback); }
// public static double getDouble(int index,double fallback, ) { return net.minecraft.nbt.NbtList.getDouble(index,fallback); }
public float getFloat(int index,float fallback) { return wrapperContained.getFloat(index,fallback); }
// public static float getFloat(int index,float fallback, ) { return net.minecraft.nbt.NbtList.getFloat(index,fallback); }
public int getInt(int index,int fallback) { return wrapperContained.getInt(index,fallback); }
// public static int getInt(int index,int fallback, ) { return net.minecraft.nbt.NbtList.getInt(index,fallback); }
public java.lang.String getString(int index,java.lang.String fallback) { return wrapperContained.getString(index,fallback); }
// public static java.lang.String getString(int index,java.lang.String fallback, ) { return net.minecraft.nbt.NbtList.getString(index,fallback); }
public short getShort(int index,short fallback) { return wrapperContained.getShort(index,fallback); }
// public static short getShort(int index,short fallback, ) { return net.minecraft.nbt.NbtList.getShort(index,fallback); }
// public yarnwrap.nbt.NbtElement unwrap(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtElement(wrapperContained.unwrap(nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement unwrap(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtList.unwrap(nbt.wrapperContained)); }
public void unwrapAndAdd(yarnwrap.nbt.NbtElement nbt) { wrapperContained.unwrapAndAdd(nbt.wrapperContained); }
// public static void unwrapAndAdd(yarnwrap.nbt.NbtElement nbt, ) { net.minecraft.nbt.NbtList.unwrapAndAdd(nbt.wrapperContained); }
// public void method_68581(yarnwrap.nbt.NbtElement nbt,java.util.function.Consumer callback) { wrapperContained.method_68581(nbt.wrapperContained,callback); }
// public static void method_68581(yarnwrap.nbt.NbtElement nbt,java.util.function.Consumer callback, ) { net.minecraft.nbt.NbtList.method_68581(nbt.wrapperContained,callback); }
public yarnwrap.nbt.NbtCompound getCompoundOrEmpty(int index) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getCompoundOrEmpty(index)); }
// public static yarnwrap.nbt.NbtCompound getCompoundOrEmpty(int index, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtList.getCompoundOrEmpty(index)); }
// public boolean isConvertedEntry(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.isConvertedEntry(nbt.wrapperContained); }
// public static boolean isConvertedEntry(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.nbt.NbtList.isConvertedEntry(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound convertToCompound(yarnwrap.nbt.NbtElement nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.convertToCompound(nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound convertToCompound(yarnwrap.nbt.NbtElement nbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtList.convertToCompound(nbt.wrapperContained)); }
// public byte getValueType() { return wrapperContained.getValueType(); }
// public static byte getValueType() { return net.minecraft.nbt.NbtList.getValueType(); }
public yarnwrap.nbt.NbtList getListOrEmpty(int index) { return new yarnwrap.nbt.NbtList(wrapperContained.getListOrEmpty(index)); }
// public static yarnwrap.nbt.NbtList getListOrEmpty(int index, ) { return new yarnwrap.nbt.NbtList(net.minecraft.nbt.NbtList.getListOrEmpty(index)); }
public java.util.stream.Stream streamCompounds() { return wrapperContained.streamCompounds(); }
// public static java.util.stream.Stream streamCompounds() { return net.minecraft.nbt.NbtList.streamCompounds(); }
// public yarnwrap.nbt.NbtElement getNullable(int index) { return new yarnwrap.nbt.NbtElement(wrapperContained.getNullable(index)); }
// public static yarnwrap.nbt.NbtElement getNullable(int index, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtList.getNullable(index)); }
// public java.util.Optional getOptional(int index) { return wrapperContained.getOptional(index); }
// public static java.util.Optional getOptional(int index, ) { return net.minecraft.nbt.NbtList.getOptional(index); }
// public java.lang.Object set(int index,java.lang.Object element) { return wrapperContained.set(index,element); }
// public static java.lang.Object set(int index,java.lang.Object element, ) { return net.minecraft.nbt.NbtList.set(index,element); }

}