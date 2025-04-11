package yarnwrap.client.texture;
public class SpriteAtlasTexture { public net.minecraft.client.texture.SpriteAtlasTexture wrapperContained; public SpriteAtlasTexture(net.minecraft.client.texture.SpriteAtlasTexture wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier PARTICLE_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PARTICLE_ATLAS_TEXTURE); }
// public void PARTICLE_ATLAS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.PARTICLE_ATLAS_TEXTURE = value.wrapperContained; }
// public int maxTextureSize() { return wrapperContained.maxTextureSize; }
// public void maxTextureSize(int value) { wrapperContained.maxTextureSize = value; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public int mipLevel() { return wrapperContained.mipLevel; }
// public void mipLevel(int value) { wrapperContained.mipLevel = value; }
// public yarnwrap.client.texture.Sprite missingSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.missingSprite); }
// public void missingSprite(yarnwrap.client.texture.Sprite value) { wrapperContained.missingSprite = value.wrapperContained; }
public yarnwrap.util.Identifier BLOCK_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BLOCK_ATLAS_TEXTURE); }
// public void BLOCK_ATLAS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BLOCK_ATLAS_TEXTURE = value.wrapperContained; }
// public java.util.List animatedSprites() { return wrapperContained.animatedSprites; }
// public void animatedSprites(java.util.List value) { wrapperContained.animatedSprites = value; }
// public java.util.List spritesToLoad() { return wrapperContained.spritesToLoad; }
// public void spritesToLoad(java.util.List value) { wrapperContained.spritesToLoad = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map sprites() { return wrapperContained.sprites; }
// public void sprites(java.util.Map value) { wrapperContained.sprites = value; }
public SpriteAtlasTexture(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.client.texture.SpriteAtlasTexture(id.wrapperContained); }
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