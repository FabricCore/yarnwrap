package yarnwrap.client.font;
public class RenderableGlyph { public net.minecraft.client.font.RenderableGlyph wrapperContained; public RenderableGlyph(net.minecraft.client.font.RenderableGlyph wrapperContained) { this.wrapperContained = wrapperContained; }

public float getXMax() { return wrapperContained.getXMax(); }
public float getYMin() { return wrapperContained.getYMin(); }
public float getYMax() { return wrapperContained.getYMax(); }
public void upload(int x,int y) { wrapperContained.upload(x,y); }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
public boolean hasColor() { return wrapperContained.hasColor(); }
public float getXMin() { return wrapperContained.getXMin(); }
public float getOversample() { return wrapperContained.getOversample(); }
public float getBearingX() { return wrapperContained.getBearingX(); }
public float getAscent() { return wrapperContained.getAscent(); }

}