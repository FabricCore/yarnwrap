package yarnwrap.loot.function;
public class SetOminousBottleAmplifierLootFunction { public net.minecraft.loot.function.SetOminousBottleAmplifierLootFunction wrapperContained; public SetOminousBottleAmplifierLootFunction(net.minecraft.loot.function.SetOminousBottleAmplifierLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.loot.provider.number.LootNumberProvider amplifier() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.amplifier); }
// public void amplifier(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.amplifier = value.wrapperContained; }
// public SetOminousBottleAmplifierLootFunction(java.util.List conditions,yarnwrap.loot.provider.number.LootNumberProvider amplifier) { this.wrapperContained = new net.minecraft.loot.function.SetOminousBottleAmplifierLootFunction(conditions,amplifier.wrapperContained); }
// public yarnwrap.loot.provider.number.LootNumberProvider method_58736(yarnwrap.loot.function.SetOminousBottleAmplifierLootFunction lootFunction) { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.method_58736(lootFunction.wrapperContained)); }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider amplifier) { return wrapperContained.builder(amplifier.wrapperContained); }
// public yarnwrap.loot.function.LootFunction method_58738(yarnwrap.loot.provider.number.LootNumberProvider conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_58738(conditions.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_58739(Object instance) { return wrapperContained.method_58739(instance); }
public yarnwrap.loot.provider.number.LootNumberProvider getAmplifier() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.getAmplifier()); }

}