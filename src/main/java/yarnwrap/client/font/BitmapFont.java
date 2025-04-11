package yarnwrap.client.font;
public class BitmapFont { public net.minecraft.client.font.BitmapFont wrapperContained; public BitmapFont(net.minecraft.client.font.BitmapFont wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.GlyphContainer glyphs() { return new yarnwrap.client.font.GlyphContainer(wrapperContained.glyphs); }
// public void glyphs(yarnwrap.client.font.GlyphContainer value) { wrapperContained.glyphs = value.wrapperContained; }
// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
// public void image(yarnwrap.client.texture.NativeImage value) { wrapperContained.image = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public BitmapFont(yarnwrap.client.texture.NativeImage image,yarnwrap.client.font.GlyphContainer glyphs) { this.wrapperContained = new net.minecraft.client.font.BitmapFont(image.wrapperContained,glyphs.wrapperContained); }

}