package yarnwrap.util;
public class Language { public net.minecraft.util.Language wrapperContained; public Language(net.minecraft.util.Language wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Language instance() { return new yarnwrap.util.Language(wrapperContained.instance); }
// public void instance(yarnwrap.util.Language value) { wrapperContained.instance = value.wrapperContained; }
// public java.util.regex.Pattern TOKEN_PATTERN() { return wrapperContained.TOKEN_PATTERN; }
// public void TOKEN_PATTERN(java.util.regex.Pattern value) { wrapperContained.TOKEN_PATTERN = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
public java.lang.String DEFAULT_LANGUAGE() { return wrapperContained.DEFAULT_LANGUAGE; }
// public void DEFAULT_LANGUAGE(java.lang.String value) { wrapperContained.DEFAULT_LANGUAGE = value; }
public yarnwrap.util.Language getInstance() { return new yarnwrap.util.Language(wrapperContained.getInstance()); }
public void load(java.io.InputStream inputStream,java.util.function.BiConsumer entryConsumer) { wrapperContained.load(inputStream,entryConsumer); }
public void setInstance(yarnwrap.util.Language language) { wrapperContained.setInstance(language.wrapperContained); }
public boolean isRightToLeft() { return wrapperContained.isRightToLeft(); }
// public yarnwrap.util.Language create() { return new yarnwrap.util.Language(wrapperContained.create()); }
public java.util.List reorder(java.util.List texts) { return wrapperContained.reorder(texts); }
public yarnwrap.text.OrderedText reorder(yarnwrap.text.StringVisitable text) { return new yarnwrap.text.OrderedText(wrapperContained.reorder(text.wrapperContained)); }
public boolean hasTranslation(java.lang.String key) { return wrapperContained.hasTranslation(key); }
public java.lang.String get(java.lang.String key,java.lang.String fallback) { return wrapperContained.get(key,fallback); }
public java.lang.String get(java.lang.String key) { return wrapperContained.get(key); }
// public void load(java.util.function.BiConsumer entryConsumer,java.lang.String path) { wrapperContained.load(entryConsumer,path); }

}