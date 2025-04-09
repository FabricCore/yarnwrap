package yarnwrap.resource;
public class VanillaDataPackProvider { public net.minecraft.resource.VanillaDataPackProvider wrapperContained; public VanillaDataPackProvider(net.minecraft.resource.VanillaDataPackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.metadata.ResourceMetadataMap METADATA_MAP() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.METADATA_MAP); }
// public yarnwrap.resource.metadata.PackResourceMetadata METADATA() { return new yarnwrap.resource.metadata.PackResourceMetadata(wrapperContained.METADATA); }
// public yarnwrap.resource.metadata.PackFeatureSetMetadata FEATURE_FLAGS() { return new yarnwrap.resource.metadata.PackFeatureSetMetadata(wrapperContained.FEATURE_FLAGS); }
// public yarnwrap.util.Identifier ID() { return new yarnwrap.util.Identifier(wrapperContained.ID); }
// public yarnwrap.resource.ResourcePackInfo INFO() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.INFO); }
// public yarnwrap.resource.ResourcePackPosition BOTTOM_POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.BOTTOM_POSITION); }
// public yarnwrap.resource.ResourcePackPosition TOP_POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.TOP_POSITION); }
// public yarnwrap.resource.ResourcePackManager createManager(Object session) { return new yarnwrap.resource.ResourcePackManager(wrapperContained.createManager(session)); }
public yarnwrap.resource.ResourcePackManager createManager(java.nio.file.Path dataPacksPath,yarnwrap.util.path.SymlinkFinder symlinkFinder) { return new yarnwrap.resource.ResourcePackManager(wrapperContained.createManager(dataPacksPath,symlinkFinder.wrapperContained)); }
public yarnwrap.resource.DefaultResourcePack createDefaultPack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.createDefaultPack()); }
public yarnwrap.resource.ResourcePackManager createClientManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.createClientManager()); }
// public yarnwrap.resource.ResourcePackInfo createInfo(java.lang.String id,yarnwrap.text.Text title) { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.createInfo(id,title.wrapperContained)); }

}