package yarnwrap.client.gl;
public class Framebuffer { public net.minecraft.client.gl.Framebuffer wrapperContained; public Framebuffer(net.minecraft.client.gl.Framebuffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int depthAttachment() { return wrapperContained.depthAttachment; }
// public int colorAttachment() { return wrapperContained.colorAttachment; }
public int fbo() { return wrapperContained.fbo; }
public int viewportHeight() { return wrapperContained.viewportHeight; }
public boolean useDepthAttachment() { return wrapperContained.useDepthAttachment; }
// public float[] clearColor() { return wrapperContained.clearColor; }
public int viewportWidth() { return wrapperContained.viewportWidth; }
public int textureHeight() { return wrapperContained.textureHeight; }
public int textureWidth() { return wrapperContained.textureWidth; }
public int texFilter() { return wrapperContained.texFilter; }
public void clear(boolean getError) { wrapperContained.clear(getError); }
public void initFbo(int width,int height,boolean getError) { wrapperContained.initFbo(width,height,getError); }
// public void setTexFilter(int texFilter,boolean force) { wrapperContained.setTexFilter(texFilter,force); }
// public void drawInternal(int width,int height,boolean disableBlend) { wrapperContained.drawInternal(width,height,disableBlend); }
public void resize(int width,int height,boolean getError) { wrapperContained.resize(width,height,getError); }
public void beginWrite(boolean setViewport) { wrapperContained.beginWrite(setViewport); }
public void setClearColor(float r,float g,float b,float a) { wrapperContained.setClearColor(r,g,b,a); }
public void draw(int width,int height) { wrapperContained.draw(width,height); }
public void delete() { wrapperContained.delete(); }
public void checkFramebufferStatus() { wrapperContained.checkFramebufferStatus(); }
public void endWrite() { wrapperContained.endWrite(); }
public void endRead() { wrapperContained.endRead(); }
public void draw(int width,int height,boolean disableBlend) { wrapperContained.draw(width,height,disableBlend); }
// public void bind(boolean updateViewport) { wrapperContained.bind(updateViewport); }
// public void resizeInternal(int width,int height,boolean getError) { wrapperContained.resizeInternal(width,height,getError); }
public void copyDepthFrom(yarnwrap.client.gl.Framebuffer framebuffer) { wrapperContained.copyDepthFrom(framebuffer.wrapperContained); }
public int getColorAttachment() { return wrapperContained.getColorAttachment(); }
public int getDepthAttachment() { return wrapperContained.getDepthAttachment(); }
public void beginRead() { wrapperContained.beginRead(); }
public void setTexFilter(int texFilter) { wrapperContained.setTexFilter(texFilter); }

}