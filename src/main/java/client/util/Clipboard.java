package yarnwrap.client.util;
public class Clipboard { public net.minecraft.client.util.Clipboard wrapperContained; public Clipboard(net.minecraft.client.util.Clipboard wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.ByteBuffer clipboardBuffer() { return wrapperContained.clipboardBuffer; }
public int GLFW_FORMAT_UNAVAILABLE() { return wrapperContained.GLFW_FORMAT_UNAVAILABLE; }
public java.lang.String getClipboard(long window,org.lwjgl.glfw.GLFWErrorCallbackI errorCallback) { return wrapperContained.getClipboard(window,errorCallback); }
// public void setClipboard(long window,java.nio.ByteBuffer clipboardBuffer,byte content) { wrapperContained.setClipboard(window,clipboardBuffer,content); }
public void setClipboard(long window,java.lang.String string) { wrapperContained.setClipboard(window,string); }

}