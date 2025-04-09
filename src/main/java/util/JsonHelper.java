package yarnwrap.util;
public class JsonHelper { public net.minecraft.util.JsonHelper wrapperContained; public JsonHelper(net.minecraft.util.JsonHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
public com.google.gson.JsonArray asArray(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asArray(element,name); }
public java.lang.String getString(com.google.gson.JsonObject object,java.lang.String element,java.lang.String defaultStr) { return wrapperContained.getString(object,element,defaultStr); }
public boolean hasBoolean(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.hasBoolean(object,element); }
public com.google.gson.JsonObject deserialize(java.io.Reader reader) { return wrapperContained.deserialize(reader); }
public yarnwrap.registry.entry.RegistryEntry asItem(com.google.gson.JsonElement element,java.lang.String name) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.asItem(element,name)); }
public int asInt(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asInt(element,name); }
public boolean getBoolean(com.google.gson.JsonObject object,java.lang.String element,boolean defaultBoolean) { return wrapperContained.getBoolean(object,element,defaultBoolean); }
public float getFloat(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getFloat(object,element); }
public int getInt(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getInt(object,element); }
public com.google.gson.JsonArray getArray(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getArray(object,element); }
public java.lang.Object deserialize(com.google.gson.Gson gson,java.lang.String content,com.google.gson.reflect.TypeToken typeToken,boolean lenient) { return wrapperContained.deserialize(gson,content,typeToken,lenient); }
public long asLong(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asLong(element,name); }
public boolean hasArray(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.hasArray(object,element); }
public java.lang.String getString(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getString(object,element); }
public java.lang.String getType(com.google.gson.JsonElement element) { return wrapperContained.getType(element); }
public java.lang.Object deserialize(com.google.gson.Gson gson,java.io.Reader reader,java.lang.Class type,boolean lenient) { return wrapperContained.deserialize(gson,reader,type,lenient); }
public boolean asBoolean(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asBoolean(element,name); }
public float asFloat(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asFloat(element,name); }
public boolean getBoolean(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getBoolean(object,element); }
public byte getByte(com.google.gson.JsonObject object,java.lang.String element,byte defaultByte) { return wrapperContained.getByte(object,element,defaultByte); }
public java.lang.Object deserialize(com.google.gson.JsonObject object,java.lang.String element,com.google.gson.JsonDeserializationContext context,java.lang.Class type) { return wrapperContained.deserialize(object,element,context,type); }
public java.lang.Object deserialize(com.google.gson.Gson gson,java.io.Reader reader,com.google.gson.reflect.TypeToken typeToken,boolean lenient) { return wrapperContained.deserialize(gson,reader,typeToken,lenient); }
public com.google.gson.JsonObject deserialize(java.io.Reader reader,boolean lenient) { return wrapperContained.deserialize(reader,lenient); }
public boolean isNumber(com.google.gson.JsonElement element) { return wrapperContained.isNumber(element); }
public java.lang.Object deserialize(com.google.gson.Gson gson,java.io.Reader reader,java.lang.Class type) { return wrapperContained.deserialize(gson,reader,type); }
public float getFloat(com.google.gson.JsonObject object,java.lang.String element,float defaultFloat) { return wrapperContained.getFloat(object,element,defaultFloat); }
public boolean hasPrimitive(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.hasPrimitive(object,element); }
public java.lang.Object deserialize(com.google.gson.Gson gson,java.lang.String content,java.lang.Class type,boolean lenient) { return wrapperContained.deserialize(gson,content,type,lenient); }
public long getLong(com.google.gson.JsonObject object,java.lang.String element,long defaultLong) { return wrapperContained.getLong(object,element,defaultLong); }
public com.google.gson.JsonObject getObject(com.google.gson.JsonObject object,java.lang.String element,com.google.gson.JsonObject defaultObject) { return wrapperContained.getObject(object,element,defaultObject); }
public int getInt(com.google.gson.JsonObject object,java.lang.String element,int defaultInt) { return wrapperContained.getInt(object,element,defaultInt); }
public java.lang.Object deserialize(com.google.gson.JsonObject object,java.lang.String element,java.lang.Object defaultValue,com.google.gson.JsonDeserializationContext context,java.lang.Class type) { return wrapperContained.deserialize(object,element,defaultValue,context,type); }
public java.lang.Object deserialize(com.google.gson.Gson gson,java.lang.String content,java.lang.Class type) { return wrapperContained.deserialize(gson,content,type); }
public com.google.gson.JsonObject deserialize(java.lang.String content) { return wrapperContained.deserialize(content); }
public boolean isString(com.google.gson.JsonElement element) { return wrapperContained.isString(element); }
public java.lang.String asString(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asString(element,name); }
public yarnwrap.registry.entry.RegistryEntry getItem(com.google.gson.JsonObject object,java.lang.String key) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getItem(object,key)); }
public boolean hasString(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.hasString(object,element); }
public java.lang.Object deserialize(com.google.gson.Gson gson,java.lang.String content,com.google.gson.reflect.TypeToken typeToken) { return wrapperContained.deserialize(gson,content,typeToken); }
public java.lang.Object deserialize(com.google.gson.JsonElement element,java.lang.String name,com.google.gson.JsonDeserializationContext context,java.lang.Class type) { return wrapperContained.deserialize(element,name,context,type); }
public com.google.gson.JsonArray getArray(com.google.gson.JsonObject object,java.lang.String name,com.google.gson.JsonArray defaultArray) { return wrapperContained.getArray(object,name,defaultArray); }
public byte asByte(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asByte(element,name); }
public boolean hasElement(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.hasElement(object,element); }
public com.google.gson.JsonObject asObject(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asObject(element,name); }
public com.google.gson.JsonObject getObject(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getObject(object,element); }
public java.lang.Object deserialize(com.google.gson.Gson gson,java.io.Reader reader,com.google.gson.reflect.TypeToken typeToken) { return wrapperContained.deserialize(gson,reader,typeToken); }
public com.google.gson.JsonObject deserialize(java.lang.String content,boolean lenient) { return wrapperContained.deserialize(content,lenient); }
public long getLong(com.google.gson.JsonObject object,java.lang.String name) { return wrapperContained.getLong(object,name); }
public char getChar(com.google.gson.JsonObject object,java.lang.String element,char defaultChar) { return wrapperContained.getChar(object,element,defaultChar); }
public double getDouble(com.google.gson.JsonObject object,java.lang.String element,double defaultDouble) { return wrapperContained.getDouble(object,element,defaultDouble); }
public yarnwrap.registry.entry.RegistryEntry getItem(com.google.gson.JsonObject object,java.lang.String key,yarnwrap.registry.entry.RegistryEntry defaultValue) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getItem(object,key,defaultValue.wrapperContained)); }
public java.math.BigDecimal getBigDecimal(com.google.gson.JsonObject object,java.lang.String element,java.math.BigDecimal defaultBigDecimal) { return wrapperContained.getBigDecimal(object,element,defaultBigDecimal); }
public java.math.BigInteger getBigInteger(com.google.gson.JsonObject object,java.lang.String element,java.math.BigInteger defaultBigInteger) { return wrapperContained.getBigInteger(object,element,defaultBigInteger); }
public short getShort(com.google.gson.JsonObject object,java.lang.String element,short defaultShort) { return wrapperContained.getShort(object,element,defaultShort); }
public boolean hasNumber(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.hasNumber(object,element); }
public boolean isBoolean(com.google.gson.JsonElement object) { return wrapperContained.isBoolean(object); }
public double asDouble(com.google.gson.JsonElement object,java.lang.String name) { return wrapperContained.asDouble(object,name); }
public boolean hasJsonObject(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.hasJsonObject(object,element); }
public char asChar(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asChar(element,name); }
public java.math.BigDecimal asBigDecimal(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asBigDecimal(element,name); }
public java.math.BigInteger asBigInteger(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asBigInteger(element,name); }
public double getDouble(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getDouble(object,element); }
public short asShort(com.google.gson.JsonElement element,java.lang.String name) { return wrapperContained.asShort(element,name); }
public byte getByte(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getByte(object,element); }
public char getChar(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getChar(object,element); }
public java.math.BigDecimal getBigDecimal(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getBigDecimal(object,element); }
public java.math.BigInteger getBigInteger(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getBigInteger(object,element); }
public short getShort(com.google.gson.JsonObject object,java.lang.String element) { return wrapperContained.getShort(object,element); }
public com.google.gson.JsonArray deserializeArray(java.io.Reader reader) { return wrapperContained.deserializeArray(reader); }
// public void writeSorted(com.google.gson.stream.JsonWriter writer,com.google.gson.JsonElement json,java.util.Comparator comparator) { wrapperContained.writeSorted(writer,json,comparator); }
// public java.util.Collection sort(java.util.Collection entries,java.util.Comparator comparator) { return wrapperContained.sort(entries,comparator); }
public com.google.gson.JsonArray deserializeArray(java.lang.String content) { return wrapperContained.deserializeArray(content); }
public java.lang.String toSortedString(com.google.gson.JsonElement json) { return wrapperContained.toSortedString(json); }
public java.lang.Object deserializeNullable(com.google.gson.Gson gson,java.io.Reader reader,com.google.gson.reflect.TypeToken typeToken,boolean lenient) { return wrapperContained.deserializeNullable(gson,reader,typeToken,lenient); }
public java.lang.Object deserializeNullable(com.google.gson.Gson gson,java.io.Reader reader,java.lang.Class type,boolean lenient) { return wrapperContained.deserializeNullable(gson,reader,type,lenient); }
public java.lang.Object deserializeNullable(com.google.gson.Gson gson,java.lang.String content,java.lang.Class type,boolean lenient) { return wrapperContained.deserializeNullable(gson,content,type,lenient); }
public com.google.gson.JsonElement getElement(com.google.gson.JsonObject object,java.lang.String name) { return wrapperContained.getElement(object,name); }

}