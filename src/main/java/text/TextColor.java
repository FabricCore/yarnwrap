package yarnwrap.text;
public class TextColor { public net.minecraft.text.TextColor wrapperContained; public TextColor(net.minecraft.text.TextColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map FORMATTING_TO_COLOR() { return wrapperContained.FORMATTING_TO_COLOR; }
// public java.util.Map BY_NAME() { return wrapperContained.BY_NAME; }
// public int rgb() { return wrapperContained.rgb; }
// public java.lang.String name() { return wrapperContained.name; }
// public java.lang.String RGB_PREFIX() { return wrapperContained.RGB_PREFIX; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public int getRgb() { return wrapperContained.getRgb(); }
public yarnwrap.text.TextColor fromRgb(int rgb) { return new yarnwrap.text.TextColor(wrapperContained.fromRgb(rgb)); }
public yarnwrap.text.TextColor fromFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.text.TextColor(wrapperContained.fromFormatting(formatting.wrapperContained)); }
public com.mojang.serialization.DataResult parse(java.lang.String name) { return wrapperContained.parse(name); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public java.lang.String getHexCode() { return wrapperContained.getHexCode(); }

}