package yarnwrap.client.texture;
public class PlayerSkinProvider { public net.minecraft.client.texture.PlayerSkinProvider wrapperContained; public PlayerSkinProvider(net.minecraft.client.texture.PlayerSkinProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.cache.LoadingCache cache() { return wrapperContained.cache; }
// public void cache(com.google.common.cache.LoadingCache value) { wrapperContained.cache = value; }
// public Object skinCache() { return wrapperContained.skinCache; }
// // public void skinCache(Object value) { wrapperContained.skinCache = value; }
// public Object capeCache() { return wrapperContained.capeCache; }
// // public void capeCache(Object value) { wrapperContained.capeCache = value; }
// public Object elytraCache() { return wrapperContained.elytraCache; }
// // public void elytraCache(Object value) { wrapperContained.elytraCache = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.mojang.authlib.minecraft.MinecraftSessionService sessionService() { return wrapperContained.sessionService; }
// public void sessionService(com.mojang.authlib.minecraft.MinecraftSessionService value) { wrapperContained.sessionService = value; }
public PlayerSkinProvider(yarnwrap.client.texture.TextureManager textureManager,java.nio.file.Path directory,com.mojang.authlib.minecraft.MinecraftSessionService sessionService,java.util.concurrent.Executor executor) { this.wrapperContained = new net.minecraft.client.texture.PlayerSkinProvider(textureManager.wrapperContained,directory,sessionService,executor); }
public java.util.function.Supplier getSkinTexturesSupplier(com.mojang.authlib.GameProfile profile) { return wrapperContained.getSkinTexturesSupplier(profile); }
// public java.util.concurrent.CompletableFuture fetchSkinTextures(java.util.UUID uuid,com.mojang.authlib.minecraft.MinecraftProfileTextures textures) { return wrapperContained.fetchSkinTextures(uuid,textures); }
// public yarnwrap.client.util.SkinTextures method_52861(java.util.concurrent.CompletableFuture v) { return new yarnwrap.client.util.SkinTextures(wrapperContained.method_52861(v)); }
public yarnwrap.client.util.SkinTextures getSkinTextures(com.mojang.authlib.GameProfile profile) { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures(profile)); }
public java.util.concurrent.CompletableFuture fetchSkinTextures(com.mojang.authlib.GameProfile profile) { return wrapperContained.fetchSkinTextures(profile); }

}