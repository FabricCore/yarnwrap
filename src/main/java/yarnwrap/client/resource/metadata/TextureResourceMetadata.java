package yarnwrap.client.resource.metadata;
public class TextureResourceMetadata { public net.minecraft.client.resource.metadata.TextureResourceMetadata wrapperContained; public TextureResourceMetadata(net.minecraft.client.resource.metadata.TextureResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.metadata.TextureResourceMetadataReader READER() { return new yarnwrap.client.resource.metadata.TextureResourceMetadataReader(wrapperContained.READER); }
// public void READER(yarnwrap.client.resource.metadata.TextureResourceMetadataReader value) { wrapperContained.READER = value.wrapperContained; }
public static yarnwrap.client.resource.metadata.TextureResourceMetadataReader READER() { return new yarnwrap.client.resource.metadata.TextureResourceMetadataReader(net.minecraft.client.resource.metadata.TextureResourceMetadata.READER); }
// public static void READER(yarnwrap.client.resource.metadata.TextureResourceMetadataReader value, ) { net.minecraft.client.resource.metadata.TextureResourceMetadata.READER = value.wrapperContained; }

// public boolean clamp() { return wrapperContained.clamp; }
// public void clamp(boolean value) { wrapperContained.clamp = value; }
// public static boolean clamp() { return net.minecraft.client.resource.metadata.TextureResourceMetadata.clamp; }
// public static void clamp(boolean value, ) { net.minecraft.client.resource.metadata.TextureResourceMetadata.clamp = value; }

// public boolean blur() { return wrapperContained.blur; }
// public void blur(boolean value) { wrapperContained.blur = value; }
// public static boolean blur() { return net.minecraft.client.resource.metadata.TextureResourceMetadata.blur; }
// public static void blur(boolean value, ) { net.minecraft.client.resource.metadata.TextureResourceMetadata.blur = value; }

public TextureResourceMetadata(boolean blur,boolean clamp) { this.wrapperContained = new net.minecraft.client.resource.metadata.TextureResourceMetadata(blur,clamp); }
public boolean shouldBlur() { return wrapperContained.shouldBlur(); }
// public static boolean shouldBlur() { return net.minecraft.client.resource.metadata.TextureResourceMetadata.shouldBlur(); }
public boolean shouldClamp() { return wrapperContained.shouldClamp(); }
// public static boolean shouldClamp() { return net.minecraft.client.resource.metadata.TextureResourceMetadata.shouldClamp(); }

}