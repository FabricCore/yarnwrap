package yarnwrap.text;
public class KeybindTextContent { public net.minecraft.text.KeybindTextContent wrapperContained; public KeybindTextContent(net.minecraft.text.KeybindTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String key() { return wrapperContained.key; }
// public java.util.function.Supplier translated() { return wrapperContained.translated; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object TYPE() { return wrapperContained.TYPE; }
public java.lang.String getKey() { return wrapperContained.getKey(); }
// public yarnwrap.text.Text getTranslated() { return new yarnwrap.text.Text(wrapperContained.getTranslated()); }

}