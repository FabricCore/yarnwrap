package yarnwrap.loot.function;
public class SetOminousBottleAmplifierLootFunction { public net.minecraft.loot.function.SetOminousBottleAmplifierLootFunction wrapperContained; public SetOminousBottleAmplifierLootFunction(net.minecraft.loot.function.SetOminousBottleAmplifierLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.loot.provider.number.LootNumberProvider amplifier() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.amplifier); }
// public void amplifier(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.amplifier = value.wrapperContained; }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider amplifier) { return wrapperContained.builder(amplifier.wrapperContained); }
public yarnwrap.loot.provider.number.LootNumberProvider getAmplifier() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.getAmplifier()); }

}