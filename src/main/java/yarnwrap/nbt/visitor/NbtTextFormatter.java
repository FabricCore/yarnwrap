package yarnwrap.nbt.visitor;
public class NbtTextFormatter { public net.minecraft.nbt.visitor.NbtTextFormatter wrapperContained; public NbtTextFormatter(net.minecraft.nbt.visitor.NbtTextFormatter wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public it.unimi.dsi.fastutil.bytes.ByteCollection SINGLE_LINE_ELEMENT_TYPES() { return wrapperContained.SINGLE_LINE_ELEMENT_TYPES; }
// public void SINGLE_LINE_ELEMENT_TYPES(it.unimi.dsi.fastutil.bytes.ByteCollection value) { wrapperContained.SINGLE_LINE_ELEMENT_TYPES = value; }
// public yarnwrap.util.Formatting NAME_COLOR() { return new yarnwrap.util.Formatting(wrapperContained.NAME_COLOR); }
// public void NAME_COLOR(yarnwrap.util.Formatting value) { wrapperContained.NAME_COLOR = value.wrapperContained; }
// public yarnwrap.util.Formatting STRING_COLOR() { return new yarnwrap.util.Formatting(wrapperContained.STRING_COLOR); }
// public void STRING_COLOR(yarnwrap.util.Formatting value) { wrapperContained.STRING_COLOR = value.wrapperContained; }
// public yarnwrap.util.Formatting NUMBER_COLOR() { return new yarnwrap.util.Formatting(wrapperContained.NUMBER_COLOR); }
// public void NUMBER_COLOR(yarnwrap.util.Formatting value) { wrapperContained.NUMBER_COLOR = value.wrapperContained; }
// public yarnwrap.util.Formatting TYPE_SUFFIX_COLOR() { return new yarnwrap.util.Formatting(wrapperContained.TYPE_SUFFIX_COLOR); }
// public void TYPE_SUFFIX_COLOR(yarnwrap.util.Formatting value) { wrapperContained.TYPE_SUFFIX_COLOR = value.wrapperContained; }
// public java.util.regex.Pattern SIMPLE_NAME() { return wrapperContained.SIMPLE_NAME; }
// public void SIMPLE_NAME(java.util.regex.Pattern value) { wrapperContained.SIMPLE_NAME = value; }
// public java.lang.String ENTRY_SEPARATOR() { return wrapperContained.ENTRY_SEPARATOR; }
// public void ENTRY_SEPARATOR(java.lang.String value) { wrapperContained.ENTRY_SEPARATOR = value; }
// public java.lang.String prefix() { return wrapperContained.prefix; }
// public void prefix(java.lang.String value) { wrapperContained.prefix = value; }
// public int depth() { return wrapperContained.depth; }
// public void depth(int value) { wrapperContained.depth = value; }
// public yarnwrap.text.MutableText result() { return new yarnwrap.text.MutableText(wrapperContained.result); }
// public void result(yarnwrap.text.MutableText value) { wrapperContained.result = value.wrapperContained; }
// public java.lang.String SQUARE_OPEN_BRACKET() { return wrapperContained.SQUARE_OPEN_BRACKET; }
// public void SQUARE_OPEN_BRACKET(java.lang.String value) { wrapperContained.SQUARE_OPEN_BRACKET = value; }
// public java.lang.String SQUARE_CLOSE_BRACKET() { return wrapperContained.SQUARE_CLOSE_BRACKET; }
// public void SQUARE_CLOSE_BRACKET(java.lang.String value) { wrapperContained.SQUARE_CLOSE_BRACKET = value; }
// public java.lang.String SEMICOLON() { return wrapperContained.SEMICOLON; }
// public void SEMICOLON(java.lang.String value) { wrapperContained.SEMICOLON = value; }
// public java.lang.String SPACE() { return wrapperContained.SPACE; }
// public void SPACE(java.lang.String value) { wrapperContained.SPACE = value; }
// public java.lang.String CURLY_OPEN_BRACKET() { return wrapperContained.CURLY_OPEN_BRACKET; }
// public void CURLY_OPEN_BRACKET(java.lang.String value) { wrapperContained.CURLY_OPEN_BRACKET = value; }
// public java.lang.String CURLY_CLOSE_BRACKET() { return wrapperContained.CURLY_CLOSE_BRACKET; }
// public void CURLY_CLOSE_BRACKET(java.lang.String value) { wrapperContained.CURLY_CLOSE_BRACKET = value; }
// public java.lang.String NEW_LINE() { return wrapperContained.NEW_LINE; }
// public void NEW_LINE(java.lang.String value) { wrapperContained.NEW_LINE = value; }
// public int indentationLevel() { return wrapperContained.indentationLevel; }
// public void indentationLevel(int value) { wrapperContained.indentationLevel = value; }
// public yarnwrap.text.Text FLOAT_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.FLOAT_TYPE_SUFFIX); }
// public void FLOAT_TYPE_SUFFIX(yarnwrap.text.Text value) { wrapperContained.FLOAT_TYPE_SUFFIX = value.wrapperContained; }
// public yarnwrap.text.Text DOUBLE_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.DOUBLE_TYPE_SUFFIX); }
// public void DOUBLE_TYPE_SUFFIX(yarnwrap.text.Text value) { wrapperContained.DOUBLE_TYPE_SUFFIX = value.wrapperContained; }
// public yarnwrap.text.Text ARRAY_BYTE_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.ARRAY_BYTE_TYPE_SUFFIX); }
// public void ARRAY_BYTE_TYPE_SUFFIX(yarnwrap.text.Text value) { wrapperContained.ARRAY_BYTE_TYPE_SUFFIX = value.wrapperContained; }
// public java.lang.String COLON_WITH_SPACE() { return wrapperContained.COLON_WITH_SPACE; }
// public void COLON_WITH_SPACE(java.lang.String value) { wrapperContained.COLON_WITH_SPACE = value; }
// public java.lang.String ENTRY_SEPARATOR_WITH_NEW_LINE() { return wrapperContained.ENTRY_SEPARATOR_WITH_NEW_LINE; }
// public void ENTRY_SEPARATOR_WITH_NEW_LINE(java.lang.String value) { wrapperContained.ENTRY_SEPARATOR_WITH_NEW_LINE = value; }
// public java.lang.String ENTRY_SEPARATOR_WITH_SPACE() { return wrapperContained.ENTRY_SEPARATOR_WITH_SPACE; }
// public void ENTRY_SEPARATOR_WITH_SPACE(java.lang.String value) { wrapperContained.ENTRY_SEPARATOR_WITH_SPACE = value; }
// public yarnwrap.text.Text ELLIPSIS() { return new yarnwrap.text.Text(wrapperContained.ELLIPSIS); }
// public void ELLIPSIS(yarnwrap.text.Text value) { wrapperContained.ELLIPSIS = value.wrapperContained; }
// public yarnwrap.text.Text BYTE_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.BYTE_TYPE_SUFFIX); }
// public void BYTE_TYPE_SUFFIX(yarnwrap.text.Text value) { wrapperContained.BYTE_TYPE_SUFFIX = value.wrapperContained; }
// public yarnwrap.text.Text SHORT_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.SHORT_TYPE_SUFFIX); }
// public void SHORT_TYPE_SUFFIX(yarnwrap.text.Text value) { wrapperContained.SHORT_TYPE_SUFFIX = value.wrapperContained; }
// public yarnwrap.text.Text INT_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.INT_TYPE_SUFFIX); }
// public void INT_TYPE_SUFFIX(yarnwrap.text.Text value) { wrapperContained.INT_TYPE_SUFFIX = value.wrapperContained; }
// public yarnwrap.text.Text LONG_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.LONG_TYPE_SUFFIX); }
// public void LONG_TYPE_SUFFIX(yarnwrap.text.Text value) { wrapperContained.LONG_TYPE_SUFFIX = value.wrapperContained; }
// public yarnwrap.text.Text escapeName(java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.escapeName(name)); }
public yarnwrap.text.Text apply(yarnwrap.nbt.NbtElement element) { return new yarnwrap.text.Text(wrapperContained.apply(element.wrapperContained)); }
// public void formatSubElement(yarnwrap.nbt.NbtElement element,boolean indent) { wrapperContained.formatSubElement(element.wrapperContained,indent); }

}