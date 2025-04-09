package yarnwrap.client.texture;
public class MissingSprite { public net.minecraft.client.texture.MissingSprite wrapperContained; public MissingSprite(net.minecraft.client.texture.MissingSprite wrapperContained) { this.wrapperContained = wrapperContained; }

// public int WIDTH() { return wrapperContained.WIDTH; }
// public int HEIGHT() { return wrapperContained.HEIGHT; }
// public java.lang.String MISSINGNO_ID() { return wrapperContained.MISSINGNO_ID; }
// public yarnwrap.resource.metadata.ResourceMetadata METADATA() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.METADATA); }
// public yarnwrap.util.Identifier MISSINGNO() { return new yarnwrap.util.Identifier(wrapperContained.MISSINGNO); }
// public yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.texture); }
public yarnwrap.util.Identifier getMissingSpriteId() { return new yarnwrap.util.Identifier(wrapperContained.getMissingSpriteId()); }
public yarnwrap.client.texture.NativeImageBackedTexture getMissingSpriteTexture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.getMissingSpriteTexture()); }
public yarnwrap.client.texture.SpriteContents createSpriteContents() { return new yarnwrap.client.texture.SpriteContents(wrapperContained.createSpriteContents()); }
// public yarnwrap.client.texture.NativeImage createImage(int width,int height) { return new yarnwrap.client.texture.NativeImage(wrapperContained.createImage(width,height)); }

}