package yarnwrap.client.render;
public class MapRenderer { public net.minecraft.client.render.MapRenderer wrapperContained; public MapRenderer(net.minecraft.client.render.MapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public static yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(net.minecraft.client.render.MapRenderer.textureManager); }
// public static void textureManager(yarnwrap.client.texture.TextureManager value, ) { net.minecraft.client.render.MapRenderer.textureManager = value.wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap mapTextures() { return wrapperContained.mapTextures; }
// public void mapTextures(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.mapTextures = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap mapTextures() { return net.minecraft.client.render.MapRenderer.mapTextures; }
// public static void mapTextures(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.client.render.MapRenderer.mapTextures = value; }

// public int DEFAULT_IMAGE_WIDTH() { return wrapperContained.DEFAULT_IMAGE_WIDTH; }
// public void DEFAULT_IMAGE_WIDTH(int value) { wrapperContained.DEFAULT_IMAGE_WIDTH = value; }
// public static int DEFAULT_IMAGE_WIDTH() { return net.minecraft.client.render.MapRenderer.DEFAULT_IMAGE_WIDTH; }
// public static void DEFAULT_IMAGE_WIDTH(int value, ) { net.minecraft.client.render.MapRenderer.DEFAULT_IMAGE_WIDTH = value; }

// public int DEFAULT_IMAGE_HEIGHT() { return wrapperContained.DEFAULT_IMAGE_HEIGHT; }
// public void DEFAULT_IMAGE_HEIGHT(int value) { wrapperContained.DEFAULT_IMAGE_HEIGHT = value; }
// public static int DEFAULT_IMAGE_HEIGHT() { return net.minecraft.client.render.MapRenderer.DEFAULT_IMAGE_HEIGHT; }
// public static void DEFAULT_IMAGE_HEIGHT(int value, ) { net.minecraft.client.render.MapRenderer.DEFAULT_IMAGE_HEIGHT = value; }

// public yarnwrap.client.texture.MapDecorationsAtlasManager mapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(wrapperContained.mapDecorationsAtlasManager); }
// public void mapDecorationsAtlasManager(yarnwrap.client.texture.MapDecorationsAtlasManager value) { wrapperContained.mapDecorationsAtlasManager = value.wrapperContained; }
// public static yarnwrap.client.texture.MapDecorationsAtlasManager mapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(net.minecraft.client.render.MapRenderer.mapDecorationsAtlasManager); }
// public static void mapDecorationsAtlasManager(yarnwrap.client.texture.MapDecorationsAtlasManager value, ) { net.minecraft.client.render.MapRenderer.mapDecorationsAtlasManager = value.wrapperContained; }

public MapRenderer(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.client.texture.MapDecorationsAtlasManager mapDecorationsAtlasManager) { this.wrapperContained = new net.minecraft.client.render.MapRenderer(textureManager.wrapperContained,mapDecorationsAtlasManager.wrapperContained); }
public void updateTexture(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state) { wrapperContained.updateTexture(id.wrapperContained,state.wrapperContained); }
// public static void updateTexture(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state, ) { net.minecraft.client.render.MapRenderer.updateTexture(id.wrapperContained,state.wrapperContained); }
public void clearStateTextures() { wrapperContained.clearStateTextures(); }
// public static void clearStateTextures() { net.minecraft.client.render.MapRenderer.clearStateTextures(); }
public void draw(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state,boolean hidePlayerIcons,int light) { wrapperContained.draw(matrices.wrapperContained,vertexConsumers.wrapperContained,id.wrapperContained,state.wrapperContained,hidePlayerIcons,light); }
// public static void draw(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state,boolean hidePlayerIcons,int light, ) { net.minecraft.client.render.MapRenderer.draw(matrices.wrapperContained,vertexConsumers.wrapperContained,id.wrapperContained,state.wrapperContained,hidePlayerIcons,light); }
// public Object method_32600(yarnwrap.item.map.MapState id2,java.lang.Integer texture) { return wrapperContained.method_32600(id2.wrapperContained,texture); }
// public static Object method_32600(yarnwrap.item.map.MapState id2,java.lang.Integer texture, ) { return net.minecraft.client.render.MapRenderer.method_32600(id2.wrapperContained,texture); }
// public Object getMapTexture(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state) { return wrapperContained.getMapTexture(id.wrapperContained,state.wrapperContained); }
// public static Object getMapTexture(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state, ) { return net.minecraft.client.render.MapRenderer.getMapTexture(id.wrapperContained,state.wrapperContained); }

}