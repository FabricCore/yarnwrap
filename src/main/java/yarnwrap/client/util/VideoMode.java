package yarnwrap.client.util;
public class VideoMode { public net.minecraft.client.util.VideoMode wrapperContained; public VideoMode(net.minecraft.client.util.VideoMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public int refreshRate() { return wrapperContained.refreshRate; }
// public void refreshRate(int value) { wrapperContained.refreshRate = value; }
// public static int refreshRate() { return net.minecraft.client.util.VideoMode.refreshRate; }
// public static void refreshRate(int value, ) { net.minecraft.client.util.VideoMode.refreshRate = value; }

// public int blueBits() { return wrapperContained.blueBits; }
// public void blueBits(int value) { wrapperContained.blueBits = value; }
// public static int blueBits() { return net.minecraft.client.util.VideoMode.blueBits; }
// public static void blueBits(int value, ) { net.minecraft.client.util.VideoMode.blueBits = value; }

// public int greenBits() { return wrapperContained.greenBits; }
// public void greenBits(int value) { wrapperContained.greenBits = value; }
// public static int greenBits() { return net.minecraft.client.util.VideoMode.greenBits; }
// public static void greenBits(int value, ) { net.minecraft.client.util.VideoMode.greenBits = value; }

// public int redBits() { return wrapperContained.redBits; }
// public void redBits(int value) { wrapperContained.redBits = value; }
// public static int redBits() { return net.minecraft.client.util.VideoMode.redBits; }
// public static void redBits(int value, ) { net.minecraft.client.util.VideoMode.redBits = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.util.VideoMode.height; }
// public static void height(int value, ) { net.minecraft.client.util.VideoMode.height = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.util.VideoMode.width; }
// public static void width(int value, ) { net.minecraft.client.util.VideoMode.width = value; }

// public java.util.regex.Pattern PATTERN() { return wrapperContained.PATTERN; }
// public void PATTERN(java.util.regex.Pattern value) { wrapperContained.PATTERN = value; }
// public static java.util.regex.Pattern PATTERN() { return net.minecraft.client.util.VideoMode.PATTERN; }
// public static void PATTERN(java.util.regex.Pattern value, ) { net.minecraft.client.util.VideoMode.PATTERN = value; }

public VideoMode(int width,int height,int redBits,int greenBits,int blueBits,int refreshRate) { this.wrapperContained = new net.minecraft.client.util.VideoMode(width,height,redBits,greenBits,blueBits,refreshRate); }
// public VideoMode(Object buffer) { this.wrapperContained = new net.minecraft.client.util.VideoMode(buffer); }
public VideoMode(org.lwjgl.glfw.GLFWVidMode vidMode) { this.wrapperContained = new net.minecraft.client.util.VideoMode(vidMode); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.util.VideoMode.equals(o); }
// public java.util.Optional fromString(java.lang.String string) { return wrapperContained.fromString(string); }
// public static java.util.Optional fromString(java.lang.String string, ) { return net.minecraft.client.util.VideoMode.fromString(string); }
public int getRedBits() { return wrapperContained.getRedBits(); }
// public static int getRedBits() { return net.minecraft.client.util.VideoMode.getRedBits(); }
public int getGreenBits() { return wrapperContained.getGreenBits(); }
// public static int getGreenBits() { return net.minecraft.client.util.VideoMode.getGreenBits(); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.util.VideoMode.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.util.VideoMode.getHeight(); }
public java.lang.String asString() { return wrapperContained.asString(); }
// public static java.lang.String asString() { return net.minecraft.client.util.VideoMode.asString(); }
public int getRefreshRate() { return wrapperContained.getRefreshRate(); }
// public static int getRefreshRate() { return net.minecraft.client.util.VideoMode.getRefreshRate(); }
public int getBlueBits() { return wrapperContained.getBlueBits(); }
// public static int getBlueBits() { return net.minecraft.client.util.VideoMode.getBlueBits(); }

}