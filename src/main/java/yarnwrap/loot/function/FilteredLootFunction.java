package yarnwrap.loot.function;
public class FilteredLootFunction { public net.minecraft.loot.function.FilteredLootFunction wrapperContained; public FilteredLootFunction(net.minecraft.loot.function.FilteredLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.predicate.item.ItemPredicate itemFilter() { return new yarnwrap.predicate.item.ItemPredicate(wrapperContained.itemFilter); }
// public void itemFilter(yarnwrap.predicate.item.ItemPredicate value) { wrapperContained.itemFilter = value.wrapperContained; }
// public yarnwrap.loot.function.LootFunction modifier() { return new yarnwrap.loot.function.LootFunction(wrapperContained.modifier); }
// public void modifier(yarnwrap.loot.function.LootFunction value) { wrapperContained.modifier = value.wrapperContained; }

}