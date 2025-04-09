package yarnwrap.client.resource;
public class DefaultClientResourcePackProvider { public net.minecraft.client.resource.DefaultClientResourcePackProvider wrapperContained; public DefaultClientResourcePackProvider(net.minecraft.client.resource.DefaultClientResourcePackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.metadata.PackResourceMetadata METADATA() { return new yarnwrap.resource.metadata.PackResourceMetadata(wrapperContained.METADATA); }
// public yarnwrap.resource.metadata.ResourceMetadataMap METADATA_MAP() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.METADATA_MAP); }
// public java.util.Map PROFILE_NAME_TEXTS() { return wrapperContained.PROFILE_NAME_TEXTS; }
// public yarnwrap.util.Identifier ID() { return new yarnwrap.util.Identifier(wrapperContained.ID); }
// public java.nio.file.Path resourcePacksPath() { return wrapperContained.resourcePacksPath; }
public java.lang.String HIGH_CONTRAST_ID() { return wrapperContained.HIGH_CONTRAST_ID; }
// public yarnwrap.resource.ResourcePackInfo INFO() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.INFO); }
// public yarnwrap.resource.ResourcePackPosition REQUIRED_POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.REQUIRED_POSITION); }
// public yarnwrap.resource.ResourcePackPosition OPTIONAL_POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.OPTIONAL_POSITION); }
// public java.nio.file.Path getResourcePacksPath(java.nio.file.Path path) { return wrapperContained.getResourcePacksPath(path); }
// public yarnwrap.resource.DefaultResourcePack createDefaultPack(java.nio.file.Path assetsPath) { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.createDefaultPack(assetsPath)); }
// public yarnwrap.resource.ResourcePackInfo createInfo(java.lang.String id,yarnwrap.text.Text title) { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.createInfo(id,title.wrapperContained)); }

}