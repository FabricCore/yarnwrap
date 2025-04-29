package yarnwrap.client.render;
public class DimensionEffects { public net.minecraft.client.render.DimensionEffects wrapperContained; public DimensionEffects(net.minecraft.client.render.DimensionEffects wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectMap BY_IDENTIFIER() { return wrapperContained.BY_IDENTIFIER; }
// public void BY_IDENTIFIER(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.BY_IDENTIFIER = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectMap BY_IDENTIFIER() { return net.minecraft.client.render.DimensionEffects.BY_IDENTIFIER; }
// public static void BY_IDENTIFIER(it.unimi.dsi.fastutil.objects.Object2ObjectMap value, ) { net.minecraft.client.render.DimensionEffects.BY_IDENTIFIER = value; }

// public float[] rgba() { return wrapperContained.rgba; }
// public void rgba(float[] value) { wrapperContained.rgba = value; }
// public static float[] rgba() { return net.minecraft.client.render.DimensionEffects.rgba; }
// public static void rgba(float[] value, ) { net.minecraft.client.render.DimensionEffects.rgba = value; }

// public float cloudsHeight() { return wrapperContained.cloudsHeight; }
// public void cloudsHeight(float value) { wrapperContained.cloudsHeight = value; }
// public static float cloudsHeight() { return net.minecraft.client.render.DimensionEffects.cloudsHeight; }
// public static void cloudsHeight(float value, ) { net.minecraft.client.render.DimensionEffects.cloudsHeight = value; }

// public boolean alternateSkyColor() { return wrapperContained.alternateSkyColor; }
// public void alternateSkyColor(boolean value) { wrapperContained.alternateSkyColor = value; }
// public static boolean alternateSkyColor() { return net.minecraft.client.render.DimensionEffects.alternateSkyColor; }
// public static void alternateSkyColor(boolean value, ) { net.minecraft.client.render.DimensionEffects.alternateSkyColor = value; }

// public boolean brightenLighting() { return wrapperContained.brightenLighting; }
// public void brightenLighting(boolean value) { wrapperContained.brightenLighting = value; }
// public static boolean brightenLighting() { return net.minecraft.client.render.DimensionEffects.brightenLighting; }
// public static void brightenLighting(boolean value, ) { net.minecraft.client.render.DimensionEffects.brightenLighting = value; }

// public Object skyType() { return wrapperContained.skyType; }
// // public void skyType(Object value) { wrapperContained.skyType = value; }
// // public static Object skyType() { return net.minecraft.client.render.DimensionEffects.skyType; }
// // public static void skyType(Object value, ) { net.minecraft.client.render.DimensionEffects.skyType = value; }

// public boolean darkened() { return wrapperContained.darkened; }
// public void darkened(boolean value) { wrapperContained.darkened = value; }
// public static boolean darkened() { return net.minecraft.client.render.DimensionEffects.darkened; }
// public static void darkened(boolean value, ) { net.minecraft.client.render.DimensionEffects.darkened = value; }

// public DimensionEffects(float cloudsHeight,boolean alternateSkyColor,Object skyType,boolean brightenLighting,boolean darkened) { this.wrapperContained = new net.minecraft.client.render.DimensionEffects(cloudsHeight,alternateSkyColor,skyType,brightenLighting,darkened); }
public float getCloudsHeight() { return wrapperContained.getCloudsHeight(); }
// public static float getCloudsHeight() { return net.minecraft.client.render.DimensionEffects.getCloudsHeight(); }
public float[] getFogColorOverride(float skyAngle,float tickDelta) { return wrapperContained.getFogColorOverride(skyAngle,tickDelta); }
// public static float[] getFogColorOverride(float skyAngle,float tickDelta, ) { return net.minecraft.client.render.DimensionEffects.getFogColorOverride(skyAngle,tickDelta); }
public boolean useThickFog(int camX,int camY) { return wrapperContained.useThickFog(camX,camY); }
// public static boolean useThickFog(int camX,int camY, ) { return net.minecraft.client.render.DimensionEffects.useThickFog(camX,camY); }
// public yarnwrap.client.render.DimensionEffects byDimensionType(yarnwrap.world.dimension.DimensionType dimensionType) { return new yarnwrap.client.render.DimensionEffects(wrapperContained.byDimensionType(dimensionType.wrapperContained)); }
// public static yarnwrap.client.render.DimensionEffects byDimensionType(yarnwrap.world.dimension.DimensionType dimensionType, ) { return new yarnwrap.client.render.DimensionEffects(net.minecraft.client.render.DimensionEffects.byDimensionType(dimensionType.wrapperContained)); }
public yarnwrap.util.math.Vec3d adjustFogColor(yarnwrap.util.math.Vec3d color,float sunHeight) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustFogColor(color.wrapperContained,sunHeight)); }
// public static yarnwrap.util.math.Vec3d adjustFogColor(yarnwrap.util.math.Vec3d color,float sunHeight, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.DimensionEffects.adjustFogColor(color.wrapperContained,sunHeight)); }
public boolean isAlternateSkyColor() { return wrapperContained.isAlternateSkyColor(); }
// public static boolean isAlternateSkyColor() { return net.minecraft.client.render.DimensionEffects.isAlternateSkyColor(); }
public boolean shouldBrightenLighting() { return wrapperContained.shouldBrightenLighting(); }
// public static boolean shouldBrightenLighting() { return net.minecraft.client.render.DimensionEffects.shouldBrightenLighting(); }
// public void method_29092(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap map) { wrapperContained.method_29092(map); }
// public static void method_29092(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap map, ) { net.minecraft.client.render.DimensionEffects.method_29092(map); }
public Object getSkyType() { return wrapperContained.getSkyType(); }
// public static Object getSkyType() { return net.minecraft.client.render.DimensionEffects.getSkyType(); }
public boolean isDarkened() { return wrapperContained.isDarkened(); }
// public static boolean isDarkened() { return net.minecraft.client.render.DimensionEffects.isDarkened(); }

}