package yarnwrap.client.resource.language;
public class LanguageManager { public net.minecraft.client.resource.language.LanguageManager wrapperContained; public LanguageManager(net.minecraft.client.resource.language.LanguageManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.language.LanguageDefinition ENGLISH_US() { return new yarnwrap.client.resource.language.LanguageDefinition(wrapperContained.ENGLISH_US); }
// public void ENGLISH_US(yarnwrap.client.resource.language.LanguageDefinition value) { wrapperContained.ENGLISH_US = value.wrapperContained; }
// public java.util.function.Consumer reloadCallback() { return wrapperContained.reloadCallback; }
// public void reloadCallback(java.util.function.Consumer value) { wrapperContained.reloadCallback = value; }
// public java.lang.String currentLanguageCode() { return wrapperContained.currentLanguageCode; }
// public void currentLanguageCode(java.lang.String value) { wrapperContained.currentLanguageCode = value; }
// public java.util.Map languageDefs() { return wrapperContained.languageDefs; }
// public void languageDefs(java.util.Map value) { wrapperContained.languageDefs = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map loadAvailableLanguages(java.util.stream.Stream packs) { return wrapperContained.loadAvailableLanguages(packs); }
public java.util.SortedMap getAllLanguages() { return wrapperContained.getAllLanguages(); }
public void setLanguage(java.lang.String languageCode) { wrapperContained.setLanguage(languageCode); }
public yarnwrap.client.resource.language.LanguageDefinition getLanguage(java.lang.String code) { return new yarnwrap.client.resource.language.LanguageDefinition(wrapperContained.getLanguage(code)); }
public java.lang.String getLanguage() { return wrapperContained.getLanguage(); }

}