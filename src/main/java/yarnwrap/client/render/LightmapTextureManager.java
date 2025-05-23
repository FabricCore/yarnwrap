package yarnwrap.client.render;
public class LightmapTextureManager { public net.minecraft.client.render.LightmapTextureManager wrapperContained; public LightmapTextureManager(net.minecraft.client.render.LightmapTextureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.GameRenderer renderer() { return new yarnwrap.client.render.GameRenderer(wrapperContained.renderer); }
// public void renderer(yarnwrap.client.render.GameRenderer value) { wrapperContained.renderer = value.wrapperContained; }
// public static yarnwrap.client.render.GameRenderer renderer() { return new yarnwrap.client.render.GameRenderer(net.minecraft.client.render.LightmapTextureManager.renderer); }
// public static void renderer(yarnwrap.client.render.GameRenderer value, ) { net.minecraft.client.render.LightmapTextureManager.renderer = value.wrapperContained; }

// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public static boolean dirty() { return net.minecraft.client.render.LightmapTextureManager.dirty; }
// public static void dirty(boolean value, ) { net.minecraft.client.render.LightmapTextureManager.dirty = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.LightmapTextureManager.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.LightmapTextureManager.client = value.wrapperContained; }

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

// public com.mojang.blaze3d.textures.GpuTexture glTexture() { return wrapperContained.glTexture; }
// public void glTexture(com.mojang.blaze3d.textures.GpuTexture value) { wrapperContained.glTexture = value; }
// public static com.mojang.blaze3d.textures.GpuTexture glTexture() { return net.minecraft.client.render.LightmapTextureManager.glTexture; }
// public static void glTexture(com.mojang.blaze3d.textures.GpuTexture value, ) { net.minecraft.client.render.LightmapTextureManager.glTexture = value; }

// public int UBO_SIZE() { return wrapperContained.UBO_SIZE; }
// public void UBO_SIZE(int value) { wrapperContained.UBO_SIZE = value; }
// public static int UBO_SIZE() { return net.minecraft.client.render.LightmapTextureManager.UBO_SIZE; }
// public static void UBO_SIZE(int value, ) { net.minecraft.client.render.LightmapTextureManager.UBO_SIZE = value; }

// public yarnwrap.client.gl.MappableRingBuffer buffer() { return new yarnwrap.client.gl.MappableRingBuffer(wrapperContained.buffer); }
// public void buffer(yarnwrap.client.gl.MappableRingBuffer value) { wrapperContained.buffer = value.wrapperContained; }
// public static yarnwrap.client.gl.MappableRingBuffer buffer() { return new yarnwrap.client.gl.MappableRingBuffer(net.minecraft.client.render.LightmapTextureManager.buffer); }
// public static void buffer(yarnwrap.client.gl.MappableRingBuffer value, ) { net.minecraft.client.render.LightmapTextureManager.buffer = value.wrapperContained; }

// // public com.mojang.blaze3d.textures.GpuTextureView glTextureView() { return wrapperContained.glTextureView; }
// // public void glTextureView(com.mojang.blaze3d.textures.GpuTextureView value) { wrapperContained.glTextureView = value; }
// // public static com.mojang.blaze3d.textures.GpuTextureView glTextureView() { return net.minecraft.client.render.LightmapTextureManager.glTextureView; }
// // public static void glTextureView(com.mojang.blaze3d.textures.GpuTextureView value, ) { net.minecraft.client.render.LightmapTextureManager.glTextureView = value; }

public LightmapTextureManager(yarnwrap.client.render.GameRenderer renderer,yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.LightmapTextureManager(renderer.wrapperContained,client.wrapperContained); }
public void update(float tickProgress) { wrapperContained.update(tickProgress); }
// public static void update(float tickProgress, ) { net.minecraft.client.render.LightmapTextureManager.update(tickProgress); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.render.LightmapTextureManager.tick(); }
public void disable() { wrapperContained.disable(); }
// public static void disable() { net.minecraft.client.render.LightmapTextureManager.disable(); }
public void enable() { wrapperContained.enable(); }
// public static void enable() { net.minecraft.client.render.LightmapTextureManager.enable(); }
// public float getBrightness(yarnwrap.world.dimension.DimensionType type,int lightLevel) { return wrapperContained.getBrightness(type.wrapperContained,lightLevel); }
// public static float getBrightness(yarnwrap.world.dimension.DimensionType type,int lightLevel, ) { return net.minecraft.client.render.LightmapTextureManager.getBrightness(type.wrapperContained,lightLevel); }
// public int pack(int block,int sky) { return wrapperContained.pack(block,sky); }
// public static int pack(int block,int sky, ) { return net.minecraft.client.render.LightmapTextureManager.pack(block,sky); }
// public int getBlockLightCoordinates(int light) { return wrapperContained.getBlockLightCoordinates(light); }
// public static int getBlockLightCoordinates(int light, ) { return net.minecraft.client.render.LightmapTextureManager.getBlockLightCoordinates(light); }
// public int getSkyLightCoordinates(int light) { return wrapperContained.getSkyLightCoordinates(light); }
// public static int getSkyLightCoordinates(int light, ) { return net.minecraft.client.render.LightmapTextureManager.getSkyLightCoordinates(light); }
// public float getDarkness(yarnwrap.entity.LivingEntity entity,float factor,float tickProgress) { return wrapperContained.getDarkness(entity.wrapperContained,factor,tickProgress); }
// public static float getDarkness(yarnwrap.entity.LivingEntity entity,float factor,float tickProgress, ) { return net.minecraft.client.render.LightmapTextureManager.getDarkness(entity.wrapperContained,factor,tickProgress); }
// public float getBrightness(float ambientLight,int lightLevel) { return wrapperContained.getBrightness(ambientLight,lightLevel); }
// public static float getBrightness(float ambientLight,int lightLevel, ) { return net.minecraft.client.render.LightmapTextureManager.getBrightness(ambientLight,lightLevel); }
// public int applyEmission(int light,int lightEmission) { return wrapperContained.applyEmission(light,lightEmission); }
// public static int applyEmission(int light,int lightEmission, ) { return net.minecraft.client.render.LightmapTextureManager.applyEmission(light,lightEmission); }
// // public com.mojang.blaze3d.textures.GpuTextureView getGlTextureView() { return wrapperContained.getGlTextureView(); }
// // public static com.mojang.blaze3d.textures.GpuTextureView getGlTextureView() { return net.minecraft.client.render.LightmapTextureManager.getGlTextureView(); }

}