package yarnwrap.text;
public class Text { public net.minecraft.text.Text wrapperContained; public Text(net.minecraft.text.Text wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.TextContent getContent() { return new yarnwrap.text.TextContent(wrapperContained.getContent()); }
// public static yarnwrap.text.TextContent getContent() { return new yarnwrap.text.TextContent(net.minecraft.text.Text.getContent()); }
public java.util.List getSiblings() { return wrapperContained.getSiblings(); }
// public static java.util.List getSiblings() { return net.minecraft.text.Text.getSiblings(); }
public java.lang.String asTruncatedString(int length) { return wrapperContained.asTruncatedString(length); }
// public static java.lang.String asTruncatedString(int length, ) { return net.minecraft.text.Text.asTruncatedString(length); }
public yarnwrap.text.Style getStyle() { return new yarnwrap.text.Style(wrapperContained.getStyle()); }
// public static yarnwrap.text.Style getStyle() { return new yarnwrap.text.Style(net.minecraft.text.Text.getStyle()); }
// public java.util.Optional method_27655(int string) { return wrapperContained.method_27655(string); }
// public static java.util.Optional method_27655(int string, ) { return net.minecraft.text.Text.method_27655(string); }
public yarnwrap.text.MutableText copy() { return new yarnwrap.text.MutableText(wrapperContained.copy()); }
// public static yarnwrap.text.MutableText copy() { return new yarnwrap.text.MutableText(net.minecraft.text.Text.copy()); }
public yarnwrap.text.MutableText copyContentOnly() { return new yarnwrap.text.MutableText(wrapperContained.copyContentOnly()); }
// public static yarnwrap.text.MutableText copyContentOnly() { return new yarnwrap.text.MutableText(net.minecraft.text.Text.copyContentOnly()); }
// public yarnwrap.text.Text of(java.lang.String string) { return new yarnwrap.text.Text(wrapperContained.of(string)); }
// public static yarnwrap.text.Text of(java.lang.String string, ) { return new yarnwrap.text.Text(net.minecraft.text.Text.of(string)); }
public yarnwrap.text.OrderedText asOrderedText() { return new yarnwrap.text.OrderedText(wrapperContained.asOrderedText()); }
// public static yarnwrap.text.OrderedText asOrderedText() { return new yarnwrap.text.OrderedText(net.minecraft.text.Text.asOrderedText()); }
// public java.util.Optional method_36135(java.util.List styleOverride,yarnwrap.text.Style text) { return wrapperContained.method_36135(styleOverride,text.wrapperContained); }
// public static java.util.Optional method_36135(java.util.List styleOverride,yarnwrap.text.Style text, ) { return net.minecraft.text.Text.method_36135(styleOverride,text.wrapperContained); }
public java.util.List getWithStyle(yarnwrap.text.Style style) { return wrapperContained.getWithStyle(style.wrapperContained); }
// public static java.util.List getWithStyle(yarnwrap.text.Style style, ) { return net.minecraft.text.Text.getWithStyle(style.wrapperContained); }
// public yarnwrap.text.MutableText score(java.lang.String name,java.lang.String objective) { return new yarnwrap.text.MutableText(wrapperContained.score(name,objective)); }
// public static yarnwrap.text.MutableText score(java.lang.String name,java.lang.String objective, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.score(name,objective)); }
// public yarnwrap.text.MutableText selector(yarnwrap.text.ParsedSelector selector,java.util.Optional separator) { return new yarnwrap.text.MutableText(wrapperContained.selector(selector.wrapperContained,separator)); }
// public static yarnwrap.text.MutableText selector(yarnwrap.text.ParsedSelector selector,java.util.Optional separator, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.selector(selector.wrapperContained,separator)); }
// public yarnwrap.text.MutableText nbt(java.lang.String rawPath,boolean interpret,java.util.Optional separator,yarnwrap.text.NbtDataSource dataSource) { return new yarnwrap.text.MutableText(wrapperContained.nbt(rawPath,interpret,separator,dataSource.wrapperContained)); }
// public static yarnwrap.text.MutableText nbt(java.lang.String rawPath,boolean interpret,java.util.Optional separator,yarnwrap.text.NbtDataSource dataSource, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.nbt(rawPath,interpret,separator,dataSource.wrapperContained)); }
// public yarnwrap.text.MutableText translatable(java.lang.String key,java.lang.Object[] args) { return new yarnwrap.text.MutableText(wrapperContained.translatable(key,args)); }
// public static yarnwrap.text.MutableText translatable(java.lang.String key,java.lang.Object[] args, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.translatable(key,args)); }
// public yarnwrap.text.MutableText literal(java.lang.String string) { return new yarnwrap.text.MutableText(wrapperContained.literal(string)); }
// public static yarnwrap.text.MutableText literal(java.lang.String string, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.literal(string)); }
// public yarnwrap.text.MutableText translatable(java.lang.String key) { return new yarnwrap.text.MutableText(wrapperContained.translatable(key)); }
// public static yarnwrap.text.MutableText translatable(java.lang.String key, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.translatable(key)); }
// public yarnwrap.text.MutableText keybind(java.lang.String string) { return new yarnwrap.text.MutableText(wrapperContained.keybind(string)); }
// public static yarnwrap.text.MutableText keybind(java.lang.String string, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.keybind(string)); }
// public yarnwrap.text.MutableText empty() { return new yarnwrap.text.MutableText(wrapperContained.empty()); }
public static yarnwrap.text.MutableText empty() { return new yarnwrap.text.MutableText(net.minecraft.text.Text.empty()); }
public boolean contains(yarnwrap.text.Text text) { return wrapperContained.contains(text.wrapperContained); }
// public static boolean contains(yarnwrap.text.Text text, ) { return net.minecraft.text.Text.contains(text.wrapperContained); }
public java.util.List withoutStyle() { return wrapperContained.withoutStyle(); }
// public static java.util.List withoutStyle() { return net.minecraft.text.Text.withoutStyle(); }
// public yarnwrap.text.MutableText translatableWithFallback(java.lang.String key,java.lang.String fallback) { return new yarnwrap.text.MutableText(wrapperContained.translatableWithFallback(key,fallback)); }
// public static yarnwrap.text.MutableText translatableWithFallback(java.lang.String key,java.lang.String fallback, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.translatableWithFallback(key,fallback)); }
// public yarnwrap.text.MutableText translatableWithFallback(java.lang.String key,java.lang.String fallback,java.lang.Object[] args) { return new yarnwrap.text.MutableText(wrapperContained.translatableWithFallback(key,fallback,args)); }
// public static yarnwrap.text.MutableText translatableWithFallback(java.lang.String key,java.lang.String fallback,java.lang.Object[] args, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.translatableWithFallback(key,fallback,args)); }
// public yarnwrap.text.Text of(yarnwrap.util.Identifier id) { return new yarnwrap.text.Text(wrapperContained.of(id.wrapperContained)); }
// public static yarnwrap.text.Text of(yarnwrap.util.Identifier id, ) { return new yarnwrap.text.Text(net.minecraft.text.Text.of(id.wrapperContained)); }
// public yarnwrap.text.Text of(com.mojang.brigadier.Message message) { return new yarnwrap.text.Text(wrapperContained.of(message)); }
// public static yarnwrap.text.Text of(com.mojang.brigadier.Message message, ) { return new yarnwrap.text.Text(net.minecraft.text.Text.of(message)); }
// public yarnwrap.text.Text of(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.text.Text(wrapperContained.of(pos.wrapperContained)); }
// public static yarnwrap.text.Text of(yarnwrap.util.math.ChunkPos pos, ) { return new yarnwrap.text.Text(net.minecraft.text.Text.of(pos.wrapperContained)); }
// public yarnwrap.text.Text of(java.util.Date date) { return new yarnwrap.text.Text(wrapperContained.of(date)); }
// public static yarnwrap.text.Text of(java.util.Date date, ) { return new yarnwrap.text.Text(net.minecraft.text.Text.of(date)); }
// public yarnwrap.text.Text of(java.util.UUID uuid) { return new yarnwrap.text.Text(wrapperContained.of(uuid)); }
// public static yarnwrap.text.Text of(java.util.UUID uuid, ) { return new yarnwrap.text.Text(net.minecraft.text.Text.of(uuid)); }
// public yarnwrap.text.MutableText stringifiedTranslatable(java.lang.String key,java.lang.Object[] args) { return new yarnwrap.text.MutableText(wrapperContained.stringifiedTranslatable(key,args)); }
// public static yarnwrap.text.MutableText stringifiedTranslatable(java.lang.String key,java.lang.Object[] args, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.stringifiedTranslatable(key,args)); }
public java.lang.String getLiteralString() { return wrapperContained.getLiteralString(); }
// public static java.lang.String getLiteralString() { return net.minecraft.text.Text.getLiteralString(); }
// public yarnwrap.text.Text of(java.net.URI uri) { return new yarnwrap.text.Text(wrapperContained.of(uri)); }
// public static yarnwrap.text.Text of(java.net.URI uri, ) { return new yarnwrap.text.Text(net.minecraft.text.Text.of(uri)); }
// public yarnwrap.text.MutableText score(yarnwrap.text.ParsedSelector selector,java.lang.String objective) { return new yarnwrap.text.MutableText(wrapperContained.score(selector.wrapperContained,objective)); }
// public static yarnwrap.text.MutableText score(yarnwrap.text.ParsedSelector selector,java.lang.String objective, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Text.score(selector.wrapperContained,objective)); }

}