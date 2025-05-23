package yarnwrap.client.texture;
public class TextureContents { public net.minecraft.client.texture.TextureContents wrapperContained; public TextureContents(net.minecraft.client.texture.TextureContents wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.TextureContents createMissing() { return new yarnwrap.client.texture.TextureContents(wrapperContained.createMissing()); }
public static yarnwrap.client.texture.TextureContents createMissing() { return new yarnwrap.client.texture.TextureContents(net.minecraft.client.texture.TextureContents.createMissing()); }
// public yarnwrap.client.texture.TextureContents load(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier textureId) { return new yarnwrap.client.texture.TextureContents(wrapperContained.load(resourceManager.wrapperContained,textureId.wrapperContained)); }
// public static yarnwrap.client.texture.TextureContents load(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier textureId, ) { return new yarnwrap.client.texture.TextureContents(net.minecraft.client.texture.TextureContents.load(resourceManager.wrapperContained,textureId.wrapperContained)); }
public boolean blur() { return wrapperContained.blur(); }
// public static boolean blur() { return net.minecraft.client.texture.TextureContents.blur(); }
public boolean clamp() { return wrapperContained.clamp(); }
// public static boolean clamp() { return net.minecraft.client.texture.TextureContents.clamp(); }

}