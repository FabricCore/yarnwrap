package yarnwrap.registry.entry;
public class RegistryEntryInfo { public net.minecraft.registry.entry.RegistryEntryInfo wrapperContained; public RegistryEntryInfo(net.minecraft.registry.entry.RegistryEntryInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntryInfo DEFAULT() { return new yarnwrap.registry.entry.RegistryEntryInfo(wrapperContained.DEFAULT); }

}