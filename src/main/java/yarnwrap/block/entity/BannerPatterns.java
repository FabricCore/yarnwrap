package yarnwrap.block.entity;
public class BannerPatterns { public net.minecraft.block.entity.BannerPatterns wrapperContained; public BannerPatterns(net.minecraft.block.entity.BannerPatterns wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key) { wrapperContained.register(registry.wrapperContained,key.wrapperContained); }

}