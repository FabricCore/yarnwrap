package yarnwrap.client.render;
public class MapRenderer { public net.minecraft.client.render.MapRenderer wrapperContained; public MapRenderer(net.minecraft.client.render.MapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.MapTextureManager textureManager() { return new yarnwrap.client.texture.MapTextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.MapTextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public static yarnwrap.client.texture.MapTextureManager textureManager() { return new yarnwrap.client.texture.MapTextureManager(net.minecraft.client.render.MapRenderer.textureManager); }
// public static void textureManager(yarnwrap.client.texture.MapTextureManager value, ) { net.minecraft.client.render.MapRenderer.textureManager = value.wrapperContained; }

// public int DEFAULT_IMAGE_WIDTH() { return wrapperContained.DEFAULT_IMAGE_WIDTH; }
// public void DEFAULT_IMAGE_WIDTH(int value) { wrapperContained.DEFAULT_IMAGE_WIDTH = value; }
// public static int DEFAULT_IMAGE_WIDTH() { return net.minecraft.client.render.MapRenderer.DEFAULT_IMAGE_WIDTH; }
// public static void DEFAULT_IMAGE_WIDTH(int value, ) { net.minecraft.client.render.MapRenderer.DEFAULT_IMAGE_WIDTH = value; }

// public int DEFAULT_IMAGE_HEIGHT() { return wrapperContained.DEFAULT_IMAGE_HEIGHT; }
// public void DEFAULT_IMAGE_HEIGHT(int value) { wrapperContained.DEFAULT_IMAGE_HEIGHT = value; }
// public static int DEFAULT_IMAGE_HEIGHT() { return net.minecraft.client.render.MapRenderer.DEFAULT_IMAGE_HEIGHT; }
// public static void DEFAULT_IMAGE_HEIGHT(int value, ) { net.minecraft.client.render.MapRenderer.DEFAULT_IMAGE_HEIGHT = value; }

// public yarnwrap.client.texture.MapDecorationsAtlasManager decorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(wrapperContained.decorationsAtlasManager); }
// public void decorationsAtlasManager(yarnwrap.client.texture.MapDecorationsAtlasManager value) { wrapperContained.decorationsAtlasManager = value.wrapperContained; }
// public static yarnwrap.client.texture.MapDecorationsAtlasManager decorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(net.minecraft.client.render.MapRenderer.decorationsAtlasManager); }
// public static void decorationsAtlasManager(yarnwrap.client.texture.MapDecorationsAtlasManager value, ) { net.minecraft.client.render.MapRenderer.decorationsAtlasManager = value.wrapperContained; }

public MapRenderer(yarnwrap.client.texture.MapDecorationsAtlasManager decorationsAtlasManager,yarnwrap.client.texture.MapTextureManager textureManager) { this.wrapperContained = new net.minecraft.client.render.MapRenderer(decorationsAtlasManager.wrapperContained,textureManager.wrapperContained); }
// public void draw(yarnwrap.client.render.MapRenderState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,boolean light) { wrapperContained.draw(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public static void draw(yarnwrap.client.render.MapRenderState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,boolean light, ) { net.minecraft.client.render.MapRenderer.draw(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public Object createDecoration(yarnwrap.item.map.MapDecoration decoration) { return wrapperContained.createDecoration(decoration.wrapperContained); }
// public static Object createDecoration(yarnwrap.item.map.MapDecoration decoration, ) { return net.minecraft.client.render.MapRenderer.createDecoration(decoration.wrapperContained); }
public void update(yarnwrap.component.type.MapIdComponent mapId,yarnwrap.item.map.MapState mapState,yarnwrap.client.render.MapRenderState renderState) { wrapperContained.update(mapId.wrapperContained,mapState.wrapperContained,renderState.wrapperContained); }
// public static void update(yarnwrap.component.type.MapIdComponent mapId,yarnwrap.item.map.MapState mapState,yarnwrap.client.render.MapRenderState renderState, ) { net.minecraft.client.render.MapRenderer.update(mapId.wrapperContained,mapState.wrapperContained,renderState.wrapperContained); }

}