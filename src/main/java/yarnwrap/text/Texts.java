package yarnwrap.text;
public class Texts { public net.minecraft.text.Texts wrapperContained; public Texts(net.minecraft.text.Texts wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String DEFAULT_SEPARATOR() { return wrapperContained.DEFAULT_SEPARATOR; }
// public void DEFAULT_SEPARATOR(java.lang.String value) { wrapperContained.DEFAULT_SEPARATOR = value; }
public static java.lang.String DEFAULT_SEPARATOR() { return net.minecraft.text.Texts.DEFAULT_SEPARATOR; }
// public static void DEFAULT_SEPARATOR(java.lang.String value, ) { net.minecraft.text.Texts.DEFAULT_SEPARATOR = value; }

// public yarnwrap.text.Text GRAY_DEFAULT_SEPARATOR_TEXT() { return new yarnwrap.text.Text(wrapperContained.GRAY_DEFAULT_SEPARATOR_TEXT); }
// public void GRAY_DEFAULT_SEPARATOR_TEXT(yarnwrap.text.Text value) { wrapperContained.GRAY_DEFAULT_SEPARATOR_TEXT = value.wrapperContained; }
public static yarnwrap.text.Text GRAY_DEFAULT_SEPARATOR_TEXT() { return new yarnwrap.text.Text(net.minecraft.text.Texts.GRAY_DEFAULT_SEPARATOR_TEXT); }
// public static void GRAY_DEFAULT_SEPARATOR_TEXT(yarnwrap.text.Text value, ) { net.minecraft.text.Texts.GRAY_DEFAULT_SEPARATOR_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text DEFAULT_SEPARATOR_TEXT() { return new yarnwrap.text.Text(wrapperContained.DEFAULT_SEPARATOR_TEXT); }
// public void DEFAULT_SEPARATOR_TEXT(yarnwrap.text.Text value) { wrapperContained.DEFAULT_SEPARATOR_TEXT = value.wrapperContained; }
public static yarnwrap.text.Text DEFAULT_SEPARATOR_TEXT() { return new yarnwrap.text.Text(net.minecraft.text.Texts.DEFAULT_SEPARATOR_TEXT); }
// public static void DEFAULT_SEPARATOR_TEXT(yarnwrap.text.Text value, ) { net.minecraft.text.Texts.DEFAULT_SEPARATOR_TEXT = value.wrapperContained; }

// public yarnwrap.text.MutableText parse(yarnwrap.server.command.ServerCommandSource source,yarnwrap.text.Text text,yarnwrap.entity.Entity sender,int depth) { return new yarnwrap.text.MutableText(wrapperContained.parse(source.wrapperContained,text.wrapperContained,sender.wrapperContained,depth)); }
// public static yarnwrap.text.MutableText parse(yarnwrap.server.command.ServerCommandSource source,yarnwrap.text.Text text,yarnwrap.entity.Entity sender,int depth, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Texts.parse(source.wrapperContained,text.wrapperContained,sender.wrapperContained,depth)); }
// public yarnwrap.text.Text toText(com.mojang.brigadier.Message message) { return new yarnwrap.text.Text(wrapperContained.toText(message)); }
// public static yarnwrap.text.Text toText(com.mojang.brigadier.Message message, ) { return new yarnwrap.text.Text(net.minecraft.text.Texts.toText(message)); }
// public yarnwrap.text.Text join(java.util.Collection elements,java.util.function.Function transformer) { return new yarnwrap.text.Text(wrapperContained.join(elements,transformer)); }
// public static yarnwrap.text.Text join(java.util.Collection elements,java.util.function.Function transformer, ) { return new yarnwrap.text.Text(net.minecraft.text.Texts.join(elements,transformer)); }
// public yarnwrap.text.MutableText bracketed(yarnwrap.text.Text text) { return new yarnwrap.text.MutableText(wrapperContained.bracketed(text.wrapperContained)); }
// public static yarnwrap.text.MutableText bracketed(yarnwrap.text.Text text, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Texts.bracketed(text.wrapperContained)); }
// public yarnwrap.text.Text method_10886(java.lang.String string) { return new yarnwrap.text.Text(wrapperContained.method_10886(string)); }
// public static yarnwrap.text.Text method_10886(java.lang.String string, ) { return new yarnwrap.text.Text(net.minecraft.text.Texts.method_10886(string)); }
// public yarnwrap.text.Text joinOrdered(java.util.Collection elements,java.util.function.Function transformer) { return new yarnwrap.text.Text(wrapperContained.joinOrdered(elements,transformer)); }
// public static yarnwrap.text.Text joinOrdered(java.util.Collection elements,java.util.function.Function transformer, ) { return new yarnwrap.text.Text(net.minecraft.text.Texts.joinOrdered(elements,transformer)); }
// public yarnwrap.text.Text joinOrdered(java.util.Collection strings) { return new yarnwrap.text.Text(wrapperContained.joinOrdered(strings)); }
// public static yarnwrap.text.Text joinOrdered(java.util.Collection strings, ) { return new yarnwrap.text.Text(net.minecraft.text.Texts.joinOrdered(strings)); }
// public yarnwrap.text.MutableText setStyleIfAbsent(yarnwrap.text.MutableText text,yarnwrap.text.Style style) { return new yarnwrap.text.MutableText(wrapperContained.setStyleIfAbsent(text.wrapperContained,style.wrapperContained)); }
// public static yarnwrap.text.MutableText setStyleIfAbsent(yarnwrap.text.MutableText text,yarnwrap.text.Style style, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Texts.setStyleIfAbsent(text.wrapperContained,style.wrapperContained)); }
// public yarnwrap.text.Style parseStyle(yarnwrap.server.command.ServerCommandSource source,yarnwrap.text.Style style,yarnwrap.entity.Entity sender,int depth) { return new yarnwrap.text.Style(wrapperContained.parseStyle(source.wrapperContained,style.wrapperContained,sender.wrapperContained,depth)); }
// public static yarnwrap.text.Style parseStyle(yarnwrap.server.command.ServerCommandSource source,yarnwrap.text.Style style,yarnwrap.entity.Entity sender,int depth, ) { return new yarnwrap.text.Style(net.minecraft.text.Texts.parseStyle(source.wrapperContained,style.wrapperContained,sender.wrapperContained,depth)); }
// public java.util.Optional parse(yarnwrap.server.command.ServerCommandSource source,java.util.Optional text,yarnwrap.entity.Entity sender,int depth) { return wrapperContained.parse(source.wrapperContained,text,sender.wrapperContained,depth); }
// public static java.util.Optional parse(yarnwrap.server.command.ServerCommandSource source,java.util.Optional text,yarnwrap.entity.Entity sender,int depth, ) { return net.minecraft.text.Texts.parse(source.wrapperContained,text,sender.wrapperContained,depth); }
// public yarnwrap.text.MutableText join(java.util.Collection elements,java.util.Optional separator,java.util.function.Function transformer) { return new yarnwrap.text.MutableText(wrapperContained.join(elements,separator,transformer)); }
// public static yarnwrap.text.MutableText join(java.util.Collection elements,java.util.Optional separator,java.util.function.Function transformer, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Texts.join(elements,separator,transformer)); }
// public yarnwrap.text.MutableText join(java.util.Collection elements,yarnwrap.text.Text separator,java.util.function.Function transformer) { return new yarnwrap.text.MutableText(wrapperContained.join(elements,separator.wrapperContained,transformer)); }
// public static yarnwrap.text.MutableText join(java.util.Collection elements,yarnwrap.text.Text separator,java.util.function.Function transformer, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Texts.join(elements,separator.wrapperContained,transformer)); }
// public yarnwrap.text.Text join(java.util.Collection texts,yarnwrap.text.Text separator) { return new yarnwrap.text.Text(wrapperContained.join(texts,separator.wrapperContained)); }
// public static yarnwrap.text.Text join(java.util.Collection texts,yarnwrap.text.Text separator, ) { return new yarnwrap.text.Text(net.minecraft.text.Texts.join(texts,separator.wrapperContained)); }
// public boolean hasTranslation(yarnwrap.text.Text text) { return wrapperContained.hasTranslation(text.wrapperContained); }
// public static boolean hasTranslation(yarnwrap.text.Text text, ) { return net.minecraft.text.Texts.hasTranslation(text.wrapperContained); }
// public yarnwrap.text.MutableText bracketedCopyable(java.lang.String string) { return new yarnwrap.text.MutableText(wrapperContained.bracketedCopyable(string)); }
// public static yarnwrap.text.MutableText bracketedCopyable(java.lang.String string, ) { return new yarnwrap.text.MutableText(net.minecraft.text.Texts.bracketedCopyable(string)); }
// public yarnwrap.text.Style method_47524(java.lang.String style) { return new yarnwrap.text.Style(wrapperContained.method_47524(style)); }
// public static yarnwrap.text.Style method_47524(java.lang.String style, ) { return new yarnwrap.text.Style(net.minecraft.text.Texts.method_47524(style)); }

}