package yarnwrap.client.util;
public class GlException { public net.minecraft.client.util.GlException wrapperContained; public GlException(net.minecraft.client.util.GlException wrapperContained) { this.wrapperContained = wrapperContained; }

public GlException(java.lang.String message) { this.wrapperContained = new net.minecraft.client.util.GlException(message); }
public GlException(java.lang.String message,java.lang.Throwable cause) { this.wrapperContained = new net.minecraft.client.util.GlException(message,cause); }

}