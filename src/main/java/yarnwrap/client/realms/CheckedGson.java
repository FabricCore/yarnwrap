package yarnwrap.client.realms;
public class CheckedGson { public net.minecraft.client.realms.CheckedGson wrapperContained; public CheckedGson(net.minecraft.client.realms.CheckedGson wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
public java.lang.String toJson(yarnwrap.client.realms.RealmsSerializable serializable) { return wrapperContained.toJson(serializable.wrapperContained); }
public yarnwrap.client.realms.RealmsSerializable fromJson(java.lang.String json,java.lang.Class type) { return new yarnwrap.client.realms.RealmsSerializable(wrapperContained.fromJson(json,type)); }
public java.lang.String toJson(com.google.gson.JsonElement json) { return wrapperContained.toJson(json); }

}