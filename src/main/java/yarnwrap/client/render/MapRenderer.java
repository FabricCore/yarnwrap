package yarnwrap.client.render;
public class MapRenderer { public net.minecraft.client.render.MapRenderer wrapperContained; public MapRenderer(net.minecraft.client.render.MapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap mapTextures() { return wrapperContained.mapTextures; }
// public void mapTextures(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.mapTextures = value; }
// public int DEFAULT_IMAGE_WIDTH() { return wrapperContained.DEFAULT_IMAGE_WIDTH; }
// public void DEFAULT_IMAGE_WIDTH(int value) { wrapperContained.DEFAULT_IMAGE_WIDTH = value; }
// public int DEFAULT_IMAGE_HEIGHT() { return wrapperContained.DEFAULT_IMAGE_HEIGHT; }
// public void DEFAULT_IMAGE_HEIGHT(int value) { wrapperContained.DEFAULT_IMAGE_HEIGHT = value; }
// public yarnwrap.client.texture.MapDecorationsAtlasManager mapDecorationsAtlasManager() { return new yarnwrap.client.texture.MapDecorationsAtlasManager(wrapperContained.mapDecorationsAtlasManager); }
// public void mapDecorationsAtlasManager(yarnwrap.client.texture.MapDecorationsAtlasManager value) { wrapperContained.mapDecorationsAtlasManager = value.wrapperContained; }
public void updateTexture(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state) { wrapperContained.updateTexture(id.wrapperContained,state.wrapperContained); }
public void clearStateTextures() { wrapperContained.clearStateTextures(); }
public void draw(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state,boolean hidePlayerIcons,int light) { wrapperContained.draw(matrices.wrapperContained,vertexConsumers.wrapperContained,id.wrapperContained,state.wrapperContained,hidePlayerIcons,light); }
// public Object getMapTexture(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state) { return wrapperContained.getMapTexture(id.wrapperContained,state.wrapperContained); }

}