package yarnwrap.text;
public class Style { public net.minecraft.text.Style wrapperContained; public Style(net.minecraft.text.Style wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Boolean underlined() { return wrapperContained.underlined; }
// public java.lang.Boolean italic() { return wrapperContained.italic; }
// public yarnwrap.text.ClickEvent clickEvent() { return new yarnwrap.text.ClickEvent(wrapperContained.clickEvent); }
// public yarnwrap.text.TextColor color() { return new yarnwrap.text.TextColor(wrapperContained.color); }
// public java.lang.Boolean bold() { return wrapperContained.bold; }
// public java.lang.Boolean strikethrough() { return wrapperContained.strikethrough; }
// public yarnwrap.text.HoverEvent hoverEvent() { return new yarnwrap.text.HoverEvent(wrapperContained.hoverEvent); }
// public java.lang.String insertion() { return wrapperContained.insertion; }
// public java.lang.Boolean obfuscated() { return wrapperContained.obfuscated; }
public yarnwrap.util.Identifier DEFAULT_FONT_ID() { return new yarnwrap.util.Identifier(wrapperContained.DEFAULT_FONT_ID); }
public yarnwrap.text.Style EMPTY() { return new yarnwrap.text.Style(wrapperContained.EMPTY); }
// public yarnwrap.util.Identifier font() { return new yarnwrap.util.Identifier(wrapperContained.font); }
public yarnwrap.text.Style withHoverEvent(yarnwrap.text.HoverEvent hoverEvent) { return new yarnwrap.text.Style(wrapperContained.withHoverEvent(hoverEvent.wrapperContained)); }
public java.lang.String getInsertion() { return wrapperContained.getInsertion(); }
public yarnwrap.text.Style withClickEvent(yarnwrap.text.ClickEvent clickEvent) { return new yarnwrap.text.Style(wrapperContained.withClickEvent(clickEvent.wrapperContained)); }
public boolean isUnderlined() { return wrapperContained.isUnderlined(); }
public boolean isItalic() { return wrapperContained.isItalic(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.text.HoverEvent getHoverEvent() { return new yarnwrap.text.HoverEvent(wrapperContained.getHoverEvent()); }
public yarnwrap.text.ClickEvent getClickEvent() { return new yarnwrap.text.ClickEvent(wrapperContained.getClickEvent()); }
public yarnwrap.text.TextColor getColor() { return new yarnwrap.text.TextColor(wrapperContained.getColor()); }
public yarnwrap.text.Style withInsertion(java.lang.String insertion) { return new yarnwrap.text.Style(wrapperContained.withInsertion(insertion)); }
public yarnwrap.text.Style withColor(yarnwrap.util.Formatting color) { return new yarnwrap.text.Style(wrapperContained.withColor(color.wrapperContained)); }
public yarnwrap.text.Style withItalic(java.lang.Boolean italic) { return new yarnwrap.text.Style(wrapperContained.withItalic(italic)); }
public yarnwrap.text.Style withBold(java.lang.Boolean bold) { return new yarnwrap.text.Style(wrapperContained.withBold(bold)); }
public boolean isBold() { return wrapperContained.isBold(); }
public boolean isStrikethrough() { return wrapperContained.isStrikethrough(); }
public boolean isObfuscated() { return wrapperContained.isObfuscated(); }
public yarnwrap.text.Style withParent(yarnwrap.text.Style parent) { return new yarnwrap.text.Style(wrapperContained.withParent(parent.wrapperContained)); }
public yarnwrap.text.Style withColor(yarnwrap.text.TextColor color) { return new yarnwrap.text.Style(wrapperContained.withColor(color.wrapperContained)); }
public yarnwrap.text.Style withFont(yarnwrap.util.Identifier font) { return new yarnwrap.text.Style(wrapperContained.withFont(font.wrapperContained)); }
public yarnwrap.text.Style withFormatting(net.minecraft.util.Formatting[] formattings) { return new yarnwrap.text.Style(wrapperContained.withFormatting(formattings)); }
public yarnwrap.text.Style withFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.text.Style(wrapperContained.withFormatting(formatting.wrapperContained)); }
public yarnwrap.text.Style withExclusiveFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.text.Style(wrapperContained.withExclusiveFormatting(formatting.wrapperContained)); }
public yarnwrap.util.Identifier getFont() { return new yarnwrap.util.Identifier(wrapperContained.getFont()); }
public yarnwrap.text.Style withUnderline(java.lang.Boolean underline) { return new yarnwrap.text.Style(wrapperContained.withUnderline(underline)); }
public yarnwrap.text.Style withColor(int rgbColor) { return new yarnwrap.text.Style(wrapperContained.withColor(rgbColor)); }
public yarnwrap.text.Style withStrikethrough(java.lang.Boolean strikethrough) { return new yarnwrap.text.Style(wrapperContained.withStrikethrough(strikethrough)); }
public yarnwrap.text.Style withObfuscated(java.lang.Boolean obfuscated) { return new yarnwrap.text.Style(wrapperContained.withObfuscated(obfuscated)); }
// public yarnwrap.text.Style of(java.util.Optional color,java.util.Optional bold,java.util.Optional italic,java.util.Optional underlined,java.util.Optional strikethrough,java.util.Optional obfuscated) { return new yarnwrap.text.Style(wrapperContained.of(color,bold,italic,underlined,strikethrough,obfuscated)); }
// public yarnwrap.text.Style with(yarnwrap.text.Style newStyle,java.lang.Object oldAttribute,java.lang.Object newAttribute) { return new yarnwrap.text.Style(wrapperContained.with(newStyle.wrapperContained,oldAttribute,newAttribute)); }

}