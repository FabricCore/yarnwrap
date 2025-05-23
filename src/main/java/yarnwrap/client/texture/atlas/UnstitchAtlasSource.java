package yarnwrap.client.texture.atlas;
public class UnstitchAtlasSource { public net.minecraft.client.texture.atlas.UnstitchAtlasSource wrapperContained; public UnstitchAtlasSource(net.minecraft.client.texture.atlas.UnstitchAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public double divisorX() { return wrapperContained.divisorX; }
// public void divisorX(double value) { wrapperContained.divisorX = value; }
// public static double divisorX() { return net.minecraft.client.texture.atlas.UnstitchAtlasSource.divisorX; }
// public static void divisorX(double value, ) { net.minecraft.client.texture.atlas.UnstitchAtlasSource.divisorX = value; }

// public double divisorY() { return wrapperContained.divisorY; }
// public void divisorY(double value) { wrapperContained.divisorY = value; }
// public static double divisorY() { return net.minecraft.client.texture.atlas.UnstitchAtlasSource.divisorY; }
// public static void divisorY(double value, ) { net.minecraft.client.texture.atlas.UnstitchAtlasSource.divisorY = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.texture.atlas.UnstitchAtlasSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.texture.atlas.UnstitchAtlasSource.CODEC = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.atlas.UnstitchAtlasSource.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.atlas.UnstitchAtlasSource.LOGGER = value; }

public UnstitchAtlasSource(yarnwrap.util.Identifier resource,java.util.List regions,double divisorX,double divisorY) { this.wrapperContained = new net.minecraft.client.texture.atlas.UnstitchAtlasSource(resource.wrapperContained,regions,divisorX,divisorY); }
// public double divisorX() { return wrapperContained.divisorX(); }
// // public static double divisorX() { return net.minecraft.client.texture.atlas.UnstitchAtlasSource.divisorX(); }
// public double divisorY() { return wrapperContained.divisorY(); }
// // public static double divisorY() { return net.minecraft.client.texture.atlas.UnstitchAtlasSource.divisorY(); }
// public com.mojang.datafixers.kinds.App method_47692(Object instance) { return wrapperContained.method_47692(instance); }
// public static com.mojang.datafixers.kinds.App method_47692(Object instance, ) { return net.minecraft.client.texture.atlas.UnstitchAtlasSource.method_47692(instance); }

}