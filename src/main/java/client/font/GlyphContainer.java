package yarnwrap.client.font;
public class GlyphContainer { public net.minecraft.client.font.GlyphContainer wrapperContained; public GlyphContainer(net.minecraft.client.font.GlyphContainer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ROW_SHIFT() { return wrapperContained.ROW_SHIFT; }
// public int ENTRIES_PER_ROW() { return wrapperContained.ENTRIES_PER_ROW; }
// public int LAST_ENTRY_NUM_IN_ROW() { return wrapperContained.LAST_ENTRY_NUM_IN_ROW; }
// public int LAST_ROW_NUM() { return wrapperContained.LAST_ROW_NUM; }
// public int NUM_ROWS() { return wrapperContained.NUM_ROWS; }
// public java.lang.Object[] defaultRow() { return wrapperContained.defaultRow; }
// public java.lang.Object[][] rows() { return wrapperContained.rows; }
// public java.util.function.IntFunction makeRow() { return wrapperContained.makeRow; }
public void clear() { wrapperContained.clear(); }
public java.lang.Object get(int codePoint) { return wrapperContained.get(codePoint); }
public java.lang.Object put(int codePoint,java.lang.Object glyph) { return wrapperContained.put(codePoint,glyph); }
public java.lang.Object computeIfAbsent(int codePoint,java.util.function.IntFunction ifAbsent) { return wrapperContained.computeIfAbsent(codePoint,ifAbsent); }
// public void forEachGlyph(Object glyphConsumer) { wrapperContained.forEachGlyph(glyphConsumer); }
public it.unimi.dsi.fastutil.ints.IntSet getProvidedGlyphs() { return wrapperContained.getProvidedGlyphs(); }
public java.lang.Object remove(int codePoint) { return wrapperContained.remove(codePoint); }

}