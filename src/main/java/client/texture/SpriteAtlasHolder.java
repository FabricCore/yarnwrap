package yarnwrap.client.texture;
public class SpriteAtlasHolder { public net.minecraft.client.texture.SpriteAtlasHolder wrapperContained; public SpriteAtlasHolder(net.minecraft.client.texture.SpriteAtlasHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.SpriteAtlasTexture atlas() { return new yarnwrap.client.texture.SpriteAtlasTexture(wrapperContained.atlas); }
// public yarnwrap.util.Identifier sourcePath() { return new yarnwrap.util.Identifier(wrapperContained.sourcePath); }
// public java.util.Set metadataReaders() { return wrapperContained.metadataReaders; }
// public void afterReload(Object stitchResult,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.afterReload(stitchResult,profiler.wrapperContained); }
// public yarnwrap.client.texture.Sprite getSprite(yarnwrap.util.Identifier objectId) { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite(objectId.wrapperContained)); }

}