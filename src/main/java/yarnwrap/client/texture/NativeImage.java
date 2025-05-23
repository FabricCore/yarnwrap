package yarnwrap.client.texture;
public class NativeImage { public net.minecraft.client.texture.NativeImage wrapperContained; public NativeImage(net.minecraft.client.texture.NativeImage wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object format() { return wrapperContained.format; }
// // public void format(Object value) { wrapperContained.format = value; }
// // public static Object format() { return net.minecraft.client.texture.NativeImage.format; }
// // public static void format(Object value, ) { net.minecraft.client.texture.NativeImage.format = value; }

// public long sizeBytes() { return wrapperContained.sizeBytes; }
// public void sizeBytes(long value) { wrapperContained.sizeBytes = value; }
// public static long sizeBytes() { return net.minecraft.client.texture.NativeImage.sizeBytes; }
// public static void sizeBytes(long value, ) { net.minecraft.client.texture.NativeImage.sizeBytes = value; }

// public long pointer() { return wrapperContained.pointer; }
// public void pointer(long value) { wrapperContained.pointer = value; }
// public static long pointer() { return net.minecraft.client.texture.NativeImage.pointer; }
// public static void pointer(long value, ) { net.minecraft.client.texture.NativeImage.pointer = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.texture.NativeImage.height; }
// public static void height(int value, ) { net.minecraft.client.texture.NativeImage.height = value; }

// public boolean isStbImage() { return wrapperContained.isStbImage; }
// public void isStbImage(boolean value) { wrapperContained.isStbImage = value; }
// public static boolean isStbImage() { return net.minecraft.client.texture.NativeImage.isStbImage; }
// public static void isStbImage(boolean value, ) { net.minecraft.client.texture.NativeImage.isStbImage = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.texture.NativeImage.width; }
// public static void width(int value, ) { net.minecraft.client.texture.NativeImage.width = value; }

// public java.util.Set WRITE_TO_FILE_OPEN_OPTIONS() { return wrapperContained.WRITE_TO_FILE_OPEN_OPTIONS; }
// public void WRITE_TO_FILE_OPEN_OPTIONS(java.util.Set value) { wrapperContained.WRITE_TO_FILE_OPEN_OPTIONS = value; }
// public static java.util.Set WRITE_TO_FILE_OPEN_OPTIONS() { return net.minecraft.client.texture.NativeImage.WRITE_TO_FILE_OPEN_OPTIONS; }
// public static void WRITE_TO_FILE_OPEN_OPTIONS(java.util.Set value, ) { net.minecraft.client.texture.NativeImage.WRITE_TO_FILE_OPEN_OPTIONS = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.NativeImage.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.NativeImage.LOGGER = value; }

// public com.mojang.jtracy.MemoryPool MEMORY_POOL() { return wrapperContained.MEMORY_POOL; }
// public void MEMORY_POOL(com.mojang.jtracy.MemoryPool value) { wrapperContained.MEMORY_POOL = value; }
// public static com.mojang.jtracy.MemoryPool MEMORY_POOL() { return net.minecraft.client.texture.NativeImage.MEMORY_POOL; }
// public static void MEMORY_POOL(com.mojang.jtracy.MemoryPool value, ) { net.minecraft.client.texture.NativeImage.MEMORY_POOL = value; }

public NativeImage(int width,int height,boolean useStb) { this.wrapperContained = new net.minecraft.client.texture.NativeImage(width,height,useStb); }
// public NativeImage(Object format,int width,int height,boolean useStb) { this.wrapperContained = new net.minecraft.client.texture.NativeImage(format,width,height,useStb); }
// public NativeImage(Object format,int width,int height,boolean useStb,long pointer) { this.wrapperContained = new net.minecraft.client.texture.NativeImage(format,width,height,useStb,pointer); }
public void resizeSubRectTo(int x,int y,int width,int height,yarnwrap.client.texture.NativeImage targetImage) { wrapperContained.resizeSubRectTo(x,y,width,height,targetImage.wrapperContained); }
// public static void resizeSubRectTo(int x,int y,int width,int height,yarnwrap.client.texture.NativeImage targetImage, ) { net.minecraft.client.texture.NativeImage.resizeSubRectTo(x,y,width,height,targetImage.wrapperContained); }
public void untrack() { wrapperContained.untrack(); }
// public static void untrack() { net.minecraft.client.texture.NativeImage.untrack(); }
// public yarnwrap.client.texture.NativeImage read(Object format,java.nio.ByteBuffer buffer) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(format,buffer)); }
// public static yarnwrap.client.texture.NativeImage read(Object format,java.nio.ByteBuffer buffer, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.NativeImage.read(format,buffer)); }
public void copyRect(int x,int y,int translateX,int translateY,int width,int height,boolean flipX,boolean flipY) { wrapperContained.copyRect(x,y,translateX,translateY,width,height,flipX,flipY); }
// public static void copyRect(int x,int y,int translateX,int translateY,int width,int height,boolean flipX,boolean flipY, ) { net.minecraft.client.texture.NativeImage.copyRect(x,y,translateX,translateY,width,height,flipX,flipY); }
public void setColor(int x,int y,int color) { wrapperContained.setColor(x,y,color); }
// public static void setColor(int x,int y,int color, ) { net.minecraft.client.texture.NativeImage.setColor(x,y,color); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.texture.NativeImage.getWidth(); }
// public yarnwrap.client.texture.NativeImage read(java.io.InputStream stream) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(stream)); }
// public static yarnwrap.client.texture.NativeImage read(java.io.InputStream stream, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.NativeImage.read(stream)); }
// public yarnwrap.client.texture.NativeImage read(Object format,java.io.InputStream stream) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(format,stream)); }
// public static yarnwrap.client.texture.NativeImage read(Object format,java.io.InputStream stream, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.NativeImage.read(format,stream)); }
public byte getOpacity(int x,int y) { return wrapperContained.getOpacity(x,y); }
// public static byte getOpacity(int x,int y, ) { return net.minecraft.client.texture.NativeImage.getOpacity(x,y); }
// public void writeTo(java.nio.file.Path path) { wrapperContained.writeTo(path); }
// public static void writeTo(java.nio.file.Path path, ) { net.minecraft.client.texture.NativeImage.writeTo(path); }
// public int getColor(int x,int y) { return wrapperContained.getColor(x,y); }
// public static int getColor(int x,int y, ) { return net.minecraft.client.texture.NativeImage.getColor(x,y); }
public boolean makeGlyphBitmapSubpixel(org.lwjgl.util.freetype.FT_Face face,int glyphIndex) { return wrapperContained.makeGlyphBitmapSubpixel(face,glyphIndex); }
// public static boolean makeGlyphBitmapSubpixel(org.lwjgl.util.freetype.FT_Face face,int glyphIndex, ) { return net.minecraft.client.texture.NativeImage.makeGlyphBitmapSubpixel(face,glyphIndex); }
public void copyFrom(yarnwrap.client.texture.NativeImage image) { wrapperContained.copyFrom(image.wrapperContained); }
// public static void copyFrom(yarnwrap.client.texture.NativeImage image, ) { net.minecraft.client.texture.NativeImage.copyFrom(image.wrapperContained); }
public Object getFormat() { return wrapperContained.getFormat(); }
// public static Object getFormat() { return net.minecraft.client.texture.NativeImage.getFormat(); }
// public void checkAllocated() { wrapperContained.checkAllocated(); }
// public static void checkAllocated() { net.minecraft.client.texture.NativeImage.checkAllocated(); }
public int[] makePixelArray() { return wrapperContained.makePixelArray(); }
// public static int[] makePixelArray() { return net.minecraft.client.texture.NativeImage.makePixelArray(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.texture.NativeImage.getHeight(); }
// public yarnwrap.client.texture.NativeImage read(java.nio.ByteBuffer buffer) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(buffer)); }
// public static yarnwrap.client.texture.NativeImage read(java.nio.ByteBuffer buffer, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.NativeImage.read(buffer)); }
// public void writeTo(java.io.File path) { wrapperContained.writeTo(path); }
// public static void writeTo(java.io.File path, ) { net.minecraft.client.texture.NativeImage.writeTo(path); }
public void fillRect(int x,int y,int width,int height,int color) { wrapperContained.fillRect(x,y,width,height,color); }
// public static void fillRect(int x,int y,int width,int height,int color, ) { net.minecraft.client.texture.NativeImage.fillRect(x,y,width,height,color); }
// public boolean write(java.nio.channels.WritableByteChannel channel) { return wrapperContained.write(channel); }
// public static boolean write(java.nio.channels.WritableByteChannel channel, ) { return net.minecraft.client.texture.NativeImage.write(channel); }
// public boolean isOutOfBounds(int x,int y) { return wrapperContained.isOutOfBounds(x,y); }
// public static boolean isOutOfBounds(int x,int y, ) { return net.minecraft.client.texture.NativeImage.isOutOfBounds(x,y); }
public void copyRect(yarnwrap.client.texture.NativeImage image,int x,int y,int destX,int destY,int width,int height,boolean flipX,boolean flipY) { wrapperContained.copyRect(image.wrapperContained,x,y,destX,destY,width,height,flipX,flipY); }
// public static void copyRect(yarnwrap.client.texture.NativeImage image,int x,int y,int destX,int destY,int width,int height,boolean flipX,boolean flipY, ) { net.minecraft.client.texture.NativeImage.copyRect(image.wrapperContained,x,y,destX,destY,width,height,flipX,flipY); }
public yarnwrap.client.texture.NativeImage applyToCopy(java.util.function.IntUnaryOperator operator) { return new yarnwrap.client.texture.NativeImage(wrapperContained.applyToCopy(operator)); }
// public static yarnwrap.client.texture.NativeImage applyToCopy(java.util.function.IntUnaryOperator operator, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.NativeImage.applyToCopy(operator)); }
public int[] copyPixelsAbgr() { return wrapperContained.copyPixelsAbgr(); }
// public static int[] copyPixelsAbgr() { return net.minecraft.client.texture.NativeImage.copyPixelsAbgr(); }
// public yarnwrap.client.texture.NativeImage read(byte bytes) { return new yarnwrap.client.texture.NativeImage(wrapperContained.read(bytes)); }
// public static yarnwrap.client.texture.NativeImage read(byte bytes, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.NativeImage.read(bytes)); }
public int getColorArgb(int x,int y) { return wrapperContained.getColorArgb(x,y); }
// public static int getColorArgb(int x,int y, ) { return net.minecraft.client.texture.NativeImage.getColorArgb(x,y); }
public void setColorArgb(int x,int y,int color) { wrapperContained.setColorArgb(x,y,color); }
// public static void setColorArgb(int x,int y,int color, ) { net.minecraft.client.texture.NativeImage.setColorArgb(x,y,color); }
public int[] copyPixelsArgb() { return wrapperContained.copyPixelsArgb(); }
// public static int[] copyPixelsArgb() { return net.minecraft.client.texture.NativeImage.copyPixelsArgb(); }
// public yarnwrap.client.texture.NativeImage putAndRead(java.nio.ByteBuffer buffer,byte bytes) { return new yarnwrap.client.texture.NativeImage(wrapperContained.putAndRead(buffer,bytes)); }
// public static yarnwrap.client.texture.NativeImage putAndRead(java.nio.ByteBuffer buffer,byte bytes, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.NativeImage.putAndRead(buffer,bytes)); }
public long imageId() { return wrapperContained.imageId(); }
// public static long imageId() { return net.minecraft.client.texture.NativeImage.imageId(); }

}