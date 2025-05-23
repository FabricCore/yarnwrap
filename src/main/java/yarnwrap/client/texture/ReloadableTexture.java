package yarnwrap.client.texture;
public class ReloadableTexture { public net.minecraft.client.texture.ReloadableTexture wrapperContained; public ReloadableTexture(net.minecraft.client.texture.ReloadableTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier textureId() { return new yarnwrap.util.Identifier(wrapperContained.textureId); }
// public void textureId(yarnwrap.util.Identifier value) { wrapperContained.textureId = value.wrapperContained; }
// public static yarnwrap.util.Identifier textureId() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.ReloadableTexture.textureId); }
// public static void textureId(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.ReloadableTexture.textureId = value.wrapperContained; }

// public ReloadableTexture(yarnwrap.util.Identifier textureId) { this.wrapperContained = new net.minecraft.client.texture.ReloadableTexture(textureId.wrapperContained); }
// public yarnwrap.client.texture.TextureContents loadContents(yarnwrap.resource.ResourceManager resourceManager) { return new yarnwrap.client.texture.TextureContents(wrapperContained.loadContents(resourceManager.wrapperContained)); }
// public static yarnwrap.client.texture.TextureContents loadContents(yarnwrap.resource.ResourceManager resourceManager, ) { return new yarnwrap.client.texture.TextureContents(net.minecraft.client.texture.ReloadableTexture.loadContents(resourceManager.wrapperContained)); }
// public void load(yarnwrap.client.texture.NativeImage image,boolean blur,boolean clamp) { wrapperContained.load(image.wrapperContained,blur,clamp); }
// public static void load(yarnwrap.client.texture.NativeImage image,boolean blur,boolean clamp, ) { net.minecraft.client.texture.ReloadableTexture.load(image.wrapperContained,blur,clamp); }
public void reload(yarnwrap.client.texture.TextureContents contents) { wrapperContained.reload(contents.wrapperContained); }
// public static void reload(yarnwrap.client.texture.TextureContents contents, ) { net.minecraft.client.texture.ReloadableTexture.reload(contents.wrapperContained); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.ReloadableTexture.getId()); }

}