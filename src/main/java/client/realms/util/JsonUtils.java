package yarnwrap.client.realms.util;
public class JsonUtils { public net.minecraft.client.realms.util.JsonUtils wrapperContained; public JsonUtils(net.minecraft.client.realms.util.JsonUtils wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Date getDateOr(java.lang.String key,com.google.gson.JsonObject node) { return wrapperContained.getDateOr(key,node); }
public int getIntOr(java.lang.String key,com.google.gson.JsonObject node,int defaultValue) { return wrapperContained.getIntOr(key,node,defaultValue); }
public long getLongOr(java.lang.String key,com.google.gson.JsonObject node,long defaultValue) { return wrapperContained.getLongOr(key,node,defaultValue); }
public java.lang.String getNullableStringOr(java.lang.String key,com.google.gson.JsonObject node,java.lang.String defaultValue) { return wrapperContained.getNullableStringOr(key,node,defaultValue); }
public boolean getBooleanOr(java.lang.String key,com.google.gson.JsonObject node,boolean defaultValue) { return wrapperContained.getBooleanOr(key,node,defaultValue); }
public java.lang.String getString(java.lang.String key,com.google.gson.JsonObject node) { return wrapperContained.getString(key,node); }
public java.util.UUID getUuidOr(java.lang.String key,com.google.gson.JsonObject node,java.util.UUID defaultValue) { return wrapperContained.getUuidOr(key,node,defaultValue); }
public java.lang.Object get(java.lang.String key,com.google.gson.JsonObject node,java.util.function.Function deserializer) { return wrapperContained.get(key,node,deserializer); }
public java.lang.Object getNullable(java.lang.String key,com.google.gson.JsonObject node,java.util.function.Function deserializer) { return wrapperContained.getNullable(key,node,deserializer); }
public java.lang.String getStringOr(java.lang.String key,com.google.gson.JsonObject node,java.lang.String defaultValue) { return wrapperContained.getStringOr(key,node,defaultValue); }

}