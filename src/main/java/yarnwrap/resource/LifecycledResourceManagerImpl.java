package yarnwrap.resource;
public class LifecycledResourceManagerImpl { public net.minecraft.resource.LifecycledResourceManagerImpl wrapperContained; public LifecycledResourceManagerImpl(net.minecraft.resource.LifecycledResourceManagerImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map subManagers() { return wrapperContained.subManagers; }
// public void subManagers(java.util.Map value) { wrapperContained.subManagers = value; }
// public static java.util.Map subManagers() { return net.minecraft.resource.LifecycledResourceManagerImpl.subManagers; }
// public static void subManagers(java.util.Map value, ) { net.minecraft.resource.LifecycledResourceManagerImpl.subManagers = value; }

// public java.util.List packs() { return wrapperContained.packs; }
// public void packs(java.util.List value) { wrapperContained.packs = value; }
// public static java.util.List packs() { return net.minecraft.resource.LifecycledResourceManagerImpl.packs; }
// public static void packs(java.util.List value, ) { net.minecraft.resource.LifecycledResourceManagerImpl.packs = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.resource.LifecycledResourceManagerImpl.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.resource.LifecycledResourceManagerImpl.LOGGER = value; }

public LifecycledResourceManagerImpl(yarnwrap.resource.ResourceType type,java.util.List packs) { this.wrapperContained = new net.minecraft.resource.LifecycledResourceManagerImpl(type.wrapperContained,packs); }
// public yarnwrap.resource.metadata.ResourceFilter parseResourceFilter(yarnwrap.resource.ResourcePack pack) { return new yarnwrap.resource.metadata.ResourceFilter(wrapperContained.parseResourceFilter(pack.wrapperContained)); }
// public static yarnwrap.resource.metadata.ResourceFilter parseResourceFilter(yarnwrap.resource.ResourcePack pack, ) { return new yarnwrap.resource.metadata.ResourceFilter(net.minecraft.resource.LifecycledResourceManagerImpl.parseResourceFilter(pack.wrapperContained)); }
// public java.util.stream.Stream method_41275(yarnwrap.resource.ResourceType pack) { return wrapperContained.method_41275(pack.wrapperContained); }
// public static java.util.stream.Stream method_41275(yarnwrap.resource.ResourceType pack, ) { return net.minecraft.resource.LifecycledResourceManagerImpl.method_41275(pack.wrapperContained); }
// public boolean method_41276(yarnwrap.resource.metadata.ResourceFilter id) { return wrapperContained.method_41276(id.wrapperContained); }
// public static boolean method_41276(yarnwrap.resource.metadata.ResourceFilter id, ) { return net.minecraft.resource.LifecycledResourceManagerImpl.method_41276(id.wrapperContained); }
// public void validateStartingPath(java.lang.String startingPath) { wrapperContained.validateStartingPath(startingPath); }
// public static void validateStartingPath(java.lang.String startingPath, ) { net.minecraft.resource.LifecycledResourceManagerImpl.validateStartingPath(startingPath); }

}