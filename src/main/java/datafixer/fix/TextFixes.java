package yarnwrap.datafixer.fix;
public class TextFixes { public net.minecraft.datafixer.fix.TextFixes wrapperContained; public TextFixes(net.minecraft.datafixer.fix.TextFixes wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String EMPTY_TEXT() { return wrapperContained.EMPTY_TEXT; }
public com.mojang.serialization.Dynamic fixText(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixText(dynamic); }
public com.mojang.serialization.Dynamic empty(com.mojang.serialization.DynamicOps ops) { return wrapperContained.empty(ops); }
public com.mojang.serialization.Dynamic text(com.mojang.serialization.DynamicOps ops,java.lang.String string) { return wrapperContained.text(ops,string); }
// public java.lang.String text(java.lang.String string) { return wrapperContained.text(string); }
public com.mojang.serialization.Dynamic translate(com.mojang.serialization.DynamicOps ops,java.lang.String key) { return wrapperContained.translate(ops,key); }
public com.mojang.serialization.Dynamic text(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.text(dynamic); }
public java.util.Optional getTranslate(java.lang.String json) { return wrapperContained.getTranslate(json); }

}