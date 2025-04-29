package yarnwrap.text;
public class TextColor { public net.minecraft.text.TextColor wrapperContained; public TextColor(net.minecraft.text.TextColor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map FORMATTING_TO_COLOR() { return wrapperContained.FORMATTING_TO_COLOR; }
// public void FORMATTING_TO_COLOR(java.util.Map value) { wrapperContained.FORMATTING_TO_COLOR = value; }
// public static java.util.Map FORMATTING_TO_COLOR() { return net.minecraft.text.TextColor.FORMATTING_TO_COLOR; }
// public static void FORMATTING_TO_COLOR(java.util.Map value, ) { net.minecraft.text.TextColor.FORMATTING_TO_COLOR = value; }

// public java.util.Map BY_NAME() { return wrapperContained.BY_NAME; }
// public void BY_NAME(java.util.Map value) { wrapperContained.BY_NAME = value; }
// public static java.util.Map BY_NAME() { return net.minecraft.text.TextColor.BY_NAME; }
// public static void BY_NAME(java.util.Map value, ) { net.minecraft.text.TextColor.BY_NAME = value; }

// public int rgb() { return wrapperContained.rgb; }
// public void rgb(int value) { wrapperContained.rgb = value; }
// public static int rgb() { return net.minecraft.text.TextColor.rgb; }
// public static void rgb(int value, ) { net.minecraft.text.TextColor.rgb = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.text.TextColor.name; }
// public static void name(java.lang.String value, ) { net.minecraft.text.TextColor.name = value; }

// public java.lang.String RGB_PREFIX() { return wrapperContained.RGB_PREFIX; }
// public void RGB_PREFIX(java.lang.String value) { wrapperContained.RGB_PREFIX = value; }
// public static java.lang.String RGB_PREFIX() { return net.minecraft.text.TextColor.RGB_PREFIX; }
// public static void RGB_PREFIX(java.lang.String value, ) { net.minecraft.text.TextColor.RGB_PREFIX = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.text.TextColor.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.text.TextColor.CODEC = value; }

// public TextColor(int rgb) { this.wrapperContained = new net.minecraft.text.TextColor(rgb); }
// public TextColor(int rgb,java.lang.String name) { this.wrapperContained = new net.minecraft.text.TextColor(rgb,name); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.text.TextColor.equals(o); }
public int getRgb() { return wrapperContained.getRgb(); }
// public static int getRgb() { return net.minecraft.text.TextColor.getRgb(); }
// public yarnwrap.text.TextColor fromRgb(int rgb) { return new yarnwrap.text.TextColor(wrapperContained.fromRgb(rgb)); }
// public static yarnwrap.text.TextColor fromRgb(int rgb, ) { return new yarnwrap.text.TextColor(net.minecraft.text.TextColor.fromRgb(rgb)); }
// public yarnwrap.text.TextColor fromFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.text.TextColor(wrapperContained.fromFormatting(formatting.wrapperContained)); }
// public static yarnwrap.text.TextColor fromFormatting(yarnwrap.util.Formatting formatting, ) { return new yarnwrap.text.TextColor(net.minecraft.text.TextColor.fromFormatting(formatting.wrapperContained)); }
// public com.mojang.serialization.DataResult parse(java.lang.String name) { return wrapperContained.parse(name); }
// public static com.mojang.serialization.DataResult parse(java.lang.String name, ) { return net.minecraft.text.TextColor.parse(name); }
// public java.lang.String method_27720(yarnwrap.text.TextColor textColor) { return wrapperContained.method_27720(textColor.wrapperContained); }
// public static java.lang.String method_27720(yarnwrap.text.TextColor textColor, ) { return net.minecraft.text.TextColor.method_27720(textColor.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.text.TextColor.getName(); }
// public yarnwrap.text.TextColor method_27722(yarnwrap.util.Formatting formatting) { return new yarnwrap.text.TextColor(wrapperContained.method_27722(formatting.wrapperContained)); }
// public static yarnwrap.text.TextColor method_27722(yarnwrap.util.Formatting formatting, ) { return new yarnwrap.text.TextColor(net.minecraft.text.TextColor.method_27722(formatting.wrapperContained)); }
public java.lang.String getHexCode() { return wrapperContained.getHexCode(); }
// public static java.lang.String getHexCode() { return net.minecraft.text.TextColor.getHexCode(); }

}