package yarnwrap.structure;
public class PillagerOutpostGenerator { public net.minecraft.structure.PillagerOutpostGenerator wrapperContained; public PillagerOutpostGenerator(net.minecraft.structure.PillagerOutpostGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey STRUCTURE_POOLS() { return new yarnwrap.registry.RegistryKey(wrapperContained.STRUCTURE_POOLS); }
public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}