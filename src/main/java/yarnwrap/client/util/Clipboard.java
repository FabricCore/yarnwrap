package yarnwrap.client.util;
public class Clipboard { public net.minecraft.client.util.Clipboard wrapperContained; public Clipboard(net.minecraft.client.util.Clipboard wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.ByteBuffer clipboardBuffer() { return wrapperContained.clipboardBuffer; }
// public void clipboardBuffer(java.nio.ByteBuffer value) { wrapperContained.clipboardBuffer = value; }
// public static java.nio.ByteBuffer clipboardBuffer() { return net.minecraft.client.util.Clipboard.clipboardBuffer; }
// public static void clipboardBuffer(java.nio.ByteBuffer value, ) { net.minecraft.client.util.Clipboard.clipboardBuffer = value; }

// public int GLFW_FORMAT_UNAVAILABLE() { return wrapperContained.GLFW_FORMAT_UNAVAILABLE; }
// public void GLFW_FORMAT_UNAVAILABLE(int value) { wrapperContained.GLFW_FORMAT_UNAVAILABLE = value; }
public static int GLFW_FORMAT_UNAVAILABLE() { return net.minecraft.client.util.Clipboard.GLFW_FORMAT_UNAVAILABLE; }
// public static void GLFW_FORMAT_UNAVAILABLE(int value, ) { net.minecraft.client.util.Clipboard.GLFW_FORMAT_UNAVAILABLE = value; }

public java.lang.String getClipboard(long window,org.lwjgl.glfw.GLFWErrorCallbackI errorCallback) { return wrapperContained.getClipboard(window,errorCallback); }
// public static java.lang.String getClipboard(long window,org.lwjgl.glfw.GLFWErrorCallbackI errorCallback, ) { return net.minecraft.client.util.Clipboard.getClipboard(window,errorCallback); }
// public void setClipboard(long window,java.nio.ByteBuffer clipboardBuffer,byte content) { wrapperContained.setClipboard(window,clipboardBuffer,content); }
// public static void setClipboard(long window,java.nio.ByteBuffer clipboardBuffer,byte content, ) { net.minecraft.client.util.Clipboard.setClipboard(window,clipboardBuffer,content); }
public void setClipboard(long window,java.lang.String string) { wrapperContained.setClipboard(window,string); }
// public static void setClipboard(long window,java.lang.String string, ) { net.minecraft.client.util.Clipboard.setClipboard(window,string); }

}