package yarnwrap.resource;
public class VanillaResourcePackProvider { public net.minecraft.resource.VanillaResourcePackProvider wrapperContained; public VanillaResourcePackProvider(net.minecraft.resource.VanillaResourcePackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String VANILLA_KEY() { return wrapperContained.VANILLA_KEY; }
// public void VANILLA_KEY(java.lang.String value) { wrapperContained.VANILLA_KEY = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(wrapperContained.type); }
// public void type(yarnwrap.resource.ResourceType value) { wrapperContained.type = value.wrapperContained; }
// public yarnwrap.resource.DefaultResourcePack resourcePack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.resourcePack); }
// public void resourcePack(yarnwrap.resource.DefaultResourcePack value) { wrapperContained.resourcePack = value.wrapperContained; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public void symlinkFinder(yarnwrap.util.path.SymlinkFinder value) { wrapperContained.symlinkFinder = value.wrapperContained; }
public yarnwrap.registry.VersionedIdentifier VANILLA_ID() { return new yarnwrap.registry.VersionedIdentifier(wrapperContained.VANILLA_ID); }
// public void VANILLA_ID(yarnwrap.registry.VersionedIdentifier value) { wrapperContained.VANILLA_ID = value.wrapperContained; }
// public VanillaResourcePackProvider(yarnwrap.resource.ResourceType type,yarnwrap.resource.DefaultResourcePack resourcePack,yarnwrap.util.Identifier id,yarnwrap.util.path.SymlinkFinder symlinkFinder) { this.wrapperContained = new net.minecraft.resource.VanillaResourcePackProvider(type.wrapperContained,resourcePack.wrapperContained,id.wrapperContained,symlinkFinder.wrapperContained); }
public yarnwrap.resource.DefaultResourcePack getResourcePack() { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.getResourcePack()); }
// public yarnwrap.resource.ResourcePackProfile createDefault(yarnwrap.resource.ResourcePack pack) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.createDefault(pack.wrapperContained)); }
// public yarnwrap.resource.ResourcePackProfile method_45258(Object id) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.method_45258(id)); }
// public yarnwrap.text.Text getDisplayName(java.lang.String id) { return new yarnwrap.text.Text(wrapperContained.getDisplayName(id)); }
// public yarnwrap.resource.ResourcePackProfile create(java.lang.String fileName,Object packFactory,yarnwrap.text.Text displayName) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.create(fileName,packFactory,displayName.wrapperContained)); }
// public java.lang.String getFileName(java.nio.file.Path path) { return wrapperContained.getFileName(path); }
// public void forEachProfile(java.nio.file.Path namespacedPath,java.util.function.BiConsumer consumer) { wrapperContained.forEachProfile(namespacedPath,consumer); }
// public void forEachProfile(java.util.function.BiConsumer consumer) { wrapperContained.forEachProfile(consumer); }
// public void method_45264(java.util.function.BiConsumer namespacedPath) { wrapperContained.method_45264(namespacedPath); }
// public void method_45265(java.util.function.BiConsumer profilePath,java.nio.file.Path factory) { wrapperContained.method_45265(profilePath,factory); }
// public void method_45266(java.util.function.Consumer id,java.lang.String packFactory) { wrapperContained.method_45266(id,packFactory); }
// public void forEachProfile(java.util.function.Consumer consumer) { wrapperContained.forEachProfile(consumer); }
// public Object createPackFactory(yarnwrap.resource.ResourcePack pack) { return wrapperContained.createPackFactory(pack.wrapperContained); }

}