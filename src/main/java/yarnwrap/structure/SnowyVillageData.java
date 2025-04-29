package yarnwrap.structure;
public class SnowyVillageData { public net.minecraft.structure.SnowyVillageData wrapperContained; public SnowyVillageData(net.minecraft.structure.SnowyVillageData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey TOWN_CENTERS_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.TOWN_CENTERS_KEY); }
// public void TOWN_CENTERS_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.TOWN_CENTERS_KEY = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey TOWN_CENTERS_KEY() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.SnowyVillageData.TOWN_CENTERS_KEY); }
// public static void TOWN_CENTERS_KEY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.SnowyVillageData.TOWN_CENTERS_KEY = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey TERMINATORS_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.TERMINATORS_KEY); }
// public void TERMINATORS_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.TERMINATORS_KEY = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey TERMINATORS_KEY() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.SnowyVillageData.TERMINATORS_KEY); }
// public static void TERMINATORS_KEY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.SnowyVillageData.TERMINATORS_KEY = value.wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable poolRegisterable, ) { net.minecraft.structure.SnowyVillageData.bootstrap(poolRegisterable.wrapperContained); }

}