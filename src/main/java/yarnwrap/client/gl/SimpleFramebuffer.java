package yarnwrap.client.gl;
public class SimpleFramebuffer { public net.minecraft.client.gl.SimpleFramebuffer wrapperContained; public SimpleFramebuffer(net.minecraft.client.gl.SimpleFramebuffer wrapperContained) { this.wrapperContained = wrapperContained; }

public SimpleFramebuffer(java.lang.String name,int width,int height,boolean useDepthAttachment) { this.wrapperContained = new net.minecraft.client.gl.SimpleFramebuffer(name,width,height,useDepthAttachment); }

}