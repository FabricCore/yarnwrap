package yarnwrap.loot.function;
public class SetDamageLootFunction { public net.minecraft.loot.function.SetDamageLootFunction wrapperContained; public SetDamageLootFunction(net.minecraft.loot.function.SetDamageLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider durabilityRange() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.durabilityRange); }
// public void durabilityRange(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.durabilityRange = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean add() { return wrapperContained.add; }
// public void add(boolean value) { wrapperContained.add = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider durabilityRange,boolean add) { return wrapperContained.builder(durabilityRange.wrapperContained,add); }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider durabilityRange) { return wrapperContained.builder(durabilityRange.wrapperContained); }

}