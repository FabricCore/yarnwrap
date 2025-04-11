package yarnwrap.client.util;
public class DefaultSkinHelper { public net.minecraft.client.util.DefaultSkinHelper wrapperContained; public DefaultSkinHelper(net.minecraft.client.util.DefaultSkinHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.util.SkinTextures[] SKINS() { return wrapperContained.SKINS; }
// public void SKINS(net.minecraft.client.util.SkinTextures[] value) { wrapperContained.SKINS = value; }
public yarnwrap.client.util.SkinTextures getSkinTextures(java.util.UUID uuid) { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures(uuid)); }
public yarnwrap.util.Identifier getTexture() { return new yarnwrap.util.Identifier(wrapperContained.getTexture()); }
public yarnwrap.client.util.SkinTextures getSkinTextures(com.mojang.authlib.GameProfile profile) { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures(profile)); }
// public yarnwrap.client.util.SkinTextures createSkinTextures(java.lang.String texture,Object model) { return new yarnwrap.client.util.SkinTextures(wrapperContained.createSkinTextures(texture,model)); }

}