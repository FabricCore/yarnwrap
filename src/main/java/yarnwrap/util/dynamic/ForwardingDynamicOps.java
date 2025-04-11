package yarnwrap.util.dynamic;
public class ForwardingDynamicOps { public net.minecraft.util.dynamic.ForwardingDynamicOps wrapperContained; public ForwardingDynamicOps(net.minecraft.util.dynamic.ForwardingDynamicOps wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.DynamicOps delegate() { return wrapperContained.delegate; }
// public void delegate(com.mojang.serialization.DynamicOps value) { wrapperContained.delegate = value; }
// public ForwardingDynamicOps(com.mojang.serialization.DynamicOps delegate) { this.wrapperContained = new net.minecraft.util.dynamic.ForwardingDynamicOps(delegate); }
public java.lang.Object convertTo(com.mojang.serialization.DynamicOps outputOps,java.lang.Object input) { return wrapperContained.convertTo(outputOps,input); }
public java.lang.Object createBoolean(boolean bl) { return wrapperContained.createBoolean(bl); }
public java.lang.Object createByte(byte b) { return wrapperContained.createByte(b); }
public java.lang.Object createByteList(java.nio.ByteBuffer buf) { return wrapperContained.createByteList(buf); }
public java.lang.Object createDouble(double d) { return wrapperContained.createDouble(d); }
public java.lang.Object createFloat(float f) { return wrapperContained.createFloat(f); }
public java.lang.Object createInt(int i) { return wrapperContained.createInt(i); }
public java.lang.Object createIntList(java.util.stream.IntStream stream) { return wrapperContained.createIntList(stream); }
public java.lang.Object createList(java.util.stream.Stream stream) { return wrapperContained.createList(stream); }
public java.lang.Object createLong(long l) { return wrapperContained.createLong(l); }
public java.lang.Object createLongList(java.util.stream.LongStream stream) { return wrapperContained.createLongList(stream); }
public java.lang.Object createMap(java.util.stream.Stream map) { return wrapperContained.createMap(map); }
public java.lang.Object createNumeric(java.lang.Number number) { return wrapperContained.createNumeric(number); }
public java.lang.Object createShort(short s) { return wrapperContained.createShort(s); }
public java.lang.Object createString(java.lang.String string) { return wrapperContained.createString(string); }
public com.mojang.serialization.DataResult getBooleanValue(java.lang.Object input) { return wrapperContained.getBooleanValue(input); }
public com.mojang.serialization.DataResult getByteBuffer(java.lang.Object input) { return wrapperContained.getByteBuffer(input); }
public com.mojang.serialization.DataResult getIntStream(java.lang.Object input) { return wrapperContained.getIntStream(input); }
public com.mojang.serialization.DataResult getList(java.lang.Object input) { return wrapperContained.getList(input); }
public com.mojang.serialization.DataResult getLongStream(java.lang.Object input) { return wrapperContained.getLongStream(input); }
public com.mojang.serialization.DataResult getMap(java.lang.Object input) { return wrapperContained.getMap(input); }
public com.mojang.serialization.DataResult getMapEntries(java.lang.Object input) { return wrapperContained.getMapEntries(input); }
public com.mojang.serialization.DataResult getMapValues(java.lang.Object input) { return wrapperContained.getMapValues(input); }
public com.mojang.serialization.DataResult getNumberValue(java.lang.Object input) { return wrapperContained.getNumberValue(input); }
public com.mojang.serialization.DataResult getStream(java.lang.Object input) { return wrapperContained.getStream(input); }
public com.mojang.serialization.DataResult getStringValue(java.lang.Object input) { return wrapperContained.getStringValue(input); }
public com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.lang.Object value) { return wrapperContained.mergeToList(list,value); }
public com.mojang.serialization.DataResult mergeToList(java.lang.Object list,java.util.List values) { return wrapperContained.mergeToList(list,values); }
public com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,com.mojang.serialization.MapLike values) { return wrapperContained.mergeToMap(map,values); }
public com.mojang.serialization.DataResult mergeToMap(java.lang.Object map,java.lang.Object key,java.lang.Object value) { return wrapperContained.mergeToMap(map,key,value); }
public java.lang.Object remove(java.lang.Object input,java.lang.String key) { return wrapperContained.remove(input,key); }

}