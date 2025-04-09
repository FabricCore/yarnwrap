package yarnwrap.nbt;
public class NbtCompound { public net.minecraft.nbt.NbtCompound wrapperContained; public NbtCompound(net.minecraft.nbt.NbtCompound wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map entries() { return wrapperContained.entries; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public int SIZE() { return wrapperContained.SIZE; }
public long getLong(java.lang.String key) { return wrapperContained.getLong(key); }
public void putLongArray(java.lang.String key,java.util.List value) { wrapperContained.putLongArray(key,value); }
// public void putIntArray(java.lang.String key,int value) { wrapperContained.putIntArray(key,value); }
public byte getType(java.lang.String key) { return wrapperContained.getType(key); }
public java.util.Set getKeys() { return wrapperContained.getKeys(); }
public yarnwrap.nbt.NbtCompound copyFrom(yarnwrap.nbt.NbtCompound source) { return new yarnwrap.nbt.NbtCompound(wrapperContained.copyFrom(source.wrapperContained)); }
public void putLong(java.lang.String key,long value) { wrapperContained.putLong(key,value); }
public boolean contains(java.lang.String key) { return wrapperContained.contains(key); }
public int getSize() { return wrapperContained.getSize(); }
public byte[] getByteArray(java.lang.String key) { return wrapperContained.getByteArray(key); }
public void putFloat(java.lang.String key,float value) { wrapperContained.putFloat(key,value); }
public void putDouble(java.lang.String key,double value) { wrapperContained.putDouble(key,value); }
public int getInt(java.lang.String key) { return wrapperContained.getInt(key); }
public void remove(java.lang.String key) { wrapperContained.remove(key); }
public yarnwrap.nbt.NbtList getList(java.lang.String key,int type) { return new yarnwrap.nbt.NbtList(wrapperContained.getList(key,type)); }
// public void write(java.lang.String key,yarnwrap.nbt.NbtElement element,java.io.DataOutput output) { wrapperContained.write(key,element.wrapperContained,output); }
public void putBoolean(java.lang.String key,boolean value) { wrapperContained.putBoolean(key,value); }
public java.lang.String getString(java.lang.String key) { return wrapperContained.getString(key); }
// public yarnwrap.util.crash.CrashReport createCrashReport(java.lang.String key,yarnwrap.nbt.NbtType reader,java.lang.ClassCastException exception) { return new yarnwrap.util.crash.CrashReport(wrapperContained.createCrashReport(key,reader.wrapperContained,exception)); }
public int[] getIntArray(java.lang.String key) { return wrapperContained.getIntArray(key); }
public yarnwrap.nbt.NbtCompound getCompound(java.lang.String key) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getCompound(key)); }
// public void putLongArray(java.lang.String key,long value) { wrapperContained.putLongArray(key,value); }
public long[] getLongArray(java.lang.String key) { return wrapperContained.getLongArray(key); }
public yarnwrap.nbt.NbtElement put(java.lang.String key,yarnwrap.nbt.NbtElement element) { return new yarnwrap.nbt.NbtElement(wrapperContained.put(key,element.wrapperContained)); }
public void putByte(java.lang.String key,byte value) { wrapperContained.putByte(key,value); }
public short getShort(java.lang.String key) { return wrapperContained.getShort(key); }
public void putInt(java.lang.String key,int value) { wrapperContained.putInt(key,value); }
// public void putByteArray(java.lang.String key,byte value) { wrapperContained.putByteArray(key,value); }
public byte getByte(java.lang.String key) { return wrapperContained.getByte(key); }
public void putIntArray(java.lang.String key,java.util.List value) { wrapperContained.putIntArray(key,value); }
public boolean contains(java.lang.String key,int type) { return wrapperContained.contains(key,type); }
public double getDouble(java.lang.String key) { return wrapperContained.getDouble(key); }
public void putShort(java.lang.String key,short value) { wrapperContained.putShort(key,value); }
public boolean getBoolean(java.lang.String key) { return wrapperContained.getBoolean(key); }
public yarnwrap.nbt.NbtElement get(java.lang.String key) { return new yarnwrap.nbt.NbtElement(wrapperContained.get(key)); }
// public yarnwrap.nbt.NbtElement read(yarnwrap.nbt.NbtType reader,java.lang.String key,java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.read(reader.wrapperContained,key,input,tracker.wrapperContained)); }
public void putString(java.lang.String key,java.lang.String value) { wrapperContained.putString(key,value); }
public float getFloat(java.lang.String key) { return wrapperContained.getFloat(key); }
public java.util.UUID getUuid(java.lang.String key) { return wrapperContained.getUuid(key); }
public void putUuid(java.lang.String key,java.util.UUID value) { wrapperContained.putUuid(key,value); }
public boolean containsUuid(java.lang.String key) { return wrapperContained.containsUuid(key); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public void putByteArray(java.lang.String key,java.util.List value) { wrapperContained.putByteArray(key,value); }
// public yarnwrap.nbt.NbtCompound shallowCopy() { return new yarnwrap.nbt.NbtCompound(wrapperContained.shallowCopy()); }
// public java.util.Set entrySet() { return wrapperContained.entrySet(); }

}