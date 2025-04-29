package yarnwrap.client.texture;
public class ResourceTexture { public net.minecraft.client.texture.ResourceTexture wrapperContained; public ResourceTexture(net.minecraft.client.texture.ResourceTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier location() { return new yarnwrap.util.Identifier(wrapperContained.location); }
// public void location(yarnwrap.util.Identifier value) { wrapperContained.location = value.wrapperContained; }
// public static yarnwrap.util.Identifier location() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.ResourceTexture.location); }
// public static void location(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.ResourceTexture.location = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.ResourceTexture.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.ResourceTexture.LOGGER = value; }

public ResourceTexture(yarnwrap.util.Identifier location) { this.wrapperContained = new net.minecraft.client.texture.ResourceTexture(location.wrapperContained); }
// public Object loadTextureData(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.loadTextureData(resourceManager.wrapperContained); }
// public static Object loadTextureData(yarnwrap.resource.ResourceManager resourceManager, ) { return net.minecraft.client.texture.ResourceTexture.loadTextureData(resourceManager.wrapperContained); }
// public void upload(yarnwrap.client.texture.NativeImage image,boolean blur,boolean clamp) { wrapperContained.upload(image.wrapperContained,blur,clamp); }
// public static void upload(yarnwrap.client.texture.NativeImage image,boolean blur,boolean clamp, ) { net.minecraft.client.texture.ResourceTexture.upload(image.wrapperContained,blur,clamp); }

}