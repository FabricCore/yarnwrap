package yarnwrap.client.resource.language;
public class I18n { public net.minecraft.client.resource.language.I18n wrapperContained; public I18n(net.minecraft.client.resource.language.I18n wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Language language() { return new yarnwrap.util.Language(wrapperContained.language); }
// public void setLanguage(yarnwrap.util.Language language) { wrapperContained.setLanguage(language.wrapperContained); }
public java.lang.String translate(java.lang.String key,java.lang.Object[] args) { return wrapperContained.translate(key,args); }
public boolean hasTranslation(java.lang.String key) { return wrapperContained.hasTranslation(key); }

}