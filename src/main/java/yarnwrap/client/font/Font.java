package yarnwrap.client.font;
public class Font { public net.minecraft.client.font.Font wrapperContained; public Font(net.minecraft.client.font.Font wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.font.Glyph getGlyph(int codePoint) { return new yarnwrap.client.font.Glyph(wrapperContained.getGlyph(codePoint)); }
// public static yarnwrap.client.font.Glyph getGlyph(int codePoint, ) { return new yarnwrap.client.font.Glyph(net.minecraft.client.font.Font.getGlyph(codePoint)); }
public it.unimi.dsi.fastutil.ints.IntSet getProvidedGlyphs() { return wrapperContained.getProvidedGlyphs(); }
// public static it.unimi.dsi.fastutil.ints.IntSet getProvidedGlyphs() { return net.minecraft.client.font.Font.getProvidedGlyphs(); }

}