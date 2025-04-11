package yarnwrap.client.model;
public class TextureDimensions { public net.minecraft.client.model.TextureDimensions wrapperContained; public TextureDimensions(net.minecraft.client.model.TextureDimensions wrapperContained) { this.wrapperContained = wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
public TextureDimensions(int width,int height) { this.wrapperContained = new net.minecraft.client.model.TextureDimensions(width,height); }

}