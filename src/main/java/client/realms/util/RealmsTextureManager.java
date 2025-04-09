package yarnwrap.client.realms.util;
public class RealmsTextureManager { public net.minecraft.client.realms.util.RealmsTextureManager wrapperContained; public RealmsTextureManager(net.minecraft.client.realms.util.RealmsTextureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map TEXTURES() { return wrapperContained.TEXTURES; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.Identifier ISLES() { return new yarnwrap.util.Identifier(wrapperContained.ISLES); }
// public yarnwrap.util.Identifier getTextureIdInternal(java.lang.String id,java.lang.String image) { return new yarnwrap.util.Identifier(wrapperContained.getTextureIdInternal(id,image)); }
// public yarnwrap.client.texture.NativeImage loadImage(java.lang.String image) { return new yarnwrap.client.texture.NativeImage(wrapperContained.loadImage(image)); }
public yarnwrap.util.Identifier getTextureId(java.lang.String id,java.lang.String image) { return new yarnwrap.util.Identifier(wrapperContained.getTextureId(id,image)); }

}