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
// public SetDamageLootFunction(java.util.List conditions,yarnwrap.loot.provider.number.LootNumberProvider durabilityRange,boolean add) { this.wrapperContained = new net.minecraft.loot.function.SetDamageLootFunction(conditions,durabilityRange.wrapperContained,add); }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider durabilityRange,boolean add) { return wrapperContained.builder(durabilityRange.wrapperContained,add); }
// public yarnwrap.loot.function.LootFunction method_35543(yarnwrap.loot.provider.number.LootNumberProvider conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_35543(conditions.wrapperContained)); }
// public java.lang.Boolean method_53378(yarnwrap.loot.function.SetDamageLootFunction function) { return wrapperContained.method_53378(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53379(Object instance) { return wrapperContained.method_53379(instance); }
// public yarnwrap.loot.provider.number.LootNumberProvider method_53380(yarnwrap.loot.function.SetDamageLootFunction function) { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.method_53380(function.wrapperContained)); }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider durabilityRange) { return wrapperContained.builder(durabilityRange.wrapperContained); }
// public yarnwrap.loot.function.LootFunction method_634(yarnwrap.loot.provider.number.LootNumberProvider conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_634(conditions.wrapperContained)); }

}