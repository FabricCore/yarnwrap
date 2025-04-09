package yarnwrap.client.texture;
public class SpriteAtlasTexture { public net.minecraft.client.texture.SpriteAtlasTexture wrapperContained; public SpriteAtlasTexture(net.minecraft.client.texture.SpriteAtlasTexture wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier PARTICLE_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PARTICLE_ATLAS_TEXTURE); }
// public int maxTextureSize() { return wrapperContained.maxTextureSize; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public int width() { return wrapperContained.width; }
// public int height() { return wrapperContained.height; }
// public int mipLevel() { return wrapperContained.mipLevel; }
// public yarnwrap.client.texture.Sprite missingSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.missingSprite); }
public yarnwrap.util.Identifier BLOCK_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BLOCK_ATLAS_TEXTURE); }
// public java.util.List animatedSprites() { return wrapperContained.animatedSprites; }
// public java.util.List spritesToLoad() { return wrapperContained.spritesToLoad; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map sprites() { return wrapperContained.sprites; }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public void applyTextureFilter(Object data) { wrapperContained.applyTextureFilter(data); }
// public void upload(Object stitchResult) { wrapperContained.upload(stitchResult); }
// public void dumpAtlasInfos(java.nio.file.Path path,java.lang.String id,java.util.Map sprites) { wrapperContained.dumpAtlasInfos(path,id,sprites); }
public int getMaxTextureSize() { return wrapperContained.getMaxTextureSize(); }
public void clear() { wrapperContained.clear(); }
public yarnwrap.client.texture.Sprite getSprite(yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite(id.wrapperContained)); }
public void tickAnimatedSprites() { wrapperContained.tickAnimatedSprites(); }
// public int getWidth() { return wrapperContained.getWidth(); }
// public int getHeight() { return wrapperContained.getHeight(); }

}