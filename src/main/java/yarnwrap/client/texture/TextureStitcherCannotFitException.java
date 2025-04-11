package yarnwrap.client.texture;
public class TextureStitcherCannotFitException { public net.minecraft.client.texture.TextureStitcherCannotFitException wrapperContained; public TextureStitcherCannotFitException(net.minecraft.client.texture.TextureStitcherCannotFitException wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection sprites() { return wrapperContained.sprites; }
// public void sprites(java.util.Collection value) { wrapperContained.sprites = value; }
// public TextureStitcherCannotFitException(Object sprite,java.util.Collection sprites) { this.wrapperContained = new net.minecraft.client.texture.TextureStitcherCannotFitException(sprite,sprites); }
public java.util.Collection getSprites() { return wrapperContained.getSprites(); }

}