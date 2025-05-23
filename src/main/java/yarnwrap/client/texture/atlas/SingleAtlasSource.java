package yarnwrap.client.texture.atlas;
public class SingleAtlasSource { public net.minecraft.client.texture.atlas.SingleAtlasSource wrapperContained; public SingleAtlasSource(net.minecraft.client.texture.atlas.SingleAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.texture.atlas.SingleAtlasSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.texture.atlas.SingleAtlasSource.CODEC = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.atlas.SingleAtlasSource.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.atlas.SingleAtlasSource.LOGGER = value; }

public SingleAtlasSource(yarnwrap.util.Identifier resourceId) { this.wrapperContained = new net.minecraft.client.texture.atlas.SingleAtlasSource(resourceId.wrapperContained); }
public SingleAtlasSource(yarnwrap.util.Identifier resource,java.util.Optional sprite) { this.wrapperContained = new net.minecraft.client.texture.atlas.SingleAtlasSource(resource.wrapperContained,sprite); }
// public com.mojang.datafixers.kinds.App method_47687(Object instance) { return wrapperContained.method_47687(instance); }
// public static com.mojang.datafixers.kinds.App method_47687(Object instance, ) { return net.minecraft.client.texture.atlas.SingleAtlasSource.method_47687(instance); }

}