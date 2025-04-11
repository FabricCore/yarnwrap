package yarnwrap.client.texture;
public class SpriteOpener { public net.minecraft.client.texture.SpriteOpener wrapperContained; public SpriteOpener(net.minecraft.client.texture.SpriteOpener wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.texture.SpriteOpener create(java.util.Collection metadatas) { return new yarnwrap.client.texture.SpriteOpener(wrapperContained.create(metadatas)); }
public yarnwrap.client.texture.SpriteContents loadSprite(yarnwrap.util.Identifier id,yarnwrap.resource.Resource resource) { return new yarnwrap.client.texture.SpriteContents(wrapperContained.loadSprite(id.wrapperContained,resource.wrapperContained)); }
// public yarnwrap.client.texture.SpriteContents method_52851(java.util.Collection id,yarnwrap.util.Identifier resource) { return new yarnwrap.client.texture.SpriteContents(wrapperContained.method_52851(id,resource.wrapperContained)); }

}