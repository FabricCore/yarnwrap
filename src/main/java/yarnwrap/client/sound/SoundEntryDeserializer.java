package yarnwrap.client.sound;
public class SoundEntryDeserializer { public net.minecraft.client.sound.SoundEntryDeserializer wrapperContained; public SoundEntryDeserializer(net.minecraft.client.sound.SoundEntryDeserializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.floatprovider.FloatProvider ONE() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.ONE); }
// public void ONE(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.ONE = value.wrapperContained; }
// public static yarnwrap.util.math.floatprovider.FloatProvider ONE() { return new yarnwrap.util.math.floatprovider.FloatProvider(net.minecraft.client.sound.SoundEntryDeserializer.ONE); }
// public static void ONE(yarnwrap.util.math.floatprovider.FloatProvider value, ) { net.minecraft.client.sound.SoundEntryDeserializer.ONE = value.wrapperContained; }

public java.lang.Object deserialize(com.google.gson.JsonElement functionJson,java.lang.reflect.Type unused,com.google.gson.JsonDeserializationContext context) { return wrapperContained.deserialize(functionJson,unused,context); }
// public static java.lang.Object deserialize(com.google.gson.JsonElement functionJson,java.lang.reflect.Type unused,com.google.gson.JsonDeserializationContext context, ) { return net.minecraft.client.sound.SoundEntryDeserializer.deserialize(functionJson,unused,context); }
// public Object deserializeType(com.google.gson.JsonObject json,Object fallback) { return wrapperContained.deserializeType(json,fallback); }
// public static Object deserializeType(com.google.gson.JsonObject json,Object fallback, ) { return net.minecraft.client.sound.SoundEntryDeserializer.deserializeType(json,fallback); }
// public yarnwrap.client.sound.Sound deserializeSound(com.google.gson.JsonObject json) { return new yarnwrap.client.sound.Sound(wrapperContained.deserializeSound(json)); }
// public static yarnwrap.client.sound.Sound deserializeSound(com.google.gson.JsonObject json, ) { return new yarnwrap.client.sound.Sound(net.minecraft.client.sound.SoundEntryDeserializer.deserializeSound(json)); }
// public java.util.List deserializeSounds(com.google.gson.JsonObject json) { return wrapperContained.deserializeSounds(json); }
// public static java.util.List deserializeSounds(com.google.gson.JsonObject json, ) { return net.minecraft.client.sound.SoundEntryDeserializer.deserializeSounds(json); }

}