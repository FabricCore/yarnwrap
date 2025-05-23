package yarnwrap.util;
public class Formatting { public net.minecraft.util.Formatting wrapperContained; public Formatting(net.minecraft.util.Formatting wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BY_NAME() { return wrapperContained.BY_NAME; }
// public void BY_NAME(java.util.Map value) { wrapperContained.BY_NAME = value; }
// public static java.util.Map BY_NAME() { return net.minecraft.util.Formatting.BY_NAME; }
// public static void BY_NAME(java.util.Map value, ) { net.minecraft.util.Formatting.BY_NAME = value; }

// public java.lang.Integer colorValue() { return wrapperContained.colorValue; }
// public void colorValue(java.lang.Integer value) { wrapperContained.colorValue = value; }
// public static java.lang.Integer colorValue() { return net.minecraft.util.Formatting.colorValue; }
// public static void colorValue(java.lang.Integer value, ) { net.minecraft.util.Formatting.colorValue = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.Formatting.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.Formatting.name = value; }

// public char code() { return wrapperContained.code; }
// public void code(char value) { wrapperContained.code = value; }
// public static char code() { return net.minecraft.util.Formatting.code; }
// public static void code(char value, ) { net.minecraft.util.Formatting.code = value; }

// public java.util.regex.Pattern FORMATTING_CODE_PATTERN() { return wrapperContained.FORMATTING_CODE_PATTERN; }
// public void FORMATTING_CODE_PATTERN(java.util.regex.Pattern value) { wrapperContained.FORMATTING_CODE_PATTERN = value; }
// public static java.util.regex.Pattern FORMATTING_CODE_PATTERN() { return net.minecraft.util.Formatting.FORMATTING_CODE_PATTERN; }
// public static void FORMATTING_CODE_PATTERN(java.util.regex.Pattern value, ) { net.minecraft.util.Formatting.FORMATTING_CODE_PATTERN = value; }

// public java.lang.String stringValue() { return wrapperContained.stringValue; }
// public void stringValue(java.lang.String value) { wrapperContained.stringValue = value; }
// public static java.lang.String stringValue() { return net.minecraft.util.Formatting.stringValue; }
// public static void stringValue(java.lang.String value, ) { net.minecraft.util.Formatting.stringValue = value; }

// public int colorIndex() { return wrapperContained.colorIndex; }
// public void colorIndex(int value) { wrapperContained.colorIndex = value; }
// public static int colorIndex() { return net.minecraft.util.Formatting.colorIndex; }
// public static void colorIndex(int value, ) { net.minecraft.util.Formatting.colorIndex = value; }

// public boolean modifier() { return wrapperContained.modifier; }
// public void modifier(boolean value) { wrapperContained.modifier = value; }
// public static boolean modifier() { return net.minecraft.util.Formatting.modifier; }
// public static void modifier(boolean value, ) { net.minecraft.util.Formatting.modifier = value; }

// public char FORMATTING_CODE_PREFIX() { return wrapperContained.FORMATTING_CODE_PREFIX; }
// public void FORMATTING_CODE_PREFIX(char value) { wrapperContained.FORMATTING_CODE_PREFIX = value; }
public static char FORMATTING_CODE_PREFIX() { return net.minecraft.util.Formatting.FORMATTING_CODE_PREFIX; }
// public static void FORMATTING_CODE_PREFIX(char value, ) { net.minecraft.util.Formatting.FORMATTING_CODE_PREFIX = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.Formatting.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Formatting.CODEC = value; }

// public com.mojang.serialization.Codec COLOR_CODEC() { return wrapperContained.COLOR_CODEC; }
// public void COLOR_CODEC(com.mojang.serialization.Codec value) { wrapperContained.COLOR_CODEC = value; }
public static com.mojang.serialization.Codec COLOR_CODEC() { return net.minecraft.util.Formatting.COLOR_CODEC; }
// public static void COLOR_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Formatting.COLOR_CODEC = value; }

// // public Formatting(java.lang.String name,int code,java.lang.String colorIndex,char colorValue) { this.wrapperContained = new net.minecraft.util.Formatting(name,code,colorIndex,colorValue); }
// // public Formatting(java.lang.String name,int code,java.lang.String modifier) { this.wrapperContained = new net.minecraft.util.Formatting(name,code,modifier); }
// // public Formatting(java.lang.String name,int code,java.lang.String modifier,char colorIndex,boolean colorValue) { this.wrapperContained = new net.minecraft.util.Formatting(name,code,modifier,colorIndex,colorValue); }
// public java.lang.String method_531(yarnwrap.util.Formatting f) { return wrapperContained.method_531(f.wrapperContained); }
// public static java.lang.String method_531(yarnwrap.util.Formatting f, ) { return net.minecraft.util.Formatting.method_531(f.wrapperContained); }
public java.lang.Integer getColorValue() { return wrapperContained.getColorValue(); }
// public static java.lang.Integer getColorValue() { return net.minecraft.util.Formatting.getColorValue(); }
// public yarnwrap.util.Formatting byName(java.lang.String name) { return new yarnwrap.util.Formatting(wrapperContained.byName(name)); }
// public static yarnwrap.util.Formatting byName(java.lang.String name, ) { return new yarnwrap.util.Formatting(net.minecraft.util.Formatting.byName(name)); }
// public yarnwrap.util.Formatting byColorIndex(int colorIndex) { return new yarnwrap.util.Formatting(wrapperContained.byColorIndex(colorIndex)); }
// public static yarnwrap.util.Formatting byColorIndex(int colorIndex, ) { return new yarnwrap.util.Formatting(net.minecraft.util.Formatting.byColorIndex(colorIndex)); }
// public java.lang.String sanitize(java.lang.String name) { return wrapperContained.sanitize(name); }
// public static java.lang.String sanitize(java.lang.String name, ) { return net.minecraft.util.Formatting.sanitize(name); }
public int getColorIndex() { return wrapperContained.getColorIndex(); }
// public static int getColorIndex() { return net.minecraft.util.Formatting.getColorIndex(); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.util.Formatting.getName(); }
// public java.lang.String strip(java.lang.String string) { return wrapperContained.strip(string); }
// public static java.lang.String strip(java.lang.String string, ) { return net.minecraft.util.Formatting.strip(string); }
// public java.util.Collection getNames(boolean colors,boolean modifiers) { return wrapperContained.getNames(colors,modifiers); }
// public static java.util.Collection getNames(boolean colors,boolean modifiers, ) { return net.minecraft.util.Formatting.getNames(colors,modifiers); }
// public yarnwrap.util.Formatting method_541(yarnwrap.util.Formatting f) { return new yarnwrap.util.Formatting(wrapperContained.method_541(f.wrapperContained)); }
// public static yarnwrap.util.Formatting method_541(yarnwrap.util.Formatting f, ) { return new yarnwrap.util.Formatting(net.minecraft.util.Formatting.method_541(f.wrapperContained)); }
public boolean isModifier() { return wrapperContained.isModifier(); }
// public static boolean isModifier() { return net.minecraft.util.Formatting.isModifier(); }
public boolean isColor() { return wrapperContained.isColor(); }
// public static boolean isColor() { return net.minecraft.util.Formatting.isColor(); }
// public yarnwrap.util.Formatting byCode(char code) { return new yarnwrap.util.Formatting(wrapperContained.byCode(code)); }
// public static yarnwrap.util.Formatting byCode(char code, ) { return new yarnwrap.util.Formatting(net.minecraft.util.Formatting.byCode(code)); }
public char getCode() { return wrapperContained.getCode(); }
// public static char getCode() { return net.minecraft.util.Formatting.getCode(); }
// public com.mojang.serialization.DataResult method_67477(yarnwrap.util.Formatting formatting) { return wrapperContained.method_67477(formatting.wrapperContained); }
// public static com.mojang.serialization.DataResult method_67477(yarnwrap.util.Formatting formatting, ) { return net.minecraft.util.Formatting.method_67477(formatting.wrapperContained); }

}