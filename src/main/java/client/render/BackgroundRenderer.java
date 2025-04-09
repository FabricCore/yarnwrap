package yarnwrap.client.render;
public class BackgroundRenderer { public net.minecraft.client.render.BackgroundRenderer wrapperContained; public BackgroundRenderer(net.minecraft.client.render.BackgroundRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public float WATER_FOG_CHANGE_DURATION() { return wrapperContained.WATER_FOG_CHANGE_DURATION; }
// public int WATER_FOG_LENGTH() { return wrapperContained.WATER_FOG_LENGTH; }
// public java.util.List FOG_MODIFIERS() { return wrapperContained.FOG_MODIFIERS; }
// public int waterFogColor() { return wrapperContained.waterFogColor; }
// public float blue() { return wrapperContained.blue; }
// public float green() { return wrapperContained.green; }
// public float red() { return wrapperContained.red; }
// public int nextWaterFogColor() { return wrapperContained.nextWaterFogColor; }
// public long lastWaterFogColorUpdateTime() { return wrapperContained.lastWaterFogColorUpdateTime; }
public void clearFog() { wrapperContained.clearFog(); }
public void render(yarnwrap.client.render.Camera camera,float tickDelta,yarnwrap.client.world.ClientWorld world,int viewDistance,float skyDarkness) { wrapperContained.render(camera.wrapperContained,tickDelta,world.wrapperContained,viewDistance,skyDarkness); }
// public void applyFog(yarnwrap.client.render.Camera camera,Object fogType,float viewDistance,boolean thickFog,float tickDelta) { wrapperContained.applyFog(camera.wrapperContained,fogType,viewDistance,thickFog,tickDelta); }
public void applyFogColor() { wrapperContained.applyFogColor(); }
// public Object getFogModifier(yarnwrap.entity.Entity entity,float tickDelta) { return wrapperContained.getFogModifier(entity.wrapperContained,tickDelta); }

}