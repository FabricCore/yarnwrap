package yarnwrap.client.render;
public class BackgroundRenderer { public net.minecraft.client.render.BackgroundRenderer wrapperContained; public BackgroundRenderer(net.minecraft.client.render.BackgroundRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float WATER_FOG_CHANGE_DURATION() { return wrapperContained.WATER_FOG_CHANGE_DURATION; }
// public void WATER_FOG_CHANGE_DURATION(float value) { wrapperContained.WATER_FOG_CHANGE_DURATION = value; }
public static float WATER_FOG_CHANGE_DURATION() { return net.minecraft.client.render.BackgroundRenderer.WATER_FOG_CHANGE_DURATION; }
// public static void WATER_FOG_CHANGE_DURATION(float value, ) { net.minecraft.client.render.BackgroundRenderer.WATER_FOG_CHANGE_DURATION = value; }

// public int WATER_FOG_LENGTH() { return wrapperContained.WATER_FOG_LENGTH; }
// public void WATER_FOG_LENGTH(int value) { wrapperContained.WATER_FOG_LENGTH = value; }
// public static int WATER_FOG_LENGTH() { return net.minecraft.client.render.BackgroundRenderer.WATER_FOG_LENGTH; }
// public static void WATER_FOG_LENGTH(int value, ) { net.minecraft.client.render.BackgroundRenderer.WATER_FOG_LENGTH = value; }

// public java.util.List FOG_MODIFIERS() { return wrapperContained.FOG_MODIFIERS; }
// public void FOG_MODIFIERS(java.util.List value) { wrapperContained.FOG_MODIFIERS = value; }
// public static java.util.List FOG_MODIFIERS() { return net.minecraft.client.render.BackgroundRenderer.FOG_MODIFIERS; }
// public static void FOG_MODIFIERS(java.util.List value, ) { net.minecraft.client.render.BackgroundRenderer.FOG_MODIFIERS = value; }

// public int waterFogColor() { return wrapperContained.waterFogColor; }
// public void waterFogColor(int value) { wrapperContained.waterFogColor = value; }
// public static int waterFogColor() { return net.minecraft.client.render.BackgroundRenderer.waterFogColor; }
// public static void waterFogColor(int value, ) { net.minecraft.client.render.BackgroundRenderer.waterFogColor = value; }

// public float blue() { return wrapperContained.blue; }
// public void blue(float value) { wrapperContained.blue = value; }
// public static float blue() { return net.minecraft.client.render.BackgroundRenderer.blue; }
// public static void blue(float value, ) { net.minecraft.client.render.BackgroundRenderer.blue = value; }

// public float green() { return wrapperContained.green; }
// public void green(float value) { wrapperContained.green = value; }
// public static float green() { return net.minecraft.client.render.BackgroundRenderer.green; }
// public static void green(float value, ) { net.minecraft.client.render.BackgroundRenderer.green = value; }

// public float red() { return wrapperContained.red; }
// public void red(float value) { wrapperContained.red = value; }
// public static float red() { return net.minecraft.client.render.BackgroundRenderer.red; }
// public static void red(float value, ) { net.minecraft.client.render.BackgroundRenderer.red = value; }

// public int nextWaterFogColor() { return wrapperContained.nextWaterFogColor; }
// public void nextWaterFogColor(int value) { wrapperContained.nextWaterFogColor = value; }
// public static int nextWaterFogColor() { return net.minecraft.client.render.BackgroundRenderer.nextWaterFogColor; }
// public static void nextWaterFogColor(int value, ) { net.minecraft.client.render.BackgroundRenderer.nextWaterFogColor = value; }

// public long lastWaterFogColorUpdateTime() { return wrapperContained.lastWaterFogColorUpdateTime; }
// public void lastWaterFogColorUpdateTime(long value) { wrapperContained.lastWaterFogColorUpdateTime = value; }
// public static long lastWaterFogColorUpdateTime() { return net.minecraft.client.render.BackgroundRenderer.lastWaterFogColorUpdateTime; }
// public static void lastWaterFogColorUpdateTime(long value, ) { net.minecraft.client.render.BackgroundRenderer.lastWaterFogColorUpdateTime = value; }

// public void clearFog() { wrapperContained.clearFog(); }
public static void clearFog() { net.minecraft.client.render.BackgroundRenderer.clearFog(); }
// public yarnwrap.util.math.Vec3d method_24873(yarnwrap.client.world.ClientWorld x,yarnwrap.world.biome.source.BiomeAccess y,float z) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_24873(x.wrapperContained,y.wrapperContained,z)); }
// public static yarnwrap.util.math.Vec3d method_24873(yarnwrap.client.world.ClientWorld x,yarnwrap.world.biome.source.BiomeAccess y,float z, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.BackgroundRenderer.method_24873(x.wrapperContained,y.wrapperContained,z)); }
// public void render(yarnwrap.client.render.Camera camera,float tickDelta,yarnwrap.client.world.ClientWorld world,int viewDistance,float skyDarkness) { wrapperContained.render(camera.wrapperContained,tickDelta,world.wrapperContained,viewDistance,skyDarkness); }
// public static void render(yarnwrap.client.render.Camera camera,float tickDelta,yarnwrap.client.world.ClientWorld world,int viewDistance,float skyDarkness, ) { net.minecraft.client.render.BackgroundRenderer.render(camera.wrapperContained,tickDelta,world.wrapperContained,viewDistance,skyDarkness); }
// public void applyFog(yarnwrap.client.render.Camera camera,Object fogType,float viewDistance,boolean thickFog,float tickDelta) { wrapperContained.applyFog(camera.wrapperContained,fogType,viewDistance,thickFog,tickDelta); }
// public static void applyFog(yarnwrap.client.render.Camera camera,Object fogType,float viewDistance,boolean thickFog,float tickDelta, ) { net.minecraft.client.render.BackgroundRenderer.applyFog(camera.wrapperContained,fogType,viewDistance,thickFog,tickDelta); }
// public void applyFogColor() { wrapperContained.applyFogColor(); }
public static void applyFogColor() { net.minecraft.client.render.BackgroundRenderer.applyFogColor(); }
// public Object getFogModifier(yarnwrap.entity.Entity entity,float tickDelta) { return wrapperContained.getFogModifier(entity.wrapperContained,tickDelta); }
// public static Object getFogModifier(yarnwrap.entity.Entity entity,float tickDelta, ) { return net.minecraft.client.render.BackgroundRenderer.getFogModifier(entity.wrapperContained,tickDelta); }
// public boolean method_42589(yarnwrap.entity.LivingEntity modifier) { return wrapperContained.method_42589(modifier.wrapperContained); }
// public static boolean method_42589(yarnwrap.entity.LivingEntity modifier, ) { return net.minecraft.client.render.BackgroundRenderer.method_42589(modifier.wrapperContained); }

}