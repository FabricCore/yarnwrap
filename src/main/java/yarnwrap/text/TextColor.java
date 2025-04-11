package yarnwrap.text;
public class TextColor { public net.minecraft.text.TextColor wrapperContained; public TextColor(net.minecraft.text.TextColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map FORMATTING_TO_COLOR() { return wrapperContained.FORMATTING_TO_COLOR; }
// public void FORMATTING_TO_COLOR(java.util.Map value) { wrapperContained.FORMATTING_TO_COLOR = value; }
// public java.util.Map BY_NAME() { return wrapperContained.BY_NAME; }
// public void BY_NAME(java.util.Map value) { wrapperContained.BY_NAME = value; }
// public int rgb() { return wrapperContained.rgb; }
// public void rgb(int value) { wrapperContained.rgb = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.lang.String RGB_PREFIX() { return wrapperContained.RGB_PREFIX; }
// public void RGB_PREFIX(java.lang.String value) { wrapperContained.RGB_PREFIX = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public int getRgb() { return wrapperContained.getRgb(); }
public yarnwrap.text.TextColor fromRgb(int rgb) { return new yarnwrap.text.TextColor(wrapperContained.fromRgb(rgb)); }
public yarnwrap.text.TextColor fromFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.text.TextColor(wrapperContained.fromFormatting(formatting.wrapperContained)); }
public com.mojang.serialization.DataResult parse(java.lang.String name) { return wrapperContained.parse(name); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public java.lang.String getHexCode() { return wrapperContained.getHexCode(); }

}