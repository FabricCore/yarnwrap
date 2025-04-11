package yarnwrap.client.texture;
public class SpriteLoader { public net.minecraft.client.texture.SpriteLoader wrapperContained; public SpriteLoader(net.minecraft.client.texture.SpriteLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public int maxTextureSize() { return wrapperContained.maxTextureSize; }
// public void maxTextureSize(int value) { wrapperContained.maxTextureSize = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
public java.util.Set METADATA_READERS() { return wrapperContained.METADATA_READERS; }
// public void METADATA_READERS(java.util.Set value) { wrapperContained.METADATA_READERS = value; }
public SpriteLoader(yarnwrap.util.Identifier id,int maxTextureSize,int width,int height) { this.wrapperContained = new net.minecraft.client.texture.SpriteLoader(id.wrapperContained,maxTextureSize,width,height); }
// public void method_45826(int sprite) { wrapperContained.method_45826(sprite); }
// public java.lang.String method_45835(Object sprite) { return wrapperContained.method_45835(sprite); }
// public java.util.Map collectStitchedSprites(yarnwrap.client.texture.TextureStitcher stitcher,int atlasWidth,int atlasHeight) { return wrapperContained.collectStitchedSprites(stitcher.wrapperContained,atlasWidth,atlasHeight); }
public yarnwrap.client.texture.SpriteLoader fromAtlas(yarnwrap.client.texture.SpriteAtlasTexture atlasTexture) { return new yarnwrap.client.texture.SpriteLoader(wrapperContained.fromAtlas(atlasTexture.wrapperContained)); }
// public void method_45841(java.util.Map info,int x,int y) { wrapperContained.method_45841(info,x,y); }
// public Object method_47659(int sprites) { return wrapperContained.method_47659(sprites); }
public java.util.concurrent.CompletableFuture load(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier path,int mipLevel,java.util.concurrent.Executor executor,java.util.Collection metadatas) { return wrapperContained.load(resourceManager.wrapperContained,path.wrapperContained,mipLevel,executor,metadatas); }
// public java.util.List method_47662(java.util.List sprites) { return wrapperContained.method_47662(sprites); }
public Object stitch(java.util.List sprites,int mipLevel,java.util.concurrent.Executor executor) { return wrapperContained.stitch(sprites,mipLevel,executor); }
public java.util.concurrent.CompletableFuture loadAll(yarnwrap.client.texture.SpriteOpener opener,java.util.List sources,java.util.concurrent.Executor executor) { return wrapperContained.loadAll(opener.wrapperContained,sources,executor); }
// public java.util.concurrent.CompletionStage method_47665(yarnwrap.client.texture.SpriteOpener sources) { return wrapperContained.method_47665(sources.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_47666(yarnwrap.client.texture.SpriteOpener sprite) { return wrapperContained.method_47666(sprite.wrapperContained); }
public java.util.concurrent.CompletableFuture load(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier path,int mipLevel,java.util.concurrent.Executor executor) { return wrapperContained.load(resourceManager.wrapperContained,path.wrapperContained,mipLevel,executor); }

}