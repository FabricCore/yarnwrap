package yarnwrap.loot.function;
public class SetPotionLootFunction { public net.minecraft.loot.function.SetPotionLootFunction wrapperContained; public SetPotionLootFunction(net.minecraft.loot.function.SetPotionLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry potion() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.potion); }
// public void potion(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.potion = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public SetPotionLootFunction(java.util.List conditions,yarnwrap.registry.entry.RegistryEntry potion) { this.wrapperContained = new net.minecraft.loot.function.SetPotionLootFunction(conditions,potion.wrapperContained); }
public Object builder(yarnwrap.registry.entry.RegistryEntry potion) { return wrapperContained.builder(potion.wrapperContained); }
// public yarnwrap.loot.function.LootFunction method_38928(yarnwrap.registry.entry.RegistryEntry conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_38928(conditions.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry method_53393(yarnwrap.loot.function.SetPotionLootFunction function) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_53393(function.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53394(Object instance) { return wrapperContained.method_53394(instance); }

}