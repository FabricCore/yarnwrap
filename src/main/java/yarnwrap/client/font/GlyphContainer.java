package yarnwrap.client.font;
public class GlyphContainer { public net.minecraft.client.font.GlyphContainer wrapperContained; public GlyphContainer(net.minecraft.client.font.GlyphContainer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ROW_SHIFT() { return wrapperContained.ROW_SHIFT; }
// public void ROW_SHIFT(int value) { wrapperContained.ROW_SHIFT = value; }
// public static int ROW_SHIFT() { return net.minecraft.client.font.GlyphContainer.ROW_SHIFT; }
// public static void ROW_SHIFT(int value, ) { net.minecraft.client.font.GlyphContainer.ROW_SHIFT = value; }

// public int ENTRIES_PER_ROW() { return wrapperContained.ENTRIES_PER_ROW; }
// public void ENTRIES_PER_ROW(int value) { wrapperContained.ENTRIES_PER_ROW = value; }
// public static int ENTRIES_PER_ROW() { return net.minecraft.client.font.GlyphContainer.ENTRIES_PER_ROW; }
// public static void ENTRIES_PER_ROW(int value, ) { net.minecraft.client.font.GlyphContainer.ENTRIES_PER_ROW = value; }

// public int LAST_ENTRY_NUM_IN_ROW() { return wrapperContained.LAST_ENTRY_NUM_IN_ROW; }
// public void LAST_ENTRY_NUM_IN_ROW(int value) { wrapperContained.LAST_ENTRY_NUM_IN_ROW = value; }
// public static int LAST_ENTRY_NUM_IN_ROW() { return net.minecraft.client.font.GlyphContainer.LAST_ENTRY_NUM_IN_ROW; }
// public static void LAST_ENTRY_NUM_IN_ROW(int value, ) { net.minecraft.client.font.GlyphContainer.LAST_ENTRY_NUM_IN_ROW = value; }

// public int LAST_ROW_NUM() { return wrapperContained.LAST_ROW_NUM; }
// public void LAST_ROW_NUM(int value) { wrapperContained.LAST_ROW_NUM = value; }
// public static int LAST_ROW_NUM() { return net.minecraft.client.font.GlyphContainer.LAST_ROW_NUM; }
// public static void LAST_ROW_NUM(int value, ) { net.minecraft.client.font.GlyphContainer.LAST_ROW_NUM = value; }

// public int NUM_ROWS() { return wrapperContained.NUM_ROWS; }
// public void NUM_ROWS(int value) { wrapperContained.NUM_ROWS = value; }
// public static int NUM_ROWS() { return net.minecraft.client.font.GlyphContainer.NUM_ROWS; }
// public static void NUM_ROWS(int value, ) { net.minecraft.client.font.GlyphContainer.NUM_ROWS = value; }

// public java.lang.Object[] defaultRow() { return wrapperContained.defaultRow; }
// public void defaultRow(java.lang.Object[] value) { wrapperContained.defaultRow = value; }
// public static java.lang.Object[] defaultRow() { return net.minecraft.client.font.GlyphContainer.defaultRow; }
// public static void defaultRow(java.lang.Object[] value, ) { net.minecraft.client.font.GlyphContainer.defaultRow = value; }

// public java.lang.Object[][] rows() { return wrapperContained.rows; }
// public void rows(java.lang.Object[][] value) { wrapperContained.rows = value; }
// public static java.lang.Object[][] rows() { return net.minecraft.client.font.GlyphContainer.rows; }
// public static void rows(java.lang.Object[][] value, ) { net.minecraft.client.font.GlyphContainer.rows = value; }

// public java.util.function.IntFunction makeRow() { return wrapperContained.makeRow; }
// public void makeRow(java.util.function.IntFunction value) { wrapperContained.makeRow = value; }
// public static java.util.function.IntFunction makeRow() { return net.minecraft.client.font.GlyphContainer.makeRow; }
// public static void makeRow(java.util.function.IntFunction value, ) { net.minecraft.client.font.GlyphContainer.makeRow = value; }

public GlyphContainer(java.util.function.IntFunction makeRow,java.util.function.IntFunction makeScroll) { this.wrapperContained = new net.minecraft.client.font.GlyphContainer(makeRow,makeScroll); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.font.GlyphContainer.clear(); }
public java.lang.Object get(int codePoint) { return wrapperContained.get(codePoint); }
// public static java.lang.Object get(int codePoint, ) { return net.minecraft.client.font.GlyphContainer.get(codePoint); }
public java.lang.Object put(int codePoint,java.lang.Object glyph) { return wrapperContained.put(codePoint,glyph); }
// public static java.lang.Object put(int codePoint,java.lang.Object glyph, ) { return net.minecraft.client.font.GlyphContainer.put(codePoint,glyph); }
public java.lang.Object computeIfAbsent(int codePoint,java.util.function.IntFunction ifAbsent) { return wrapperContained.computeIfAbsent(codePoint,ifAbsent); }
// public static java.lang.Object computeIfAbsent(int codePoint,java.util.function.IntFunction ifAbsent, ) { return net.minecraft.client.font.GlyphContainer.computeIfAbsent(codePoint,ifAbsent); }
// public void forEachGlyph(Object glyphConsumer) { wrapperContained.forEachGlyph(glyphConsumer); }
// public static void forEachGlyph(Object glyphConsumer, ) { net.minecraft.client.font.GlyphContainer.forEachGlyph(glyphConsumer); }
// public void method_51602(it.unimi.dsi.fastutil.ints.IntOpenHashSet codePoint,int glyph) { wrapperContained.method_51602(codePoint,glyph); }
// public static void method_51602(it.unimi.dsi.fastutil.ints.IntOpenHashSet codePoint,int glyph, ) { net.minecraft.client.font.GlyphContainer.method_51602(codePoint,glyph); }
public it.unimi.dsi.fastutil.ints.IntSet getProvidedGlyphs() { return wrapperContained.getProvidedGlyphs(); }
// public static it.unimi.dsi.fastutil.ints.IntSet getProvidedGlyphs() { return net.minecraft.client.font.GlyphContainer.getProvidedGlyphs(); }
public java.lang.Object remove(int codePoint) { return wrapperContained.remove(codePoint); }
// public static java.lang.Object remove(int codePoint, ) { return net.minecraft.client.font.GlyphContainer.remove(codePoint); }

}