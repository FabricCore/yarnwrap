package yarnwrap.client.gl;
public class WindowFramebuffer { public net.minecraft.client.gl.WindowFramebuffer wrapperContained; public WindowFramebuffer(net.minecraft.client.gl.WindowFramebuffer wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEFAULT_WIDTH() { return wrapperContained.DEFAULT_WIDTH; }
// public void DEFAULT_WIDTH(int value) { wrapperContained.DEFAULT_WIDTH = value; }
public int DEFAULT_HEIGHT() { return wrapperContained.DEFAULT_HEIGHT; }
// public void DEFAULT_HEIGHT(int value) { wrapperContained.DEFAULT_HEIGHT = value; }
// public Object DEFAULT() { return wrapperContained.DEFAULT; }
// // public void DEFAULT(Object value) { wrapperContained.DEFAULT = value; }
public WindowFramebuffer(int width,int height) { this.wrapperContained = new net.minecraft.client.gl.WindowFramebuffer(width,height); }
// public boolean supportsColor(Object size) { return wrapperContained.supportsColor(size); }
// public void init(int width,int height) { wrapperContained.init(width,height); }
// public boolean supportsDepth(Object size) { return wrapperContained.supportsDepth(size); }
// public Object findSuitableSize(int width,int height) { return wrapperContained.findSuitableSize(width,height); }

}