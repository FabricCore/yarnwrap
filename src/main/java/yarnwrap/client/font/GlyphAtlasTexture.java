package yarnwrap.client.font;
public class GlyphAtlasTexture { public net.minecraft.client.font.GlyphAtlasTexture wrapperContained; public GlyphAtlasTexture(net.minecraft.client.font.GlyphAtlasTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasColor() { return wrapperContained.hasColor; }
// public void hasColor(boolean value) { wrapperContained.hasColor = value; }
// public static boolean hasColor() { return net.minecraft.client.font.GlyphAtlasTexture.hasColor; }
// public static void hasColor(boolean value, ) { net.minecraft.client.font.GlyphAtlasTexture.hasColor = value; }

// public Object rootSlot() { return wrapperContained.rootSlot; }
// // public void rootSlot(Object value) { wrapperContained.rootSlot = value; }
// // public static Object rootSlot() { return net.minecraft.client.font.GlyphAtlasTexture.rootSlot; }
// // public static void rootSlot(Object value, ) { net.minecraft.client.font.GlyphAtlasTexture.rootSlot = value; }

// public int SLOT_LENGTH() { return wrapperContained.SLOT_LENGTH; }
// public void SLOT_LENGTH(int value) { wrapperContained.SLOT_LENGTH = value; }
// public static int SLOT_LENGTH() { return net.minecraft.client.font.GlyphAtlasTexture.SLOT_LENGTH; }
// public static void SLOT_LENGTH(int value, ) { net.minecraft.client.font.GlyphAtlasTexture.SLOT_LENGTH = value; }

// public yarnwrap.client.font.TextRenderLayerSet textRenderLayers() { return new yarnwrap.client.font.TextRenderLayerSet(wrapperContained.textRenderLayers); }
// public void textRenderLayers(yarnwrap.client.font.TextRenderLayerSet value) { wrapperContained.textRenderLayers = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderLayerSet textRenderLayers() { return new yarnwrap.client.font.TextRenderLayerSet(net.minecraft.client.font.GlyphAtlasTexture.textRenderLayers); }
// public static void textRenderLayers(yarnwrap.client.font.TextRenderLayerSet value, ) { net.minecraft.client.font.GlyphAtlasTexture.textRenderLayers = value.wrapperContained; }

public GlyphAtlasTexture(yarnwrap.client.font.TextRenderLayerSet textRenderLayers,boolean hasColor) { this.wrapperContained = new net.minecraft.client.font.GlyphAtlasTexture(textRenderLayers.wrapperContained,hasColor); }
public yarnwrap.client.font.GlyphRenderer getGlyphRenderer(yarnwrap.client.font.RenderableGlyph glyph) { return new yarnwrap.client.font.GlyphRenderer(wrapperContained.getGlyphRenderer(glyph.wrapperContained)); }
// public static yarnwrap.client.font.GlyphRenderer getGlyphRenderer(yarnwrap.client.font.RenderableGlyph glyph, ) { return new yarnwrap.client.font.GlyphRenderer(net.minecraft.client.font.GlyphAtlasTexture.getGlyphRenderer(glyph.wrapperContained)); }
// public int method_51640(int color) { return wrapperContained.method_51640(color); }
// public static int method_51640(int color, ) { return net.minecraft.client.font.GlyphAtlasTexture.method_51640(color); }

}