package yarnwrap.client.texture;
public class TextureManager { public net.minecraft.client.texture.TextureManager wrapperContained; public TextureManager(net.minecraft.client.texture.TextureManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map dynamicIdCounters() { return wrapperContained.dynamicIdCounters; }
// public void dynamicIdCounters(java.util.Map value) { wrapperContained.dynamicIdCounters = value; }
// public java.util.Set tickListeners() { return wrapperContained.tickListeners; }
// public void tickListeners(java.util.Set value) { wrapperContained.tickListeners = value; }
public yarnwrap.util.Identifier MISSING_IDENTIFIER() { return new yarnwrap.util.Identifier(wrapperContained.MISSING_IDENTIFIER); }
// public void MISSING_IDENTIFIER(yarnwrap.util.Identifier value) { wrapperContained.MISSING_IDENTIFIER = value.wrapperContained; }
// public java.util.Map textures() { return wrapperContained.textures; }
// public void textures(java.util.Map value) { wrapperContained.textures = value; }
// public yarnwrap.resource.ResourceManager resourceContainer() { return new yarnwrap.resource.ResourceManager(wrapperContained.resourceContainer); }
// public void resourceContainer(yarnwrap.resource.ResourceManager value) { wrapperContained.resourceContainer = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.util.concurrent.CompletableFuture loadTextureAsync(yarnwrap.util.Identifier id,java.util.concurrent.Executor executor) { return wrapperContained.loadTextureAsync(id.wrapperContained,executor); }
// public void runOnRenderThread(java.lang.Runnable runnable) { wrapperContained.runOnRenderThread(runnable); }
public void bindTexture(yarnwrap.util.Identifier id) { wrapperContained.bindTexture(id.wrapperContained); }
// public yarnwrap.client.texture.AbstractTexture loadTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture) { return new yarnwrap.client.texture.AbstractTexture(wrapperContained.loadTexture(id.wrapperContained,texture.wrapperContained)); }
// public void closeTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture) { wrapperContained.closeTexture(id.wrapperContained,texture.wrapperContained); }
public yarnwrap.client.texture.AbstractTexture getOrDefault(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture fallback) { return new yarnwrap.client.texture.AbstractTexture(wrapperContained.getOrDefault(id.wrapperContained,fallback.wrapperContained)); }
public void destroyTexture(yarnwrap.util.Identifier id) { wrapperContained.destroyTexture(id.wrapperContained); }
public void registerTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture) { wrapperContained.registerTexture(id.wrapperContained,texture.wrapperContained); }
public yarnwrap.util.Identifier registerDynamicTexture(java.lang.String prefix,yarnwrap.client.texture.NativeImageBackedTexture texture) { return new yarnwrap.util.Identifier(wrapperContained.registerDynamicTexture(prefix,texture.wrapperContained)); }
// public void bindTextureInner(yarnwrap.util.Identifier id) { wrapperContained.bindTextureInner(id.wrapperContained); }
public yarnwrap.client.texture.AbstractTexture getTexture(yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.AbstractTexture(wrapperContained.getTexture(id.wrapperContained)); }
public void dumpDynamicTextures(java.nio.file.Path path) { wrapperContained.dumpDynamicTextures(path); }
// public void dumpDynamicTexturesInternal(java.nio.file.Path path) { wrapperContained.dumpDynamicTexturesInternal(path); }

}