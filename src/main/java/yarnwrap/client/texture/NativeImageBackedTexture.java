package yarnwrap.client.texture;
public class NativeImageBackedTexture { public net.minecraft.client.texture.NativeImageBackedTexture wrapperContained; public NativeImageBackedTexture(net.minecraft.client.texture.NativeImageBackedTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
// public void image(yarnwrap.client.texture.NativeImage value) { wrapperContained.image = value.wrapperContained; }
public NativeImageBackedTexture(int width,int height,boolean useStb) { this.wrapperContained = new net.minecraft.client.texture.NativeImageBackedTexture(width,height,useStb); }
public NativeImageBackedTexture(yarnwrap.client.texture.NativeImage image) { this.wrapperContained = new net.minecraft.client.texture.NativeImageBackedTexture(image.wrapperContained); }
public void upload() { wrapperContained.upload(); }
public yarnwrap.client.texture.NativeImage getImage() { return new yarnwrap.client.texture.NativeImage(wrapperContained.getImage()); }
public void setImage(yarnwrap.client.texture.NativeImage image) { wrapperContained.setImage(image.wrapperContained); }

}