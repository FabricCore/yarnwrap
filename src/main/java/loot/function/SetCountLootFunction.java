package yarnwrap.loot.function;
public class SetCountLootFunction { public net.minecraft.loot.function.SetCountLootFunction wrapperContained; public SetCountLootFunction(net.minecraft.loot.function.SetCountLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider countRange() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.countRange); }
// public boolean add() { return wrapperContained.add; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider countRange,boolean add) { return wrapperContained.builder(countRange.wrapperContained,add); }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider countRange) { return wrapperContained.builder(countRange.wrapperContained); }

}