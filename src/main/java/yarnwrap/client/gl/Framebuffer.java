package yarnwrap.client.gl;
public class Framebuffer { public net.minecraft.client.gl.Framebuffer wrapperContained; public Framebuffer(net.minecraft.client.gl.Framebuffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int depthAttachment() { return wrapperContained.depthAttachment; }
// public void depthAttachment(int value) { wrapperContained.depthAttachment = value; }
// public static int depthAttachment() { return net.minecraft.client.gl.Framebuffer.depthAttachment; }
// public static void depthAttachment(int value, ) { net.minecraft.client.gl.Framebuffer.depthAttachment = value; }

// public int colorAttachment() { return wrapperContained.colorAttachment; }
// public void colorAttachment(int value) { wrapperContained.colorAttachment = value; }
// public static int colorAttachment() { return net.minecraft.client.gl.Framebuffer.colorAttachment; }
// public static void colorAttachment(int value, ) { net.minecraft.client.gl.Framebuffer.colorAttachment = value; }

public int fbo() { return wrapperContained.fbo; }
public void fbo(int value) { wrapperContained.fbo = value; }
// public static int fbo() { return net.minecraft.client.gl.Framebuffer.fbo; }
// public static void fbo(int value, ) { net.minecraft.client.gl.Framebuffer.fbo = value; }

public int viewportHeight() { return wrapperContained.viewportHeight; }
public void viewportHeight(int value) { wrapperContained.viewportHeight = value; }
// public static int viewportHeight() { return net.minecraft.client.gl.Framebuffer.viewportHeight; }
// public static void viewportHeight(int value, ) { net.minecraft.client.gl.Framebuffer.viewportHeight = value; }

public boolean useDepthAttachment() { return wrapperContained.useDepthAttachment; }
// public void useDepthAttachment(boolean value) { wrapperContained.useDepthAttachment = value; }
// public static boolean useDepthAttachment() { return net.minecraft.client.gl.Framebuffer.useDepthAttachment; }
// public static void useDepthAttachment(boolean value, ) { net.minecraft.client.gl.Framebuffer.useDepthAttachment = value; }

// public float[] clearColor() { return wrapperContained.clearColor; }
// public void clearColor(float[] value) { wrapperContained.clearColor = value; }
// public static float[] clearColor() { return net.minecraft.client.gl.Framebuffer.clearColor; }
// public static void clearColor(float[] value, ) { net.minecraft.client.gl.Framebuffer.clearColor = value; }

public int viewportWidth() { return wrapperContained.viewportWidth; }
public void viewportWidth(int value) { wrapperContained.viewportWidth = value; }
// public static int viewportWidth() { return net.minecraft.client.gl.Framebuffer.viewportWidth; }
// public static void viewportWidth(int value, ) { net.minecraft.client.gl.Framebuffer.viewportWidth = value; }

public int textureHeight() { return wrapperContained.textureHeight; }
public void textureHeight(int value) { wrapperContained.textureHeight = value; }
// public static int textureHeight() { return net.minecraft.client.gl.Framebuffer.textureHeight; }
// public static void textureHeight(int value, ) { net.minecraft.client.gl.Framebuffer.textureHeight = value; }

public int textureWidth() { return wrapperContained.textureWidth; }
public void textureWidth(int value) { wrapperContained.textureWidth = value; }
// public static int textureWidth() { return net.minecraft.client.gl.Framebuffer.textureWidth; }
// public static void textureWidth(int value, ) { net.minecraft.client.gl.Framebuffer.textureWidth = value; }

public int texFilter() { return wrapperContained.texFilter; }
public void texFilter(int value) { wrapperContained.texFilter = value; }
// public static int texFilter() { return net.minecraft.client.gl.Framebuffer.texFilter; }
// public static void texFilter(int value, ) { net.minecraft.client.gl.Framebuffer.texFilter = value; }

// public Framebuffer(boolean useDepth) { this.wrapperContained = new net.minecraft.client.gl.Framebuffer(useDepth); }
public void clear(boolean getError) { wrapperContained.clear(getError); }
// public static void clear(boolean getError, ) { net.minecraft.client.gl.Framebuffer.clear(getError); }
public void initFbo(int width,int height,boolean getError) { wrapperContained.initFbo(width,height,getError); }
// public static void initFbo(int width,int height,boolean getError, ) { net.minecraft.client.gl.Framebuffer.initFbo(width,height,getError); }
// public void setTexFilter(int texFilter,boolean force) { wrapperContained.setTexFilter(texFilter,force); }
// public static void setTexFilter(int texFilter,boolean force, ) { net.minecraft.client.gl.Framebuffer.setTexFilter(texFilter,force); }
// public void drawInternal(int width,int height,boolean disableBlend) { wrapperContained.drawInternal(width,height,disableBlend); }
// public static void drawInternal(int width,int height,boolean disableBlend, ) { net.minecraft.client.gl.Framebuffer.drawInternal(width,height,disableBlend); }
public void resize(int width,int height,boolean getError) { wrapperContained.resize(width,height,getError); }
// public static void resize(int width,int height,boolean getError, ) { net.minecraft.client.gl.Framebuffer.resize(width,height,getError); }
public void beginWrite(boolean setViewport) { wrapperContained.beginWrite(setViewport); }
// public static void beginWrite(boolean setViewport, ) { net.minecraft.client.gl.Framebuffer.beginWrite(setViewport); }
public void setClearColor(float r,float g,float b,float a) { wrapperContained.setClearColor(r,g,b,a); }
// public static void setClearColor(float r,float g,float b,float a, ) { net.minecraft.client.gl.Framebuffer.setClearColor(r,g,b,a); }
public void draw(int width,int height) { wrapperContained.draw(width,height); }
// public static void draw(int width,int height, ) { net.minecraft.client.gl.Framebuffer.draw(width,height); }
public void delete() { wrapperContained.delete(); }
// public static void delete() { net.minecraft.client.gl.Framebuffer.delete(); }
public void checkFramebufferStatus() { wrapperContained.checkFramebufferStatus(); }
// public static void checkFramebufferStatus() { net.minecraft.client.gl.Framebuffer.checkFramebufferStatus(); }
public void endWrite() { wrapperContained.endWrite(); }
// public static void endWrite() { net.minecraft.client.gl.Framebuffer.endWrite(); }
public void endRead() { wrapperContained.endRead(); }
// public static void endRead() { net.minecraft.client.gl.Framebuffer.endRead(); }
public void draw(int width,int height,boolean disableBlend) { wrapperContained.draw(width,height,disableBlend); }
// public static void draw(int width,int height,boolean disableBlend, ) { net.minecraft.client.gl.Framebuffer.draw(width,height,disableBlend); }
// public void bind(boolean updateViewport) { wrapperContained.bind(updateViewport); }
// public static void bind(boolean updateViewport, ) { net.minecraft.client.gl.Framebuffer.bind(updateViewport); }
// public void resizeInternal(int width,int height,boolean getError) { wrapperContained.resizeInternal(width,height,getError); }
// public static void resizeInternal(int width,int height,boolean getError, ) { net.minecraft.client.gl.Framebuffer.resizeInternal(width,height,getError); }
public void copyDepthFrom(yarnwrap.client.gl.Framebuffer framebuffer) { wrapperContained.copyDepthFrom(framebuffer.wrapperContained); }
// public static void copyDepthFrom(yarnwrap.client.gl.Framebuffer framebuffer, ) { net.minecraft.client.gl.Framebuffer.copyDepthFrom(framebuffer.wrapperContained); }
public int getColorAttachment() { return wrapperContained.getColorAttachment(); }
// public static int getColorAttachment() { return net.minecraft.client.gl.Framebuffer.getColorAttachment(); }
public int getDepthAttachment() { return wrapperContained.getDepthAttachment(); }
// public static int getDepthAttachment() { return net.minecraft.client.gl.Framebuffer.getDepthAttachment(); }
public void beginRead() { wrapperContained.beginRead(); }
// public static void beginRead() { net.minecraft.client.gl.Framebuffer.beginRead(); }
public void setTexFilter(int texFilter) { wrapperContained.setTexFilter(texFilter); }
// public static void setTexFilter(int texFilter, ) { net.minecraft.client.gl.Framebuffer.setTexFilter(texFilter); }

}