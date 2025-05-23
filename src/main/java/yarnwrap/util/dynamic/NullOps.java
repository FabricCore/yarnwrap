package yarnwrap.util.dynamic;
public class NullOps { public net.minecraft.util.dynamic.NullOps wrapperContained; public NullOps(net.minecraft.util.dynamic.NullOps wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.dynamic.NullOps INSTANCE() { return new yarnwrap.util.dynamic.NullOps(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.dynamic.NullOps value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.util.dynamic.NullOps INSTANCE() { return new yarnwrap.util.dynamic.NullOps(net.minecraft.util.dynamic.NullOps.INSTANCE); }
// public static void INSTANCE(yarnwrap.util.dynamic.NullOps value, ) { net.minecraft.util.dynamic.NullOps.INSTANCE = value.wrapperContained; }

// public java.lang.Object convertTo(com.mojang.serialization.DynamicOps ops,java.lang.Object unit) { return wrapperContained.convertTo(ops,unit); }
// public static java.lang.Object convertTo(com.mojang.serialization.DynamicOps ops,java.lang.Object unit, ) { return net.minecraft.util.dynamic.NullOps.convertTo(ops,unit); }
public java.lang.Object createBoolean(boolean bl) { return wrapperContained.createBoolean(bl); }
// public static java.lang.Object createBoolean(boolean bl, ) { return net.minecraft.util.dynamic.NullOps.createBoolean(bl); }
public java.lang.Object createByte(byte b) { return wrapperContained.createByte(b); }
// public static java.lang.Object createByte(byte b, ) { return net.minecraft.util.dynamic.NullOps.createByte(b); }
public java.lang.Object createByteList(java.nio.ByteBuffer buf) { return wrapperContained.createByteList(buf); }
// public static java.lang.Object createByteList(java.nio.ByteBuffer buf, ) { return net.minecraft.util.dynamic.NullOps.createByteList(buf); }
public java.lang.Object createDouble(double d) { return wrapperContained.createDouble(d); }
// public static java.lang.Object createDouble(double d, ) { return net.minecraft.util.dynamic.NullOps.createDouble(d); }
public java.lang.Object createFloat(float f) { return wrapperContained.createFloat(f); }
// public static java.lang.Object createFloat(float f, ) { return net.minecraft.util.dynamic.NullOps.createFloat(f); }
public java.lang.Object createInt(int i) { return wrapperContained.createInt(i); }
// public static java.lang.Object createInt(int i, ) { return net.minecraft.util.dynamic.NullOps.createInt(i); }
public java.lang.Object createIntList(java.util.stream.IntStream stream) { return wrapperContained.createIntList(stream); }
// public static java.lang.Object createIntList(java.util.stream.IntStream stream, ) { return net.minecraft.util.dynamic.NullOps.createIntList(stream); }
public java.lang.Object createList(java.util.stream.Stream list) { return wrapperContained.createList(list); }
// public static java.lang.Object createList(java.util.stream.Stream list, ) { return net.minecraft.util.dynamic.NullOps.createList(list); }
public java.lang.Object createLong(long l) { return wrapperContained.createLong(l); }
// public static java.lang.Object createLong(long l, ) { return net.minecraft.util.dynamic.NullOps.createLong(l); }
public java.lang.Object createLongList(java.util.stream.LongStream stream) { return wrapperContained.createLongList(stream); }
// public static java.lang.Object createLongList(java.util.stream.LongStream stream, ) { return net.minecraft.util.dynamic.NullOps.createLongList(stream); }
public java.lang.Object createMap(java.util.Map map) { return wrapperContained.createMap(map); }
// public static java.lang.Object createMap(java.util.Map map, ) { return net.minecraft.util.dynamic.NullOps.createMap(map); }
public java.lang.Object createMap(java.util.stream.Stream map) { return wrapperContained.createMap(map); }
// public static java.lang.Object createMap(java.util.stream.Stream map, ) { return net.minecraft.util.dynamic.NullOps.createMap(map); }
public java.lang.Object createNumeric(java.lang.Number number) { return wrapperContained.createNumeric(number); }
// public static java.lang.Object createNumeric(java.lang.Number number, ) { return net.minecraft.util.dynamic.NullOps.createNumeric(number); }
public java.lang.Object createShort(short s) { return wrapperContained.createShort(s); }
// public static java.lang.Object createShort(short s, ) { return net.minecraft.util.dynamic.NullOps.createShort(s); }
public java.lang.Object createString(java.lang.String string) { return wrapperContained.createString(string); }
// public static java.lang.Object createString(java.lang.String string, ) { return net.minecraft.util.dynamic.NullOps.createString(string); }
// public com.mojang.serialization.DataResult getBooleanValue(java.lang.Object input) { return wrapperContained.getBooleanValue(input); }
// public static com.mojang.serialization.DataResult getBooleanValue(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getBooleanValue(input); }
// public com.mojang.serialization.DataResult getByteBuffer(java.lang.Object input) { return wrapperContained.getByteBuffer(input); }
// public static com.mojang.serialization.DataResult getByteBuffer(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getByteBuffer(input); }
// public com.mojang.serialization.DataResult getIntStream(java.lang.Object input) { return wrapperContained.getIntStream(input); }
// public static com.mojang.serialization.DataResult getIntStream(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getIntStream(input); }
// public com.mojang.serialization.DataResult getList(java.lang.Object input) { return wrapperContained.getList(input); }
// public static com.mojang.serialization.DataResult getList(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getList(input); }
// public com.mojang.serialization.DataResult getLongStream(java.lang.Object input) { return wrapperContained.getLongStream(input); }
// public static com.mojang.serialization.DataResult getLongStream(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getLongStream(input); }
// public com.mojang.serialization.DataResult getMap(java.lang.Object input) { return wrapperContained.getMap(input); }
// public static com.mojang.serialization.DataResult getMap(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getMap(input); }
// public com.mojang.serialization.DataResult getMapEntries(java.lang.Object input) { return wrapperContained.getMapEntries(input); }
// public static com.mojang.serialization.DataResult getMapEntries(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getMapEntries(input); }
// public com.mojang.serialization.DataResult getMapValues(java.lang.Object input) { return wrapperContained.getMapValues(input); }
// public static com.mojang.serialization.DataResult getMapValues(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getMapValues(input); }
// public com.mojang.serialization.DataResult getNumberValue(java.lang.Object input) { return wrapperContained.getNumberValue(input); }
// public static com.mojang.serialization.DataResult getNumberValue(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getNumberValue(input); }
// public com.mojang.serialization.DataResult getStream(java.lang.Object input) { return wrapperContained.getStream(input); }
// public static com.mojang.serialization.DataResult getStream(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getStream(input); }
// public com.mojang.serialization.DataResult getStringValue(java.lang.Object input) { return wrapperContained.getStringValue(input); }
// public static com.mojang.serialization.DataResult getStringValue(java.lang.Object input, ) { return net.minecraft.util.dynamic.NullOps.getStringValue(input); }
// public com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.lang.Object value) { return wrapperContained.mergeToList(list,value); }
// public static com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.lang.Object value, ) { return net.minecraft.util.dynamic.NullOps.mergeToList(list,value); }
// public com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.util.List values) { return wrapperContained.mergeToList(list,values); }
// public static com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.util.List values, ) { return net.minecraft.util.dynamic.NullOps.mergeToList(list,values); }
// public com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,com.mojang.serialization.MapLike values) { return wrapperContained.mergeToMap(map,values); }
// public static com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,com.mojang.serialization.MapLike values, ) { return net.minecraft.util.dynamic.NullOps.mergeToMap(map,values); }
// public com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,java.lang.Object key,java.lang.Object value) { return wrapperContained.mergeToMap(map,key,value); }
// public static com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,java.lang.Object key,java.lang.Object value, ) { return net.minecraft.util.dynamic.NullOps.mergeToMap(map,key,value); }
// public com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,java.util.Map values) { return wrapperContained.mergeToMap(map,values); }
// public static com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,java.util.Map values, ) { return net.minecraft.util.dynamic.NullOps.mergeToMap(map,values); }
// public java.lang.Object remove(java.lang.Object input,java.lang.String key) { return wrapperContained.remove(input,key); }
// public static java.lang.Object remove(java.lang.Object input,java.lang.String key, ) { return net.minecraft.util.dynamic.NullOps.remove(input,key); }

}