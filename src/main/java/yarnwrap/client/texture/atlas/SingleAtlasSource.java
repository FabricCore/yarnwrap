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

// public yarnwrap.util.Identifier resource() { return new yarnwrap.util.Identifier(wrapperContained.resource); }
// public void resource(yarnwrap.util.Identifier value) { wrapperContained.resource = value.wrapperContained; }
// public static yarnwrap.util.Identifier resource() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.atlas.SingleAtlasSource.resource); }
// public static void resource(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.atlas.SingleAtlasSource.resource = value.wrapperContained; }

// public java.util.Optional sprite() { return wrapperContained.sprite; }
// public void sprite(java.util.Optional value) { wrapperContained.sprite = value; }
// public static java.util.Optional sprite() { return net.minecraft.client.texture.atlas.SingleAtlasSource.sprite; }
// public static void sprite(java.util.Optional value, ) { net.minecraft.client.texture.atlas.SingleAtlasSource.sprite = value; }

public SingleAtlasSource(yarnwrap.util.Identifier resource,java.util.Optional sprite) { this.wrapperContained = new net.minecraft.client.texture.atlas.SingleAtlasSource(resource.wrapperContained,sprite); }

}