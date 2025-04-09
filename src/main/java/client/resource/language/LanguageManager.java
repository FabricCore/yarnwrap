package yarnwrap.client.resource.language;
public class LanguageManager { public net.minecraft.client.resource.language.LanguageManager wrapperContained; public LanguageManager(net.minecraft.client.resource.language.LanguageManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.language.LanguageDefinition ENGLISH_US() { return new yarnwrap.client.resource.language.LanguageDefinition(wrapperContained.ENGLISH_US); }
// public java.util.function.Consumer reloadCallback() { return wrapperContained.reloadCallback; }
// public java.lang.String currentLanguageCode() { return wrapperContained.currentLanguageCode; }
// public java.util.Map languageDefs() { return wrapperContained.languageDefs; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map loadAvailableLanguages(java.util.stream.Stream packs) { return wrapperContained.loadAvailableLanguages(packs); }
public java.util.SortedMap getAllLanguages() { return wrapperContained.getAllLanguages(); }
public void setLanguage(java.lang.String languageCode) { wrapperContained.setLanguage(languageCode); }
public yarnwrap.client.resource.language.LanguageDefinition getLanguage(java.lang.String code) { return new yarnwrap.client.resource.language.LanguageDefinition(wrapperContained.getLanguage(code)); }
public java.lang.String getLanguage() { return wrapperContained.getLanguage(); }

}