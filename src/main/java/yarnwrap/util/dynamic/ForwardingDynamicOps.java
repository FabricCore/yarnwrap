package yarnwrap.util.dynamic;
public class ForwardingDynamicOps { public net.minecraft.util.dynamic.ForwardingDynamicOps wrapperContained; public ForwardingDynamicOps(net.minecraft.util.dynamic.ForwardingDynamicOps wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.DynamicOps delegate() { return wrapperContained.delegate; }
// public void delegate(com.mojang.serialization.DynamicOps value) { wrapperContained.delegate = value; }
// public static com.mojang.serialization.DynamicOps delegate() { return net.minecraft.util.dynamic.ForwardingDynamicOps.delegate; }
// public static void delegate(com.mojang.serialization.DynamicOps value, ) { net.minecraft.util.dynamic.ForwardingDynamicOps.delegate = value; }

// public ForwardingDynamicOps(com.mojang.serialization.DynamicOps delegate) { this.wrapperContained = new net.minecraft.util.dynamic.ForwardingDynamicOps(delegate); }
public java.lang.Object convertTo(com.mojang.serialization.DynamicOps outputOps,java.lang.Object input) { return wrapperContained.convertTo(outputOps,input); }
// public static java.lang.Object convertTo(com.mojang.serialization.DynamicOps outputOps,java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.convertTo(outputOps,input); }
public java.lang.Object createBoolean(boolean bl) { return wrapperContained.createBoolean(bl); }
// public static java.lang.Object createBoolean(boolean bl, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createBoolean(bl); }
public java.lang.Object createByte(byte b) { return wrapperContained.createByte(b); }
// public static java.lang.Object createByte(byte b, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createByte(b); }
public java.lang.Object createByteList(java.nio.ByteBuffer buf) { return wrapperContained.createByteList(buf); }
// public static java.lang.Object createByteList(java.nio.ByteBuffer buf, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createByteList(buf); }
public java.lang.Object createDouble(double d) { return wrapperContained.createDouble(d); }
// public static java.lang.Object createDouble(double d, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createDouble(d); }
public java.lang.Object createFloat(float f) { return wrapperContained.createFloat(f); }
// public static java.lang.Object createFloat(float f, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createFloat(f); }
public java.lang.Object createInt(int i) { return wrapperContained.createInt(i); }
// public static java.lang.Object createInt(int i, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createInt(i); }
public java.lang.Object createIntList(java.util.stream.IntStream stream) { return wrapperContained.createIntList(stream); }
// public static java.lang.Object createIntList(java.util.stream.IntStream stream, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createIntList(stream); }
public java.lang.Object createList(java.util.stream.Stream stream) { return wrapperContained.createList(stream); }
// public static java.lang.Object createList(java.util.stream.Stream stream, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createList(stream); }
public java.lang.Object createLong(long l) { return wrapperContained.createLong(l); }
// public static java.lang.Object createLong(long l, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createLong(l); }
public java.lang.Object createLongList(java.util.stream.LongStream stream) { return wrapperContained.createLongList(stream); }
// public static java.lang.Object createLongList(java.util.stream.LongStream stream, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createLongList(stream); }
public java.lang.Object createMap(java.util.stream.Stream map) { return wrapperContained.createMap(map); }
// public static java.lang.Object createMap(java.util.stream.Stream map, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createMap(map); }
public java.lang.Object createNumeric(java.lang.Number number) { return wrapperContained.createNumeric(number); }
// public static java.lang.Object createNumeric(java.lang.Number number, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createNumeric(number); }
public java.lang.Object createShort(short s) { return wrapperContained.createShort(s); }
// public static java.lang.Object createShort(short s, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createShort(s); }
public java.lang.Object createString(java.lang.String string) { return wrapperContained.createString(string); }
// public static java.lang.Object createString(java.lang.String string, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.createString(string); }
public com.mojang.serialization.DataResult getBooleanValue(java.lang.Object input) { return wrapperContained.getBooleanValue(input); }
// public static com.mojang.serialization.DataResult getBooleanValue(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getBooleanValue(input); }
public com.mojang.serialization.DataResult getByteBuffer(java.lang.Object input) { return wrapperContained.getByteBuffer(input); }
// public static com.mojang.serialization.DataResult getByteBuffer(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getByteBuffer(input); }
public com.mojang.serialization.DataResult getIntStream(java.lang.Object input) { return wrapperContained.getIntStream(input); }
// public static com.mojang.serialization.DataResult getIntStream(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getIntStream(input); }
public com.mojang.serialization.DataResult getList(java.lang.Object input) { return wrapperContained.getList(input); }
// public static com.mojang.serialization.DataResult getList(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getList(input); }
public com.mojang.serialization.DataResult getLongStream(java.lang.Object input) { return wrapperContained.getLongStream(input); }
// public static com.mojang.serialization.DataResult getLongStream(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getLongStream(input); }
public com.mojang.serialization.DataResult getMap(java.lang.Object input) { return wrapperContained.getMap(input); }
// public static com.mojang.serialization.DataResult getMap(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getMap(input); }
public com.mojang.serialization.DataResult getMapEntries(java.lang.Object input) { return wrapperContained.getMapEntries(input); }
// public static com.mojang.serialization.DataResult getMapEntries(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getMapEntries(input); }
public com.mojang.serialization.DataResult getMapValues(java.lang.Object input) { return wrapperContained.getMapValues(input); }
// public static com.mojang.serialization.DataResult getMapValues(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getMapValues(input); }
public com.mojang.serialization.DataResult getNumberValue(java.lang.Object input) { return wrapperContained.getNumberValue(input); }
// public static com.mojang.serialization.DataResult getNumberValue(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getNumberValue(input); }
public com.mojang.serialization.DataResult getStream(java.lang.Object input) { return wrapperContained.getStream(input); }
// public static com.mojang.serialization.DataResult getStream(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getStream(input); }
public com.mojang.serialization.DataResult getStringValue(java.lang.Object input) { return wrapperContained.getStringValue(input); }
// public static com.mojang.serialization.DataResult getStringValue(java.lang.Object input, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.getStringValue(input); }
public com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.lang.Object value) { return wrapperContained.mergeToList(list,value); }
// public static com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.lang.Object value, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.mergeToList(list,value); }
public com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.util.List values) { return wrapperContained.mergeToList(list,values); }
// public static com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.util.List values, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.mergeToList(list,values); }
public com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,com.mojang.serialization.MapLike values) { return wrapperContained.mergeToMap(map,values); }
// public static com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,com.mojang.serialization.MapLike values, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.mergeToMap(map,values); }
public com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,java.lang.Object key,java.lang.Object value) { return wrapperContained.mergeToMap(map,key,value); }
// public static com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,java.lang.Object key,java.lang.Object value, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.mergeToMap(map,key,value); }
public java.lang.Object remove(java.lang.Object input,java.lang.String key) { return wrapperContained.remove(input,key); }
// public static java.lang.Object remove(java.lang.Object input,java.lang.String key, ) { return net.minecraft.util.dynamic.ForwardingDynamicOps.remove(input,key); }

}