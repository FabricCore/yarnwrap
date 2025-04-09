package yarnwrap.client.texture.atlas;
public class UnstitchAtlasSource { public net.minecraft.client.texture.atlas.UnstitchAtlasSource wrapperContained; public UnstitchAtlasSource(net.minecraft.client.texture.atlas.UnstitchAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.Identifier resource() { return new yarnwrap.util.Identifier(wrapperContained.resource); }
// public java.util.List regions() { return wrapperContained.regions; }
// public double divisorX() { return wrapperContained.divisorX; }
// public double divisorY() { return wrapperContained.divisorY; }

}