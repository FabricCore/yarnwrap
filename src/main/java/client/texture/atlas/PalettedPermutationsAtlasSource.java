package yarnwrap.client.texture.atlas;
public class PalettedPermutationsAtlasSource { public net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource wrapperContained; public PalettedPermutationsAtlasSource(net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.List textures() { return wrapperContained.textures; }
// public java.util.Map permutations() { return wrapperContained.permutations; }
// public yarnwrap.util.Identifier paletteKey() { return new yarnwrap.util.Identifier(wrapperContained.paletteKey); }
public int[] open(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier texture) { return wrapperContained.open(resourceManager.wrapperContained,texture.wrapperContained); }
// public java.util.function.IntUnaryOperator toMapper(int from,int to) { return wrapperContained.toMapper(from,to); }

}