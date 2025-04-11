package yarnwrap.util;
public class Formatting { public net.minecraft.util.Formatting wrapperContained; public Formatting(net.minecraft.util.Formatting wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BY_NAME() { return wrapperContained.BY_NAME; }
// public void BY_NAME(java.util.Map value) { wrapperContained.BY_NAME = value; }
// public java.lang.Integer colorValue() { return wrapperContained.colorValue; }
// public void colorValue(java.lang.Integer value) { wrapperContained.colorValue = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public char code() { return wrapperContained.code; }
// public void code(char value) { wrapperContained.code = value; }
// public java.util.regex.Pattern FORMATTING_CODE_PATTERN() { return wrapperContained.FORMATTING_CODE_PATTERN; }
// public void FORMATTING_CODE_PATTERN(java.util.regex.Pattern value) { wrapperContained.FORMATTING_CODE_PATTERN = value; }
// public java.lang.String stringValue() { return wrapperContained.stringValue; }
// public void stringValue(java.lang.String value) { wrapperContained.stringValue = value; }
// public int colorIndex() { return wrapperContained.colorIndex; }
// public void colorIndex(int value) { wrapperContained.colorIndex = value; }
// public boolean modifier() { return wrapperContained.modifier; }
// public void modifier(boolean value) { wrapperContained.modifier = value; }
public char FORMATTING_CODE_PREFIX() { return wrapperContained.FORMATTING_CODE_PREFIX; }
// public void FORMATTING_CODE_PREFIX(char value) { wrapperContained.FORMATTING_CODE_PREFIX = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// // public Formatting(java.lang.String name,int code,java.lang.String colorIndex,char colorValue) { this.wrapperContained = new net.minecraft.util.Formatting(name,code,colorIndex,colorValue); }
// // public Formatting(java.lang.String name,int code,java.lang.String modifier) { this.wrapperContained = new net.minecraft.util.Formatting(name,code,modifier); }
// // public Formatting(java.lang.String name,int code,java.lang.String modifier,char colorIndex,boolean colorValue) { this.wrapperContained = new net.minecraft.util.Formatting(name,code,modifier,colorIndex,colorValue); }
public char getCode() { return wrapperContained.getCode(); }
// public java.lang.String method_531(yarnwrap.util.Formatting f) { return wrapperContained.method_531(f.wrapperContained); }
public java.lang.Integer getColorValue() { return wrapperContained.getColorValue(); }
public yarnwrap.util.Formatting byName(java.lang.String name) { return new yarnwrap.util.Formatting(wrapperContained.byName(name)); }
public yarnwrap.util.Formatting byColorIndex(int colorIndex) { return new yarnwrap.util.Formatting(wrapperContained.byColorIndex(colorIndex)); }
// public java.lang.String sanitize(java.lang.String name) { return wrapperContained.sanitize(name); }
public int getColorIndex() { return wrapperContained.getColorIndex(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public java.lang.String strip(java.lang.String string) { return wrapperContained.strip(string); }
public java.util.Collection getNames(boolean colors,boolean modifiers) { return wrapperContained.getNames(colors,modifiers); }
// public yarnwrap.util.Formatting method_541(yarnwrap.util.Formatting f) { return new yarnwrap.util.Formatting(wrapperContained.method_541(f.wrapperContained)); }
public boolean isModifier() { return wrapperContained.isModifier(); }
public boolean isColor() { return wrapperContained.isColor(); }
public yarnwrap.util.Formatting byCode(char code) { return new yarnwrap.util.Formatting(wrapperContained.byCode(code)); }

}