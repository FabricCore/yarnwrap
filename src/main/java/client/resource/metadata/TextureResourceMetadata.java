package yarnwrap.client.resource.metadata;
public class TextureResourceMetadata { public net.minecraft.client.resource.metadata.TextureResourceMetadata wrapperContained; public TextureResourceMetadata(net.minecraft.client.resource.metadata.TextureResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.resource.metadata.TextureResourceMetadataReader READER() { return new yarnwrap.client.resource.metadata.TextureResourceMetadataReader(wrapperContained.READER); }
// public boolean clamp() { return wrapperContained.clamp; }
// public boolean blur() { return wrapperContained.blur; }
public boolean shouldBlur() { return wrapperContained.shouldBlur(); }
public boolean shouldClamp() { return wrapperContained.shouldClamp(); }

}