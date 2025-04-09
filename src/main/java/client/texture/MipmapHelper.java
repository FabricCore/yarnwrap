package yarnwrap.client.texture;
public class MipmapHelper { public net.minecraft.client.texture.MipmapHelper wrapperContained; public MipmapHelper(net.minecraft.client.texture.MipmapHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public float[] COLOR_FRACTIONS() { return wrapperContained.COLOR_FRACTIONS; }
// public int MIN_ALPHA() { return wrapperContained.MIN_ALPHA; }
// public float getColorFraction(int value) { return wrapperContained.getColorFraction(value); }
// public int getColorComponent(int one,int two,int three,int four,int bits) { return wrapperContained.getColorComponent(one,two,three,four,bits); }
// public int blend(int one,int two,int three,int four,boolean checkAlpha) { return wrapperContained.blend(one,two,three,four,checkAlpha); }
public net.minecraft.client.texture.NativeImage[] getMipmapLevelsImages(net.minecraft.client.texture.NativeImage[] originals,int mipmap) { return wrapperContained.getMipmapLevelsImages(originals,mipmap); }
// public boolean hasAlpha(yarnwrap.client.texture.NativeImage image) { return wrapperContained.hasAlpha(image.wrapperContained); }

}