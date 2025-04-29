package yarnwrap.text;
public class KeybindTextContent { public net.minecraft.text.KeybindTextContent wrapperContained; public KeybindTextContent(net.minecraft.text.KeybindTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String key() { return wrapperContained.key; }
// public void key(java.lang.String value) { wrapperContained.key = value; }
// public static java.lang.String key() { return net.minecraft.text.KeybindTextContent.key; }
// public static void key(java.lang.String value, ) { net.minecraft.text.KeybindTextContent.key = value; }

// public java.util.function.Supplier translated() { return wrapperContained.translated; }
// public void translated(java.util.function.Supplier value) { wrapperContained.translated = value; }
// public static java.util.function.Supplier translated() { return net.minecraft.text.KeybindTextContent.translated; }
// public static void translated(java.util.function.Supplier value, ) { net.minecraft.text.KeybindTextContent.translated = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.text.KeybindTextContent.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.text.KeybindTextContent.CODEC = value; }

// public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public static Object TYPE() { return net.minecraft.text.KeybindTextContent.TYPE; }
// // public static void TYPE(Object value, ) { net.minecraft.text.KeybindTextContent.TYPE = value; }

public KeybindTextContent(java.lang.String key) { this.wrapperContained = new net.minecraft.text.KeybindTextContent(key); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.text.KeybindTextContent.equals(o); }
public java.lang.String getKey() { return wrapperContained.getKey(); }
// public static java.lang.String getKey() { return net.minecraft.text.KeybindTextContent.getKey(); }
// public yarnwrap.text.Text getTranslated() { return new yarnwrap.text.Text(wrapperContained.getTranslated()); }
// public static yarnwrap.text.Text getTranslated() { return new yarnwrap.text.Text(net.minecraft.text.KeybindTextContent.getTranslated()); }
// public com.mojang.datafixers.kinds.App method_54228(Object instance) { return wrapperContained.method_54228(instance); }
// public static com.mojang.datafixers.kinds.App method_54228(Object instance, ) { return net.minecraft.text.KeybindTextContent.method_54228(instance); }
// public java.lang.String method_54229(yarnwrap.text.KeybindTextContent content) { return wrapperContained.method_54229(content.wrapperContained); }
// public static java.lang.String method_54229(yarnwrap.text.KeybindTextContent content, ) { return net.minecraft.text.KeybindTextContent.method_54229(content.wrapperContained); }

}