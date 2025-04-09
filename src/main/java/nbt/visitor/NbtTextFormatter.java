package yarnwrap.nbt.visitor;
public class NbtTextFormatter { public net.minecraft.nbt.visitor.NbtTextFormatter wrapperContained; public NbtTextFormatter(net.minecraft.nbt.visitor.NbtTextFormatter wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public it.unimi.dsi.fastutil.bytes.ByteCollection SINGLE_LINE_ELEMENT_TYPES() { return wrapperContained.SINGLE_LINE_ELEMENT_TYPES; }
// public yarnwrap.util.Formatting NAME_COLOR() { return new yarnwrap.util.Formatting(wrapperContained.NAME_COLOR); }
// public yarnwrap.util.Formatting STRING_COLOR() { return new yarnwrap.util.Formatting(wrapperContained.STRING_COLOR); }
// public yarnwrap.util.Formatting NUMBER_COLOR() { return new yarnwrap.util.Formatting(wrapperContained.NUMBER_COLOR); }
// public yarnwrap.util.Formatting TYPE_SUFFIX_COLOR() { return new yarnwrap.util.Formatting(wrapperContained.TYPE_SUFFIX_COLOR); }
// public java.util.regex.Pattern SIMPLE_NAME() { return wrapperContained.SIMPLE_NAME; }
// public java.lang.String ENTRY_SEPARATOR() { return wrapperContained.ENTRY_SEPARATOR; }
// public java.lang.String prefix() { return wrapperContained.prefix; }
// public int depth() { return wrapperContained.depth; }
// public yarnwrap.text.MutableText result() { return new yarnwrap.text.MutableText(wrapperContained.result); }
// public java.lang.String SQUARE_OPEN_BRACKET() { return wrapperContained.SQUARE_OPEN_BRACKET; }
// public java.lang.String SQUARE_CLOSE_BRACKET() { return wrapperContained.SQUARE_CLOSE_BRACKET; }
// public java.lang.String SEMICOLON() { return wrapperContained.SEMICOLON; }
// public java.lang.String SPACE() { return wrapperContained.SPACE; }
// public java.lang.String CURLY_OPEN_BRACKET() { return wrapperContained.CURLY_OPEN_BRACKET; }
// public java.lang.String CURLY_CLOSE_BRACKET() { return wrapperContained.CURLY_CLOSE_BRACKET; }
// public java.lang.String NEW_LINE() { return wrapperContained.NEW_LINE; }
// public int indentationLevel() { return wrapperContained.indentationLevel; }
// public yarnwrap.text.Text FLOAT_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.FLOAT_TYPE_SUFFIX); }
// public yarnwrap.text.Text DOUBLE_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.DOUBLE_TYPE_SUFFIX); }
// public yarnwrap.text.Text ARRAY_BYTE_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.ARRAY_BYTE_TYPE_SUFFIX); }
// public java.lang.String COLON_WITH_SPACE() { return wrapperContained.COLON_WITH_SPACE; }
// public java.lang.String ENTRY_SEPARATOR_WITH_NEW_LINE() { return wrapperContained.ENTRY_SEPARATOR_WITH_NEW_LINE; }
// public java.lang.String ENTRY_SEPARATOR_WITH_SPACE() { return wrapperContained.ENTRY_SEPARATOR_WITH_SPACE; }
// public yarnwrap.text.Text ELLIPSIS() { return new yarnwrap.text.Text(wrapperContained.ELLIPSIS); }
// public yarnwrap.text.Text BYTE_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.BYTE_TYPE_SUFFIX); }
// public yarnwrap.text.Text SHORT_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.SHORT_TYPE_SUFFIX); }
// public yarnwrap.text.Text INT_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.INT_TYPE_SUFFIX); }
// public yarnwrap.text.Text LONG_TYPE_SUFFIX() { return new yarnwrap.text.Text(wrapperContained.LONG_TYPE_SUFFIX); }
// public yarnwrap.text.Text escapeName(java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.escapeName(name)); }
public yarnwrap.text.Text apply(yarnwrap.nbt.NbtElement element) { return new yarnwrap.text.Text(wrapperContained.apply(element.wrapperContained)); }
// public void formatSubElement(yarnwrap.nbt.NbtElement element,boolean indent) { wrapperContained.formatSubElement(element.wrapperContained,indent); }

}