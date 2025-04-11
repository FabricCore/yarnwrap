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
public java.lang.String getKey() { return wrapperContained.getKey(); }
// public yarnwrap.text.Text getTranslated() { return new yarnwrap.text.Text(wrapperContained.getTranslated()); }

}