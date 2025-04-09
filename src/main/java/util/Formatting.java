package yarnwrap.util;
public class Formatting { public net.minecraft.util.Formatting wrapperContained; public Formatting(net.minecraft.util.Formatting wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BY_NAME() { return wrapperContained.BY_NAME; }
// public java.lang.Integer colorValue() { return wrapperContained.colorValue; }
// public java.lang.String name() { return wrapperContained.name; }
// public char code() { return wrapperContained.code; }
// public java.util.regex.Pattern FORMATTING_CODE_PATTERN() { return wrapperContained.FORMATTING_CODE_PATTERN; }
// public java.lang.String stringValue() { return wrapperContained.stringValue; }
// public int colorIndex() { return wrapperContained.colorIndex; }
// public boolean modifier() { return wrapperContained.modifier; }
public char FORMATTING_CODE_PREFIX() { return wrapperContained.FORMATTING_CODE_PREFIX; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public char getCode() { return wrapperContained.getCode(); }
public java.lang.Integer getColorValue() { return wrapperContained.getColorValue(); }
public yarnwrap.util.Formatting byName(java.lang.String name) { return new yarnwrap.util.Formatting(wrapperContained.byName(name)); }
public yarnwrap.util.Formatting byColorIndex(int colorIndex) { return new yarnwrap.util.Formatting(wrapperContained.byColorIndex(colorIndex)); }
// public java.lang.String sanitize(java.lang.String name) { return wrapperContained.sanitize(name); }
public int getColorIndex() { return wrapperContained.getColorIndex(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public java.lang.String strip(java.lang.String string) { return wrapperContained.strip(string); }
public java.util.Collection getNames(boolean colors,boolean modifiers) { return wrapperContained.getNames(colors,modifiers); }
public boolean isModifier() { return wrapperContained.isModifier(); }
public boolean isColor() { return wrapperContained.isColor(); }
public yarnwrap.util.Formatting byCode(char code) { return new yarnwrap.util.Formatting(wrapperContained.byCode(code)); }

}