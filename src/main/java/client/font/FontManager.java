package yarnwrap.client.font;
public class FontManager { public net.minecraft.client.font.FontManager wrapperContained; public FontManager(net.minecraft.client.font.FontManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map fontStorages() { return wrapperContained.fontStorages; }
// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.util.Identifier MISSING_STORAGE_ID() { return new yarnwrap.util.Identifier(wrapperContained.MISSING_STORAGE_ID); }
// public yarnwrap.client.font.FontStorage missingStorage() { return new yarnwrap.client.font.FontStorage(wrapperContained.missingStorage); }
// public java.lang.String FONTS_JSON() { return wrapperContained.FONTS_JSON; }
// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public java.util.List fonts() { return wrapperContained.fonts; }
// public yarnwrap.client.font.FontStorage currentStorage() { return new yarnwrap.client.font.FontStorage(wrapperContained.currentStorage); }
public yarnwrap.client.font.TextRenderer createTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.createTextRenderer()); }
public yarnwrap.client.font.TextRenderer createAdvanceValidatingTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.createAdvanceValidatingTextRenderer()); }
// public java.util.concurrent.CompletableFuture loadIndex(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor) { return wrapperContained.loadIndex(resourceManager.wrapperContained,executor); }
// public java.util.concurrent.CompletableFuture load(Object key,Object loadable,yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor) { return wrapperContained.load(key,loadable,resourceManager.wrapperContained,executor); }
// public void reload(Object index,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.reload(index,profiler.wrapperContained); }
// public java.util.Map getRequiredFontProviders(java.util.List entries) { return wrapperContained.getRequiredFontProviders(entries); }
// public java.util.List loadFontProviders(java.util.List fontResources,yarnwrap.util.Identifier id) { return wrapperContained.loadFontProviders(fontResources,id.wrapperContained); }
// public void insertFont(java.util.List fonts,Object font) { wrapperContained.insertFont(fonts,font); }
// public yarnwrap.client.font.FontStorage getStorageInternal(yarnwrap.util.Identifier id) { return new yarnwrap.client.font.FontStorage(wrapperContained.getStorageInternal(id.wrapperContained)); }
public void setActiveFilters(yarnwrap.client.option.GameOptions options) { wrapperContained.setActiveFilters(options.wrapperContained); }
// public yarnwrap.client.font.FontStorage getStorage(yarnwrap.util.Identifier id) { return new yarnwrap.client.font.FontStorage(wrapperContained.getStorage(id.wrapperContained)); }
// public java.util.Set getActiveFilters(yarnwrap.client.option.GameOptions options) { return wrapperContained.getActiveFilters(options.wrapperContained); }
// public Object createEmptyFont() { return wrapperContained.createEmptyFont(); }

}