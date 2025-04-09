package yarnwrap.resource;
public class LifecycledResourceManagerImpl { public net.minecraft.resource.LifecycledResourceManagerImpl wrapperContained; public LifecycledResourceManagerImpl(net.minecraft.resource.LifecycledResourceManagerImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map subManagers() { return wrapperContained.subManagers; }
// public java.util.List packs() { return wrapperContained.packs; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.resource.metadata.ResourceFilter parseResourceFilter(yarnwrap.resource.ResourcePack pack) { return new yarnwrap.resource.metadata.ResourceFilter(wrapperContained.parseResourceFilter(pack.wrapperContained)); }
// public void validateStartingPath(java.lang.String startingPath) { wrapperContained.validateStartingPath(startingPath); }

}