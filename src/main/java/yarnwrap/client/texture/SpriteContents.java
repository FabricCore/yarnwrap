package yarnwrap.client.texture;
public class SpriteContents { public net.minecraft.client.texture.SpriteContents wrapperContained; public SpriteContents(net.minecraft.client.texture.SpriteContents wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.SpriteContents.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.SpriteContents.LOGGER = value; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.SpriteContents.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.SpriteContents.id = value.wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.texture.SpriteContents.width; }
// public static void width(int value, ) { net.minecraft.client.texture.SpriteContents.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.texture.SpriteContents.height; }
// public static void height(int value, ) { net.minecraft.client.texture.SpriteContents.height = value; }

// public yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(wrapperContained.image); }
// public void image(yarnwrap.client.texture.NativeImage value) { wrapperContained.image = value.wrapperContained; }
// public static yarnwrap.client.texture.NativeImage image() { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.SpriteContents.image); }
// public static void image(yarnwrap.client.texture.NativeImage value, ) { net.minecraft.client.texture.SpriteContents.image = value.wrapperContained; }

// public net.minecraft.client.texture.NativeImage[] mipmapLevelsImages() { return wrapperContained.mipmapLevelsImages; }
// public void mipmapLevelsImages(net.minecraft.client.texture.NativeImage[] value) { wrapperContained.mipmapLevelsImages = value; }
// public static net.minecraft.client.texture.NativeImage[] mipmapLevelsImages() { return net.minecraft.client.texture.SpriteContents.mipmapLevelsImages; }
// public static void mipmapLevelsImages(net.minecraft.client.texture.NativeImage[] value, ) { net.minecraft.client.texture.SpriteContents.mipmapLevelsImages = value; }

// public Object animation() { return wrapperContained.animation; }
// // public void animation(Object value) { wrapperContained.animation = value; }
// // public static Object animation() { return net.minecraft.client.texture.SpriteContents.animation; }
// // public static void animation(Object value, ) { net.minecraft.client.texture.SpriteContents.animation = value; }

// public yarnwrap.resource.metadata.ResourceMetadata metadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.metadata); }
// public void metadata(yarnwrap.resource.metadata.ResourceMetadata value) { wrapperContained.metadata = value.wrapperContained; }
// public static yarnwrap.resource.metadata.ResourceMetadata metadata() { return new yarnwrap.resource.metadata.ResourceMetadata(net.minecraft.client.texture.SpriteContents.metadata); }
// public static void metadata(yarnwrap.resource.metadata.ResourceMetadata value, ) { net.minecraft.client.texture.SpriteContents.metadata = value.wrapperContained; }

public SpriteContents(yarnwrap.util.Identifier id,yarnwrap.client.texture.SpriteDimensions dimensions,yarnwrap.client.texture.NativeImage image,yarnwrap.resource.metadata.ResourceMetadata metadata) { this.wrapperContained = new net.minecraft.client.texture.SpriteContents(id.wrapperContained,dimensions.wrapperContained,image.wrapperContained,metadata.wrapperContained); }
public void generateMipmaps(int mipmapLevels) { wrapperContained.generateMipmaps(mipmapLevels); }
// public static void generateMipmaps(int mipmapLevels, ) { net.minecraft.client.texture.SpriteContents.generateMipmaps(mipmapLevels); }
public void upload(int x,int y) { wrapperContained.upload(x,y); }
// public static void upload(int x,int y, ) { net.minecraft.client.texture.SpriteContents.upload(x,y); }
public boolean isPixelTransparent(int frame,int x,int y) { return wrapperContained.isPixelTransparent(frame,x,y); }
// public static boolean isPixelTransparent(int frame,int x,int y, ) { return net.minecraft.client.texture.SpriteContents.isPixelTransparent(frame,x,y); }
// public void upload(int x,int y,int unpackSkipPixels,int unpackSkipRows,net.minecraft.client.texture.NativeImage[] images) { wrapperContained.upload(x,y,unpackSkipPixels,unpackSkipRows,images); }
// public static void upload(int x,int y,int unpackSkipPixels,int unpackSkipRows,net.minecraft.client.texture.NativeImage[] images, ) { net.minecraft.client.texture.SpriteContents.upload(x,y,unpackSkipPixels,unpackSkipRows,images); }
// public Object createAnimation(yarnwrap.client.texture.SpriteDimensions dimensions,int imageWidth,int imageHeight,yarnwrap.client.resource.metadata.AnimationResourceMetadata metadata) { return wrapperContained.createAnimation(dimensions.wrapperContained,imageWidth,imageHeight,metadata.wrapperContained); }
// public static Object createAnimation(yarnwrap.client.texture.SpriteDimensions dimensions,int imageWidth,int imageHeight,yarnwrap.client.resource.metadata.AnimationResourceMetadata metadata, ) { return net.minecraft.client.texture.SpriteContents.createAnimation(dimensions.wrapperContained,imageWidth,imageHeight,metadata.wrapperContained); }
// public boolean method_45813(it.unimi.dsi.fastutil.ints.IntSet frameIndex) { return wrapperContained.method_45813(frameIndex); }
// public static boolean method_45813(it.unimi.dsi.fastutil.ints.IntSet frameIndex, ) { return net.minecraft.client.texture.SpriteContents.method_45813(frameIndex); }
// public void method_45814(java.util.List index,int frameTime) { wrapperContained.method_45814(index,frameTime); }
// public static void method_45814(java.util.List index,int frameTime, ) { net.minecraft.client.texture.SpriteContents.method_45814(index,frameTime); }
public java.util.stream.IntStream getDistinctFrameCount() { return wrapperContained.getDistinctFrameCount(); }
// public static java.util.stream.IntStream getDistinctFrameCount() { return net.minecraft.client.texture.SpriteContents.getDistinctFrameCount(); }
public yarnwrap.client.texture.Animator createAnimator() { return new yarnwrap.client.texture.Animator(wrapperContained.createAnimator()); }
// public static yarnwrap.client.texture.Animator createAnimator() { return new yarnwrap.client.texture.Animator(net.minecraft.client.texture.SpriteContents.createAnimator()); }
// public int getFrameCount() { return wrapperContained.getFrameCount(); }
// public static int getFrameCount() { return net.minecraft.client.texture.SpriteContents.getFrameCount(); }
public yarnwrap.resource.metadata.ResourceMetadata getMetadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.getMetadata()); }
// public static yarnwrap.resource.metadata.ResourceMetadata getMetadata() { return new yarnwrap.resource.metadata.ResourceMetadata(net.minecraft.client.texture.SpriteContents.getMetadata()); }

}