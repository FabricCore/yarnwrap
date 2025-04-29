package yarnwrap.text;
public class SelectorTextContent { public net.minecraft.text.SelectorTextContent wrapperContained; public SelectorTextContent(net.minecraft.text.SelectorTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String pattern() { return wrapperContained.pattern; }
// public void pattern(java.lang.String value) { wrapperContained.pattern = value; }
// public static java.lang.String pattern() { return net.minecraft.text.SelectorTextContent.pattern; }
// public static void pattern(java.lang.String value, ) { net.minecraft.text.SelectorTextContent.pattern = value; }

// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector); }
// public void selector(yarnwrap.command.EntitySelector value) { wrapperContained.selector = value.wrapperContained; }
// public static yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(net.minecraft.text.SelectorTextContent.selector); }
// public static void selector(yarnwrap.command.EntitySelector value, ) { net.minecraft.text.SelectorTextContent.selector = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.text.SelectorTextContent.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.text.SelectorTextContent.LOGGER = value; }

// public java.util.Optional separator() { return wrapperContained.separator; }
// public void separator(java.util.Optional value) { wrapperContained.separator = value; }
// public static java.util.Optional separator() { return net.minecraft.text.SelectorTextContent.separator; }
// public static void separator(java.util.Optional value, ) { net.minecraft.text.SelectorTextContent.separator = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.text.SelectorTextContent.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.text.SelectorTextContent.CODEC = value; }

// public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public static Object TYPE() { return net.minecraft.text.SelectorTextContent.TYPE; }
// // public static void TYPE(Object value, ) { net.minecraft.text.SelectorTextContent.TYPE = value; }

public SelectorTextContent(java.lang.String pattern,java.util.Optional separator) { this.wrapperContained = new net.minecraft.text.SelectorTextContent(pattern,separator); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.text.SelectorTextContent.equals(o); }
public java.lang.String getPattern() { return wrapperContained.getPattern(); }
// public static java.lang.String getPattern() { return net.minecraft.text.SelectorTextContent.getPattern(); }
public yarnwrap.command.EntitySelector getSelector() { return new yarnwrap.command.EntitySelector(wrapperContained.getSelector()); }
// public static yarnwrap.command.EntitySelector getSelector() { return new yarnwrap.command.EntitySelector(net.minecraft.text.SelectorTextContent.getSelector()); }
public java.util.Optional getSeparator() { return wrapperContained.getSeparator(); }
// public static java.util.Optional getSeparator() { return net.minecraft.text.SelectorTextContent.getSeparator(); }
// public yarnwrap.command.EntitySelector readSelector(java.lang.String pattern) { return new yarnwrap.command.EntitySelector(wrapperContained.readSelector(pattern)); }
// public static yarnwrap.command.EntitySelector readSelector(java.lang.String pattern, ) { return new yarnwrap.command.EntitySelector(net.minecraft.text.SelectorTextContent.readSelector(pattern)); }
// public com.mojang.datafixers.kinds.App method_54234(Object instance) { return wrapperContained.method_54234(instance); }
// public static com.mojang.datafixers.kinds.App method_54234(Object instance, ) { return net.minecraft.text.SelectorTextContent.method_54234(instance); }

}