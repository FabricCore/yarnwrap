package yarnwrap.client.render;
public class DimensionEffects { public net.minecraft.client.render.DimensionEffects wrapperContained; public DimensionEffects(net.minecraft.client.render.DimensionEffects wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectMap BY_IDENTIFIER() { return wrapperContained.BY_IDENTIFIER; }
// public float[] rgba() { return wrapperContained.rgba; }
// public float cloudsHeight() { return wrapperContained.cloudsHeight; }
// public boolean alternateSkyColor() { return wrapperContained.alternateSkyColor; }
// public boolean brightenLighting() { return wrapperContained.brightenLighting; }
// public Object skyType() { return wrapperContained.skyType; }
// public boolean darkened() { return wrapperContained.darkened; }
public float getCloudsHeight() { return wrapperContained.getCloudsHeight(); }
public float[] getFogColorOverride(float skyAngle,float tickDelta) { return wrapperContained.getFogColorOverride(skyAngle,tickDelta); }
public boolean useThickFog(int camX,int camY) { return wrapperContained.useThickFog(camX,camY); }
public yarnwrap.client.render.DimensionEffects byDimensionType(yarnwrap.world.dimension.DimensionType dimensionType) { return new yarnwrap.client.render.DimensionEffects(wrapperContained.byDimensionType(dimensionType.wrapperContained)); }
public yarnwrap.util.math.Vec3d adjustFogColor(yarnwrap.util.math.Vec3d color,float sunHeight) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustFogColor(color.wrapperContained,sunHeight)); }
public boolean isAlternateSkyColor() { return wrapperContained.isAlternateSkyColor(); }
public boolean shouldBrightenLighting() { return wrapperContained.shouldBrightenLighting(); }
public Object getSkyType() { return wrapperContained.getSkyType(); }
public boolean isDarkened() { return wrapperContained.isDarkened(); }

}