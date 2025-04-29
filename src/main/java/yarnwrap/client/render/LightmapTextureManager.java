package yarnwrap.client.render;
public class LightmapTextureManager { public net.minecraft.client.render.LightmapTextureManager wrapperContained; public LightmapTextureManager(net.minecraft.client.render.LightmapTextureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public float flickerIntensity() { return wrapperContained.flickerIntensity; }
// public void flickerIntensity(float value) { wrapperContained.flickerIntensity = value; }
// public static float flickerIntensity() { return net.minecraft.client.render.LightmapTextureManager.flickerIntensity; }
// public static void flickerIntensity(float value, ) { net.minecraft.client.render.LightmapTextureManager.flickerIntensity = value; }

// public int MAX_LIGHT_COORDINATE() { return wrapperContained.MAX_LIGHT_COORDINATE; }
// public void MAX_LIGHT_COORDINATE(int value) { wrapperContained.MAX_LIGHT_COORDINATE = value; }
public static int MAX_LIGHT_COORDINATE() { return net.minecraft.client.render.LightmapTextureManager.MAX_LIGHT_COORDINATE; }
// public static void MAX_LIGHT_COORDINATE(int value, ) { net.minecraft.client.render.LightmapTextureManager.MAX_LIGHT_COORDINATE = value; }

// public int MAX_SKY_LIGHT_COORDINATE() { return wrapperContained.MAX_SKY_LIGHT_COORDINATE; }
// public void MAX_SKY_LIGHT_COORDINATE(int value) { wrapperContained.MAX_SKY_LIGHT_COORDINATE = value; }
public static int MAX_SKY_LIGHT_COORDINATE() { return net.minecraft.client.render.LightmapTextureManager.MAX_SKY_LIGHT_COORDINATE; }
// public static void MAX_SKY_LIGHT_COORDINATE(int value, ) { net.minecraft.client.render.LightmapTextureManager.MAX_SKY_LIGHT_COORDINATE = value; }

// public int MAX_BLOCK_LIGHT_COORDINATE() { return wrapperContained.MAX_BLOCK_LIGHT_COORDINATE; }
// public void MAX_BLOCK_LIGHT_COORDINATE(int value) { wrapperContained.MAX_BLOCK_LIGHT_COORDINATE = value; }
public static int MAX_BLOCK_LIGHT_COORDINATE() { return net.minecraft.client.render.LightmapTextureManager.MAX_BLOCK_LIGHT_COORDINATE; }
// public static void MAX_BLOCK_LIGHT_COORDINATE(int value, ) { net.minecraft.client.render.LightmapTextureManager.MAX_BLOCK_LIGHT_COORDINATE = value; }

// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
// public void image(yarnwrap.client.texture.NativeImage value) { wrapperContained.image = value.wrapperContained; }
// public static yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.render.LightmapTextureManager.image); }
// public static void image(yarnwrap.client.texture.NativeImage value, ) { net.minecraft.client.render.LightmapTextureManager.image = value.wrapperContained; }

// public yarnwrap.client.render.GameRenderer renderer() { return new yarnwrap.client.render.GameRenderer(wrapperContained.renderer); }
// public void renderer(yarnwrap.client.render.GameRenderer value) { wrapperContained.renderer = value.wrapperContained; }
// public static yarnwrap.client.render.GameRenderer renderer() { return new yarnwrap.client.render.GameRenderer(net.minecraft.client.render.LightmapTextureManager.renderer); }
// public static void renderer(yarnwrap.client.render.GameRenderer value, ) { net.minecraft.client.render.LightmapTextureManager.renderer = value.wrapperContained; }

// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public static boolean dirty() { return net.minecraft.client.render.LightmapTextureManager.dirty; }
// public static void dirty(boolean value, ) { net.minecraft.client.render.LightmapTextureManager.dirty = value; }

// public yarnwrap.util.Identifier textureIdentifier() { return new yarnwrap.util.Identifier(wrapperContained.textureIdentifier); }
// public void textureIdentifier(yarnwrap.util.Identifier value) { wrapperContained.textureIdentifier = value.wrapperContained; }
// public static yarnwrap.util.Identifier textureIdentifier() { return new yarnwrap.util.Identifier(net.minecraft.client.render.LightmapTextureManager.textureIdentifier); }
// public static void textureIdentifier(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.LightmapTextureManager.textureIdentifier = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.LightmapTextureManager.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.LightmapTextureManager.client = value.wrapperContained; }

// public yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.texture); }
// public void texture(yarnwrap.client.texture.NativeImageBackedTexture value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(net.minecraft.client.render.LightmapTextureManager.texture); }
// public static void texture(yarnwrap.client.texture.NativeImageBackedTexture value, ) { net.minecraft.client.render.LightmapTextureManager.texture = value.wrapperContained; }

public LightmapTextureManager(yarnwrap.client.render.GameRenderer renderer,yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.LightmapTextureManager(renderer.wrapperContained,client.wrapperContained); }
// public float getBrightness(yarnwrap.world.dimension.DimensionType type,int lightLevel) { return wrapperContained.getBrightness(type.wrapperContained,lightLevel); }
// public static float getBrightness(yarnwrap.world.dimension.DimensionType type,int lightLevel, ) { return net.minecraft.client.render.LightmapTextureManager.getBrightness(type.wrapperContained,lightLevel); }
// public int pack(int block,int sky) { return wrapperContained.pack(block,sky); }
// public static int pack(int block,int sky, ) { return net.minecraft.client.render.LightmapTextureManager.pack(block,sky); }
// public float easeOutQuart(float x) { return wrapperContained.easeOutQuart(x); }
// public static float easeOutQuart(float x, ) { return net.minecraft.client.render.LightmapTextureManager.easeOutQuart(x); }
// public int getBlockLightCoordinates(int light) { return wrapperContained.getBlockLightCoordinates(light); }
// public static int getBlockLightCoordinates(int light, ) { return net.minecraft.client.render.LightmapTextureManager.getBlockLightCoordinates(light); }
// public int getSkyLightCoordinates(int light) { return wrapperContained.getSkyLightCoordinates(light); }
// public static int getSkyLightCoordinates(int light, ) { return net.minecraft.client.render.LightmapTextureManager.getSkyLightCoordinates(light); }
public void update(float delta) { wrapperContained.update(delta); }
// public static void update(float delta, ) { net.minecraft.client.render.LightmapTextureManager.update(delta); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.render.LightmapTextureManager.tick(); }
public void disable() { wrapperContained.disable(); }
// public static void disable() { net.minecraft.client.render.LightmapTextureManager.disable(); }
public void enable() { wrapperContained.enable(); }
// public static void enable() { net.minecraft.client.render.LightmapTextureManager.enable(); }
// public float getDarkness(yarnwrap.entity.LivingEntity entity,float factor,float delta) { return wrapperContained.getDarkness(entity.wrapperContained,factor,delta); }
// public static float getDarkness(yarnwrap.entity.LivingEntity entity,float factor,float delta, ) { return net.minecraft.client.render.LightmapTextureManager.getDarkness(entity.wrapperContained,factor,delta); }
// public float getDarknessFactor(float delta) { return wrapperContained.getDarknessFactor(delta); }
// public static float getDarknessFactor(float delta, ) { return net.minecraft.client.render.LightmapTextureManager.getDarknessFactor(delta); }
// public void clamp(org.joml.Vector3f vec) { wrapperContained.clamp(vec); }
// public static void clamp(org.joml.Vector3f vec, ) { net.minecraft.client.render.LightmapTextureManager.clamp(vec); }

}