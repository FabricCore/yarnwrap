package yarnwrap.client.texture;
public class MapTextureManager { public net.minecraft.client.texture.MapTextureManager wrapperContained; public MapTextureManager(net.minecraft.client.texture.MapTextureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap texturesByMapId() { return wrapperContained.texturesByMapId; }
// public void texturesByMapId(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.texturesByMapId = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap texturesByMapId() { return net.minecraft.client.texture.MapTextureManager.texturesByMapId; }
// public static void texturesByMapId(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.client.texture.MapTextureManager.texturesByMapId = value; }

// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public static yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(net.minecraft.client.texture.MapTextureManager.textureManager); }
// public static void textureManager(yarnwrap.client.texture.TextureManager value, ) { net.minecraft.client.texture.MapTextureManager.textureManager = value.wrapperContained; }

public MapTextureManager(yarnwrap.client.texture.TextureManager textureManager) { this.wrapperContained = new net.minecraft.client.texture.MapTextureManager(textureManager.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.texture.MapTextureManager.clear(); }
public void setNeedsUpdate(yarnwrap.component.type.MapIdComponent mapIdComponent,yarnwrap.item.map.MapState mapState) { wrapperContained.setNeedsUpdate(mapIdComponent.wrapperContained,mapState.wrapperContained); }
// public static void setNeedsUpdate(yarnwrap.component.type.MapIdComponent mapIdComponent,yarnwrap.item.map.MapState mapState, ) { net.minecraft.client.texture.MapTextureManager.setNeedsUpdate(mapIdComponent.wrapperContained,mapState.wrapperContained); }
// public Object method_62623(yarnwrap.item.map.MapState id,java.lang.Integer mapTexture) { return wrapperContained.method_62623(id.wrapperContained,mapTexture); }
// public static Object method_62623(yarnwrap.item.map.MapState id,java.lang.Integer mapTexture, ) { return net.minecraft.client.texture.MapTextureManager.method_62623(id.wrapperContained,mapTexture); }
public yarnwrap.util.Identifier getTextureId(yarnwrap.component.type.MapIdComponent mapIdComponent,yarnwrap.item.map.MapState mapState) { return new yarnwrap.util.Identifier(wrapperContained.getTextureId(mapIdComponent.wrapperContained,mapState.wrapperContained)); }
// public static yarnwrap.util.Identifier getTextureId(yarnwrap.component.type.MapIdComponent mapIdComponent,yarnwrap.item.map.MapState mapState, ) { return new yarnwrap.util.Identifier(net.minecraft.client.texture.MapTextureManager.getTextureId(mapIdComponent.wrapperContained,mapState.wrapperContained)); }
// public Object getMapTexture(yarnwrap.component.type.MapIdComponent mapId,yarnwrap.item.map.MapState mapState) { return wrapperContained.getMapTexture(mapId.wrapperContained,mapState.wrapperContained); }
// public static Object getMapTexture(yarnwrap.component.type.MapIdComponent mapId,yarnwrap.item.map.MapState mapState, ) { return net.minecraft.client.texture.MapTextureManager.getMapTexture(mapId.wrapperContained,mapState.wrapperContained); }

}