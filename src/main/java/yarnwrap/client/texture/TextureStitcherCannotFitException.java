package yarnwrap.client.texture;
public class TextureStitcherCannotFitException { public net.minecraft.client.texture.TextureStitcherCannotFitException wrapperContained; public TextureStitcherCannotFitException(net.minecraft.client.texture.TextureStitcherCannotFitException wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection sprites() { return wrapperContained.sprites; }
// public void sprites(java.util.Collection value) { wrapperContained.sprites = value; }
// public static java.util.Collection sprites() { return net.minecraft.client.texture.TextureStitcherCannotFitException.sprites; }
// public static void sprites(java.util.Collection value, ) { net.minecraft.client.texture.TextureStitcherCannotFitException.sprites = value; }

// public TextureStitcherCannotFitException(Object sprite,java.util.Collection sprites) { this.wrapperContained = new net.minecraft.client.texture.TextureStitcherCannotFitException(sprite,sprites); }
public java.util.Collection getSprites() { return wrapperContained.getSprites(); }
// public static java.util.Collection getSprites() { return net.minecraft.client.texture.TextureStitcherCannotFitException.getSprites(); }

}