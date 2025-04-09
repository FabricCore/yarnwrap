package yarnwrap.client.texture;
public class NativeImageBackedTexture { public net.minecraft.client.texture.NativeImageBackedTexture wrapperContained; public NativeImageBackedTexture(net.minecraft.client.texture.NativeImageBackedTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
public void upload() { wrapperContained.upload(); }
public yarnwrap.client.texture.NativeImage getImage() { return new yarnwrap.client.texture.NativeImage(wrapperContained.getImage()); }
public void setImage(yarnwrap.client.texture.NativeImage image) { wrapperContained.setImage(image.wrapperContained); }

}