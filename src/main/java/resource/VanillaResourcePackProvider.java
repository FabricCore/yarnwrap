package yarnwrap.resource;
public class VanillaResourcePackProvider { public net.minecraft.resource.VanillaResourcePackProvider wrapperContained; public VanillaResourcePackProvider(net.minecraft.resource.VanillaResourcePackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String VANILLA_KEY() { return wrapperContained.VANILLA_KEY; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(wrapperContained.type); }
// public yarnwrap.resource.DefaultResourcePack resourcePack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.resourcePack); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
public yarnwrap.registry.VersionedIdentifier VANILLA_ID() { return new yarnwrap.registry.VersionedIdentifier(wrapperContained.VANILLA_ID); }
public yarnwrap.resource.DefaultResourcePack getResourcePack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.getResourcePack()); }
// public yarnwrap.resource.ResourcePackProfile createDefault(yarnwrap.resource.ResourcePack pack) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.createDefault(pack.wrapperContained)); }
// public yarnwrap.text.Text getDisplayName(java.lang.String id) { return new yarnwrap.text.Text(wrapperContained.getDisplayName(id)); }
// public yarnwrap.resource.ResourcePackProfile create(java.lang.String fileName,Object packFactory,yarnwrap.text.Text displayName) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.create(fileName,packFactory,displayName.wrapperContained)); }
// public java.lang.String getFileName(java.nio.file.Path path) { return wrapperContained.getFileName(path); }
// public void forEachProfile(java.nio.file.Path namespacedPath,java.util.function.BiConsumer consumer) { wrapperContained.forEachProfile(namespacedPath,consumer); }
// public void forEachProfile(java.util.function.BiConsumer consumer) { wrapperContained.forEachProfile(consumer); }
// public void forEachProfile(java.util.function.Consumer consumer) { wrapperContained.forEachProfile(consumer); }
// public Object createPackFactory(yarnwrap.resource.ResourcePack pack) { return wrapperContained.createPackFactory(pack.wrapperContained); }

}