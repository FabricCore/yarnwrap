package yarnwrap.client.texture.atlas;
public class UnstitchAtlasSource { public net.minecraft.client.texture.atlas.UnstitchAtlasSource wrapperContained; public UnstitchAtlasSource(net.minecraft.client.texture.atlas.UnstitchAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.util.Identifier resource() { return new yarnwrap.util.Identifier(wrapperContained.resource); }
// public void resource(yarnwrap.util.Identifier value) { wrapperContained.resource = value.wrapperContained; }
// public java.util.List regions() { return wrapperContained.regions; }
// public void regions(java.util.List value) { wrapperContained.regions = value; }
// public double divisorX() { return wrapperContained.divisorX; }
// public void divisorX(double value) { wrapperContained.divisorX = value; }
// public double divisorY() { return wrapperContained.divisorY; }
// public void divisorY(double value) { wrapperContained.divisorY = value; }

}