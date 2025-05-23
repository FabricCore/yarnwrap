package yarnwrap.client.texture;
public class AbstractTexture { public net.minecraft.client.texture.AbstractTexture wrapperContained; public AbstractTexture(net.minecraft.client.texture.AbstractTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.blaze3d.textures.GpuTexture glTexture() { return wrapperContained.glTexture; }
// public void glTexture(com.mojang.blaze3d.textures.GpuTexture value) { wrapperContained.glTexture = value; }
// public static com.mojang.blaze3d.textures.GpuTexture glTexture() { return net.minecraft.client.texture.AbstractTexture.glTexture; }
// public static void glTexture(com.mojang.blaze3d.textures.GpuTexture value, ) { net.minecraft.client.texture.AbstractTexture.glTexture = value; }

// // public com.mojang.blaze3d.textures.GpuTextureView glTextureView() { return wrapperContained.glTextureView; }
// // public void glTextureView(com.mojang.blaze3d.textures.GpuTextureView value) { wrapperContained.glTextureView = value; }
// // public static com.mojang.blaze3d.textures.GpuTextureView glTextureView() { return net.minecraft.client.texture.AbstractTexture.glTextureView; }
// // public static void glTextureView(com.mojang.blaze3d.textures.GpuTextureView value, ) { net.minecraft.client.texture.AbstractTexture.glTextureView = value; }

public void setFilter(boolean bilinear,boolean mipmap) { wrapperContained.setFilter(bilinear,mipmap); }
// public static void setFilter(boolean bilinear,boolean mipmap, ) { net.minecraft.client.texture.AbstractTexture.setFilter(bilinear,mipmap); }
public void setClamp(boolean clamp) { wrapperContained.setClamp(clamp); }
// public static void setClamp(boolean clamp, ) { net.minecraft.client.texture.AbstractTexture.setClamp(clamp); }
public com.mojang.blaze3d.textures.GpuTexture getGlTexture() { return wrapperContained.getGlTexture(); }
// public static com.mojang.blaze3d.textures.GpuTexture getGlTexture() { return net.minecraft.client.texture.AbstractTexture.getGlTexture(); }
// public void setUseMipmaps(boolean useMipmaps) { wrapperContained.setUseMipmaps(useMipmaps); }
// public static void setUseMipmaps(boolean useMipmaps, ) { net.minecraft.client.texture.AbstractTexture.setUseMipmaps(useMipmaps); }
// // public com.mojang.blaze3d.textures.GpuTextureView getGlTextureView() { return wrapperContained.getGlTextureView(); }
// // public static com.mojang.blaze3d.textures.GpuTextureView getGlTextureView() { return net.minecraft.client.texture.AbstractTexture.getGlTextureView(); }

}