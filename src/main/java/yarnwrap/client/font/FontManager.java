package yarnwrap.client.font;
public class FontManager { public net.minecraft.client.font.FontManager wrapperContained; public FontManager(net.minecraft.client.font.FontManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map fontStorages() { return wrapperContained.fontStorages; }
// public void fontStorages(java.util.Map value) { wrapperContained.fontStorages = value; }
// public static java.util.Map fontStorages() { return net.minecraft.client.font.FontManager.fontStorages; }
// public static void fontStorages(java.util.Map value, ) { net.minecraft.client.font.FontManager.fontStorages = value; }

// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public static yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(net.minecraft.client.font.FontManager.textureManager); }
// public static void textureManager(yarnwrap.client.texture.TextureManager value, ) { net.minecraft.client.font.FontManager.textureManager = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.font.FontManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.font.FontManager.LOGGER = value; }

// public yarnwrap.util.Identifier MISSING_STORAGE_ID() { return new yarnwrap.util.Identifier(wrapperContained.MISSING_STORAGE_ID); }
// public void MISSING_STORAGE_ID(yarnwrap.util.Identifier value) { wrapperContained.MISSING_STORAGE_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier MISSING_STORAGE_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.font.FontManager.MISSING_STORAGE_ID); }
// public static void MISSING_STORAGE_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.font.FontManager.MISSING_STORAGE_ID = value.wrapperContained; }

// public yarnwrap.client.font.FontStorage missingStorage() { return new yarnwrap.client.font.FontStorage(wrapperContained.missingStorage); }
// public void missingStorage(yarnwrap.client.font.FontStorage value) { wrapperContained.missingStorage = value.wrapperContained; }
// public static yarnwrap.client.font.FontStorage missingStorage() { return new yarnwrap.client.font.FontStorage(net.minecraft.client.font.FontManager.missingStorage); }
// public static void missingStorage(yarnwrap.client.font.FontStorage value, ) { net.minecraft.client.font.FontManager.missingStorage = value.wrapperContained; }

// public java.lang.String FONTS_JSON() { return wrapperContained.FONTS_JSON; }
// public void FONTS_JSON(java.lang.String value) { wrapperContained.FONTS_JSON = value; }
// public static java.lang.String FONTS_JSON() { return net.minecraft.client.font.FontManager.FONTS_JSON; }
// public static void FONTS_JSON(java.lang.String value, ) { net.minecraft.client.font.FontManager.FONTS_JSON = value; }

// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.client.font.FontManager.FINDER); }
// public static void FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.client.font.FontManager.FINDER = value.wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.client.font.FontManager.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.client.font.FontManager.GSON = value; }

// public java.util.List fonts() { return wrapperContained.fonts; }
// public void fonts(java.util.List value) { wrapperContained.fonts = value; }
// public static java.util.List fonts() { return net.minecraft.client.font.FontManager.fonts; }
// public static void fonts(java.util.List value, ) { net.minecraft.client.font.FontManager.fonts = value; }

// public yarnwrap.client.font.FontStorage currentStorage() { return new yarnwrap.client.font.FontStorage(wrapperContained.currentStorage); }
// public void currentStorage(yarnwrap.client.font.FontStorage value) { wrapperContained.currentStorage = value.wrapperContained; }
// public static yarnwrap.client.font.FontStorage currentStorage() { return new yarnwrap.client.font.FontStorage(net.minecraft.client.font.FontManager.currentStorage); }
// public static void currentStorage(yarnwrap.client.font.FontStorage value, ) { net.minecraft.client.font.FontManager.currentStorage = value.wrapperContained; }

public FontManager(yarnwrap.client.texture.TextureManager manager) { this.wrapperContained = new net.minecraft.client.font.FontManager(manager.wrapperContained); }
public yarnwrap.client.font.TextRenderer createTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.createTextRenderer()); }
// public static yarnwrap.client.font.TextRenderer createTextRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.font.FontManager.createTextRenderer()); }
// public void method_27540(yarnwrap.client.font.FontStorage fontStorage) { wrapperContained.method_27540(fontStorage.wrapperContained); }
// public static void method_27540(yarnwrap.client.font.FontStorage fontStorage, ) { net.minecraft.client.font.FontManager.method_27540(fontStorage.wrapperContained); }
public yarnwrap.client.font.TextRenderer createAdvanceValidatingTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.createAdvanceValidatingTextRenderer()); }
// public static yarnwrap.client.font.TextRenderer createAdvanceValidatingTextRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.font.FontManager.createAdvanceValidatingTextRenderer()); }
// public void method_51607(java.util.Set id,yarnwrap.util.Identifier fonts) { wrapperContained.method_51607(id,fonts.wrapperContained); }
// public static void method_51607(java.util.Set id,yarnwrap.util.Identifier fonts, ) { net.minecraft.client.font.FontManager.method_51607(id,fonts.wrapperContained); }
// public java.util.concurrent.CompletableFuture loadIndex(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor) { return wrapperContained.loadIndex(resourceManager.wrapperContained,executor); }
// public static java.util.concurrent.CompletableFuture loadIndex(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor, ) { return net.minecraft.client.font.FontManager.loadIndex(resourceManager.wrapperContained,executor); }
// public void method_51609(yarnwrap.resource.DependencyTracker entry) { wrapperContained.method_51609(entry.wrapperContained); }
// public static void method_51609(yarnwrap.resource.DependencyTracker entry, ) { net.minecraft.client.font.FontManager.method_51609(entry.wrapperContained); }
// public void method_51610(yarnwrap.util.profiler.Profiler index) { wrapperContained.method_51610(index.wrapperContained); }
// public static void method_51610(yarnwrap.util.profiler.Profiler index, ) { net.minecraft.client.font.FontManager.method_51610(index.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_51611(Object dest) { return wrapperContained.method_51611(dest); }
// public static java.util.concurrent.CompletableFuture method_51611(Object dest, ) { return net.minecraft.client.font.FontManager.method_51611(dest); }
// public void method_51612(Object loadable) { wrapperContained.method_51612(loadable); }
// public static void method_51612(Object loadable, ) { net.minecraft.client.font.FontManager.method_51612(loadable); }
// public java.util.concurrent.CompletableFuture load(Object key,Object loadable,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor) { return wrapperContained.load(key,loadable,resourceManager.wrapperContained,executor); }
// public static java.util.concurrent.CompletableFuture load(Object key,Object loadable,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor, ) { return net.minecraft.client.font.FontManager.load(key,loadable,resourceManager.wrapperContained,executor); }
// public void reload(Object index,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.reload(index,profiler.wrapperContained); }
// public static void reload(Object index,yarnwrap.util.profiler.Profiler profiler, ) { net.minecraft.client.font.FontManager.reload(index,profiler.wrapperContained); }
// public void method_51615(Object reference) { wrapperContained.method_51615(reference); }
// public static void method_51615(Object reference, ) { net.minecraft.client.font.FontManager.method_51615(reference); }
// public java.util.Map getRequiredFontProviders(java.util.List entries) { return wrapperContained.getRequiredFontProviders(entries); }
// public static java.util.Map getRequiredFontProviders(java.util.List entries, ) { return net.minecraft.client.font.FontManager.getRequiredFontProviders(entries); }
// public void method_51618(java.util.List codePoint) { wrapperContained.method_51618(codePoint); }
// public static void method_51618(java.util.List codePoint, ) { net.minecraft.client.font.FontManager.method_51618(codePoint); }
// public java.util.List loadFontProviders(java.util.List fontResources,yarnwrap.util.Identifier id) { return wrapperContained.loadFontProviders(fontResources,id.wrapperContained); }
// public static java.util.List loadFontProviders(java.util.List fontResources,yarnwrap.util.Identifier id, ) { return net.minecraft.client.font.FontManager.loadFontProviders(fontResources,id.wrapperContained); }
// public void insertFont(java.util.List fonts,Object font) { wrapperContained.insertFont(fonts,font); }
// public static void insertFont(java.util.List fonts,Object font, ) { net.minecraft.client.font.FontManager.insertFont(fonts,font); }
// public java.util.concurrent.CompletionStage method_51621(java.util.List providers) { return wrapperContained.method_51621(providers); }
// public static java.util.concurrent.CompletionStage method_51621(java.util.List providers, ) { return net.minecraft.client.font.FontManager.method_51621(providers); }
// public Object method_51622(java.util.List ignored) { return wrapperContained.method_51622(ignored); }
// public static Object method_51622(java.util.List ignored, ) { return net.minecraft.client.font.FontManager.method_51622(ignored); }
// public void method_51624(java.util.Map dependent,yarnwrap.util.Identifier fontEntry) { wrapperContained.method_51624(dependent,fontEntry.wrapperContained); }
// public static void method_51624(java.util.Map dependent,yarnwrap.util.Identifier fontEntry, ) { net.minecraft.client.font.FontManager.method_51624(dependent,fontEntry.wrapperContained); }
// public void method_51625(java.util.Map fonts) { wrapperContained.method_51625(fonts); }
// public static void method_51625(java.util.Map fonts, ) { net.minecraft.client.font.FontManager.method_51625(fonts); }
// public java.util.concurrent.CompletionStage method_51626(java.util.concurrent.Executor entries) { return wrapperContained.method_51626(entries); }
// public static java.util.concurrent.CompletionStage method_51626(java.util.concurrent.Executor entries, ) { return net.minecraft.client.font.FontManager.method_51626(entries); }
// public yarnwrap.client.font.FontStorage getStorageInternal(yarnwrap.util.Identifier id) { return new yarnwrap.client.font.FontStorage(wrapperContained.getStorageInternal(id.wrapperContained)); }
// public static yarnwrap.client.font.FontStorage getStorageInternal(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.font.FontStorage(net.minecraft.client.font.FontManager.getStorageInternal(id.wrapperContained)); }
public void setActiveFilters(yarnwrap.client.option.GameOptions options) { wrapperContained.setActiveFilters(options.wrapperContained); }
// public static void setActiveFilters(yarnwrap.client.option.GameOptions options, ) { net.minecraft.client.font.FontManager.setActiveFilters(options.wrapperContained); }
// public yarnwrap.client.font.FontStorage getStorage(yarnwrap.util.Identifier id) { return new yarnwrap.client.font.FontStorage(wrapperContained.getStorage(id.wrapperContained)); }
// public static yarnwrap.client.font.FontStorage getStorage(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.font.FontStorage(net.minecraft.client.font.FontManager.getStorage(id.wrapperContained)); }
// public java.util.Set getActiveFilters(yarnwrap.client.option.GameOptions options) { return wrapperContained.getActiveFilters(options.wrapperContained); }
// public static java.util.Set getActiveFilters(yarnwrap.client.option.GameOptions options, ) { return net.minecraft.client.font.FontManager.getActiveFilters(options.wrapperContained); }
// public Object createEmptyFont() { return wrapperContained.createEmptyFont(); }
// public static Object createEmptyFont() { return net.minecraft.client.font.FontManager.createEmptyFont(); }

}