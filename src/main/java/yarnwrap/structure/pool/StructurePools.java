package yarnwrap.structure.pool;
public class StructurePools { public net.minecraft.structure.pool.StructurePools wrapperContained; public StructurePools(net.minecraft.structure.pool.StructurePools wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey EMPTY() { return new yarnwrap.registry.RegistryKey(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.registry.RegistryKey value) { wrapperContained.EMPTY = value.wrapperContained; }
public void bootstrap(yarnwrap.registry.Registerable structurePoolsRegisterable) { wrapperContained.bootstrap(structurePoolsRegisterable.wrapperContained); }
public void register(yarnwrap.registry.Registerable structurePoolsRegisterable,java.lang.String id,yarnwrap.structure.pool.StructurePool pool) { wrapperContained.register(structurePoolsRegisterable.wrapperContained,id,pool.wrapperContained); }
public yarnwrap.registry.RegistryKey ofVanilla(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.ofVanilla(id)); }
public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }

}