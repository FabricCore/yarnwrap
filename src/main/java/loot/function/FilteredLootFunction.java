package yarnwrap.loot.function;
public class FilteredLootFunction { public net.minecraft.loot.function.FilteredLootFunction wrapperContained; public FilteredLootFunction(net.minecraft.loot.function.FilteredLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.predicate.item.ItemPredicate itemFilter() { return new yarnwrap.predicate.item.ItemPredicate(wrapperContained.itemFilter); }
// public yarnwrap.loot.function.LootFunction modifier() { return new yarnwrap.loot.function.LootFunction(wrapperContained.modifier); }

}