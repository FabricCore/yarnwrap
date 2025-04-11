package yarnwrap.client.texture;
public class MissingSprite { public net.minecraft.client.texture.MissingSprite wrapperContained; public MissingSprite(net.minecraft.client.texture.MissingSprite wrapperContained) { this.wrapperContained = wrapperContained; }

// public int WIDTH() { return wrapperContained.WIDTH; }
// public void WIDTH(int value) { wrapperContained.WIDTH = value; }
// public int HEIGHT() { return wrapperContained.HEIGHT; }
// public void HEIGHT(int value) { wrapperContained.HEIGHT = value; }
// public java.lang.String MISSINGNO_ID() { return wrapperContained.MISSINGNO_ID; }
// public void MISSINGNO_ID(java.lang.String value) { wrapperContained.MISSINGNO_ID = value; }
// public yarnwrap.resource.metadata.ResourceMetadata METADATA() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.METADATA); }
// public void METADATA(yarnwrap.resource.metadata.ResourceMetadata value) { wrapperContained.METADATA = value.wrapperContained; }
// public yarnwrap.util.Identifier MISSINGNO() { return new yarnwrap.util.Identifier(wrapperContained.MISSINGNO); }
// public void MISSINGNO(yarnwrap.util.Identifier value) { wrapperContained.MISSINGNO = value.wrapperContained; }
// public yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.texture); }
// public void texture(yarnwrap.client.texture.NativeImageBackedTexture value) { wrapperContained.texture = value.wrapperContained; }
public yarnwrap.util.Identifier getMissingSpriteId() { return new yarnwrap.util.Identifier(wrapperContained.getMissingSpriteId()); }
public yarnwrap.client.texture.NativeImageBackedTexture getMissingSpriteTexture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.getMissingSpriteTexture()); }
public yarnwrap.client.texture.SpriteContents createSpriteContents() { return new yarnwrap.client.texture.SpriteContents(wrapperContained.createSpriteContents()); }
// public yarnwrap.client.texture.NativeImage createImage(int width,int height) { return new yarnwrap.client.texture.NativeImage(wrapperContained.createImage(width,height)); }

}