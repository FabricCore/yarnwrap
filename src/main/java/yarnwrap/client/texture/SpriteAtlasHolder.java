package yarnwrap.client.texture;
public class SpriteAtlasHolder { public net.minecraft.client.texture.SpriteAtlasHolder wrapperContained; public SpriteAtlasHolder(net.minecraft.client.texture.SpriteAtlasHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.SpriteAtlasTexture atlas() { return new yarnwrap.client.texture.SpriteAtlasTexture(wrapperContained.atlas); }
// public void atlas(yarnwrap.client.texture.SpriteAtlasTexture value) { wrapperContained.atlas = value.wrapperContained; }
// public yarnwrap.util.Identifier sourcePath() { return new yarnwrap.util.Identifier(wrapperContained.sourcePath); }
// public void sourcePath(yarnwrap.util.Identifier value) { wrapperContained.sourcePath = value.wrapperContained; }
// public java.util.Set metadataReaders() { return wrapperContained.metadataReaders; }
// public void metadataReaders(java.util.Set value) { wrapperContained.metadataReaders = value; }
// public void afterReload(Object stitchResult,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.afterReload(stitchResult,profiler.wrapperContained); }
// public yarnwrap.client.texture.Sprite getSprite(yarnwrap.util.Identifier objectId) { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite(objectId.wrapperContained)); }

}