package yarnwrap.loot.function;
public class FilteredLootFunction { public net.minecraft.loot.function.FilteredLootFunction wrapperContained; public FilteredLootFunction(net.minecraft.loot.function.FilteredLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.FilteredLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.FilteredLootFunction.CODEC = value; }

// public yarnwrap.predicate.item.ItemPredicate itemFilter() { return new yarnwrap.predicate.item.ItemPredicate(wrapperContained.itemFilter); }
// public void itemFilter(yarnwrap.predicate.item.ItemPredicate value) { wrapperContained.itemFilter = value.wrapperContained; }
// public static yarnwrap.predicate.item.ItemPredicate itemFilter() { return new yarnwrap.predicate.item.ItemPredicate(net.minecraft.loot.function.FilteredLootFunction.itemFilter); }
// public static void itemFilter(yarnwrap.predicate.item.ItemPredicate value, ) { net.minecraft.loot.function.FilteredLootFunction.itemFilter = value.wrapperContained; }

// public yarnwrap.loot.function.LootFunction modifier() { return new yarnwrap.loot.function.LootFunction(wrapperContained.modifier); }
// public void modifier(yarnwrap.loot.function.LootFunction value) { wrapperContained.modifier = value.wrapperContained; }
// public static yarnwrap.loot.function.LootFunction modifier() { return new yarnwrap.loot.function.LootFunction(net.minecraft.loot.function.FilteredLootFunction.modifier); }
// public static void modifier(yarnwrap.loot.function.LootFunction value, ) { net.minecraft.loot.function.FilteredLootFunction.modifier = value.wrapperContained; }

// public FilteredLootFunction(java.util.List conditions,yarnwrap.predicate.item.ItemPredicate itemFilter,yarnwrap.loot.function.LootFunction modifier) { this.wrapperContained = new net.minecraft.loot.function.FilteredLootFunction(conditions,itemFilter.wrapperContained,modifier.wrapperContained); }
// public yarnwrap.loot.function.LootFunction method_59739(yarnwrap.loot.function.FilteredLootFunction lootFunction) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_59739(lootFunction.wrapperContained)); }
// public static yarnwrap.loot.function.LootFunction method_59739(yarnwrap.loot.function.FilteredLootFunction lootFunction, ) { return new yarnwrap.loot.function.LootFunction(net.minecraft.loot.function.FilteredLootFunction.method_59739(lootFunction.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_59740(Object instance) { return wrapperContained.method_59740(instance); }
// public static com.mojang.datafixers.kinds.App method_59740(Object instance, ) { return net.minecraft.loot.function.FilteredLootFunction.method_59740(instance); }
// public yarnwrap.predicate.item.ItemPredicate method_59741(yarnwrap.loot.function.FilteredLootFunction lootFunction) { return new yarnwrap.predicate.item.ItemPredicate(wrapperContained.method_59741(lootFunction.wrapperContained)); }
// public static yarnwrap.predicate.item.ItemPredicate method_59741(yarnwrap.loot.function.FilteredLootFunction lootFunction, ) { return new yarnwrap.predicate.item.ItemPredicate(net.minecraft.loot.function.FilteredLootFunction.method_59741(lootFunction.wrapperContained)); }

}