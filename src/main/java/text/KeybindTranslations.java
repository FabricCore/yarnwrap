package yarnwrap.text;
public class KeybindTranslations { public net.minecraft.text.KeybindTranslations wrapperContained; public KeybindTranslations(net.minecraft.text.KeybindTranslations wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function factory() { return wrapperContained.factory; }
public void setFactory(java.util.function.Function factory) { wrapperContained.setFactory(factory); }

}