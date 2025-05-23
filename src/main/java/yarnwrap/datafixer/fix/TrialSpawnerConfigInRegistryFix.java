package yarnwrap.datafixer.fix;
public class TrialSpawnerConfigInRegistryFix { public net.minecraft.datafixer.fix.TrialSpawnerConfigInRegistryFix wrapperContained; public TrialSpawnerConfigInRegistryFix(net.minecraft.datafixer.fix.TrialSpawnerConfigInRegistryFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.datafixer.fix.TrialSpawnerConfigInRegistryFix.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.datafixer.fix.TrialSpawnerConfigInRegistryFix.LOGGER = value; }

public TrialSpawnerConfigInRegistryFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.TrialSpawnerConfigInRegistryFix(outputSchema); }
public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic nbt) { return wrapperContained.fix(nbt); }
// public static com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic nbt, ) { return net.minecraft.datafixer.fix.TrialSpawnerConfigInRegistryFix.fix(nbt); }
// public com.mojang.serialization.Dynamic method_62997(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_62997(dynamic); }
// public static com.mojang.serialization.Dynamic method_62997(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.TrialSpawnerConfigInRegistryFix.method_62997(dynamic); }

}