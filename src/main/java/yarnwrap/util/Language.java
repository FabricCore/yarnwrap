package yarnwrap.util;
public class Language { public net.minecraft.util.Language wrapperContained; public Language(net.minecraft.util.Language wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Language instance() { return new yarnwrap.util.Language(wrapperContained.instance); }
// public void instance(yarnwrap.util.Language value) { wrapperContained.instance = value.wrapperContained; }
// public static yarnwrap.util.Language instance() { return new yarnwrap.util.Language(net.minecraft.util.Language.instance); }
// public static void instance(yarnwrap.util.Language value, ) { net.minecraft.util.Language.instance = value.wrapperContained; }

// public java.util.regex.Pattern TOKEN_PATTERN() { return wrapperContained.TOKEN_PATTERN; }
// public void TOKEN_PATTERN(java.util.regex.Pattern value) { wrapperContained.TOKEN_PATTERN = value; }
// public static java.util.regex.Pattern TOKEN_PATTERN() { return net.minecraft.util.Language.TOKEN_PATTERN; }
// public static void TOKEN_PATTERN(java.util.regex.Pattern value, ) { net.minecraft.util.Language.TOKEN_PATTERN = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.Language.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.Language.LOGGER = value; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.util.Language.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.util.Language.GSON = value; }

// public java.lang.String DEFAULT_LANGUAGE() { return wrapperContained.DEFAULT_LANGUAGE; }
// public void DEFAULT_LANGUAGE(java.lang.String value) { wrapperContained.DEFAULT_LANGUAGE = value; }
public static java.lang.String DEFAULT_LANGUAGE() { return net.minecraft.util.Language.DEFAULT_LANGUAGE; }
// public static void DEFAULT_LANGUAGE(java.lang.String value, ) { net.minecraft.util.Language.DEFAULT_LANGUAGE = value; }

public boolean hasTranslation(java.lang.String key) { return wrapperContained.hasTranslation(key); }
// public static boolean hasTranslation(java.lang.String key, ) { return net.minecraft.util.Language.hasTranslation(key); }
public java.lang.String get(java.lang.String key,java.lang.String fallback) { return wrapperContained.get(key,fallback); }
// public static java.lang.String get(java.lang.String key,java.lang.String fallback, ) { return net.minecraft.util.Language.get(key,fallback); }
// public yarnwrap.util.Language getInstance() { return new yarnwrap.util.Language(wrapperContained.getInstance()); }
public static yarnwrap.util.Language getInstance() { return new yarnwrap.util.Language(net.minecraft.util.Language.getInstance()); }
// public void load(java.io.InputStream inputStream,java.util.function.BiConsumer entryConsumer) { wrapperContained.load(inputStream,entryConsumer); }
// public static void load(java.io.InputStream inputStream,java.util.function.BiConsumer entryConsumer, ) { net.minecraft.util.Language.load(inputStream,entryConsumer); }
// public void setInstance(yarnwrap.util.Language language) { wrapperContained.setInstance(language.wrapperContained); }
// public static void setInstance(yarnwrap.util.Language language, ) { net.minecraft.util.Language.setInstance(language.wrapperContained); }
public boolean isRightToLeft() { return wrapperContained.isRightToLeft(); }
// public static boolean isRightToLeft() { return net.minecraft.util.Language.isRightToLeft(); }
// public yarnwrap.util.Language create() { return new yarnwrap.util.Language(wrapperContained.create()); }
// public static yarnwrap.util.Language create() { return new yarnwrap.util.Language(net.minecraft.util.Language.create()); }
public java.util.List reorder(java.util.List texts) { return wrapperContained.reorder(texts); }
// public static java.util.List reorder(java.util.List texts, ) { return net.minecraft.util.Language.reorder(texts); }
public yarnwrap.text.OrderedText reorder(yarnwrap.text.StringVisitable text) { return new yarnwrap.text.OrderedText(wrapperContained.reorder(text.wrapperContained)); }
// public static yarnwrap.text.OrderedText reorder(yarnwrap.text.StringVisitable text, ) { return new yarnwrap.text.OrderedText(net.minecraft.util.Language.reorder(text.wrapperContained)); }
public java.lang.String get(java.lang.String key) { return wrapperContained.get(key); }
// public static java.lang.String get(java.lang.String key, ) { return net.minecraft.util.Language.get(key); }
// public void load(java.util.function.BiConsumer entryConsumer,java.lang.String path) { wrapperContained.load(entryConsumer,path); }
// public static void load(java.util.function.BiConsumer entryConsumer,java.lang.String path, ) { net.minecraft.util.Language.load(entryConsumer,path); }

}