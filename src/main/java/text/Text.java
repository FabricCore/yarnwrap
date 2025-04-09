package yarnwrap.text;
public class Text { public net.minecraft.text.Text wrapperContained; public Text(net.minecraft.text.Text wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.TextContent getContent() { return new yarnwrap.text.TextContent(wrapperContained.getContent()); }
public java.util.List getSiblings() { return wrapperContained.getSiblings(); }
public java.lang.String asTruncatedString(int length) { return wrapperContained.asTruncatedString(length); }
public yarnwrap.text.Style getStyle() { return new yarnwrap.text.Style(wrapperContained.getStyle()); }
public yarnwrap.text.MutableText copy() { return new yarnwrap.text.MutableText(wrapperContained.copy()); }
public yarnwrap.text.MutableText copyContentOnly() { return new yarnwrap.text.MutableText(wrapperContained.copyContentOnly()); }
// public yarnwrap.text.Text of(java.lang.String string) { return new yarnwrap.text.Text(wrapperContained.of(string)); }
public yarnwrap.text.OrderedText asOrderedText() { return new yarnwrap.text.OrderedText(wrapperContained.asOrderedText()); }
public java.util.List getWithStyle(yarnwrap.text.Style style) { return wrapperContained.getWithStyle(style.wrapperContained); }
// public yarnwrap.text.MutableText score(java.lang.String name,java.lang.String objective) { return new yarnwrap.text.MutableText(wrapperContained.score(name,objective)); }
// public yarnwrap.text.MutableText selector(java.lang.String pattern,java.util.Optional separator) { return new yarnwrap.text.MutableText(wrapperContained.selector(pattern,separator)); }
// public yarnwrap.text.MutableText nbt(java.lang.String rawPath,boolean interpret,java.util.Optional separator,yarnwrap.text.NbtDataSource dataSource) { return new yarnwrap.text.MutableText(wrapperContained.nbt(rawPath,interpret,separator,dataSource.wrapperContained)); }
// public yarnwrap.text.MutableText translatable(java.lang.String key,java.lang.Object[] args) { return new yarnwrap.text.MutableText(wrapperContained.translatable(key,args)); }
// public yarnwrap.text.MutableText literal(java.lang.String string) { return new yarnwrap.text.MutableText(wrapperContained.literal(string)); }
// public yarnwrap.text.MutableText translatable(java.lang.String key) { return new yarnwrap.text.MutableText(wrapperContained.translatable(key)); }
// public yarnwrap.text.MutableText keybind(java.lang.String string) { return new yarnwrap.text.MutableText(wrapperContained.keybind(string)); }
// public yarnwrap.text.MutableText empty() { return new yarnwrap.text.MutableText(wrapperContained.empty()); }
public boolean contains(yarnwrap.text.Text text) { return wrapperContained.contains(text.wrapperContained); }
public java.util.List withoutStyle() { return wrapperContained.withoutStyle(); }
// public yarnwrap.text.MutableText translatableWithFallback(java.lang.String key,java.lang.String fallback) { return new yarnwrap.text.MutableText(wrapperContained.translatableWithFallback(key,fallback)); }
// public yarnwrap.text.MutableText translatableWithFallback(java.lang.String key,java.lang.String fallback,java.lang.Object[] args) { return new yarnwrap.text.MutableText(wrapperContained.translatableWithFallback(key,fallback,args)); }
// public yarnwrap.text.Text of(yarnwrap.util.Identifier id) { return new yarnwrap.text.Text(wrapperContained.of(id.wrapperContained)); }
// public yarnwrap.text.Text of(com.mojang.brigadier.Message message) { return new yarnwrap.text.Text(wrapperContained.of(message)); }
// public yarnwrap.text.Text of(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.text.Text(wrapperContained.of(pos.wrapperContained)); }
// public yarnwrap.text.Text of(java.util.Date date) { return new yarnwrap.text.Text(wrapperContained.of(date)); }
// public yarnwrap.text.Text of(java.util.UUID uuid) { return new yarnwrap.text.Text(wrapperContained.of(uuid)); }
// public yarnwrap.text.MutableText stringifiedTranslatable(java.lang.String key,java.lang.Object[] args) { return new yarnwrap.text.MutableText(wrapperContained.stringifiedTranslatable(key,args)); }
public java.lang.String getLiteralString() { return wrapperContained.getLiteralString(); }
// public yarnwrap.text.Text of(java.net.URI uri) { return new yarnwrap.text.Text(wrapperContained.of(uri)); }

}