package yarnwrap.client.render;
public class BackgroundRenderer { public net.minecraft.client.render.BackgroundRenderer wrapperContained; public BackgroundRenderer(net.minecraft.client.render.BackgroundRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public float WATER_FOG_CHANGE_DURATION() { return wrapperContained.WATER_FOG_CHANGE_DURATION; }
// public void WATER_FOG_CHANGE_DURATION(float value) { wrapperContained.WATER_FOG_CHANGE_DURATION = value; }
// public int WATER_FOG_LENGTH() { return wrapperContained.WATER_FOG_LENGTH; }
// public void WATER_FOG_LENGTH(int value) { wrapperContained.WATER_FOG_LENGTH = value; }
// public java.util.List FOG_MODIFIERS() { return wrapperContained.FOG_MODIFIERS; }
// public void FOG_MODIFIERS(java.util.List value) { wrapperContained.FOG_MODIFIERS = value; }
// public int waterFogColor() { return wrapperContained.waterFogColor; }
// public void waterFogColor(int value) { wrapperContained.waterFogColor = value; }
// public float blue() { return wrapperContained.blue; }
// public void blue(float value) { wrapperContained.blue = value; }
// public float green() { return wrapperContained.green; }
// public void green(float value) { wrapperContained.green = value; }
// public float red() { return wrapperContained.red; }
// public void red(float value) { wrapperContained.red = value; }
// public int nextWaterFogColor() { return wrapperContained.nextWaterFogColor; }
// public void nextWaterFogColor(int value) { wrapperContained.nextWaterFogColor = value; }
// public long lastWaterFogColorUpdateTime() { return wrapperContained.lastWaterFogColorUpdateTime; }
// public void lastWaterFogColorUpdateTime(long value) { wrapperContained.lastWaterFogColorUpdateTime = value; }
public void clearFog() { wrapperContained.clearFog(); }
public void render(yarnwrap.client.render.Camera camera,float tickDelta,yarnwrap.client.world.ClientWorld world,int viewDistance,float skyDarkness) { wrapperContained.render(camera.wrapperContained,tickDelta,world.wrapperContained,viewDistance,skyDarkness); }
// public void applyFog(yarnwrap.client.render.Camera camera,Object fogType,float viewDistance,boolean thickFog,float tickDelta) { wrapperContained.applyFog(camera.wrapperContained,fogType,viewDistance,thickFog,tickDelta); }
public void applyFogColor() { wrapperContained.applyFogColor(); }
// public Object getFogModifier(yarnwrap.entity.Entity entity,float tickDelta) { return wrapperContained.getFogModifier(entity.wrapperContained,tickDelta); }

}