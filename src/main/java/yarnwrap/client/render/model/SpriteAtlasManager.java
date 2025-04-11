package yarnwrap.client.render.model;
public class SpriteAtlasManager { public net.minecraft.client.render.model.SpriteAtlasManager wrapperContained; public SpriteAtlasManager(net.minecraft.client.render.model.SpriteAtlasManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map atlases() { return wrapperContained.atlases; }
// public void atlases(java.util.Map value) { wrapperContained.atlases = value; }
public SpriteAtlasManager(java.util.Map loaders,yarnwrap.client.texture.TextureManager textureManager) { this.wrapperContained = new net.minecraft.client.render.model.SpriteAtlasManager(loaders,textureManager.wrapperContained); }
public yarnwrap.client.texture.SpriteAtlasTexture getAtlas(yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.SpriteAtlasTexture(wrapperContained.getAtlas(id.wrapperContained)); }
public java.util.Map reload(yarnwrap.resource.ResourceManager resourceManager,int mipmapLevels,java.util.concurrent.Executor executor) { return wrapperContained.reload(resourceManager.wrapperContained,mipmapLevels,executor); }
// public java.util.concurrent.CompletableFuture method_45863(yarnwrap.resource.ResourceManager entry) { return wrapperContained.method_45863(entry.wrapperContained); }
// public Object method_45864(yarnwrap.client.texture.TextureManager entry) { return wrapperContained.method_45864(entry.wrapperContained); }
// public Object method_45867(Object stitchResult) { return wrapperContained.method_45867(stitchResult); }

}