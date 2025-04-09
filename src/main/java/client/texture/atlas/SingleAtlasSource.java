package yarnwrap.client.texture.atlas;
public class SingleAtlasSource { public net.minecraft.client.texture.atlas.SingleAtlasSource wrapperContained; public SingleAtlasSource(net.minecraft.client.texture.atlas.SingleAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.Identifier resource() { return new yarnwrap.util.Identifier(wrapperContained.resource); }
// public java.util.Optional sprite() { return wrapperContained.sprite; }

}