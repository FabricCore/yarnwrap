package yarnwrap.registry.entry;
public class RegistryEntryOwner { public net.minecraft.registry.entry.RegistryEntryOwner wrapperContained; public RegistryEntryOwner(net.minecraft.registry.entry.RegistryEntryOwner wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean ownerEquals(yarnwrap.registry.entry.RegistryEntryOwner other) { return wrapperContained.ownerEquals(other.wrapperContained); }

}