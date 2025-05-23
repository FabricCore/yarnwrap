package yarnwrap.client.util;
public class TextureAllocationException { public net.minecraft.client.util.TextureAllocationException wrapperContained; public TextureAllocationException(net.minecraft.client.util.TextureAllocationException wrapperContained) { this.wrapperContained = wrapperContained; }

public TextureAllocationException(java.lang.String message) { this.wrapperContained = new net.minecraft.client.util.TextureAllocationException(message); }

}