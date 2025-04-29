package yarnwrap.client.model;
public class TextureDimensions { public net.minecraft.client.model.TextureDimensions wrapperContained; public TextureDimensions(net.minecraft.client.model.TextureDimensions wrapperContained) { this.wrapperContained = wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.model.TextureDimensions.width; }
// public static void width(int value, ) { net.minecraft.client.model.TextureDimensions.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.model.TextureDimensions.height; }
// public static void height(int value, ) { net.minecraft.client.model.TextureDimensions.height = value; }

public TextureDimensions(int width,int height) { this.wrapperContained = new net.minecraft.client.model.TextureDimensions(width,height); }

}