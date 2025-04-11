package yarnwrap.text;
public class KeybindTranslations { public net.minecraft.text.KeybindTranslations wrapperContained; public KeybindTranslations(net.minecraft.text.KeybindTranslations wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function factory() { return wrapperContained.factory; }
// public void factory(java.util.function.Function value) { wrapperContained.factory = value; }
// public java.util.function.Supplier method_43481(java.lang.String key) { return wrapperContained.method_43481(key); }
public void setFactory(java.util.function.Function factory) { wrapperContained.setFactory(factory); }

}