package yarnwrap.structure;
public class BastionRemnantGenerator { public net.minecraft.structure.BastionRemnantGenerator wrapperContained; public BastionRemnantGenerator(net.minecraft.structure.BastionRemnantGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey STRUCTURE_POOLS() { return new yarnwrap.registry.RegistryKey(wrapperContained.STRUCTURE_POOLS); }
// public void STRUCTURE_POOLS(yarnwrap.registry.RegistryKey value) { wrapperContained.STRUCTURE_POOLS = value.wrapperContained; }
public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}