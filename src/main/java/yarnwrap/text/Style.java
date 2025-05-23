package yarnwrap.text;
public class Style { public net.minecraft.text.Style wrapperContained; public Style(net.minecraft.text.Style wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Boolean underlined() { return wrapperContained.underlined; }
// public void underlined(java.lang.Boolean value) { wrapperContained.underlined = value; }
// public static java.lang.Boolean underlined() { return net.minecraft.text.Style.underlined; }
// public static void underlined(java.lang.Boolean value, ) { net.minecraft.text.Style.underlined = value; }

// public java.lang.Boolean italic() { return wrapperContained.italic; }
// public void italic(java.lang.Boolean value) { wrapperContained.italic = value; }
// public static java.lang.Boolean italic() { return net.minecraft.text.Style.italic; }
// public static void italic(java.lang.Boolean value, ) { net.minecraft.text.Style.italic = value; }

// public yarnwrap.text.ClickEvent clickEvent() { return new yarnwrap.text.ClickEvent(wrapperContained.clickEvent); }
// public void clickEvent(yarnwrap.text.ClickEvent value) { wrapperContained.clickEvent = value.wrapperContained; }
// public static yarnwrap.text.ClickEvent clickEvent() { return new yarnwrap.text.ClickEvent(net.minecraft.text.Style.clickEvent); }
// public static void clickEvent(yarnwrap.text.ClickEvent value, ) { net.minecraft.text.Style.clickEvent = value.wrapperContained; }

// public yarnwrap.text.TextColor color() { return new yarnwrap.text.TextColor(wrapperContained.color); }
// public void color(yarnwrap.text.TextColor value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.text.TextColor color() { return new yarnwrap.text.TextColor(net.minecraft.text.Style.color); }
// public static void color(yarnwrap.text.TextColor value, ) { net.minecraft.text.Style.color = value.wrapperContained; }

// public java.lang.Boolean bold() { return wrapperContained.bold; }
// public void bold(java.lang.Boolean value) { wrapperContained.bold = value; }
// public static java.lang.Boolean bold() { return net.minecraft.text.Style.bold; }
// public static void bold(java.lang.Boolean value, ) { net.minecraft.text.Style.bold = value; }

// public java.lang.Boolean strikethrough() { return wrapperContained.strikethrough; }
// public void strikethrough(java.lang.Boolean value) { wrapperContained.strikethrough = value; }
// public static java.lang.Boolean strikethrough() { return net.minecraft.text.Style.strikethrough; }
// public static void strikethrough(java.lang.Boolean value, ) { net.minecraft.text.Style.strikethrough = value; }

// public yarnwrap.text.HoverEvent hoverEvent() { return new yarnwrap.text.HoverEvent(wrapperContained.hoverEvent); }
// public void hoverEvent(yarnwrap.text.HoverEvent value) { wrapperContained.hoverEvent = value.wrapperContained; }
// public static yarnwrap.text.HoverEvent hoverEvent() { return new yarnwrap.text.HoverEvent(net.minecraft.text.Style.hoverEvent); }
// public static void hoverEvent(yarnwrap.text.HoverEvent value, ) { net.minecraft.text.Style.hoverEvent = value.wrapperContained; }

// public java.lang.String insertion() { return wrapperContained.insertion; }
// public void insertion(java.lang.String value) { wrapperContained.insertion = value; }
// public static java.lang.String insertion() { return net.minecraft.text.Style.insertion; }
// public static void insertion(java.lang.String value, ) { net.minecraft.text.Style.insertion = value; }

// public java.lang.Boolean obfuscated() { return wrapperContained.obfuscated; }
// public void obfuscated(java.lang.Boolean value) { wrapperContained.obfuscated = value; }
// public static java.lang.Boolean obfuscated() { return net.minecraft.text.Style.obfuscated; }
// public static void obfuscated(java.lang.Boolean value, ) { net.minecraft.text.Style.obfuscated = value; }

// public yarnwrap.util.Identifier DEFAULT_FONT_ID() { return new yarnwrap.util.Identifier(wrapperContained.DEFAULT_FONT_ID); }
// public void DEFAULT_FONT_ID(yarnwrap.util.Identifier value) { wrapperContained.DEFAULT_FONT_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier DEFAULT_FONT_ID() { return new yarnwrap.util.Identifier(net.minecraft.text.Style.DEFAULT_FONT_ID); }
// public static void DEFAULT_FONT_ID(yarnwrap.util.Identifier value, ) { net.minecraft.text.Style.DEFAULT_FONT_ID = value.wrapperContained; }

// public yarnwrap.text.Style EMPTY() { return new yarnwrap.text.Style(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.Style value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.text.Style EMPTY() { return new yarnwrap.text.Style(net.minecraft.text.Style.EMPTY); }
// public static void EMPTY(yarnwrap.text.Style value, ) { net.minecraft.text.Style.EMPTY = value.wrapperContained; }

// public yarnwrap.util.Identifier font() { return new yarnwrap.util.Identifier(wrapperContained.font); }
// public void font(yarnwrap.util.Identifier value) { wrapperContained.font = value.wrapperContained; }
// public static yarnwrap.util.Identifier font() { return new yarnwrap.util.Identifier(net.minecraft.text.Style.font); }
// public static void font(yarnwrap.util.Identifier value, ) { net.minecraft.text.Style.font = value.wrapperContained; }

// public java.lang.Integer shadowColor() { return wrapperContained.shadowColor; }
// public void shadowColor(java.lang.Integer value) { wrapperContained.shadowColor = value; }
// public static java.lang.Integer shadowColor() { return net.minecraft.text.Style.shadowColor; }
// public static void shadowColor(java.lang.Integer value, ) { net.minecraft.text.Style.shadowColor = value; }

// public Style(yarnwrap.text.TextColor color,java.lang.Integer shadowColor,java.lang.Boolean bold,java.lang.Boolean italic,java.lang.Boolean underlined,java.lang.Boolean strikethrough,java.lang.Boolean obfuscated,yarnwrap.text.ClickEvent clickEvent,yarnwrap.text.HoverEvent hoverEvent,java.lang.String insertion,yarnwrap.util.Identifier font) { this.wrapperContained = new net.minecraft.text.Style(color.wrapperContained,shadowColor,bold,italic,underlined,strikethrough,obfuscated,clickEvent.wrapperContained,hoverEvent.wrapperContained,insertion,font.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.text.Style.equals(o); }
public yarnwrap.text.Style withHoverEvent(yarnwrap.text.HoverEvent hoverEvent) { return new yarnwrap.text.Style(wrapperContained.withHoverEvent(hoverEvent.wrapperContained)); }
// public static yarnwrap.text.Style withHoverEvent(yarnwrap.text.HoverEvent hoverEvent, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withHoverEvent(hoverEvent.wrapperContained)); }
public java.lang.String getInsertion() { return wrapperContained.getInsertion(); }
// public static java.lang.String getInsertion() { return net.minecraft.text.Style.getInsertion(); }
public yarnwrap.text.Style withClickEvent(yarnwrap.text.ClickEvent clickEvent) { return new yarnwrap.text.Style(wrapperContained.withClickEvent(clickEvent.wrapperContained)); }
// public static yarnwrap.text.Style withClickEvent(yarnwrap.text.ClickEvent clickEvent, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withClickEvent(clickEvent.wrapperContained)); }
public boolean isUnderlined() { return wrapperContained.isUnderlined(); }
// public static boolean isUnderlined() { return net.minecraft.text.Style.isUnderlined(); }
public boolean isItalic() { return wrapperContained.isItalic(); }
// public static boolean isItalic() { return net.minecraft.text.Style.isItalic(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.text.Style.isEmpty(); }
public yarnwrap.text.HoverEvent getHoverEvent() { return new yarnwrap.text.HoverEvent(wrapperContained.getHoverEvent()); }
// public static yarnwrap.text.HoverEvent getHoverEvent() { return new yarnwrap.text.HoverEvent(net.minecraft.text.Style.getHoverEvent()); }
public yarnwrap.text.ClickEvent getClickEvent() { return new yarnwrap.text.ClickEvent(wrapperContained.getClickEvent()); }
// public static yarnwrap.text.ClickEvent getClickEvent() { return new yarnwrap.text.ClickEvent(net.minecraft.text.Style.getClickEvent()); }
public yarnwrap.text.TextColor getColor() { return new yarnwrap.text.TextColor(wrapperContained.getColor()); }
// public static yarnwrap.text.TextColor getColor() { return new yarnwrap.text.TextColor(net.minecraft.text.Style.getColor()); }
public yarnwrap.text.Style withInsertion(java.lang.String insertion) { return new yarnwrap.text.Style(wrapperContained.withInsertion(insertion)); }
// public static yarnwrap.text.Style withInsertion(java.lang.String insertion, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withInsertion(insertion)); }
public yarnwrap.text.Style withColor(yarnwrap.util.Formatting color) { return new yarnwrap.text.Style(wrapperContained.withColor(color.wrapperContained)); }
// public static yarnwrap.text.Style withColor(yarnwrap.util.Formatting color, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withColor(color.wrapperContained)); }
public yarnwrap.text.Style withItalic(java.lang.Boolean italic) { return new yarnwrap.text.Style(wrapperContained.withItalic(italic)); }
// public static yarnwrap.text.Style withItalic(java.lang.Boolean italic, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withItalic(italic)); }
public yarnwrap.text.Style withBold(java.lang.Boolean bold) { return new yarnwrap.text.Style(wrapperContained.withBold(bold)); }
// public static yarnwrap.text.Style withBold(java.lang.Boolean bold, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withBold(bold)); }
public boolean isBold() { return wrapperContained.isBold(); }
// public static boolean isBold() { return net.minecraft.text.Style.isBold(); }
public boolean isStrikethrough() { return wrapperContained.isStrikethrough(); }
// public static boolean isStrikethrough() { return net.minecraft.text.Style.isStrikethrough(); }
public boolean isObfuscated() { return wrapperContained.isObfuscated(); }
// public static boolean isObfuscated() { return net.minecraft.text.Style.isObfuscated(); }
public yarnwrap.text.Style withParent(yarnwrap.text.Style parent) { return new yarnwrap.text.Style(wrapperContained.withParent(parent.wrapperContained)); }
// public static yarnwrap.text.Style withParent(yarnwrap.text.Style parent, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withParent(parent.wrapperContained)); }
public yarnwrap.text.Style withColor(yarnwrap.text.TextColor color) { return new yarnwrap.text.Style(wrapperContained.withColor(color.wrapperContained)); }
// public static yarnwrap.text.Style withColor(yarnwrap.text.TextColor color, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withColor(color.wrapperContained)); }
public yarnwrap.text.Style withFont(yarnwrap.util.Identifier font) { return new yarnwrap.text.Style(wrapperContained.withFont(font.wrapperContained)); }
// public static yarnwrap.text.Style withFont(yarnwrap.util.Identifier font, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withFont(font.wrapperContained)); }
public yarnwrap.text.Style withFormatting(net.minecraft.util.Formatting[] formattings) { return new yarnwrap.text.Style(wrapperContained.withFormatting(formattings)); }
// public static yarnwrap.text.Style withFormatting(net.minecraft.util.Formatting[] formattings, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withFormatting(formattings)); }
public yarnwrap.text.Style withFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.text.Style(wrapperContained.withFormatting(formatting.wrapperContained)); }
// public static yarnwrap.text.Style withFormatting(yarnwrap.util.Formatting formatting, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withFormatting(formatting.wrapperContained)); }
public yarnwrap.text.Style withExclusiveFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.text.Style(wrapperContained.withExclusiveFormatting(formatting.wrapperContained)); }
// public static yarnwrap.text.Style withExclusiveFormatting(yarnwrap.util.Formatting formatting, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withExclusiveFormatting(formatting.wrapperContained)); }
public yarnwrap.util.Identifier getFont() { return new yarnwrap.util.Identifier(wrapperContained.getFont()); }
// public static yarnwrap.util.Identifier getFont() { return new yarnwrap.util.Identifier(net.minecraft.text.Style.getFont()); }
public yarnwrap.text.Style withUnderline(java.lang.Boolean underline) { return new yarnwrap.text.Style(wrapperContained.withUnderline(underline)); }
// public static yarnwrap.text.Style withUnderline(java.lang.Boolean underline, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withUnderline(underline)); }
public yarnwrap.text.Style withColor(int rgbColor) { return new yarnwrap.text.Style(wrapperContained.withColor(rgbColor)); }
// public static yarnwrap.text.Style withColor(int rgbColor, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withColor(rgbColor)); }
public yarnwrap.text.Style withStrikethrough(java.lang.Boolean strikethrough) { return new yarnwrap.text.Style(wrapperContained.withStrikethrough(strikethrough)); }
// public static yarnwrap.text.Style withStrikethrough(java.lang.Boolean strikethrough, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withStrikethrough(strikethrough)); }
public yarnwrap.text.Style withObfuscated(java.lang.Boolean obfuscated) { return new yarnwrap.text.Style(wrapperContained.withObfuscated(obfuscated)); }
// public static yarnwrap.text.Style withObfuscated(java.lang.Boolean obfuscated, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withObfuscated(obfuscated)); }
// public yarnwrap.text.Style of(java.util.Optional color,java.util.Optional shadowColor,java.util.Optional bold,java.util.Optional italic,java.util.Optional underlined,java.util.Optional strikethrough,java.util.Optional obfuscated,java.util.Optional clickEvent,java.util.Optional hoverEvent,java.util.Optional insertion,java.util.Optional font) { return new yarnwrap.text.Style(wrapperContained.of(color,shadowColor,bold,italic,underlined,strikethrough,obfuscated,clickEvent,hoverEvent,insertion,font)); }
// public static yarnwrap.text.Style of(java.util.Optional color,java.util.Optional shadowColor,java.util.Optional bold,java.util.Optional italic,java.util.Optional underlined,java.util.Optional strikethrough,java.util.Optional obfuscated,java.util.Optional clickEvent,java.util.Optional hoverEvent,java.util.Optional insertion,java.util.Optional font, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.of(color,shadowColor,bold,italic,underlined,strikethrough,obfuscated,clickEvent,hoverEvent,insertion,font)); }
// public yarnwrap.text.Style with(yarnwrap.text.Style newStyle,java.lang.Object oldAttribute,java.lang.Object newAttribute) { return new yarnwrap.text.Style(wrapperContained.with(newStyle.wrapperContained,oldAttribute,newAttribute)); }
// public static yarnwrap.text.Style with(yarnwrap.text.Style newStyle,java.lang.Object oldAttribute,java.lang.Object newAttribute, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.with(newStyle.wrapperContained,oldAttribute,newAttribute)); }
public java.lang.Integer getShadowColor() { return wrapperContained.getShadowColor(); }
// public static java.lang.Integer getShadowColor() { return net.minecraft.text.Style.getShadowColor(); }
public yarnwrap.text.Style withShadowColor(int shadowColor) { return new yarnwrap.text.Style(wrapperContained.withShadowColor(shadowColor)); }
// public static yarnwrap.text.Style withShadowColor(int shadowColor, ) { return new yarnwrap.text.Style(net.minecraft.text.Style.withShadowColor(shadowColor)); }

}