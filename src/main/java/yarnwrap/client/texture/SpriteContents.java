package yarnwrap.client.texture;
public class SpriteContents { public net.minecraft.client.texture.SpriteContents wrapperContained; public SpriteContents(net.minecraft.client.texture.SpriteContents wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
// public void image(yarnwrap.client.texture.NativeImage value) { wrapperContained.image = value.wrapperContained; }
// public net.minecraft.client.texture.NativeImage[] mipmapLevelsImages() { return wrapperContained.mipmapLevelsImages; }
// public void mipmapLevelsImages(net.minecraft.client.texture.NativeImage[] value) { wrapperContained.mipmapLevelsImages = value; }
// public Object animation() { return wrapperContained.animation; }
// // public void animation(Object value) { wrapperContained.animation = value; }
// public yarnwrap.resource.metadata.ResourceMetadata metadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.metadata); }
// public void metadata(yarnwrap.resource.metadata.ResourceMetadata value) { wrapperContained.metadata = value.wrapperContained; }
public SpriteContents(yarnwrap.util.Identifier id,yarnwrap.client.texture.SpriteDimensions dimensions,yarnwrap.client.texture.NativeImage image,yarnwrap.resource.metadata.ResourceMetadata metadata) { this.wrapperContained = new net.minecraft.client.texture.SpriteContents(id.wrapperContained,dimensions.wrapperContained,image.wrapperContained,metadata.wrapperContained); }
public void generateMipmaps(int mipmapLevels) { wrapperContained.generateMipmaps(mipmapLevels); }
public void upload(int x,int y) { wrapperContained.upload(x,y); }
public boolean isPixelTransparent(int frame,int x,int y) { return wrapperContained.isPixelTransparent(frame,x,y); }
// public void upload(int x,int y,int unpackSkipPixels,int unpackSkipRows,net.minecraft.client.texture.NativeImage[] images) { wrapperContained.upload(x,y,unpackSkipPixels,unpackSkipRows,images); }
// public Object createAnimation(yarnwrap.client.texture.SpriteDimensions dimensions,int imageWidth,int imageHeight,yarnwrap.client.resource.metadata.AnimationResourceMetadata metadata) { return wrapperContained.createAnimation(dimensions.wrapperContained,imageWidth,imageHeight,metadata.wrapperContained); }
// public boolean method_45813(it.unimi.dsi.fastutil.ints.IntSet frameIndex) { return wrapperContained.method_45813(frameIndex); }
// public void method_45814(java.util.List index,int frameTime) { wrapperContained.method_45814(index,frameTime); }
public java.util.stream.IntStream getDistinctFrameCount() { return wrapperContained.getDistinctFrameCount(); }
public yarnwrap.client.texture.Animator createAnimator() { return new yarnwrap.client.texture.Animator(wrapperContained.createAnimator()); }
// public int getFrameCount() { return wrapperContained.getFrameCount(); }
public yarnwrap.resource.metadata.ResourceMetadata getMetadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.getMetadata()); }

}