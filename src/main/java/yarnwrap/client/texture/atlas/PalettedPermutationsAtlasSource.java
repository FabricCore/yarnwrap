package yarnwrap.client.texture.atlas;
public class PalettedPermutationsAtlasSource { public net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource wrapperContained; public PalettedPermutationsAtlasSource(net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.List textures() { return wrapperContained.textures; }
// public void textures(java.util.List value) { wrapperContained.textures = value; }
// public java.util.Map permutations() { return wrapperContained.permutations; }
// public void permutations(java.util.Map value) { wrapperContained.permutations = value; }
// public yarnwrap.util.Identifier paletteKey() { return new yarnwrap.util.Identifier(wrapperContained.paletteKey); }
// public void paletteKey(yarnwrap.util.Identifier value) { wrapperContained.paletteKey = value.wrapperContained; }
// public PalettedPermutationsAtlasSource(java.util.List textures,yarnwrap.util.Identifier paletteKey,java.util.Map permutations) { this.wrapperContained = new net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource(textures,paletteKey.wrapperContained,permutations); }
public int[] open(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier texture) { return wrapperContained.open(resourceManager.wrapperContained,texture.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_48487(Object instance) { return wrapperContained.method_48487(instance); }
// public java.util.Map method_48488(yarnwrap.client.texture.atlas.PalettedPermutationsAtlasSource source) { return wrapperContained.method_48488(source.wrapperContained); }
// public int method_48489(it.unimi.dsi.fastutil.ints.Int2IntMap color) { return wrapperContained.method_48489(color); }
// public void method_48490(java.util.Map key,java.util.function.Supplier texture) { wrapperContained.method_48490(key,texture); }
// public java.util.function.IntUnaryOperator toMapper(int from,int to) { return wrapperContained.toMapper(from,to); }
// public yarnwrap.util.Identifier method_48493(yarnwrap.client.texture.atlas.PalettedPermutationsAtlasSource source) { return new yarnwrap.util.Identifier(wrapperContained.method_48493(source.wrapperContained)); }
// public java.util.List method_48494(yarnwrap.client.texture.atlas.PalettedPermutationsAtlasSource source) { return wrapperContained.method_48494(source.wrapperContained); }

}