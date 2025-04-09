package yarnwrap.structure;
public class SavannaVillageData { public net.minecraft.structure.SavannaVillageData wrapperContained; public SavannaVillageData(net.minecraft.structure.SavannaVillageData wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey TOWN_CENTERS_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.TOWN_CENTERS_KEY); }
// public yarnwrap.registry.RegistryKey TERMINATORS_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.TERMINATORS_KEY); }
// public yarnwrap.registry.RegistryKey ZOMBIE_TERMINATORS_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.ZOMBIE_TERMINATORS_KEY); }
public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}