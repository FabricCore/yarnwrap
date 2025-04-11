package yarnwrap.text;
public class KeybindTextContent { public net.minecraft.text.KeybindTextContent wrapperContained; public KeybindTextContent(net.minecraft.text.KeybindTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String key() { return wrapperContained.key; }
// public void key(java.lang.String value) { wrapperContained.key = value; }
// public java.util.function.Supplier translated() { return wrapperContained.translated; }
// public void translated(java.util.function.Supplier value) { wrapperContained.translated = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
public KeybindTextContent(java.lang.String key) { this.wrapperContained = new net.minecraft.text.KeybindTextContent(key); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.lang.String getKey() { return wrapperContained.getKey(); }
// public yarnwrap.text.Text getTranslated() { return new yarnwrap.text.Text(wrapperContained.getTranslated()); }
// public com.mojang.datafixers.kinds.App method_54228(Object instance) { return wrapperContained.method_54228(instance); }
// public java.lang.String method_54229(yarnwrap.text.KeybindTextContent content) { return wrapperContained.method_54229(content.wrapperContained); }

}