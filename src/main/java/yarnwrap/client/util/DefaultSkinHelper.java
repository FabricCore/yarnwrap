package yarnwrap.client.util;
public class DefaultSkinHelper { public net.minecraft.client.util.DefaultSkinHelper wrapperContained; public DefaultSkinHelper(net.minecraft.client.util.DefaultSkinHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.util.SkinTextures[] SKINS() { return wrapperContained.SKINS; }
// public void SKINS(net.minecraft.client.util.SkinTextures[] value) { wrapperContained.SKINS = value; }
// public static net.minecraft.client.util.SkinTextures[] SKINS() { return net.minecraft.client.util.DefaultSkinHelper.SKINS; }
// public static void SKINS(net.minecraft.client.util.SkinTextures[] value, ) { net.minecraft.client.util.DefaultSkinHelper.SKINS = value; }

// public yarnwrap.client.util.SkinTextures getSkinTextures(java.util.UUID uuid) { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures(uuid)); }
// public static yarnwrap.client.util.SkinTextures getSkinTextures(java.util.UUID uuid, ) { return new yarnwrap.client.util.SkinTextures(net.minecraft.client.util.DefaultSkinHelper.getSkinTextures(uuid)); }
// public yarnwrap.util.Identifier getTexture() { return new yarnwrap.util.Identifier(wrapperContained.getTexture()); }
public static yarnwrap.util.Identifier getTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.util.DefaultSkinHelper.getTexture()); }
// public yarnwrap.client.util.SkinTextures getSkinTextures(com.mojang.authlib.GameProfile profile) { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures(profile)); }
// public static yarnwrap.client.util.SkinTextures getSkinTextures(com.mojang.authlib.GameProfile profile, ) { return new yarnwrap.client.util.SkinTextures(net.minecraft.client.util.DefaultSkinHelper.getSkinTextures(profile)); }
// public yarnwrap.client.util.SkinTextures createSkinTextures(java.lang.String texture,Object model) { return new yarnwrap.client.util.SkinTextures(wrapperContained.createSkinTextures(texture,model)); }
// public static yarnwrap.client.util.SkinTextures createSkinTextures(java.lang.String texture,Object model, ) { return new yarnwrap.client.util.SkinTextures(net.minecraft.client.util.DefaultSkinHelper.createSkinTextures(texture,model)); }

}