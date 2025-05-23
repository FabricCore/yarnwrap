package yarnwrap.text;
public class SelectorTextContent { public net.minecraft.text.SelectorTextContent wrapperContained; public SelectorTextContent(net.minecraft.text.SelectorTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.ParsedSelector selector() { return new yarnwrap.text.ParsedSelector(wrapperContained.selector); }
// public void selector(yarnwrap.text.ParsedSelector value) { wrapperContained.selector = value.wrapperContained; }
// public static yarnwrap.text.ParsedSelector selector() { return new yarnwrap.text.ParsedSelector(net.minecraft.text.SelectorTextContent.selector); }
// public static void selector(yarnwrap.text.ParsedSelector value, ) { net.minecraft.text.SelectorTextContent.selector = value.wrapperContained; }

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

// public SelectorTextContent(yarnwrap.text.ParsedSelector separator) { this.wrapperContained = new net.minecraft.text.SelectorTextContent(separator.wrapperContained); }
// public yarnwrap.text.ParsedSelector selector() { return new yarnwrap.text.ParsedSelector(wrapperContained.selector()); }
// // public static yarnwrap.text.ParsedSelector selector() { return new yarnwrap.text.ParsedSelector(net.minecraft.text.SelectorTextContent.selector()); }
// public java.util.Optional separator() { return wrapperContained.separator(); }
// // public static java.util.Optional separator() { return net.minecraft.text.SelectorTextContent.separator(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.text.SelectorTextContent.equals(o); }
// public com.mojang.datafixers.kinds.App method_54234(Object instance) { return wrapperContained.method_54234(instance); }
// public static com.mojang.datafixers.kinds.App method_54234(Object instance, ) { return net.minecraft.text.SelectorTextContent.method_54234(instance); }

}