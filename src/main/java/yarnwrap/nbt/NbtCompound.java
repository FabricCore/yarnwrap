package yarnwrap.nbt;
public class NbtCompound { public net.minecraft.nbt.NbtCompound wrapperContained; public NbtCompound(net.minecraft.nbt.NbtCompound wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map entries() { return wrapperContained.entries; }
// public void entries(java.util.Map value) { wrapperContained.entries = value; }
// public static java.util.Map entries() { return net.minecraft.nbt.NbtCompound.entries; }
// public static void entries(java.util.Map value, ) { net.minecraft.nbt.NbtCompound.entries = value; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtCompound.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtCompound.TYPE = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.nbt.NbtCompound.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.nbt.NbtCompound.CODEC = value; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtCompound.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtCompound.SIZE = value; }

// public NbtCompound(java.util.Map entries) { this.wrapperContained = new net.minecraft.nbt.NbtCompound(entries); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtCompound.equals(o); }
public long getLong(java.lang.String key) { return wrapperContained.getLong(key); }
// public static long getLong(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getLong(key); }
public void putLongArray(java.lang.String key,java.util.List value) { wrapperContained.putLongArray(key,value); }
// public static void putLongArray(java.lang.String key,java.util.List value, ) { net.minecraft.nbt.NbtCompound.putLongArray(key,value); }
// public void putIntArray(java.lang.String key,int value) { wrapperContained.putIntArray(key,value); }
// public static void putIntArray(java.lang.String key,int value, ) { net.minecraft.nbt.NbtCompound.putIntArray(key,value); }
public byte getType(java.lang.String key) { return wrapperContained.getType(key); }
// public static byte getType(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getType(key); }
public java.util.Set getKeys() { return wrapperContained.getKeys(); }
// public static java.util.Set getKeys() { return net.minecraft.nbt.NbtCompound.getKeys(); }
public yarnwrap.nbt.NbtCompound copyFrom(yarnwrap.nbt.NbtCompound source) { return new yarnwrap.nbt.NbtCompound(wrapperContained.copyFrom(source.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound copyFrom(yarnwrap.nbt.NbtCompound source, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtCompound.copyFrom(source.wrapperContained)); }
public void putLong(java.lang.String key,long value) { wrapperContained.putLong(key,value); }
// public static void putLong(java.lang.String key,long value, ) { net.minecraft.nbt.NbtCompound.putLong(key,value); }
public boolean contains(java.lang.String key) { return wrapperContained.contains(key); }
// public static boolean contains(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.contains(key); }
public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.nbt.NbtCompound.getSize(); }
public byte[] getByteArray(java.lang.String key) { return wrapperContained.getByteArray(key); }
// public static byte[] getByteArray(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getByteArray(key); }
public void putFloat(java.lang.String key,float value) { wrapperContained.putFloat(key,value); }
// public static void putFloat(java.lang.String key,float value, ) { net.minecraft.nbt.NbtCompound.putFloat(key,value); }
public void putDouble(java.lang.String key,double value) { wrapperContained.putDouble(key,value); }
// public static void putDouble(java.lang.String key,double value, ) { net.minecraft.nbt.NbtCompound.putDouble(key,value); }
public int getInt(java.lang.String key) { return wrapperContained.getInt(key); }
// public static int getInt(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getInt(key); }
public void remove(java.lang.String key) { wrapperContained.remove(key); }
// public static void remove(java.lang.String key, ) { net.minecraft.nbt.NbtCompound.remove(key); }
public yarnwrap.nbt.NbtList getList(java.lang.String key,int type) { return new yarnwrap.nbt.NbtList(wrapperContained.getList(key,type)); }
// public static yarnwrap.nbt.NbtList getList(java.lang.String key,int type, ) { return new yarnwrap.nbt.NbtList(net.minecraft.nbt.NbtCompound.getList(key,type)); }
// public void write(java.lang.String key,yarnwrap.nbt.NbtElement element,java.io.DataOutput output) { wrapperContained.write(key,element.wrapperContained,output); }
// public static void write(java.lang.String key,yarnwrap.nbt.NbtElement element,java.io.DataOutput output, ) { net.minecraft.nbt.NbtCompound.write(key,element.wrapperContained,output); }
public void putBoolean(java.lang.String key,boolean value) { wrapperContained.putBoolean(key,value); }
// public static void putBoolean(java.lang.String key,boolean value, ) { net.minecraft.nbt.NbtCompound.putBoolean(key,value); }
public java.lang.String getString(java.lang.String key) { return wrapperContained.getString(key); }
// public static java.lang.String getString(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getString(key); }
// public yarnwrap.util.crash.CrashReport createCrashReport(java.lang.String key,yarnwrap.nbt.NbtType reader,java.lang.ClassCastException exception) { return new yarnwrap.util.crash.CrashReport(wrapperContained.createCrashReport(key,reader.wrapperContained,exception)); }
// public static yarnwrap.util.crash.CrashReport createCrashReport(java.lang.String key,yarnwrap.nbt.NbtType reader,java.lang.ClassCastException exception, ) { return new yarnwrap.util.crash.CrashReport(net.minecraft.nbt.NbtCompound.createCrashReport(key,reader.wrapperContained,exception)); }
public int[] getIntArray(java.lang.String key) { return wrapperContained.getIntArray(key); }
// public static int[] getIntArray(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getIntArray(key); }
public yarnwrap.nbt.NbtCompound getCompound(java.lang.String key) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getCompound(key)); }
// public static yarnwrap.nbt.NbtCompound getCompound(java.lang.String key, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtCompound.getCompound(key)); }
// public void putLongArray(java.lang.String key,long value) { wrapperContained.putLongArray(key,value); }
// public static void putLongArray(java.lang.String key,long value, ) { net.minecraft.nbt.NbtCompound.putLongArray(key,value); }
public long[] getLongArray(java.lang.String key) { return wrapperContained.getLongArray(key); }
// public static long[] getLongArray(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getLongArray(key); }
public yarnwrap.nbt.NbtElement put(java.lang.String key,yarnwrap.nbt.NbtElement element) { return new yarnwrap.nbt.NbtElement(wrapperContained.put(key,element.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement put(java.lang.String key,yarnwrap.nbt.NbtElement element, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtCompound.put(key,element.wrapperContained)); }
public void putByte(java.lang.String key,byte value) { wrapperContained.putByte(key,value); }
// public static void putByte(java.lang.String key,byte value, ) { net.minecraft.nbt.NbtCompound.putByte(key,value); }
public short getShort(java.lang.String key) { return wrapperContained.getShort(key); }
// public static short getShort(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getShort(key); }
public void putInt(java.lang.String key,int value) { wrapperContained.putInt(key,value); }
// public static void putInt(java.lang.String key,int value, ) { net.minecraft.nbt.NbtCompound.putInt(key,value); }
// public void putByteArray(java.lang.String key,byte value) { wrapperContained.putByteArray(key,value); }
// public static void putByteArray(java.lang.String key,byte value, ) { net.minecraft.nbt.NbtCompound.putByteArray(key,value); }
public byte getByte(java.lang.String key) { return wrapperContained.getByte(key); }
// public static byte getByte(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getByte(key); }
public void putIntArray(java.lang.String key,java.util.List value) { wrapperContained.putIntArray(key,value); }
// public static void putIntArray(java.lang.String key,java.util.List value, ) { net.minecraft.nbt.NbtCompound.putIntArray(key,value); }
public boolean contains(java.lang.String key,int type) { return wrapperContained.contains(key,type); }
// public static boolean contains(java.lang.String key,int type, ) { return net.minecraft.nbt.NbtCompound.contains(key,type); }
public double getDouble(java.lang.String key) { return wrapperContained.getDouble(key); }
// public static double getDouble(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getDouble(key); }
public void putShort(java.lang.String key,short value) { wrapperContained.putShort(key,value); }
// public static void putShort(java.lang.String key,short value, ) { net.minecraft.nbt.NbtCompound.putShort(key,value); }
public boolean getBoolean(java.lang.String key) { return wrapperContained.getBoolean(key); }
// public static boolean getBoolean(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getBoolean(key); }
public yarnwrap.nbt.NbtElement get(java.lang.String key) { return new yarnwrap.nbt.NbtElement(wrapperContained.get(key)); }
// public static yarnwrap.nbt.NbtElement get(java.lang.String key, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtCompound.get(key)); }
// public yarnwrap.nbt.NbtElement read(yarnwrap.nbt.NbtType reader,java.lang.String key,java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.read(reader.wrapperContained,key,input,tracker.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement read(yarnwrap.nbt.NbtType reader,java.lang.String key,java.io.DataInput input,yarnwrap.nbt.NbtSizeTracker tracker, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.nbt.NbtCompound.read(reader.wrapperContained,key,input,tracker.wrapperContained)); }
public void putString(java.lang.String key,java.lang.String value) { wrapperContained.putString(key,value); }
// public static void putString(java.lang.String key,java.lang.String value, ) { net.minecraft.nbt.NbtCompound.putString(key,value); }
public float getFloat(java.lang.String key) { return wrapperContained.getFloat(key); }
// public static float getFloat(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getFloat(key); }
public java.util.UUID getUuid(java.lang.String key) { return wrapperContained.getUuid(key); }
// public static java.util.UUID getUuid(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.getUuid(key); }
public void putUuid(java.lang.String key,java.util.UUID value) { wrapperContained.putUuid(key,value); }
// public static void putUuid(java.lang.String key,java.util.UUID value, ) { net.minecraft.nbt.NbtCompound.putUuid(key,value); }
public boolean containsUuid(java.lang.String key) { return wrapperContained.containsUuid(key); }
// public static boolean containsUuid(java.lang.String key, ) { return net.minecraft.nbt.NbtCompound.containsUuid(key); }
// public com.mojang.serialization.DataResult method_29141(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_29141(dynamic); }
// public static com.mojang.serialization.DataResult method_29141(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.nbt.NbtCompound.method_29141(dynamic); }
// public com.mojang.serialization.Dynamic method_29142(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.method_29142(nbt.wrapperContained); }
// public static com.mojang.serialization.Dynamic method_29142(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.nbt.NbtCompound.method_29142(nbt.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.nbt.NbtCompound.isEmpty(); }
public void putByteArray(java.lang.String key,java.util.List value) { wrapperContained.putByteArray(key,value); }
// public static void putByteArray(java.lang.String key,java.util.List value, ) { net.minecraft.nbt.NbtCompound.putByteArray(key,value); }
// public yarnwrap.nbt.NbtCompound shallowCopy() { return new yarnwrap.nbt.NbtCompound(wrapperContained.shallowCopy()); }
// public static yarnwrap.nbt.NbtCompound shallowCopy() { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.NbtCompound.shallowCopy()); }
// public java.util.Set entrySet() { return wrapperContained.entrySet(); }
// public static java.util.Set entrySet() { return net.minecraft.nbt.NbtCompound.entrySet(); }

}