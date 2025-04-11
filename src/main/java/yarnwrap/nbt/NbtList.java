package yarnwrap.nbt;
public class NbtList { public net.minecraft.nbt.NbtList wrapperContained; public NbtList(net.minecraft.nbt.NbtList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List value() { return wrapperContained.value; }
// public void value(java.util.List value) { wrapperContained.value = value; }
// public byte type() { return wrapperContained.type; }
// public void type(byte value) { wrapperContained.type = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public NbtList(java.util.List list,byte type) { this.wrapperContained = new net.minecraft.nbt.NbtList(list,type); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.lang.Object get(int index) { return wrapperContained.get(index); }
public int getInt(int index) { return wrapperContained.getInt(index); }
public yarnwrap.nbt.NbtCompound getCompound(int index) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getCompound(index)); }
public yarnwrap.nbt.NbtList getList(int index) { return new yarnwrap.nbt.NbtList(wrapperContained.getList(index)); }
public float getFloat(int index) { return wrapperContained.getFloat(index); }
// public boolean canAdd(yarnwrap.nbt.NbtElement element) { return wrapperContained.canAdd(element.wrapperContained); }
public java.lang.String getString(int index) { return wrapperContained.getString(index); }
public short getShort(int index) { return wrapperContained.getShort(index); }
public double getDouble(int index) { return wrapperContained.getDouble(index); }
// public void forgetTypeIfEmpty() { wrapperContained.forgetTypeIfEmpty(); }
public int[] getIntArray(int index) { return wrapperContained.getIntArray(index); }
public long[] getLongArray(int index) { return wrapperContained.getLongArray(index); }

}