package yarnwrap.client.resource.language;
public class LanguageDefinition { public net.minecraft.client.resource.language.LanguageDefinition wrapperContained; public LanguageDefinition(net.minecraft.client.resource.language.LanguageDefinition wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rightToLeft() { return wrapperContained.rightToLeft; }
// public void rightToLeft(boolean value) { wrapperContained.rightToLeft = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public LanguageDefinition(java.lang.String code,java.lang.String region) { this.wrapperContained = new net.minecraft.client.resource.language.LanguageDefinition(code,region); }
// public boolean rightToLeft() { return wrapperContained.rightToLeft(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(wrapperContained.getDisplayText()); }
// public com.mojang.datafixers.kinds.App method_48304(Object instance) { return wrapperContained.method_48304(instance); }

}