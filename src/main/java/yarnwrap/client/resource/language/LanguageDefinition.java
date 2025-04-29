package yarnwrap.client.resource.language;
public class LanguageDefinition { public net.minecraft.client.resource.language.LanguageDefinition wrapperContained; public LanguageDefinition(net.minecraft.client.resource.language.LanguageDefinition wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rightToLeft() { return wrapperContained.rightToLeft; }
// public void rightToLeft(boolean value) { wrapperContained.rightToLeft = value; }
// public static boolean rightToLeft() { return net.minecraft.client.resource.language.LanguageDefinition.rightToLeft; }
// public static void rightToLeft(boolean value, ) { net.minecraft.client.resource.language.LanguageDefinition.rightToLeft = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.resource.language.LanguageDefinition.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.resource.language.LanguageDefinition.CODEC = value; }

// public LanguageDefinition(java.lang.String code,java.lang.String region) { this.wrapperContained = new net.minecraft.client.resource.language.LanguageDefinition(code,region); }
// public boolean rightToLeft() { return wrapperContained.rightToLeft(); }
// // public static boolean rightToLeft() { return net.minecraft.client.resource.language.LanguageDefinition.rightToLeft(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.resource.language.LanguageDefinition.equals(o); }
public yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(wrapperContained.getDisplayText()); }
// public static yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(net.minecraft.client.resource.language.LanguageDefinition.getDisplayText()); }
// public com.mojang.datafixers.kinds.App method_48304(Object instance) { return wrapperContained.method_48304(instance); }
// public static com.mojang.datafixers.kinds.App method_48304(Object instance, ) { return net.minecraft.client.resource.language.LanguageDefinition.method_48304(instance); }

}