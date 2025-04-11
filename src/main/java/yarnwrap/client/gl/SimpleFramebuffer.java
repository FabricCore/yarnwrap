package yarnwrap.client.gl;
public class SimpleFramebuffer { public net.minecraft.client.gl.SimpleFramebuffer wrapperContained; public SimpleFramebuffer(net.minecraft.client.gl.SimpleFramebuffer wrapperContained) { this.wrapperContained = wrapperContained; }

public SimpleFramebuffer(int width,int height,boolean useDepth,boolean getError) { this.wrapperContained = new net.minecraft.client.gl.SimpleFramebuffer(width,height,useDepth,getError); }

}