package yarnwrap.client.resource.metadata;
public class TextureResourceMetadata { public net.minecraft.client.resource.metadata.TextureResourceMetadata wrapperContained; public TextureResourceMetadata(net.minecraft.client.resource.metadata.TextureResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.resource.metadata.TextureResourceMetadataReader READER() { return new yarnwrap.client.resource.metadata.TextureResourceMetadataReader(wrapperContained.READER); }
// public void READER(yarnwrap.client.resource.metadata.TextureResourceMetadataReader value) { wrapperContained.READER = value.wrapperContained; }
// public boolean clamp() { return wrapperContained.clamp; }
// public void clamp(boolean value) { wrapperContained.clamp = value; }
// public boolean blur() { return wrapperContained.blur; }
// public void blur(boolean value) { wrapperContained.blur = value; }
public TextureResourceMetadata(boolean blur,boolean clamp) { this.wrapperContained = new net.minecraft.client.resource.metadata.TextureResourceMetadata(blur,clamp); }
public boolean shouldBlur() { return wrapperContained.shouldBlur(); }
public boolean shouldClamp() { return wrapperContained.shouldClamp(); }

}