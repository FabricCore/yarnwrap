package yarnwrap.client.font;
public class BitmapFont { public net.minecraft.client.font.BitmapFont wrapperContained; public BitmapFont(net.minecraft.client.font.BitmapFont wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.GlyphContainer glyphs() { return new yarnwrap.client.font.GlyphContainer(wrapperContained.glyphs); }
// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }

}