package yarnwrap.text;
public class PlainTextContent { public net.minecraft.text.PlainTextContent wrapperContained; public PlainTextContent(net.minecraft.text.PlainTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.text.PlainTextContent.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.text.PlainTextContent.CODEC = value; }

// public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public static Object TYPE() { return net.minecraft.text.PlainTextContent.TYPE; }
// // public static void TYPE(Object value, ) { net.minecraft.text.PlainTextContent.TYPE = value; }

// public yarnwrap.text.PlainTextContent EMPTY() { return new yarnwrap.text.PlainTextContent(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.PlainTextContent value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.text.PlainTextContent EMPTY() { return new yarnwrap.text.PlainTextContent(net.minecraft.text.PlainTextContent.EMPTY); }
// public static void EMPTY(yarnwrap.text.PlainTextContent value, ) { net.minecraft.text.PlainTextContent.EMPTY = value.wrapperContained; }

public java.lang.String string() { return wrapperContained.string(); }
// public static java.lang.String string() { return net.minecraft.text.PlainTextContent.string(); }
// public com.mojang.datafixers.kinds.App method_54231(Object instance) { return wrapperContained.method_54231(instance); }
// public static com.mojang.datafixers.kinds.App method_54231(Object instance, ) { return net.minecraft.text.PlainTextContent.method_54231(instance); }
// public yarnwrap.text.PlainTextContent of(java.lang.String string) { return new yarnwrap.text.PlainTextContent(wrapperContained.of(string)); }
// public static yarnwrap.text.PlainTextContent of(java.lang.String string, ) { return new yarnwrap.text.PlainTextContent(net.minecraft.text.PlainTextContent.of(string)); }

}