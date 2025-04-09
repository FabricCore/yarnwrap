package yarnwrap.client.texture;
public class SpriteContents { public net.minecraft.client.texture.SpriteContents wrapperContained; public SpriteContents(net.minecraft.client.texture.SpriteContents wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public int width() { return wrapperContained.width; }
// public int height() { return wrapperContained.height; }
// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
// public net.minecraft.client.texture.NativeImage[] mipmapLevelsImages() { return wrapperContained.mipmapLevelsImages; }
// public Object animation() { return wrapperContained.animation; }
// public yarnwrap.resource.metadata.ResourceMetadata metadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.metadata); }
public void generateMipmaps(int mipmapLevels) { wrapperContained.generateMipmaps(mipmapLevels); }
public void upload(int x,int y) { wrapperContained.upload(x,y); }
public boolean isPixelTransparent(int frame,int x,int y) { return wrapperContained.isPixelTransparent(frame,x,y); }
// public void upload(int x,int y,int unpackSkipPixels,int unpackSkipRows,net.minecraft.client.texture.NativeImage[] images) { wrapperContained.upload(x,y,unpackSkipPixels,unpackSkipRows,images); }
// public Object createAnimation(yarnwrap.client.texture.SpriteDimensions dimensions,int imageWidth,int imageHeight,yarnwrap.client.resource.metadata.AnimationResourceMetadata metadata) { return wrapperContained.createAnimation(dimensions.wrapperContained,imageWidth,imageHeight,metadata.wrapperContained); }
public java.util.stream.IntStream getDistinctFrameCount() { return wrapperContained.getDistinctFrameCount(); }
public yarnwrap.client.texture.Animator createAnimator() { return new yarnwrap.client.texture.Animator(wrapperContained.createAnimator()); }
// public int getFrameCount() { return wrapperContained.getFrameCount(); }
public yarnwrap.resource.metadata.ResourceMetadata getMetadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.getMetadata()); }

}