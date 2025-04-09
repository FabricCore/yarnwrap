package yarnwrap.client.font;
public class GlyphAtlasTexture { public net.minecraft.client.font.GlyphAtlasTexture wrapperContained; public GlyphAtlasTexture(net.minecraft.client.font.GlyphAtlasTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasColor() { return wrapperContained.hasColor; }
// public Object rootSlot() { return wrapperContained.rootSlot; }
// public int SLOT_LENGTH() { return wrapperContained.SLOT_LENGTH; }
// public yarnwrap.client.font.TextRenderLayerSet textRenderLayers() { return new yarnwrap.client.font.TextRenderLayerSet(wrapperContained.textRenderLayers); }
public yarnwrap.client.font.GlyphRenderer getGlyphRenderer(yarnwrap.client.font.RenderableGlyph glyph) { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.getGlyphRenderer(glyph.wrapperContained)); }

}