package yarnwrap.nbt;
public class NbtOps { public net.minecraft.nbt.NbtOps wrapperContained; public NbtOps(net.minecraft.nbt.NbtOps wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtOps INSTANCE() { return new yarnwrap.nbt.NbtOps(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.nbt.NbtOps value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.nbt.NbtOps INSTANCE() { return new yarnwrap.nbt.NbtOps(net.minecraft.nbt.NbtOps.INSTANCE); }
// public static void INSTANCE(yarnwrap.nbt.NbtOps value, ) { net.minecraft.nbt.NbtOps.INSTANCE = value.wrapperContained; }

// public java.lang.Object convertTo(com.mojang.serialization.DynamicOps ops,java.lang.Object element) { return wrapperContained.convertTo(ops,element); }
// public static java.lang.Object convertTo(com.mojang.serialization.DynamicOps ops,java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.convertTo(ops,element); }
public java.lang.Object createBoolean(boolean value) { return wrapperContained.createBoolean(value); }
// public static java.lang.Object createBoolean(boolean value, ) { return net.minecraft.nbt.NbtOps.createBoolean(value); }
public java.lang.Object createByte(byte value) { return wrapperContained.createByte(value); }
// public static java.lang.Object createByte(byte value, ) { return net.minecraft.nbt.NbtOps.createByte(value); }
public java.lang.Object createByteList(java.nio.ByteBuffer buf) { return wrapperContained.createByteList(buf); }
// public static java.lang.Object createByteList(java.nio.ByteBuffer buf, ) { return net.minecraft.nbt.NbtOps.createByteList(buf); }
public java.lang.Object createDouble(double value) { return wrapperContained.createDouble(value); }
// public static java.lang.Object createDouble(double value, ) { return net.minecraft.nbt.NbtOps.createDouble(value); }
public java.lang.Object createFloat(float value) { return wrapperContained.createFloat(value); }
// public static java.lang.Object createFloat(float value, ) { return net.minecraft.nbt.NbtOps.createFloat(value); }
public java.lang.Object createInt(int value) { return wrapperContained.createInt(value); }
// public static java.lang.Object createInt(int value, ) { return net.minecraft.nbt.NbtOps.createInt(value); }
public java.lang.Object createIntList(java.util.stream.IntStream stream) { return wrapperContained.createIntList(stream); }
// public static java.lang.Object createIntList(java.util.stream.IntStream stream, ) { return net.minecraft.nbt.NbtOps.createIntList(stream); }
public java.lang.Object createList(java.util.stream.Stream stream) { return wrapperContained.createList(stream); }
// public static java.lang.Object createList(java.util.stream.Stream stream, ) { return net.minecraft.nbt.NbtOps.createList(stream); }
public java.lang.Object createLong(long value) { return wrapperContained.createLong(value); }
// public static java.lang.Object createLong(long value, ) { return net.minecraft.nbt.NbtOps.createLong(value); }
public java.lang.Object createLongList(java.util.stream.LongStream stream) { return wrapperContained.createLongList(stream); }
// public static java.lang.Object createLongList(java.util.stream.LongStream stream, ) { return net.minecraft.nbt.NbtOps.createLongList(stream); }
public java.lang.Object createMap(java.util.stream.Stream entries) { return wrapperContained.createMap(entries); }
// public static java.lang.Object createMap(java.util.stream.Stream entries, ) { return net.minecraft.nbt.NbtOps.createMap(entries); }
public java.lang.Object createNumeric(java.lang.Number value) { return wrapperContained.createNumeric(value); }
// public static java.lang.Object createNumeric(java.lang.Number value, ) { return net.minecraft.nbt.NbtOps.createNumeric(value); }
public java.lang.Object createShort(short value) { return wrapperContained.createShort(value); }
// public static java.lang.Object createShort(short value, ) { return net.minecraft.nbt.NbtOps.createShort(value); }
public java.lang.Object createString(java.lang.String string) { return wrapperContained.createString(string); }
// public static java.lang.Object createString(java.lang.String string, ) { return net.minecraft.nbt.NbtOps.createString(string); }
// public com.mojang.serialization.DataResult getByteBuffer(java.lang.Object element) { return wrapperContained.getByteBuffer(element); }
// public static com.mojang.serialization.DataResult getByteBuffer(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getByteBuffer(element); }
// public com.mojang.serialization.DataResult getIntStream(java.lang.Object element) { return wrapperContained.getIntStream(element); }
// public static com.mojang.serialization.DataResult getIntStream(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getIntStream(element); }
// public com.mojang.serialization.DataResult getList(java.lang.Object element) { return wrapperContained.getList(element); }
// public static com.mojang.serialization.DataResult getList(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getList(element); }
// public com.mojang.serialization.DataResult getLongStream(java.lang.Object element) { return wrapperContained.getLongStream(element); }
// public static com.mojang.serialization.DataResult getLongStream(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getLongStream(element); }
// public com.mojang.serialization.DataResult getMap(java.lang.Object element) { return wrapperContained.getMap(element); }
// public static com.mojang.serialization.DataResult getMap(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getMap(element); }
// public com.mojang.serialization.DataResult getMapEntries(java.lang.Object element) { return wrapperContained.getMapEntries(element); }
// public static com.mojang.serialization.DataResult getMapEntries(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getMapEntries(element); }
// public com.mojang.serialization.DataResult getMapValues(java.lang.Object element) { return wrapperContained.getMapValues(element); }
// public static com.mojang.serialization.DataResult getMapValues(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getMapValues(element); }
// public com.mojang.serialization.DataResult getNumberValue(java.lang.Object element) { return wrapperContained.getNumberValue(element); }
// public static com.mojang.serialization.DataResult getNumberValue(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getNumberValue(element); }
// public com.mojang.serialization.DataResult getStream(java.lang.Object element) { return wrapperContained.getStream(element); }
// public static com.mojang.serialization.DataResult getStream(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getStream(element); }
// public com.mojang.serialization.DataResult getStringValue(java.lang.Object element) { return wrapperContained.getStringValue(element); }
// public static com.mojang.serialization.DataResult getStringValue(java.lang.Object element, ) { return net.minecraft.nbt.NbtOps.getStringValue(element); }
// public com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.lang.Object value) { return wrapperContained.mergeToList(list,value); }
// public static com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.lang.Object value, ) { return net.minecraft.nbt.NbtOps.mergeToList(list,value); }
// public com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.util.List values) { return wrapperContained.mergeToList(list,values); }
// public static com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.util.List values, ) { return net.minecraft.nbt.NbtOps.mergeToList(list,values); }
// public com.mojang.serialization.DataResult mergeToMap(java.lang.Object element,com.mojang.serialization.MapLike map) { return wrapperContained.mergeToMap(element,map); }
// public static com.mojang.serialization.DataResult mergeToMap(java.lang.Object element,com.mojang.serialization.MapLike map, ) { return net.minecraft.nbt.NbtOps.mergeToMap(element,map); }
// public com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,java.lang.Object key,java.lang.Object value) { return wrapperContained.mergeToMap(map,key,value); }
// public static com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,java.lang.Object key,java.lang.Object value, ) { return net.minecraft.nbt.NbtOps.mergeToMap(map,key,value); }
// public com.mojang.serialization.DataResult mergeToMap(java.lang.Object nbt,java.util.Map map) { return wrapperContained.mergeToMap(nbt,map); }
// public static com.mojang.serialization.DataResult mergeToMap(java.lang.Object nbt,java.util.Map map, ) { return net.minecraft.nbt.NbtOps.mergeToMap(nbt,map); }
// public void method_29147(java.util.List entry,yarnwrap.nbt.NbtCompound pair) { wrapperContained.method_29147(entry,pair.wrapperContained); }
// public static void method_29147(java.util.List entry,yarnwrap.nbt.NbtCompound pair, ) { net.minecraft.nbt.NbtOps.method_29147(entry,pair.wrapperContained); }
// public void method_29152(yarnwrap.nbt.NbtCompound entry) { wrapperContained.method_29152(entry.wrapperContained); }
// public static void method_29152(yarnwrap.nbt.NbtCompound entry, ) { net.minecraft.nbt.NbtOps.method_29152(entry.wrapperContained); }
// public com.mojang.serialization.DataResult method_46230(java.util.List merger) { return wrapperContained.method_46230(merger); }
// public static com.mojang.serialization.DataResult method_46230(java.util.List merger, ) { return net.minecraft.nbt.NbtOps.method_46230(merger); }
// public com.mojang.serialization.DataResult method_46234(yarnwrap.nbt.NbtElement merger) { return wrapperContained.method_46234(merger.wrapperContained); }
// public static com.mojang.serialization.DataResult method_46234(yarnwrap.nbt.NbtElement merger, ) { return net.minecraft.nbt.NbtOps.method_46234(merger.wrapperContained); }
// public java.util.Optional createMerger(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.createMerger(nbt.wrapperContained); }
// public static java.util.Optional createMerger(yarnwrap.nbt.NbtElement nbt, ) { return net.minecraft.nbt.NbtOps.createMerger(nbt.wrapperContained); }
// public java.lang.Object remove(java.lang.Object element,java.lang.String key) { return wrapperContained.remove(element,key); }
// public static java.lang.Object remove(java.lang.Object element,java.lang.String key, ) { return net.minecraft.nbt.NbtOps.remove(element,key); }

}