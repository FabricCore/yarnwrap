package yarnwrap.client.texture;
public class SpriteAtlasTexture { public net.minecraft.client.texture.SpriteAtlasTexture wrapperContained; public SpriteAtlasTexture(net.minecraft.client.texture.SpriteAtlasTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier BLOCK_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BLOCK_ATLAS_TEXTURE); }
// public void BLOCK_ATLAS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BLOCK_ATLAS_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier BLOCK_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE); }
// public static void BLOCK_ATLAS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE = value.wrapperContained; }

// public java.util.List animatedSprites() { return wrapperContained.animatedSprites; }
// public void animatedSprites(java.util.List value) { wrapperContained.animatedSprites = value; }
// public static java.util.List animatedSprites() { return net.minecraft.client.texture.SpriteAtlasTexture.animatedSprites; }
// public static void animatedSprites(java.util.List value, ) { net.minecraft.client.texture.SpriteAtlasTexture.animatedSprites = value; }

// public java.util.List spritesToLoad() { return wrapperContained.spritesToLoad; }
// public void spritesToLoad(java.util.List value) { wrapperContained.spritesToLoad = value; }
// public static java.util.List spritesToLoad() { return net.minecraft.client.texture.SpriteAtlasTexture.spritesToLoad; }
// public static void spritesToLoad(java.util.List value, ) { net.minecraft.client.texture.SpriteAtlasTexture.spritesToLoad = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.SpriteAtlasTexture.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.SpriteAtlasTexture.LOGGER = value; }

// public java.util.Map sprites() { return wrapperContained.sprites; }
// public void sprites(java.util.Map value) { wrapperContained.sprites = value; }
// public static java.util.Map sprites() { return net.minecraft.client.texture.SpriteAtlasTexture.sprites; }
// public static void sprites(java.util.Map value, ) { net.minecraft.client.texture.SpriteAtlasTexture.sprites = value; }

// public yarnwrap.util.Identifier PARTICLE_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PARTICLE_ATLAS_TEXTURE); }
// public void PARTICLE_ATLAS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.PARTICLE_ATLAS_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier PARTICLE_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.SpriteAtlasTexture.PARTICLE_ATLAS_TEXTURE); }
// public static void PARTICLE_ATLAS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.SpriteAtlasTexture.PARTICLE_ATLAS_TEXTURE = value.wrapperContained; }

// public int maxTextureSize() { return wrapperContained.maxTextureSize; }
// public void maxTextureSize(int value) { wrapperContained.maxTextureSize = value; }
// public static int maxTextureSize() { return net.minecraft.client.texture.SpriteAtlasTexture.maxTextureSize; }
// public static void maxTextureSize(int value, ) { net.minecraft.client.texture.SpriteAtlasTexture.maxTextureSize = value; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.SpriteAtlasTexture.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.SpriteAtlasTexture.id = value.wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.texture.SpriteAtlasTexture.width; }
// public static void width(int value, ) { net.minecraft.client.texture.SpriteAtlasTexture.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.texture.SpriteAtlasTexture.height; }
// public static void height(int value, ) { net.minecraft.client.texture.SpriteAtlasTexture.height = value; }

// public int mipLevel() { return wrapperContained.mipLevel; }
// public void mipLevel(int value) { wrapperContained.mipLevel = value; }
// public static int mipLevel() { return net.minecraft.client.texture.SpriteAtlasTexture.mipLevel; }
// public static void mipLevel(int value, ) { net.minecraft.client.texture.SpriteAtlasTexture.mipLevel = value; }

// public yarnwrap.client.texture.Sprite missingSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.missingSprite); }
// public void missingSprite(yarnwrap.client.texture.Sprite value) { wrapperContained.missingSprite = value.wrapperContained; }
// public static yarnwrap.client.texture.Sprite missingSprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.texture.SpriteAtlasTexture.missingSprite); }
// public static void missingSprite(yarnwrap.client.texture.Sprite value, ) { net.minecraft.client.texture.SpriteAtlasTexture.missingSprite = value.wrapperContained; }

public SpriteAtlasTexture(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.client.texture.SpriteAtlasTexture(id.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.texture.SpriteAtlasTexture.clear(); }
public yarnwrap.client.texture.Sprite getSprite(yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite(id.wrapperContained)); }
// public static yarnwrap.client.texture.Sprite getSprite(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.texture.Sprite(net.minecraft.client.texture.SpriteAtlasTexture.getSprite(id.wrapperContained)); }
public void tickAnimatedSprites() { wrapperContained.tickAnimatedSprites(); }
// public static void tickAnimatedSprites() { net.minecraft.client.texture.SpriteAtlasTexture.tickAnimatedSprites(); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.SpriteAtlasTexture.getId()); }
// public void upload(Object stitchResult) { wrapperContained.upload(stitchResult); }
// public static void upload(Object stitchResult, ) { net.minecraft.client.texture.SpriteAtlasTexture.upload(stitchResult); }
// public void dumpAtlasInfos(java.nio.file.Path path,java.lang.String id,java.util.Map sprites) { wrapperContained.dumpAtlasInfos(path,id,sprites); }
// public static void dumpAtlasInfos(java.nio.file.Path path,java.lang.String id,java.util.Map sprites, ) { net.minecraft.client.texture.SpriteAtlasTexture.dumpAtlasInfos(path,id,sprites); }
public int getMaxTextureSize() { return wrapperContained.getMaxTextureSize(); }
// public static int getMaxTextureSize() { return net.minecraft.client.texture.SpriteAtlasTexture.getMaxTextureSize(); }
// public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.texture.SpriteAtlasTexture.getWidth(); }
// public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.texture.SpriteAtlasTexture.getHeight(); }
// public int method_68168(int color) { return wrapperContained.method_68168(color); }
// public static int method_68168(int color, ) { return net.minecraft.client.texture.SpriteAtlasTexture.method_68168(color); }

}