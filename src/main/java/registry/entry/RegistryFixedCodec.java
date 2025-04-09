package yarnwrap.registry.entry;
public class RegistryFixedCodec { public net.minecraft.registry.entry.RegistryFixedCodec wrapperContained; public RegistryFixedCodec(net.minecraft.registry.entry.RegistryFixedCodec wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey registry() { return new yarnwrap.registry.RegistryKey(wrapperContained.registry); }
public yarnwrap.registry.entry.RegistryFixedCodec of(yarnwrap.registry.RegistryKey registry) { return new yarnwrap.registry.entry.RegistryFixedCodec(wrapperContained.of(registry.wrapperContained)); }

}