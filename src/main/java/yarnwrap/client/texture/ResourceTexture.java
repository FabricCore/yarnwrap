package yarnwrap.client.texture;
public class ResourceTexture { public net.minecraft.client.texture.ResourceTexture wrapperContained; public ResourceTexture(net.minecraft.client.texture.ResourceTexture wrapperContained) { this.wrapperContained = wrapperContained; }

public ResourceTexture(yarnwrap.util.Identifier location) { this.wrapperContained = new net.minecraft.client.texture.ResourceTexture(location.wrapperContained); }

}