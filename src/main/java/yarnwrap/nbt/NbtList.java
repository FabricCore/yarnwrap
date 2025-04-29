package yarnwrap.nbt;
public class NbtList { public net.minecraft.nbt.NbtList wrapperContained; public NbtList(net.minecraft.nbt.NbtList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List value() { return wrapperContained.value; }
// public void value(java.util.List value) { wrapperContained.value = value; }
// public static java.util.List value() { return net.minecraft.nbt.NbtList.value; }
// public static void value(java.util.List value, ) { net.minecraft.nbt.NbtList.value = value; }

// public byte type() { return wrapperContained.type; }
// public void type(byte value) { wrapperContained.type = value; }
// public static byte type() { return net.minecraft.nbt.NbtList.type; }
// public static void type(byte value, ) { net.minecraft.nbt.NbtList.type = value; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtList.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtList.TYPE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtList.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtList.SIZE = value; }

// public NbtList(java.util.List list,byte type) { this.wrapperContained = new net.minecraft.nbt.NbtList(list,type); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtList.equals(o); }
public java.lang.Object get(int index) { return wrapperContained.get(index); }
// public static java.lang.Object get(int index, ) { return net.minecraft.nbt.NbtList.get(index); }
public int getInt(int index) { return wrapperContained.getInt(index); }
// public static int getInt(int index, ) { return net.minecraft.nbt.NbtList.getInt(index); }
public yarnwrap.nbt.NbtCompound getCompound(int index) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getCompound(index)); }
// public static yarnwrap.nbt.NbtCompound getCompound(int index, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtList.getCompound(index)); }
public yarnwrap.nbt.NbtList getList(int index) { return new yarnwrap.nbt.NbtList(wrapperContained.getList(index)); }
// public static yarnwrap.nbt.NbtList getList(int index, ) { return new yarnwrap.nbt.NbtList(net.minecraft.nbt.NbtList.getList(index)); }
public float getFloat(int index) { return wrapperContained.getFloat(index); }
// public static float getFloat(int index, ) { return net.minecraft.nbt.NbtList.getFloat(index); }
// public boolean canAdd(yarnwrap.nbt.NbtElement element) { return wrapperContained.canAdd(element.wrapperContained); }
// public static boolean canAdd(yarnwrap.nbt.NbtElement element, ) { return net.minecraft.nbt.NbtList.canAdd(element.wrapperContained); }
public java.lang.String getString(int index) { return wrapperContained.getString(index); }
// public static java.lang.String getString(int index, ) { return net.minecraft.nbt.NbtList.getString(index); }
public short getShort(int index) { return wrapperContained.getShort(index); }
// public static short getShort(int index, ) { return net.minecraft.nbt.NbtList.getShort(index); }
public double getDouble(int index) { return wrapperContained.getDouble(index); }
// public static double getDouble(int index, ) { return net.minecraft.nbt.NbtList.getDouble(index); }
// public void forgetTypeIfEmpty() { wrapperContained.forgetTypeIfEmpty(); }
// public static void forgetTypeIfEmpty() { net.minecraft.nbt.NbtList.forgetTypeIfEmpty(); }
public int[] getIntArray(int index) { return wrapperContained.getIntArray(index); }
// public static int[] getIntArray(int index, ) { return net.minecraft.nbt.NbtList.getIntArray(index); }
public long[] getLongArray(int index) { return wrapperContained.getLongArray(index); }
// public static long[] getLongArray(int index, ) { return net.minecraft.nbt.NbtList.getLongArray(index); }

}