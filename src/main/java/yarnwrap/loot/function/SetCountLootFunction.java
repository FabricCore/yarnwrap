package yarnwrap.loot.function;
public class SetCountLootFunction { public net.minecraft.loot.function.SetCountLootFunction wrapperContained; public SetCountLootFunction(net.minecraft.loot.function.SetCountLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider countRange() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.countRange); }
// public void countRange(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.countRange = value.wrapperContained; }
// public boolean add() { return wrapperContained.add; }
// public void add(boolean value) { wrapperContained.add = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider countRange,boolean add) { return wrapperContained.builder(countRange.wrapperContained,add); }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider countRange) { return wrapperContained.builder(countRange.wrapperContained); }

}