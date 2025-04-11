package yarnwrap.client.resource.language;
public class LanguageDefinition { public net.minecraft.client.resource.language.LanguageDefinition wrapperContained; public LanguageDefinition(net.minecraft.client.resource.language.LanguageDefinition wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rightToLeft() { return wrapperContained.rightToLeft; }
// public void rightToLeft(boolean value) { wrapperContained.rightToLeft = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public boolean rightToLeft() { return wrapperContained.rightToLeft(); }
public yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(wrapperContained.getDisplayText()); }

}