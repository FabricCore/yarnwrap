package yarnwrap.client.render.model;
public class SpriteAtlasManager { public net.minecraft.client.render.model.SpriteAtlasManager wrapperContained; public SpriteAtlasManager(net.minecraft.client.render.model.SpriteAtlasManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map atlases() { return wrapperContained.atlases; }
// public void atlases(java.util.Map value) { wrapperContained.atlases = value; }
public yarnwrap.client.texture.SpriteAtlasTexture getAtlas(yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.SpriteAtlasTexture(wrapperContained.getAtlas(id.wrapperContained)); }
public java.util.Map reload(yarnwrap.resource.ResourceManager resourceManager,int mipmapLevels,java.util.concurrent.Executor executor) { return wrapperContained.reload(resourceManager.wrapperContained,mipmapLevels,executor); }

}