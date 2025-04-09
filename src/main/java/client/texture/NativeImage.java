package yarnwrap.client.texture;
public class NativeImage { public net.minecraft.client.texture.NativeImage wrapperContained; public NativeImage(net.minecraft.client.texture.NativeImage wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public Object format() { return wrapperContained.format; }
// public long sizeBytes() { return wrapperContained.sizeBytes; }
// public long pointer() { return wrapperContained.pointer; }
// public int height() { return wrapperContained.height; }
// public boolean isStbImage() { return wrapperContained.isStbImage; }
// public int width() { return wrapperContained.width; }
// public java.util.Set WRITE_TO_FILE_OPEN_OPTIONS() { return wrapperContained.WRITE_TO_FILE_OPEN_OPTIONS; }
public void upload(int level,int offsetX,int offsetY,int unpackSkipPixels,int unpackSkipRows,int width,int height,boolean blur,boolean clamp,boolean mipmap,boolean close) { wrapperContained.upload(level,offsetX,offsetY,unpackSkipPixels,unpackSkipRows,width,height,blur,clamp,mipmap,close); }
// public boolean write(java.nio.channels.WritableByteChannel channel) { return wrapperContained.write(channel); }
// public byte[] getBytes() { return wrapperContained.getBytes(); }
public void readDepthComponent(float unused) { wrapperContained.readDepthComponent(unused); }
public void setLuminance(int x,int y,byte luminance) { wrapperContained.setLuminance(x,y,luminance); }
public byte getRed(int x,int y) { return wrapperContained.getRed(x,y); }
public void blend(int x,int y,int color) { wrapperContained.blend(x,y,color); }
public byte getGreen(int x,int y) { return wrapperContained.getGreen(x,y); }
public byte getBlue(int x,int y) { return wrapperContained.getBlue(x,y); }
public void drawPixels() { wrapperContained.drawPixels(); }
// public boolean isOutOfBounds(int x,int y) { return wrapperContained.isOutOfBounds(x,y); }
public void resizeSubRectTo(int x,int y,int width,int height,yarnwrap.client.texture.NativeImage targetImage) { wrapperContained.resizeSubRectTo(x,y,width,height,targetImage.wrapperContained); }
public void upload(int level,int offsetX,int offsetY,boolean close) { wrapperContained.upload(level,offsetX,offsetY,close); }
public void untrack() { wrapperContained.untrack(); }
// public yarnwrap.client.texture.NativeImage read(Object format,java.nio.ByteBuffer buffer) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(format,buffer)); }
public void copyRect(int x,int y,int translateX,int translateY,int width,int height,boolean flipX,boolean flipY) { wrapperContained.copyRect(x,y,translateX,translateY,width,height,flipX,flipY); }
public void setColor(int x,int y,int color) { wrapperContained.setColor(x,y,color); }
public int getWidth() { return wrapperContained.getWidth(); }
// public void setTextureFilter(boolean blur,boolean mipmap) { wrapperContained.setTextureFilter(blur,mipmap); }
// public yarnwrap.client.texture.NativeImage read(java.io.InputStream stream) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(stream)); }
// public yarnwrap.client.texture.NativeImage read(Object format,java.io.InputStream stream) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(format,stream)); }
public byte getOpacity(int x,int y) { return wrapperContained.getOpacity(x,y); }
public void upload(int level,int offsetX,int offsetY,int unpackSkipPixels,int unpackSkipRows,int width,int height,boolean mipmap,boolean close) { wrapperContained.upload(level,offsetX,offsetY,unpackSkipPixels,unpackSkipRows,width,height,mipmap,close); }
// public void writeTo(java.nio.file.Path path) { wrapperContained.writeTo(path); }
public int getColor(int x,int y) { return wrapperContained.getColor(x,y); }
public boolean makeGlyphBitmapSubpixel(org.lwjgl.util.freetype.FT_Face face,int glyphIndex) { return wrapperContained.makeGlyphBitmapSubpixel(face,glyphIndex); }
public void copyFrom(yarnwrap.client.texture.NativeImage image) { wrapperContained.copyFrom(image.wrapperContained); }
public Object getFormat() { return wrapperContained.getFormat(); }
public void mirrorVertically() { wrapperContained.mirrorVertically(); }
// public void checkAllocated() { wrapperContained.checkAllocated(); }
// public void uploadInternal(int level,int offsetX,int offsetY,int unpackSkipPixels,int unpackSkipRows,int width,int height,boolean blur,boolean clamp,boolean mipmap,boolean close) { wrapperContained.uploadInternal(level,offsetX,offsetY,unpackSkipPixels,unpackSkipRows,width,height,blur,clamp,mipmap,close); }
public int[] makePixelArray() { return wrapperContained.makePixelArray(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public yarnwrap.client.texture.NativeImage read(java.nio.ByteBuffer buffer) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(buffer)); }
// public void writeTo(java.io.File path) { wrapperContained.writeTo(path); }
public void fillRect(int x,int y,int width,int height,int color) { wrapperContained.fillRect(x,y,width,height,color); }
public void loadFromTextureImage(int level,boolean removeAlpha) { wrapperContained.loadFromTextureImage(level,removeAlpha); }
public void copyRect(yarnwrap.client.texture.NativeImage image,int x,int y,int destX,int destY,int width,int height,boolean flipX,boolean flipY) { wrapperContained.copyRect(image.wrapperContained,x,y,destX,destY,width,height,flipX,flipY); }
public yarnwrap.client.texture.NativeImage applyToCopy(java.util.function.IntUnaryOperator operator) { return new yarnwrap.client.texture.NativeImage(wrapperContained.applyToCopy(operator)); }
public int[] copyPixelsRgba() { return wrapperContained.copyPixelsRgba(); }
// public yarnwrap.client.texture.NativeImage read(byte bytes) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(bytes)); }
public void apply(java.util.function.IntUnaryOperator operator) { wrapperContained.apply(operator); }

}