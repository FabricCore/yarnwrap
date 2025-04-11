package yarnwrap.client.texture;
public class ResourceTexture { public net.minecraft.client.texture.ResourceTexture wrapperContained; public ResourceTexture(net.minecraft.client.texture.ResourceTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier location() { return new yarnwrap.util.Identifier(wrapperContained.location); }
// public void location(yarnwrap.util.Identifier value) { wrapperContained.location = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public ResourceTexture(yarnwrap.util.Identifier location) { this.wrapperContained = new net.minecraft.client.texture.ResourceTexture(location.wrapperContained); }
// public Object loadTextureData(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.loadTextureData(resourceManager.wrapperContained); }
// public void upload(yarnwrap.client.texture.NativeImage image,boolean blur,boolean clamp) { wrapperContained.upload(image.wrapperContained,blur,clamp); }

}