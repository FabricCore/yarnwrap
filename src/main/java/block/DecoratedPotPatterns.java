package yarnwrap.block;
public class DecoratedPotPatterns { public net.minecraft.block.DecoratedPotPatterns wrapperContained; public DecoratedPotPatterns(net.minecraft.block.DecoratedPotPatterns wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map SHERD_TO_PATTERN() { return wrapperContained.SHERD_TO_PATTERN; }
public yarnwrap.registry.RegistryKey fromSherd(yarnwrap.item.Item sherd) { return new yarnwrap.registry.RegistryKey(wrapperContained.fromSherd(sherd.wrapperContained)); }
public yarnwrap.block.DecoratedPotPattern registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.block.DecoratedPotPattern(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public yarnwrap.registry.RegistryKey of(java.lang.String path) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(path)); }
// public yarnwrap.block.DecoratedPotPattern register(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.lang.String id) { return new yarnwrap.block.DecoratedPotPattern(wrapperContained.register(registry.wrapperContained,key.wrapperContained,id)); }

}