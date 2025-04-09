package yarnwrap.client.resource.language;
public class TranslationStorage { public net.minecraft.client.resource.language.TranslationStorage wrapperContained; public TranslationStorage(net.minecraft.client.resource.language.TranslationStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rightToLeft() { return wrapperContained.rightToLeft; }
// public java.util.Map translations() { return wrapperContained.translations; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.resource.language.TranslationStorage load(yarnwrap.resource.ResourceManager resourceManager,java.util.List definitions,boolean rightToLeft) { return new yarnwrap.client.resource.language.TranslationStorage(wrapperContained.load(resourceManager.wrapperContained,definitions,rightToLeft)); }
// public void load(java.lang.String langCode,java.util.List resourceRefs,java.util.Map translations) { wrapperContained.load(langCode,resourceRefs,translations); }

}