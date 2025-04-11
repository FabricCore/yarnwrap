package yarnwrap.client.texture;
public class TextureStitcher { public net.minecraft.client.texture.TextureStitcher wrapperContained; public TextureStitcher(net.minecraft.client.texture.TextureStitcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
// public java.util.List holders() { return wrapperContained.holders; }
// public void holders(java.util.List value) { wrapperContained.holders = value; }
// public int maxHeight() { return wrapperContained.maxHeight; }
// public void maxHeight(int value) { wrapperContained.maxHeight = value; }
// public java.util.List slots() { return wrapperContained.slots; }
// public void slots(java.util.List value) { wrapperContained.slots = value; }
// public int maxWidth() { return wrapperContained.maxWidth; }
// public void maxWidth(int value) { wrapperContained.maxWidth = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int mipLevel() { return wrapperContained.mipLevel; }
// public void mipLevel(int value) { wrapperContained.mipLevel = value; }
// public void getStitchedSprites(Object consumer) { wrapperContained.getStitchedSprites(consumer); }
// public boolean fit(Object holder) { return wrapperContained.fit(holder); }
// public int applyMipLevel(int size,int mipLevel) { return wrapperContained.applyMipLevel(size,mipLevel); }
// public boolean growAndFit(Object holder) { return wrapperContained.growAndFit(holder); }
// public void add(Object info) { wrapperContained.add(info); }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
public void stitch() { wrapperContained.stitch(); }

}