package yarnwrap.client.texture.atlas;
public class PalettedPermutationsAtlasSource { public net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource wrapperContained; public PalettedPermutationsAtlasSource(net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.CODEC = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.LOGGER = value; }

// public java.lang.String DEFAULT_SEPARATOR() { return wrapperContained.DEFAULT_SEPARATOR; }
// public void DEFAULT_SEPARATOR(java.lang.String value) { wrapperContained.DEFAULT_SEPARATOR = value; }
public static java.lang.String DEFAULT_SEPARATOR() { return net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.DEFAULT_SEPARATOR; }
// public static void DEFAULT_SEPARATOR(java.lang.String value, ) { net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.DEFAULT_SEPARATOR = value; }

public PalettedPermutationsAtlasSource(java.util.List textures,yarnwrap.util.Identifier paletteKey,java.util.Map permutations) { this.wrapperContained = new net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource(textures,paletteKey.wrapperContained,permutations); }
// public PalettedPermutationsAtlasSource(java.util.List textures,yarnwrap.util.Identifier permutations) { this.wrapperContained = new net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource(textures,permutations.wrapperContained); }
// public int[] open(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier texture) { return wrapperContained.open(resourceManager.wrapperContained,texture.wrapperContained); }
// public static int[] open(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier texture, ) { return net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.open(resourceManager.wrapperContained,texture.wrapperContained); }
// public int method_48489(it.unimi.dsi.fastutil.ints.Int2IntMap color) { return wrapperContained.method_48489(color); }
// public static int method_48489(it.unimi.dsi.fastutil.ints.Int2IntMap color, ) { return net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.method_48489(color); }
// public void method_48490(java.util.Map key,java.util.function.Supplier texture) { wrapperContained.method_48490(key,texture); }
// public static void method_48490(java.util.Map key,java.util.function.Supplier texture, ) { net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.method_48490(key,texture); }
// public java.util.function.IntUnaryOperator toMapper(int from,int to) { return wrapperContained.toMapper(from,to); }
// public static java.util.function.IntUnaryOperator toMapper(int from,int to, ) { return net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.toMapper(from,to); }
// public com.mojang.datafixers.kinds.App method_67291(Object instance) { return wrapperContained.method_67291(instance); }
// public static com.mojang.datafixers.kinds.App method_67291(Object instance, ) { return net.minecraft.client.texture.atlas.PalettedPermutationsAtlasSource.method_67291(instance); }

}