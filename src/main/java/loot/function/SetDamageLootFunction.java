package yarnwrap.loot.function;
public class SetDamageLootFunction { public net.minecraft.loot.function.SetDamageLootFunction wrapperContained; public SetDamageLootFunction(net.minecraft.loot.function.SetDamageLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider durabilityRange() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.durabilityRange); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean add() { return wrapperContained.add; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider durabilityRange,boolean add) { return wrapperContained.builder(durabilityRange.wrapperContained,add); }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider durabilityRange) { return wrapperContained.builder(durabilityRange.wrapperContained); }

}