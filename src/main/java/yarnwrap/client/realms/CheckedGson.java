package yarnwrap.client.realms;
public class CheckedGson { public net.minecraft.client.realms.CheckedGson wrapperContained; public CheckedGson(net.minecraft.client.realms.CheckedGson wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.client.realms.CheckedGson.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.client.realms.CheckedGson.GSON = value; }

// public com.google.gson.ExclusionStrategy EXCLUSION_STRATEGY() { return wrapperContained.EXCLUSION_STRATEGY; }
// public void EXCLUSION_STRATEGY(com.google.gson.ExclusionStrategy value) { wrapperContained.EXCLUSION_STRATEGY = value; }
// public static com.google.gson.ExclusionStrategy EXCLUSION_STRATEGY() { return net.minecraft.client.realms.CheckedGson.EXCLUSION_STRATEGY; }
// public static void EXCLUSION_STRATEGY(com.google.gson.ExclusionStrategy value, ) { net.minecraft.client.realms.CheckedGson.EXCLUSION_STRATEGY = value; }

public java.lang.String toJson(yarnwrap.client.realms.RealmsSerializable serializable) { return wrapperContained.toJson(serializable.wrapperContained); }
// public static java.lang.String toJson(yarnwrap.client.realms.RealmsSerializable serializable, ) { return net.minecraft.client.realms.CheckedGson.toJson(serializable.wrapperContained); }
public yarnwrap.client.realms.RealmsSerializable fromJson(java.lang.String json,java.lang.Class type) { return new yarnwrap.client.realms.RealmsSerializable(wrapperContained.fromJson(json,type)); }
// public static yarnwrap.client.realms.RealmsSerializable fromJson(java.lang.String json,java.lang.Class type, ) { return new yarnwrap.client.realms.RealmsSerializable(net.minecraft.client.realms.CheckedGson.fromJson(json,type)); }
public java.lang.String toJson(com.google.gson.JsonElement json) { return wrapperContained.toJson(json); }
// public static java.lang.String toJson(com.google.gson.JsonElement json, ) { return net.minecraft.client.realms.CheckedGson.toJson(json); }

}