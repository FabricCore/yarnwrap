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
public UnstitchAtlasSource(yarnwrap.util.Identifier resource,java.util.List regions,double divisorX,double divisorY) { this.wrapperContained = new net.minecraft.client.texture.atlas.UnstitchAtlasSource(resource.wrapperContained,regions,divisorX,divisorY); }
// public com.mojang.datafixers.kinds.App method_47692(Object instance) { return wrapperContained.method_47692(instance); }
// public java.lang.Double method_47693(yarnwrap.client.texture.atlas.UnstitchAtlasSource source) { return wrapperContained.method_47693(source.wrapperContained); }
// public java.lang.Double method_47694(yarnwrap.client.texture.atlas.UnstitchAtlasSource source) { return wrapperContained.method_47694(source.wrapperContained); }
// public java.util.List method_47695(yarnwrap.client.texture.atlas.UnstitchAtlasSource source) { return wrapperContained.method_47695(source.wrapperContained); }
// public yarnwrap.util.Identifier method_47696(yarnwrap.client.texture.atlas.UnstitchAtlasSource source) { return new yarnwrap.util.Identifier(wrapperContained.method_47696(source.wrapperContained)); }

}