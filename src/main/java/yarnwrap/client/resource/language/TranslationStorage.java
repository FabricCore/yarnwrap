package yarnwrap.client.resource.language;
public class TranslationStorage { public net.minecraft.client.resource.language.TranslationStorage wrapperContained; public TranslationStorage(net.minecraft.client.resource.language.TranslationStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean rightToLeft() { return wrapperContained.rightToLeft; }
// public void rightToLeft(boolean value) { wrapperContained.rightToLeft = value; }
// public java.util.Map translations() { return wrapperContained.translations; }
// public void translations(java.util.Map value) { wrapperContained.translations = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public TranslationStorage(java.util.Map translations,boolean rightToLeft) { this.wrapperContained = new net.minecraft.client.resource.language.TranslationStorage(translations,rightToLeft); }
public yarnwrap.client.resource.language.TranslationStorage load(yarnwrap.resource.ResourceManager resourceManager,java.util.List definitions,boolean rightToLeft) { return new yarnwrap.client.resource.language.TranslationStorage(wrapperContained.load(resourceManager.wrapperContained,definitions,rightToLeft)); }
// public void load(java.lang.String langCode,java.util.List resourceRefs,java.util.Map translations) { wrapperContained.load(langCode,resourceRefs,translations); }

}