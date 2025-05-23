package yarnwrap.client.font;
public class RenderableGlyph { public net.minecraft.client.font.RenderableGlyph wrapperContained; public RenderableGlyph(net.minecraft.client.font.RenderableGlyph wrapperContained) { this.wrapperContained = wrapperContained; }

public float getXMax() { return wrapperContained.getXMax(); }
// public static float getXMax() { return net.minecraft.client.font.RenderableGlyph.getXMax(); }
public float getYMin() { return wrapperContained.getYMin(); }
// public static float getYMin() { return net.minecraft.client.font.RenderableGlyph.getYMin(); }
public float getYMax() { return wrapperContained.getYMax(); }
// public static float getYMax() { return net.minecraft.client.font.RenderableGlyph.getYMax(); }
public void upload(int x,int y,com.mojang.blaze3d.textures.GpuTexture texture) { wrapperContained.upload(x,y,texture); }
// public static void upload(int x,int y,com.mojang.blaze3d.textures.GpuTexture texture, ) { net.minecraft.client.font.RenderableGlyph.upload(x,y,texture); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.font.RenderableGlyph.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.font.RenderableGlyph.getHeight(); }
public boolean hasColor() { return wrapperContained.hasColor(); }
// public static boolean hasColor() { return net.minecraft.client.font.RenderableGlyph.hasColor(); }
public float getXMin() { return wrapperContained.getXMin(); }
// public static float getXMin() { return net.minecraft.client.font.RenderableGlyph.getXMin(); }
public float getOversample() { return wrapperContained.getOversample(); }
// public static float getOversample() { return net.minecraft.client.font.RenderableGlyph.getOversample(); }
public float getBearingX() { return wrapperContained.getBearingX(); }
// public static float getBearingX() { return net.minecraft.client.font.RenderableGlyph.getBearingX(); }
public float getAscent() { return wrapperContained.getAscent(); }
// public static float getAscent() { return net.minecraft.client.font.RenderableGlyph.getAscent(); }

}