package yarnwrap.client.texture;
public class TextureManager { public net.minecraft.client.texture.TextureManager wrapperContained; public TextureManager(net.minecraft.client.texture.TextureManager wrapperContained) { this.wrapperContained = wrapperContained; }

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
public void destroyTexture(yarnwrap.util.Identifier id) { wrapperContained.destroyTexture(id.wrapperContained); }
// public static void destroyTexture(yarnwrap.util.Identifier id, ) { net.minecraft.client.texture.TextureManager.destroyTexture(id.wrapperContained); }
public void registerTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture) { wrapperContained.registerTexture(id.wrapperContained,texture.wrapperContained); }
// public static void registerTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture, ) { net.minecraft.client.texture.TextureManager.registerTexture(id.wrapperContained,texture.wrapperContained); }
public yarnwrap.client.texture.AbstractTexture getTexture(yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.AbstractTexture(wrapperContained.getTexture(id.wrapperContained)); }
// public static yarnwrap.client.texture.AbstractTexture getTexture(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.texture.AbstractTexture(net.minecraft.client.texture.TextureManager.getTexture(id.wrapperContained)); }
// public void closeTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture) { wrapperContained.closeTexture(id.wrapperContained,texture.wrapperContained); }
// public static void closeTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.AbstractTexture texture, ) { net.minecraft.client.texture.TextureManager.closeTexture(id.wrapperContained,texture.wrapperContained); }
public void dumpDynamicTextures(java.nio.file.Path path) { wrapperContained.dumpDynamicTextures(path); }
// public static void dumpDynamicTextures(java.nio.file.Path path, ) { net.minecraft.client.texture.TextureManager.dumpDynamicTextures(path); }
// public void method_49718(java.nio.file.Path id,yarnwrap.util.Identifier texture) { wrapperContained.method_49718(id,texture.wrapperContained); }
// public static void method_49718(java.nio.file.Path id,yarnwrap.util.Identifier texture, ) { net.minecraft.client.texture.TextureManager.method_49718(id,texture.wrapperContained); }
public void registerTexture(yarnwrap.util.Identifier id) { wrapperContained.registerTexture(id.wrapperContained); }
// public static void registerTexture(yarnwrap.util.Identifier id, ) { net.minecraft.client.texture.TextureManager.registerTexture(id.wrapperContained); }
public void registerTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.ReloadableTexture texture) { wrapperContained.registerTexture(id.wrapperContained,texture.wrapperContained); }
// public static void registerTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.ReloadableTexture texture, ) { net.minecraft.client.texture.TextureManager.registerTexture(id.wrapperContained,texture.wrapperContained); }
// public yarnwrap.client.texture.TextureContents loadTexture(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier textureId,yarnwrap.client.texture.ReloadableTexture texture) { return new yarnwrap.client.texture.TextureContents(wrapperContained.loadTexture(resourceManager.wrapperContained,textureId.wrapperContained,texture.wrapperContained)); }
// public static yarnwrap.client.texture.TextureContents loadTexture(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier textureId,yarnwrap.client.texture.ReloadableTexture texture, ) { return new yarnwrap.client.texture.TextureContents(net.minecraft.client.texture.TextureManager.loadTexture(resourceManager.wrapperContained,textureId.wrapperContained,texture.wrapperContained)); }
// public Object reloadTexture(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier textureId,yarnwrap.client.texture.ReloadableTexture texture,java.util.concurrent.Executor prepareExecutor) { return wrapperContained.reloadTexture(resourceManager.wrapperContained,textureId.wrapperContained,texture.wrapperContained,prepareExecutor); }
// public static Object reloadTexture(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier textureId,yarnwrap.client.texture.ReloadableTexture texture,java.util.concurrent.Executor prepareExecutor, ) { return net.minecraft.client.texture.TextureManager.reloadTexture(resourceManager.wrapperContained,textureId.wrapperContained,texture.wrapperContained,prepareExecutor); }
// public void method_65879(java.util.List id,yarnwrap.resource.ResourceManager texture) { wrapperContained.method_65879(id,texture.wrapperContained); }
// public static void method_65879(java.util.List id,yarnwrap.resource.ResourceManager texture, ) { net.minecraft.client.texture.TextureManager.method_65879(id,texture.wrapperContained); }
// public void method_65880(java.util.List v) { wrapperContained.method_65880(v); }
// public static void method_65880(java.util.List v, ) { net.minecraft.client.texture.TextureManager.method_65880(v); }
// public yarnwrap.client.texture.TextureContents loadTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.ReloadableTexture texture) { return new yarnwrap.client.texture.TextureContents(wrapperContained.loadTexture(id.wrapperContained,texture.wrapperContained)); }
// public static yarnwrap.client.texture.TextureContents loadTexture(yarnwrap.util.Identifier id,yarnwrap.client.texture.ReloadableTexture texture, ) { return new yarnwrap.client.texture.TextureContents(net.minecraft.client.texture.TextureManager.loadTexture(id.wrapperContained,texture.wrapperContained)); }

}