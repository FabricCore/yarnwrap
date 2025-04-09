package yarnwrap.client.font;
public class FontStorage { public net.minecraft.client.font.FontStorage wrapperContained; public FontStorage(net.minecraft.client.font.FontStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.GlyphRenderer whiteRectangleGlyphRenderer() { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.whiteRectangleGlyphRenderer); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap charactersByWidth() { return wrapperContained.charactersByWidth; }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public yarnwrap.client.font.GlyphContainer glyphRendererCache() { return new yarnwrap.client.font.GlyphContainer(wrapperContained.glyphRendererCache); }
// public java.util.List glyphAtlases() { return wrapperContained.glyphAtlases; }
// public yarnwrap.client.font.GlyphRenderer blankGlyphRenderer() { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.blankGlyphRenderer); }
// public yarnwrap.client.font.GlyphContainer glyphCache() { return new yarnwrap.client.font.GlyphContainer(wrapperContained.glyphCache); }
// public float MAX_ADVANCE() { return wrapperContained.MAX_ADVANCE; }
// public java.util.List allFonts() { return wrapperContained.allFonts; }
// public java.util.List availableFonts() { return wrapperContained.availableFonts; }
public void setFonts(java.util.List allFonts,java.util.Set activeFilters) { wrapperContained.setFonts(allFonts,activeFilters); }
// public void closeGlyphAtlases() { wrapperContained.closeGlyphAtlases(); }
public yarnwrap.client.font.Glyph getGlyph(int codePoint,boolean validateAdvance) { return new yarnwrap.client.font.Glyph(wrapperContained.getGlyph(codePoint,validateAdvance)); }
// public yarnwrap.client.font.GlyphRenderer getGlyphRenderer(yarnwrap.client.font.RenderableGlyph c) { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.getGlyphRenderer(c.wrapperContained)); }
public yarnwrap.client.font.GlyphRenderer getObfuscatedGlyphRenderer(yarnwrap.client.font.Glyph glyph) { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.getObfuscatedGlyphRenderer(glyph.wrapperContained)); }
public yarnwrap.client.font.GlyphRenderer getGlyphRenderer(int codePoint) { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.getGlyphRenderer(codePoint)); }
public yarnwrap.client.font.GlyphRenderer getRectangleRenderer() { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.getRectangleRenderer()); }
// public Object findGlyph(int codePoint) { return wrapperContained.findGlyph(codePoint); }
// public yarnwrap.client.font.GlyphRenderer findGlyphRenderer(int codePoint) { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.findGlyphRenderer(codePoint)); }
// public boolean isAdvanceInvalid(yarnwrap.client.font.Glyph glyph) { return wrapperContained.isAdvanceInvalid(glyph.wrapperContained); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
public void setActiveFilters(java.util.Set activeFilters) { wrapperContained.setActiveFilters(activeFilters); }
// public java.util.List applyFilters(java.util.List allFonts,java.util.Set activeFilters) { return wrapperContained.applyFilters(allFonts,activeFilters); }
// public void clear() { wrapperContained.clear(); }

}