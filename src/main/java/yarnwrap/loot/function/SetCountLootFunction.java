package yarnwrap.loot.function;
public class SetCountLootFunction { public net.minecraft.loot.function.SetCountLootFunction wrapperContained; public SetCountLootFunction(net.minecraft.loot.function.SetCountLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider countRange() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.countRange); }
// public void countRange(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.countRange = value.wrapperContained; }
// public static yarnwrap.loot.provider.number.LootNumberProvider countRange() { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.function.SetCountLootFunction.countRange); }
// public static void countRange(yarnwrap.loot.provider.number.LootNumberProvider value, ) { net.minecraft.loot.function.SetCountLootFunction.countRange = value.wrapperContained; }

// public boolean add() { return wrapperContained.add; }
// public void add(boolean value) { wrapperContained.add = value; }
// public static boolean add() { return net.minecraft.loot.function.SetCountLootFunction.add; }
// public static void add(boolean value, ) { net.minecraft.loot.function.SetCountLootFunction.add = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetCountLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetCountLootFunction.CODEC = value; }

// public SetCountLootFunction(java.util.List conditions,yarnwrap.loot.provider.number.LootNumberProvider countRange,boolean add) { this.wrapperContained = new net.minecraft.loot.function.SetCountLootFunction(conditions,countRange.wrapperContained,add); }
// public Object builder(yarnwrap.loot.provider.number.LootNumberProvider countRange,boolean add) { return wrapperContained.builder(countRange.wrapperContained,add); }
// public static Object builder(yarnwrap.loot.provider.number.LootNumberProvider countRange,boolean add, ) { return net.minecraft.loot.function.SetCountLootFunction.builder(countRange.wrapperContained,add); }
// public java.lang.Boolean method_53375(yarnwrap.loot.function.SetCountLootFunction function) { return wrapperContained.method_53375(function.wrapperContained); }
// public static java.lang.Boolean method_53375(yarnwrap.loot.function.SetCountLootFunction function, ) { return net.minecraft.loot.function.SetCountLootFunction.method_53375(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53376(Object instance) { return wrapperContained.method_53376(instance); }
// public static com.mojang.datafixers.kinds.App method_53376(Object instance, ) { return net.minecraft.loot.function.SetCountLootFunction.method_53376(instance); }
// public yarnwrap.loot.provider.number.LootNumberProvider method_53377(yarnwrap.loot.function.SetCountLootFunction function) { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.method_53377(function.wrapperContained)); }
// public static yarnwrap.loot.provider.number.LootNumberProvider method_53377(yarnwrap.loot.function.SetCountLootFunction function, ) { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.function.SetCountLootFunction.method_53377(function.wrapperContained)); }
// public Object builder(yarnwrap.loot.provider.number.LootNumberProvider countRange) { return wrapperContained.builder(countRange.wrapperContained); }
// public static Object builder(yarnwrap.loot.provider.number.LootNumberProvider countRange, ) { return net.minecraft.loot.function.SetCountLootFunction.builder(countRange.wrapperContained); }

}