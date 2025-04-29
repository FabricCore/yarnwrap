package yarnwrap.client.resource.language;
public class LanguageManager { public net.minecraft.client.resource.language.LanguageManager wrapperContained; public LanguageManager(net.minecraft.client.resource.language.LanguageManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.language.LanguageDefinition ENGLISH_US() { return new yarnwrap.client.resource.language.LanguageDefinition(wrapperContained.ENGLISH_US); }
// public void ENGLISH_US(yarnwrap.client.resource.language.LanguageDefinition value) { wrapperContained.ENGLISH_US = value.wrapperContained; }
// public static yarnwrap.client.resource.language.LanguageDefinition ENGLISH_US() { return new yarnwrap.client.resource.language.LanguageDefinition(net.minecraft.client.resource.language.LanguageManager.ENGLISH_US); }
// public static void ENGLISH_US(yarnwrap.client.resource.language.LanguageDefinition value, ) { net.minecraft.client.resource.language.LanguageManager.ENGLISH_US = value.wrapperContained; }

// public java.util.function.Consumer reloadCallback() { return wrapperContained.reloadCallback; }
// public void reloadCallback(java.util.function.Consumer value) { wrapperContained.reloadCallback = value; }
// public static java.util.function.Consumer reloadCallback() { return net.minecraft.client.resource.language.LanguageManager.reloadCallback; }
// public static void reloadCallback(java.util.function.Consumer value, ) { net.minecraft.client.resource.language.LanguageManager.reloadCallback = value; }

// public java.lang.String currentLanguageCode() { return wrapperContained.currentLanguageCode; }
// public void currentLanguageCode(java.lang.String value) { wrapperContained.currentLanguageCode = value; }
// public static java.lang.String currentLanguageCode() { return net.minecraft.client.resource.language.LanguageManager.currentLanguageCode; }
// public static void currentLanguageCode(java.lang.String value, ) { net.minecraft.client.resource.language.LanguageManager.currentLanguageCode = value; }

// public java.util.Map languageDefs() { return wrapperContained.languageDefs; }
// public void languageDefs(java.util.Map value) { wrapperContained.languageDefs = value; }
// public static java.util.Map languageDefs() { return net.minecraft.client.resource.language.LanguageManager.languageDefs; }
// public static void languageDefs(java.util.Map value, ) { net.minecraft.client.resource.language.LanguageManager.languageDefs = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.resource.language.LanguageManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.resource.language.LanguageManager.LOGGER = value; }

public LanguageManager(java.lang.String languageCode,java.util.function.Consumer reloadCallback) { this.wrapperContained = new net.minecraft.client.resource.language.LanguageManager(languageCode,reloadCallback); }
// public void method_29392(java.util.Map pack) { wrapperContained.method_29392(pack); }
// public static void method_29392(java.util.Map pack, ) { net.minecraft.client.resource.language.LanguageManager.method_29392(pack); }
// public java.util.Map loadAvailableLanguages(java.util.stream.Stream packs) { return wrapperContained.loadAvailableLanguages(packs); }
// public static java.util.Map loadAvailableLanguages(java.util.stream.Stream packs, ) { return net.minecraft.client.resource.language.LanguageManager.loadAvailableLanguages(packs); }
public java.util.SortedMap getAllLanguages() { return wrapperContained.getAllLanguages(); }
// public static java.util.SortedMap getAllLanguages() { return net.minecraft.client.resource.language.LanguageManager.getAllLanguages(); }
public void setLanguage(java.lang.String languageCode) { wrapperContained.setLanguage(languageCode); }
// public static void setLanguage(java.lang.String languageCode, ) { net.minecraft.client.resource.language.LanguageManager.setLanguage(languageCode); }
public yarnwrap.client.resource.language.LanguageDefinition getLanguage(java.lang.String code) { return new yarnwrap.client.resource.language.LanguageDefinition(wrapperContained.getLanguage(code)); }
// public static yarnwrap.client.resource.language.LanguageDefinition getLanguage(java.lang.String code, ) { return new yarnwrap.client.resource.language.LanguageDefinition(net.minecraft.client.resource.language.LanguageManager.getLanguage(code)); }
public java.lang.String getLanguage() { return wrapperContained.getLanguage(); }
// public static java.lang.String getLanguage() { return net.minecraft.client.resource.language.LanguageManager.getLanguage(); }

}