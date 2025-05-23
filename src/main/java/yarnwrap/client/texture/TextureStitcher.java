package yarnwrap.client.texture;
public class TextureStitcher { public net.minecraft.client.texture.TextureStitcher wrapperContained; public TextureStitcher(net.minecraft.client.texture.TextureStitcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List holders() { return wrapperContained.holders; }
// public void holders(java.util.List value) { wrapperContained.holders = value; }
// public static java.util.List holders() { return net.minecraft.client.texture.TextureStitcher.holders; }
// public static void holders(java.util.List value, ) { net.minecraft.client.texture.TextureStitcher.holders = value; }

// public int maxHeight() { return wrapperContained.maxHeight; }
// public void maxHeight(int value) { wrapperContained.maxHeight = value; }
// public static int maxHeight() { return net.minecraft.client.texture.TextureStitcher.maxHeight; }
// public static void maxHeight(int value, ) { net.minecraft.client.texture.TextureStitcher.maxHeight = value; }

// public java.util.List slots() { return wrapperContained.slots; }
// public void slots(java.util.List value) { wrapperContained.slots = value; }
// public static java.util.List slots() { return net.minecraft.client.texture.TextureStitcher.slots; }
// public static void slots(java.util.List value, ) { net.minecraft.client.texture.TextureStitcher.slots = value; }

// public int maxWidth() { return wrapperContained.maxWidth; }
// public void maxWidth(int value) { wrapperContained.maxWidth = value; }
// public static int maxWidth() { return net.minecraft.client.texture.TextureStitcher.maxWidth; }
// public static void maxWidth(int value, ) { net.minecraft.client.texture.TextureStitcher.maxWidth = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.texture.TextureStitcher.height; }
// public static void height(int value, ) { net.minecraft.client.texture.TextureStitcher.height = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.texture.TextureStitcher.width; }
// public static void width(int value, ) { net.minecraft.client.texture.TextureStitcher.width = value; }

// public int mipLevel() { return wrapperContained.mipLevel; }
// public void mipLevel(int value) { wrapperContained.mipLevel = value; }
// public static int mipLevel() { return net.minecraft.client.texture.TextureStitcher.mipLevel; }
// public static void mipLevel(int value, ) { net.minecraft.client.texture.TextureStitcher.mipLevel = value; }

// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
// public static java.util.Comparator COMPARATOR() { return net.minecraft.client.texture.TextureStitcher.COMPARATOR; }
// public static void COMPARATOR(java.util.Comparator value, ) { net.minecraft.client.texture.TextureStitcher.COMPARATOR = value; }

public TextureStitcher(int maxWidth,int maxHeight,int mipLevel) { this.wrapperContained = new net.minecraft.client.texture.TextureStitcher(maxWidth,maxHeight,mipLevel); }
// public void getStitchedSprites(Object consumer) { wrapperContained.getStitchedSprites(consumer); }
// public static void getStitchedSprites(Object consumer, ) { net.minecraft.client.texture.TextureStitcher.getStitchedSprites(consumer); }
// public boolean fit(Object holder) { return wrapperContained.fit(holder); }
// public static boolean fit(Object holder, ) { return net.minecraft.client.texture.TextureStitcher.fit(holder); }
// public int applyMipLevel(int size,int mipLevel) { return wrapperContained.applyMipLevel(size,mipLevel); }
// public static int applyMipLevel(int size,int mipLevel, ) { return net.minecraft.client.texture.TextureStitcher.applyMipLevel(size,mipLevel); }
// public boolean growAndFit(Object holder) { return wrapperContained.growAndFit(holder); }
// public static boolean growAndFit(Object holder, ) { return net.minecraft.client.texture.TextureStitcher.growAndFit(holder); }
// public void add(Object info) { wrapperContained.add(info); }
// public static void add(Object info, ) { net.minecraft.client.texture.TextureStitcher.add(info); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.texture.TextureStitcher.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.texture.TextureStitcher.getHeight(); }
public void stitch() { wrapperContained.stitch(); }
// public static void stitch() { net.minecraft.client.texture.TextureStitcher.stitch(); }
// public yarnwrap.util.Identifier method_18337(Object holder) { return new yarnwrap.util.Identifier(wrapperContained.method_18337(holder)); }
// public static yarnwrap.util.Identifier method_18337(Object holder, ) { return new yarnwrap.util.Identifier(net.minecraft.client.texture.TextureStitcher.method_18337(holder)); }
// public java.lang.Integer method_18338(Object holder) { return wrapperContained.method_18338(holder); }
// public static java.lang.Integer method_18338(Object holder, ) { return net.minecraft.client.texture.TextureStitcher.method_18338(holder); }
// public java.lang.Integer method_18339(Object holder) { return wrapperContained.method_18339(holder); }
// public static java.lang.Integer method_18339(Object holder, ) { return net.minecraft.client.texture.TextureStitcher.method_18339(holder); }
// public Object method_21686(Object holder) { return wrapperContained.method_21686(holder); }
// public static Object method_21686(Object holder, ) { return net.minecraft.client.texture.TextureStitcher.method_21686(holder); }

}