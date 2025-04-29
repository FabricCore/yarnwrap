package yarnwrap.util;
public class LowercaseEnumTypeAdapterFactory { public net.minecraft.util.LowercaseEnumTypeAdapterFactory wrapperContained; public LowercaseEnumTypeAdapterFactory(net.minecraft.util.LowercaseEnumTypeAdapterFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public com.google.gson.TypeAdapter create(com.google.gson.Gson gson,com.google.gson.reflect.TypeToken typeToken) { return wrapperContained.create(gson,typeToken); }
// public static com.google.gson.TypeAdapter create(com.google.gson.Gson gson,com.google.gson.reflect.TypeToken typeToken, ) { return net.minecraft.util.LowercaseEnumTypeAdapterFactory.create(gson,typeToken); }
// public java.lang.String getKey(java.lang.Object o) { return wrapperContained.getKey(o); }
// public static java.lang.String getKey(java.lang.Object o, ) { return net.minecraft.util.LowercaseEnumTypeAdapterFactory.getKey(o); }

}