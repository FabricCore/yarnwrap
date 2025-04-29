package yarnwrap.resource;
public class VanillaDataPackProvider { public net.minecraft.resource.VanillaDataPackProvider wrapperContained; public VanillaDataPackProvider(net.minecraft.resource.VanillaDataPackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.metadata.ResourceMetadataMap METADATA_MAP() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.METADATA_MAP); }
// public void METADATA_MAP(yarnwrap.resource.metadata.ResourceMetadataMap value) { wrapperContained.METADATA_MAP = value.wrapperContained; }
// public static yarnwrap.resource.metadata.ResourceMetadataMap METADATA_MAP() { return new yarnwrap.resource.metadata.ResourceMetadataMap(net.minecraft.resource.VanillaDataPackProvider.METADATA_MAP); }
// public static void METADATA_MAP(yarnwrap.resource.metadata.ResourceMetadataMap value, ) { net.minecraft.resource.VanillaDataPackProvider.METADATA_MAP = value.wrapperContained; }

// public yarnwrap.resource.metadata.PackResourceMetadata METADATA() { return new yarnwrap.resource.metadata.PackResourceMetadata(wrapperContained.METADATA); }
// public void METADATA(yarnwrap.resource.metadata.PackResourceMetadata value) { wrapperContained.METADATA = value.wrapperContained; }
// public static yarnwrap.resource.metadata.PackResourceMetadata METADATA() { return new yarnwrap.resource.metadata.PackResourceMetadata(net.minecraft.resource.VanillaDataPackProvider.METADATA); }
// public static void METADATA(yarnwrap.resource.metadata.PackResourceMetadata value, ) { net.minecraft.resource.VanillaDataPackProvider.METADATA = value.wrapperContained; }

// public yarnwrap.resource.metadata.PackFeatureSetMetadata FEATURE_FLAGS() { return new yarnwrap.resource.metadata.PackFeatureSetMetadata(wrapperContained.FEATURE_FLAGS); }
// public void FEATURE_FLAGS(yarnwrap.resource.metadata.PackFeatureSetMetadata value) { wrapperContained.FEATURE_FLAGS = value.wrapperContained; }
// public static yarnwrap.resource.metadata.PackFeatureSetMetadata FEATURE_FLAGS() { return new yarnwrap.resource.metadata.PackFeatureSetMetadata(net.minecraft.resource.VanillaDataPackProvider.FEATURE_FLAGS); }
// public static void FEATURE_FLAGS(yarnwrap.resource.metadata.PackFeatureSetMetadata value, ) { net.minecraft.resource.VanillaDataPackProvider.FEATURE_FLAGS = value.wrapperContained; }

// public yarnwrap.util.Identifier ID() { return new yarnwrap.util.Identifier(wrapperContained.ID); }
// public void ID(yarnwrap.util.Identifier value) { wrapperContained.ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier ID() { return new yarnwrap.util.Identifier(net.minecraft.resource.VanillaDataPackProvider.ID); }
// public static void ID(yarnwrap.util.Identifier value, ) { net.minecraft.resource.VanillaDataPackProvider.ID = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackInfo INFO() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.INFO); }
// public void INFO(yarnwrap.resource.ResourcePackInfo value) { wrapperContained.INFO = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackInfo INFO() { return new yarnwrap.resource.ResourcePackInfo(net.minecraft.resource.VanillaDataPackProvider.INFO); }
// public static void INFO(yarnwrap.resource.ResourcePackInfo value, ) { net.minecraft.resource.VanillaDataPackProvider.INFO = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackPosition BOTTOM_POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.BOTTOM_POSITION); }
// public void BOTTOM_POSITION(yarnwrap.resource.ResourcePackPosition value) { wrapperContained.BOTTOM_POSITION = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackPosition BOTTOM_POSITION() { return new yarnwrap.resource.ResourcePackPosition(net.minecraft.resource.VanillaDataPackProvider.BOTTOM_POSITION); }
// public static void BOTTOM_POSITION(yarnwrap.resource.ResourcePackPosition value, ) { net.minecraft.resource.VanillaDataPackProvider.BOTTOM_POSITION = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackPosition TOP_POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.TOP_POSITION); }
// public void TOP_POSITION(yarnwrap.resource.ResourcePackPosition value) { wrapperContained.TOP_POSITION = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackPosition TOP_POSITION() { return new yarnwrap.resource.ResourcePackPosition(net.minecraft.resource.VanillaDataPackProvider.TOP_POSITION); }
// public static void TOP_POSITION(yarnwrap.resource.ResourcePackPosition value, ) { net.minecraft.resource.VanillaDataPackProvider.TOP_POSITION = value.wrapperContained; }

public VanillaDataPackProvider(yarnwrap.util.path.SymlinkFinder symlinkFinder) { this.wrapperContained = new net.minecraft.resource.VanillaDataPackProvider(symlinkFinder.wrapperContained); }
// public yarnwrap.resource.ResourcePackManager createManager(Object session) { return new yarnwrap.resource.ResourcePackManager(wrapperContained.createManager(session)); }
// public static yarnwrap.resource.ResourcePackManager createManager(Object session, ) { return new yarnwrap.resource.ResourcePackManager(net.minecraft.resource.VanillaDataPackProvider.createManager(session)); }
// public yarnwrap.resource.ResourcePackManager createManager(java.nio.file.Path dataPacksPath,yarnwrap.util.path.SymlinkFinder symlinkFinder) { return new yarnwrap.resource.ResourcePackManager(wrapperContained.createManager(dataPacksPath,symlinkFinder.wrapperContained)); }
// public static yarnwrap.resource.ResourcePackManager createManager(java.nio.file.Path dataPacksPath,yarnwrap.util.path.SymlinkFinder symlinkFinder, ) { return new yarnwrap.resource.ResourcePackManager(net.minecraft.resource.VanillaDataPackProvider.createManager(dataPacksPath,symlinkFinder.wrapperContained)); }
// public yarnwrap.resource.DefaultResourcePack createDefaultPack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.createDefaultPack()); }
public static yarnwrap.resource.DefaultResourcePack createDefaultPack() { return new yarnwrap.resource.DefaultResourcePack(net.minecraft.resource.VanillaDataPackProvider.createDefaultPack()); }
// public boolean method_52442(java.nio.file.Path path) { return wrapperContained.method_52442(path); }
// public static boolean method_52442(java.nio.file.Path path, ) { return net.minecraft.resource.VanillaDataPackProvider.method_52442(path); }
// public yarnwrap.resource.ResourcePackManager createClientManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.createClientManager()); }
public static yarnwrap.resource.ResourcePackManager createClientManager() { return new yarnwrap.resource.ResourcePackManager(net.minecraft.resource.VanillaDataPackProvider.createClientManager()); }
// public yarnwrap.resource.ResourcePackInfo createInfo(java.lang.String id,yarnwrap.text.Text title) { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.createInfo(id,title.wrapperContained)); }
// public static yarnwrap.resource.ResourcePackInfo createInfo(java.lang.String id,yarnwrap.text.Text title, ) { return new yarnwrap.resource.ResourcePackInfo(net.minecraft.resource.VanillaDataPackProvider.createInfo(id,title.wrapperContained)); }

}