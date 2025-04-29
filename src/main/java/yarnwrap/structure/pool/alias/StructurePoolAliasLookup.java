package yarnwrap.structure.pool.alias;
public class StructurePoolAliasLookup { public net.minecraft.structure.pool.alias.StructurePoolAliasLookup wrapperContained; public StructurePoolAliasLookup(net.minecraft.structure.pool.alias.StructurePoolAliasLookup wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.pool.alias.StructurePoolAliasLookup EMPTY() { return new yarnwrap.structure.pool.alias.StructurePoolAliasLookup(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.structure.pool.alias.StructurePoolAliasLookup value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.structure.pool.alias.StructurePoolAliasLookup EMPTY() { return new yarnwrap.structure.pool.alias.StructurePoolAliasLookup(net.minecraft.structure.pool.alias.StructurePoolAliasLookup.EMPTY); }
// public static void EMPTY(yarnwrap.structure.pool.alias.StructurePoolAliasLookup value, ) { net.minecraft.structure.pool.alias.StructurePoolAliasLookup.EMPTY = value.wrapperContained; }

// public yarnwrap.structure.pool.alias.StructurePoolAliasLookup create(java.util.List bindings,yarnwrap.util.math.BlockPos pos,long seed) { return new yarnwrap.structure.pool.alias.StructurePoolAliasLookup(wrapperContained.create(bindings,pos.wrapperContained,seed)); }
// public static yarnwrap.structure.pool.alias.StructurePoolAliasLookup create(java.util.List bindings,yarnwrap.util.math.BlockPos pos,long seed, ) { return new yarnwrap.structure.pool.alias.StructurePoolAliasLookup(net.minecraft.structure.pool.alias.StructurePoolAliasLookup.create(bindings,pos.wrapperContained,seed)); }
public yarnwrap.registry.RegistryKey lookup(yarnwrap.registry.RegistryKey pool) { return new yarnwrap.registry.RegistryKey(wrapperContained.lookup(pool.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey lookup(yarnwrap.registry.RegistryKey pool, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.pool.alias.StructurePoolAliasLookup.lookup(pool.wrapperContained)); }
// public void method_54511(yarnwrap.util.math.random.Random binding) { wrapperContained.method_54511(binding.wrapperContained); }
// public static void method_54511(yarnwrap.util.math.random.Random binding, ) { net.minecraft.structure.pool.alias.StructurePoolAliasLookup.method_54511(binding.wrapperContained); }
// public yarnwrap.registry.RegistryKey method_54512(java.util.Map alias) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_54512(alias)); }
// public static yarnwrap.registry.RegistryKey method_54512(java.util.Map alias, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.pool.alias.StructurePoolAliasLookup.method_54512(alias)); }
// public yarnwrap.registry.RegistryKey method_54513(yarnwrap.registry.RegistryKey pool) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_54513(pool.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_54513(yarnwrap.registry.RegistryKey pool, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.pool.alias.StructurePoolAliasLookup.method_54513(pool.wrapperContained)); }

}