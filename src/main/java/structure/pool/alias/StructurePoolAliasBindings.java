package yarnwrap.structure.pool.alias;
public class StructurePoolAliasBindings { public net.minecraft.structure.pool.alias.StructurePoolAliasBindings wrapperContained; public StructurePoolAliasBindings(net.minecraft.structure.pool.alias.StructurePoolAliasBindings wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
public void registerPools(yarnwrap.registry.Registerable pools,yarnwrap.registry.entry.RegistryEntry base,java.util.List aliases) { wrapperContained.registerPools(pools.wrapperContained,base.wrapperContained,aliases); }

}