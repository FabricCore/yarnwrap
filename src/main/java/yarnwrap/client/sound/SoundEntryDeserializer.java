package yarnwrap.client.sound;
public class SoundEntryDeserializer { public net.minecraft.client.sound.SoundEntryDeserializer wrapperContained; public SoundEntryDeserializer(net.minecraft.client.sound.SoundEntryDeserializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.floatprovider.FloatProvider ONE() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.ONE); }
// public void ONE(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.ONE = value.wrapperContained; }
public java.lang.Object deserialize(com.google.gson.JsonElement functionJson,java.lang.reflect.Type unused,com.google.gson.JsonDeserializationContext context) { return wrapperContained.deserialize(functionJson,unused,context); }
// public Object deserializeType(com.google.gson.JsonObject json,Object fallback) { return wrapperContained.deserializeType(json,fallback); }
// public yarnwrap.client.sound.Sound deserializeSound(com.google.gson.JsonObject json) { return new yarnwrap.client.sound.Sound(wrapperContained.deserializeSound(json)); }
// public java.util.List deserializeSounds(com.google.gson.JsonObject json) { return wrapperContained.deserializeSounds(json); }

}