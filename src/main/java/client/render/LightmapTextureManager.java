package yarnwrap.client.render;
public class LightmapTextureManager { public net.minecraft.client.render.LightmapTextureManager wrapperContained; public LightmapTextureManager(net.minecraft.client.render.LightmapTextureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public float flickerIntensity() { return wrapperContained.flickerIntensity; }
public int MAX_LIGHT_COORDINATE() { return wrapperContained.MAX_LIGHT_COORDINATE; }
public int MAX_SKY_LIGHT_COORDINATE() { return wrapperContained.MAX_SKY_LIGHT_COORDINATE; }
public int MAX_BLOCK_LIGHT_COORDINATE() { return wrapperContained.MAX_BLOCK_LIGHT_COORDINATE; }
// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
// public yarnwrap.client.render.GameRenderer renderer() { return new yarnwrap.client.render.GameRenderer(wrapperContained.renderer); }
// public boolean dirty() { return wrapperContained.dirty; }
// public yarnwrap.util.Identifier textureIdentifier() { return new yarnwrap.util.Identifier(wrapperContained.textureIdentifier); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.texture); }
public float getBrightness(yarnwrap.world.dimension.DimensionType type,int lightLevel) { return wrapperContained.getBrightness(type.wrapperContained,lightLevel); }
public int pack(int block,int sky) { return wrapperContained.pack(block,sky); }
// public float easeOutQuart(float x) { return wrapperContained.easeOutQuart(x); }
public int getBlockLightCoordinates(int light) { return wrapperContained.getBlockLightCoordinates(light); }
public int getSkyLightCoordinates(int light) { return wrapperContained.getSkyLightCoordinates(light); }
public void update(float delta) { wrapperContained.update(delta); }
public void tick() { wrapperContained.tick(); }
public void disable() { wrapperContained.disable(); }
public void enable() { wrapperContained.enable(); }
// public float getDarkness(yarnwrap.entity.LivingEntity entity,float factor,float delta) { return wrapperContained.getDarkness(entity.wrapperContained,factor,delta); }
// public float getDarknessFactor(float delta) { return wrapperContained.getDarknessFactor(delta); }
// public void clamp(org.joml.Vector3f vec) { wrapperContained.clamp(vec); }

}