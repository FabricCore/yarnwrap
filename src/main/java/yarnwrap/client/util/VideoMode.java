package yarnwrap.client.util;
public class VideoMode { public net.minecraft.client.util.VideoMode wrapperContained; public VideoMode(net.minecraft.client.util.VideoMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public int refreshRate() { return wrapperContained.refreshRate; }
// public void refreshRate(int value) { wrapperContained.refreshRate = value; }
// public int blueBits() { return wrapperContained.blueBits; }
// public void blueBits(int value) { wrapperContained.blueBits = value; }
// public int greenBits() { return wrapperContained.greenBits; }
// public void greenBits(int value) { wrapperContained.greenBits = value; }
// public int redBits() { return wrapperContained.redBits; }
// public void redBits(int value) { wrapperContained.redBits = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public java.util.regex.Pattern PATTERN() { return wrapperContained.PATTERN; }
// public void PATTERN(java.util.regex.Pattern value) { wrapperContained.PATTERN = value; }
public java.util.Optional fromString(java.lang.String string) { return wrapperContained.fromString(string); }
public int getRedBits() { return wrapperContained.getRedBits(); }
public int getGreenBits() { return wrapperContained.getGreenBits(); }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
public java.lang.String asString() { return wrapperContained.asString(); }
public int getRefreshRate() { return wrapperContained.getRefreshRate(); }
public int getBlueBits() { return wrapperContained.getBlueBits(); }

}