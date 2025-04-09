package yarnwrap.client.texture;
public class PlayerSkinProvider { public net.minecraft.client.texture.PlayerSkinProvider wrapperContained; public PlayerSkinProvider(net.minecraft.client.texture.PlayerSkinProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.cache.LoadingCache cache() { return wrapperContained.cache; }
// public Object skinCache() { return wrapperContained.skinCache; }
// public Object capeCache() { return wrapperContained.capeCache; }
// public Object elytraCache() { return wrapperContained.elytraCache; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.mojang.authlib.minecraft.MinecraftSessionService sessionService() { return wrapperContained.sessionService; }
public java.util.function.Supplier getSkinTexturesSupplier(com.mojang.authlib.GameProfile profile) { return wrapperContained.getSkinTexturesSupplier(profile); }
// public java.util.concurrent.CompletableFuture fetchSkinTextures(java.util.UUID uuid,com.mojang.authlib.minecraft.MinecraftProfileTextures textures) { return wrapperContained.fetchSkinTextures(uuid,textures); }
public yarnwrap.client.util.SkinTextures getSkinTextures(com.mojang.authlib.GameProfile profile) { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures(profile)); }
public java.util.concurrent.CompletableFuture fetchSkinTextures(com.mojang.authlib.GameProfile profile) { return wrapperContained.fetchSkinTextures(profile); }

}