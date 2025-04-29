package yarnwrap.structure;
public class SavannaVillageData { public net.minecraft.structure.SavannaVillageData wrapperContained; public SavannaVillageData(net.minecraft.structure.SavannaVillageData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey TOWN_CENTERS_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.TOWN_CENTERS_KEY); }
// public void TOWN_CENTERS_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.TOWN_CENTERS_KEY = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey TOWN_CENTERS_KEY() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.SavannaVillageData.TOWN_CENTERS_KEY); }
// public static void TOWN_CENTERS_KEY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.SavannaVillageData.TOWN_CENTERS_KEY = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey TERMINATORS_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.TERMINATORS_KEY); }
// public void TERMINATORS_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.TERMINATORS_KEY = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey TERMINATORS_KEY() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.SavannaVillageData.TERMINATORS_KEY); }
// public static void TERMINATORS_KEY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.SavannaVillageData.TERMINATORS_KEY = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey ZOMBIE_TERMINATORS_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.ZOMBIE_TERMINATORS_KEY); }
// public void ZOMBIE_TERMINATORS_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.ZOMBIE_TERMINATORS_KEY = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey ZOMBIE_TERMINATORS_KEY() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.SavannaVillageData.ZOMBIE_TERMINATORS_KEY); }
// public static void ZOMBIE_TERMINATORS_KEY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.SavannaVillageData.ZOMBIE_TERMINATORS_KEY = value.wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable poolRegisterable, ) { net.minecraft.structure.SavannaVillageData.bootstrap(poolRegisterable.wrapperContained); }

}