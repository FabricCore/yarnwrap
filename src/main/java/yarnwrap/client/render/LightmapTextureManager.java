package yarnwrap.client.render;
public class LightmapTextureManager { public net.minecraft.client.render.LightmapTextureManager wrapperContained; public LightmapTextureManager(net.minecraft.client.render.LightmapTextureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public float flickerIntensity() { return wrapperContained.flickerIntensity; }
// public void flickerIntensity(float value) { wrapperContained.flickerIntensity = value; }
public int MAX_LIGHT_COORDINATE() { return wrapperContained.MAX_LIGHT_COORDINATE; }
// public void MAX_LIGHT_COORDINATE(int value) { wrapperContained.MAX_LIGHT_COORDINATE = value; }
public int MAX_SKY_LIGHT_COORDINATE() { return wrapperContained.MAX_SKY_LIGHT_COORDINATE; }
// public void MAX_SKY_LIGHT_COORDINATE(int value) { wrapperContained.MAX_SKY_LIGHT_COORDINATE = value; }
public int MAX_BLOCK_LIGHT_COORDINATE() { return wrapperContained.MAX_BLOCK_LIGHT_COORDINATE; }
// public void MAX_BLOCK_LIGHT_COORDINATE(int value) { wrapperContained.MAX_BLOCK_LIGHT_COORDINATE = value; }
// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
// public void image(yarnwrap.client.texture.NativeImage value) { wrapperContained.image = value.wrapperContained; }
// public yarnwrap.client.render.GameRenderer renderer() { return new yarnwrap.client.render.GameRenderer(wrapperContained.renderer); }
// public void renderer(yarnwrap.client.render.GameRenderer value) { wrapperContained.renderer = value.wrapperContained; }
// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public yarnwrap.util.Identifier textureIdentifier() { return new yarnwrap.util.Identifier(wrapperContained.textureIdentifier); }
// public void textureIdentifier(yarnwrap.util.Identifier value) { wrapperContained.textureIdentifier = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.texture); }
// public void texture(yarnwrap.client.texture.NativeImageBackedTexture value) { wrapperContained.texture = value.wrapperContained; }
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