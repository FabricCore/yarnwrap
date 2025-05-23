package yarnwrap.client.gl;
public class BufferManager { public net.minecraft.client.gl.BufferManager wrapperContained; public BufferManager(net.minecraft.client.gl.BufferManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int createFramebuffer() { return wrapperContained.createFramebuffer(); }
// public static int createFramebuffer() { return net.minecraft.client.gl.BufferManager.createFramebuffer(); }
// public void setupFramebuffer(int framebuffer,int colorAttachment,int depthAttachment,int mipLevel,int bindTarget) { wrapperContained.setupFramebuffer(framebuffer,colorAttachment,depthAttachment,mipLevel,bindTarget); }
// public static void setupFramebuffer(int framebuffer,int colorAttachment,int depthAttachment,int mipLevel,int bindTarget, ) { net.minecraft.client.gl.BufferManager.setupFramebuffer(framebuffer,colorAttachment,depthAttachment,mipLevel,bindTarget); }
// public void setupBlitFramebuffer(int readFramebuffer,int writeFramebuffer,int srcX0,int srcY0,int srcX1,int srcY1,int dstX0,int dstY0,int dstX1,int dstY1,int mask,int filter) { wrapperContained.setupBlitFramebuffer(readFramebuffer,writeFramebuffer,srcX0,srcY0,srcX1,srcY1,dstX0,dstY0,dstX1,dstY1,mask,filter); }
// public static void setupBlitFramebuffer(int readFramebuffer,int writeFramebuffer,int srcX0,int srcY0,int srcX1,int srcY1,int dstX0,int dstY0,int dstX1,int dstY1,int mask,int filter, ) { net.minecraft.client.gl.BufferManager.setupBlitFramebuffer(readFramebuffer,writeFramebuffer,srcX0,srcY0,srcX1,srcY1,dstX0,dstY0,dstX1,dstY1,mask,filter); }
// public yarnwrap.client.gl.BufferManager create(org.lwjgl.opengl.GLCapabilities capabilities,java.util.Set usedCapabilities) { return new yarnwrap.client.gl.BufferManager(wrapperContained.create(capabilities,usedCapabilities)); }
// public static yarnwrap.client.gl.BufferManager create(org.lwjgl.opengl.GLCapabilities capabilities,java.util.Set usedCapabilities, ) { return new yarnwrap.client.gl.BufferManager(net.minecraft.client.gl.BufferManager.create(capabilities,usedCapabilities)); }
// public int createBuffer() { return wrapperContained.createBuffer(); }
// public static int createBuffer() { return net.minecraft.client.gl.BufferManager.createBuffer(); }
// public void unmapBuffer(int buffer) { wrapperContained.unmapBuffer(buffer); }
// public static void unmapBuffer(int buffer, ) { net.minecraft.client.gl.BufferManager.unmapBuffer(buffer); }
// public void flushMappedBufferRange(int buffer,int offset,int length) { wrapperContained.flushMappedBufferRange(buffer,offset,length); }
// public static void flushMappedBufferRange(int buffer,int offset,int length, ) { net.minecraft.client.gl.BufferManager.flushMappedBufferRange(buffer,offset,length); }
// public java.nio.ByteBuffer mapBufferRange(int buffer,int offset,int length,int access) { return wrapperContained.mapBufferRange(buffer,offset,length,access); }
// public static java.nio.ByteBuffer mapBufferRange(int buffer,int offset,int length,int access, ) { return net.minecraft.client.gl.BufferManager.mapBufferRange(buffer,offset,length,access); }
// public void setBufferSubData(int buffer,int offset,java.nio.ByteBuffer data) { wrapperContained.setBufferSubData(buffer,offset,data); }
// public static void setBufferSubData(int buffer,int offset,java.nio.ByteBuffer data, ) { net.minecraft.client.gl.BufferManager.setBufferSubData(buffer,offset,data); }
// public void setBufferData(int buffer,long size,int usage) { wrapperContained.setBufferData(buffer,size,usage); }
// public static void setBufferData(int buffer,long size,int usage, ) { net.minecraft.client.gl.BufferManager.setBufferData(buffer,size,usage); }
// public void setBufferData(int buffer,java.nio.ByteBuffer data,int usage) { wrapperContained.setBufferData(buffer,data,usage); }
// public static void setBufferData(int buffer,java.nio.ByteBuffer data,int usage, ) { net.minecraft.client.gl.BufferManager.setBufferData(buffer,data,usage); }
// public void setBufferStorage(int buffer,long size,int flags) { wrapperContained.setBufferStorage(buffer,size,flags); }
// public static void setBufferStorage(int buffer,long size,int flags, ) { net.minecraft.client.gl.BufferManager.setBufferStorage(buffer,size,flags); }
// public void setBufferStorage(int buffer,java.nio.ByteBuffer data,int flags) { wrapperContained.setBufferStorage(buffer,data,flags); }
// public static void setBufferStorage(int buffer,java.nio.ByteBuffer data,int flags, ) { net.minecraft.client.gl.BufferManager.setBufferStorage(buffer,data,flags); }

}