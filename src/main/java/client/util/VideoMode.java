package yarnwrap.client.util;
public class VideoMode { public net.minecraft.client.util.VideoMode wrapperContained; public VideoMode(net.minecraft.client.util.VideoMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public int refreshRate() { return wrapperContained.refreshRate; }
// public int blueBits() { return wrapperContained.blueBits; }
// public int greenBits() { return wrapperContained.greenBits; }
// public int redBits() { return wrapperContained.redBits; }
// public int height() { return wrapperContained.height; }
// public int width() { return wrapperContained.width; }
// public java.util.regex.Pattern PATTERN() { return wrapperContained.PATTERN; }
public java.util.Optional fromString(java.lang.String string) { return wrapperContained.fromString(string); }
public int getRedBits() { return wrapperContained.getRedBits(); }
public int getGreenBits() { return wrapperContained.getGreenBits(); }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
public java.lang.String asString() { return wrapperContained.asString(); }
public int getRefreshRate() { return wrapperContained.getRefreshRate(); }
public int getBlueBits() { return wrapperContained.getBlueBits(); }

}