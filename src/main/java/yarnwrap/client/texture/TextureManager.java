package yarnwrap.client.texture;
public class TextureManager { public net.minecraft.client.texture.TextureManager wrapperContained; public TextureManager(net.minecraft.client.texture.TextureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map dynamicIdCounters() { return wrapperContained.dynamicIdCounters; }
// public void dynamicIdCounters(java.util.Map value) { wrapperContained.dynamicIdCounters = value; }
// public static java.util.Map dynamicIdCounters() { return net.minecraft.client.texture.TextureManager.dynamicIdCounters; }
// public static void dynamicIdCounters(java.util.Map value, ) { net.minecraft.client.texture.TextureManager.dynamicIdCounters = value; }

// public java.util.Set tickListeners() { return wrapperContained.tickListeners; }
// public void tickListeners(java.util.Set value) { wrapperContained.tickListeners = value; }
// public static java.util.Set tickListeners() { return net.minecraft.client.texture.TextureManager.tickListeners; }
// public static void tickListeners(java.util.Set value, ) { net.minecraft.client.texture.TextureManager.tickListeners = value; }

// public yarnwrap.util.Identifier MISSING_IDENTIFIER() { return new yarnwrap.util.Identifier(wrapperContained.MISSING_IDENTIFIER); }
// public void MISSING_IDENTIFIER(yarnwrap.util.Identifier value) { wrapperContained.MISSING_IDENTIFIER = value.wrapperContained; }
public static yarnwrap.util.Identifier MISSING_IDENTIFIER() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.TextureManager.MISSING_IDENTIFIER); }
// public static void MISSING_IDENTIFIER(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.TextureManager.MISSING_IDENTIFIER = value.wrapperContained; }

// public java.util.Map textures() { return wrapperContained.textures; }
// public void textures(java.util.Map value) { wrapperContained.textures = value; }
// public static java.util.Map textures() { return net.minecraft.client.texture.TextureManager.textures; }
// public static void textures(java.util.Map value, ) { net.minecraft.client.texture.TextureManager.textures = value; }

// public yarnwrap.resource.ResourceManager resourceContainer() { return new yarnwrap.resource.ResourceManager(wrapperContained.resourceContainer); }
// public void resourceContainer(yarnwrap.resource.ResourceManager value) { wrapperContained.resourceContainer = value.wrapperContained; }
// public static yarnwrap.resource.ResourceManager resourceContainer() { return new yarnwrap.resource.ResourceManager(net.minecraft.client.texture.TextureManager.resourceContainer); }
// public static void resourceContainer(yarnwrap.resource.ResourceManager value, ) { net.minecraft.client.texture.TextureManager.resourceContainer = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.TextureManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.TextureManager.LOGGER = value; }

public TextureManager(yarnwrap.resource.ResourceManager resourceManager) { this.wrapperContained = new net.minecraft.client.texture.TextureManager(resourceManager.wrapperContained); }
public java.util.concurrent.CompletableFuture loadTextureAsync(yarnwrap.util.Identifier id,java.util.concurrent.Executor executor) { return wrapperContained.loadTextureAsync(id.wrapperContained,executor); }
// public static java.util.concurrent.CompletableFuture loadTextureAsync(yarnwrap.util.Identifier id,java.util.concurrent.Executor executor, ) { return net.minecraft.client.texture.TextureManager.loadTextureAsync(id.wrapperContained,executor); }
// public void runOnRenderThread(java.lang.Runnable runnable) { wrapperContained.runOnRenderThread(runnable); }
// public static void runOnRenderThread(java.lang.Runnable runnable, ) { net.minecraft.client.texture.TextureManager.runOnRenderThread(runnable); }
public void bindTexture(yarnwrap.util.Identifier id) { wrapperContained.bindTexture(id.wrapperContained); }
// public static void bindTexture(yarnwrap.util.Identifier id, ) { net.minecraft.client.texture.TextureManager.bindTexture(id.wrapperContained); }
// public void method_22814(java.lang.Runnable runnable) { wrapperContained.method_22814(runnable); }
// public static void method_22814(java.lang.Runnable runnable, ) { net.minecraft.client.texture.TextureManager.method_22814(runnable); }
// public yarnwrap.client.texture.AbstractTexture loadTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture) { return new yarnwrap.client.texture.AbstractTexture(wrapperContained.loadTexture(id.wrapperContained,texture.wrapperContained)); }
// public static yarnwrap.client.texture.AbstractTexture loadTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture, ) { return new yarnwrap.client.texture.AbstractTexture(net.minecraft.client.texture.TextureManager.loadTexture(id.wrapperContained,texture.wrapperContained)); }
// public void closeTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture) { wrapperContained.closeTexture(id.wrapperContained,texture.wrapperContained); }
// public static void closeTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture, ) { net.minecraft.client.texture.TextureManager.closeTexture(id.wrapperContained,texture.wrapperContained); }
public yarnwrap.client.texture.AbstractTexture getOrDefault(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture fallback) { return new yarnwrap.client.texture.AbstractTexture(wrapperContained.getOrDefault(id.wrapperContained,fallback.wrapperContained)); }
// public static yarnwrap.client.texture.AbstractTexture getOrDefault(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture fallback, ) { return new yarnwrap.client.texture.AbstractTexture(net.minecraft.client.texture.TextureManager.getOrDefault(id.wrapperContained,fallback.wrapperContained)); }
public void destroyTexture(yarnwrap.util.Identifier id) { wrapperContained.destroyTexture(id.wrapperContained); }
// public static void destroyTexture(yarnwrap.util.Identifier id, ) { net.minecraft.client.texture.TextureManager.destroyTexture(id.wrapperContained); }
public void registerTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture) { wrapperContained.registerTexture(id.wrapperContained,texture.wrapperContained); }
// public static void registerTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture, ) { net.minecraft.client.texture.TextureManager.registerTexture(id.wrapperContained,texture.wrapperContained); }
public yarnwrap.util.Identifier registerDynamicTexture(java.lang.String prefix,yarnwrap.client.texture.NativeImageBackedTexture texture) { return new yarnwrap.util.Identifier(wrapperContained.registerDynamicTexture(prefix,texture.wrapperContained)); }
// public static yarnwrap.util.Identifier registerDynamicTexture(java.lang.String prefix,yarnwrap.client.texture.NativeImageBackedTexture texture, ) { return new yarnwrap.util.Identifier(net.minecraft.client.texture.TextureManager.registerDynamicTexture(prefix,texture.wrapperContained)); }
// public void bindTextureInner(yarnwrap.util.Identifier id) { wrapperContained.bindTextureInner(id.wrapperContained); }
// public static void bindTextureInner(yarnwrap.util.Identifier id, ) { net.minecraft.client.texture.TextureManager.bindTextureInner(id.wrapperContained); }
public yarnwrap.client.texture.AbstractTexture getTexture(yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.AbstractTexture(wrapperContained.getTexture(id.wrapperContained)); }
// public static yarnwrap.client.texture.AbstractTexture getTexture(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.texture.AbstractTexture(net.minecraft.client.texture.TextureManager.getTexture(id.wrapperContained)); }
public void dumpDynamicTextures(java.nio.file.Path path) { wrapperContained.dumpDynamicTextures(path); }
// public static void dumpDynamicTextures(java.nio.file.Path path, ) { net.minecraft.client.texture.TextureManager.dumpDynamicTextures(path); }
// public void method_49716(java.nio.file.Path id,yarnwrap.util.Identifier texture) { wrapperContained.method_49716(id,texture.wrapperContained); }
// public static void method_49716(java.nio.file.Path id,yarnwrap.util.Identifier texture, ) { net.minecraft.client.texture.TextureManager.method_49716(id,texture.wrapperContained); }
// public void dumpDynamicTexturesInternal(java.nio.file.Path path) { wrapperContained.dumpDynamicTexturesInternal(path); }
// public static void dumpDynamicTexturesInternal(java.nio.file.Path path, ) { net.minecraft.client.texture.TextureManager.dumpDynamicTexturesInternal(path); }

}