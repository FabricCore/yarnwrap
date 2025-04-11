package yarnwrap.client.font;
public class FontStorage { public net.minecraft.client.font.FontStorage wrapperContained; public FontStorage(net.minecraft.client.font.FontStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.GlyphRenderer whiteRectangleGlyphRenderer() { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.whiteRectangleGlyphRenderer); }
// public void whiteRectangleGlyphRenderer(yarnwrap.client.font.GlyphRenderer value) { wrapperContained.whiteRectangleGlyphRenderer = value.wrapperContained; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap charactersByWidth() { return wrapperContained.charactersByWidth; }
// public void charactersByWidth(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.charactersByWidth = value; }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public void RANDOM(yarnwrap.util.math.random.Random value) { wrapperContained.RANDOM = value.wrapperContained; }
// public yarnwrap.client.font.GlyphContainer glyphRendererCache() { return new yarnwrap.client.font.GlyphContainer(wrapperContained.glyphRendererCache); }
// public void glyphRendererCache(yarnwrap.client.font.GlyphContainer value) { wrapperContained.glyphRendererCache = value.wrapperContained; }
// public java.util.List glyphAtlases() { return wrapperContained.glyphAtlases; }
// public void glyphAtlases(java.util.List value) { wrapperContained.glyphAtlases = value; }
// public yarnwrap.client.font.GlyphRenderer blankGlyphRenderer() { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.blankGlyphRenderer); }
// public void blankGlyphRenderer(yarnwrap.client.font.GlyphRenderer value) { wrapperContained.blankGlyphRenderer = value.wrapperContained; }
// public yarnwrap.client.font.GlyphContainer glyphCache() { return new yarnwrap.client.font.GlyphContainer(wrapperContained.glyphCache); }
// public void glyphCache(yarnwrap.client.font.GlyphContainer value) { wrapperContained.glyphCache = value.wrapperContained; }
// public float MAX_ADVANCE() { return wrapperContained.MAX_ADVANCE; }
// public void MAX_ADVANCE(float value) { wrapperContained.MAX_ADVANCE = value; }
// public java.util.List allFonts() { return wrapperContained.allFonts; }
// public void allFonts(java.util.List value) { wrapperContained.allFonts = value; }
// public java.util.List availableFonts() { return wrapperContained.availableFonts; }
// public void availableFonts(java.util.List value) { wrapperContained.availableFonts = value; }
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