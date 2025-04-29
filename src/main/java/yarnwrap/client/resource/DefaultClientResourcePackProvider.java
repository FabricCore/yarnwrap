package yarnwrap.client.resource;
public class DefaultClientResourcePackProvider { public net.minecraft.client.resource.DefaultClientResourcePackProvider wrapperContained; public DefaultClientResourcePackProvider(net.minecraft.client.resource.DefaultClientResourcePackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.metadata.PackResourceMetadata METADATA() { return new yarnwrap.resource.metadata.PackResourceMetadata(wrapperContained.METADATA); }
// public void METADATA(yarnwrap.resource.metadata.PackResourceMetadata value) { wrapperContained.METADATA = value.wrapperContained; }
// public static yarnwrap.resource.metadata.PackResourceMetadata METADATA() { return new yarnwrap.resource.metadata.PackResourceMetadata(net.minecraft.client.resource.DefaultClientResourcePackProvider.METADATA); }
// public static void METADATA(yarnwrap.resource.metadata.PackResourceMetadata value, ) { net.minecraft.client.resource.DefaultClientResourcePackProvider.METADATA = value.wrapperContained; }

// public yarnwrap.resource.metadata.ResourceMetadataMap METADATA_MAP() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.METADATA_MAP); }
// public void METADATA_MAP(yarnwrap.resource.metadata.ResourceMetadataMap value) { wrapperContained.METADATA_MAP = value.wrapperContained; }
// public static yarnwrap.resource.metadata.ResourceMetadataMap METADATA_MAP() { return new yarnwrap.resource.metadata.ResourceMetadataMap(net.minecraft.client.resource.DefaultClientResourcePackProvider.METADATA_MAP); }
// public static void METADATA_MAP(yarnwrap.resource.metadata.ResourceMetadataMap value, ) { net.minecraft.client.resource.DefaultClientResourcePackProvider.METADATA_MAP = value.wrapperContained; }

// public java.util.Map PROFILE_NAME_TEXTS() { return wrapperContained.PROFILE_NAME_TEXTS; }
// public void PROFILE_NAME_TEXTS(java.util.Map value) { wrapperContained.PROFILE_NAME_TEXTS = value; }
// public static java.util.Map PROFILE_NAME_TEXTS() { return net.minecraft.client.resource.DefaultClientResourcePackProvider.PROFILE_NAME_TEXTS; }
// public static void PROFILE_NAME_TEXTS(java.util.Map value, ) { net.minecraft.client.resource.DefaultClientResourcePackProvider.PROFILE_NAME_TEXTS = value; }

// public yarnwrap.util.Identifier ID() { return new yarnwrap.util.Identifier(wrapperContained.ID); }
// public void ID(yarnwrap.util.Identifier value) { wrapperContained.ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier ID() { return new yarnwrap.util.Identifier(net.minecraft.client.resource.DefaultClientResourcePackProvider.ID); }
// public static void ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.resource.DefaultClientResourcePackProvider.ID = value.wrapperContained; }

// public java.nio.file.Path resourcePacksPath() { return wrapperContained.resourcePacksPath; }
// public void resourcePacksPath(java.nio.file.Path value) { wrapperContained.resourcePacksPath = value; }
// public static java.nio.file.Path resourcePacksPath() { return net.minecraft.client.resource.DefaultClientResourcePackProvider.resourcePacksPath; }
// public static void resourcePacksPath(java.nio.file.Path value, ) { net.minecraft.client.resource.DefaultClientResourcePackProvider.resourcePacksPath = value; }

// public java.lang.String HIGH_CONTRAST_ID() { return wrapperContained.HIGH_CONTRAST_ID; }
// public void HIGH_CONTRAST_ID(java.lang.String value) { wrapperContained.HIGH_CONTRAST_ID = value; }
public static java.lang.String HIGH_CONTRAST_ID() { return net.minecraft.client.resource.DefaultClientResourcePackProvider.HIGH_CONTRAST_ID; }
// public static void HIGH_CONTRAST_ID(java.lang.String value, ) { net.minecraft.client.resource.DefaultClientResourcePackProvider.HIGH_CONTRAST_ID = value; }

// public yarnwrap.resource.ResourcePackInfo INFO() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.INFO); }
// public void INFO(yarnwrap.resource.ResourcePackInfo value) { wrapperContained.INFO = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackInfo INFO() { return new yarnwrap.resource.ResourcePackInfo(net.minecraft.client.resource.DefaultClientResourcePackProvider.INFO); }
// public static void INFO(yarnwrap.resource.ResourcePackInfo value, ) { net.minecraft.client.resource.DefaultClientResourcePackProvider.INFO = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackPosition REQUIRED_POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.REQUIRED_POSITION); }
// public void REQUIRED_POSITION(yarnwrap.resource.ResourcePackPosition value) { wrapperContained.REQUIRED_POSITION = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackPosition REQUIRED_POSITION() { return new yarnwrap.resource.ResourcePackPosition(net.minecraft.client.resource.DefaultClientResourcePackProvider.REQUIRED_POSITION); }
// public static void REQUIRED_POSITION(yarnwrap.resource.ResourcePackPosition value, ) { net.minecraft.client.resource.DefaultClientResourcePackProvider.REQUIRED_POSITION = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackPosition OPTIONAL_POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.OPTIONAL_POSITION); }
// public void OPTIONAL_POSITION(yarnwrap.resource.ResourcePackPosition value) { wrapperContained.OPTIONAL_POSITION = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackPosition OPTIONAL_POSITION() { return new yarnwrap.resource.ResourcePackPosition(net.minecraft.client.resource.DefaultClientResourcePackProvider.OPTIONAL_POSITION); }
// public static void OPTIONAL_POSITION(yarnwrap.resource.ResourcePackPosition value, ) { net.minecraft.client.resource.DefaultClientResourcePackProvider.OPTIONAL_POSITION = value.wrapperContained; }

public DefaultClientResourcePackProvider(java.nio.file.Path assetsPath,yarnwrap.util.path.SymlinkFinder symlinkFinder) { this.wrapperContained = new net.minecraft.client.resource.DefaultClientResourcePackProvider(assetsPath,symlinkFinder.wrapperContained); }
// public java.nio.file.Path getResourcePacksPath(java.nio.file.Path path) { return wrapperContained.getResourcePacksPath(path); }
// public static java.nio.file.Path getResourcePacksPath(java.nio.file.Path path, ) { return net.minecraft.client.resource.DefaultClientResourcePackProvider.getResourcePacksPath(path); }
// public yarnwrap.resource.DefaultResourcePack createDefaultPack(java.nio.file.Path assetsPath) { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.createDefaultPack(assetsPath)); }
// public static yarnwrap.resource.DefaultResourcePack createDefaultPack(java.nio.file.Path assetsPath, ) { return new yarnwrap.resource.DefaultResourcePack(net.minecraft.client.resource.DefaultClientResourcePackProvider.createDefaultPack(assetsPath)); }
// public yarnwrap.resource.ResourcePackInfo createInfo(java.lang.String id,yarnwrap.text.Text title) { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.createInfo(id,title.wrapperContained)); }
// public static yarnwrap.resource.ResourcePackInfo createInfo(java.lang.String id,yarnwrap.text.Text title, ) { return new yarnwrap.resource.ResourcePackInfo(net.minecraft.client.resource.DefaultClientResourcePackProvider.createInfo(id,title.wrapperContained)); }

}