package yarnwrap.loot.function;
public class FillPlayerHeadLootFunction { public net.minecraft.loot.function.FillPlayerHeadLootFunction wrapperContained; public FillPlayerHeadLootFunction(net.minecraft.loot.function.FillPlayerHeadLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object entity() { return wrapperContained.entity; }
// // public void entity(Object value) { wrapperContained.entity = value; }
// // public static Object entity() { return net.minecraft.loot.function.FillPlayerHeadLootFunction.entity; }
// // public static void entity(Object value, ) { net.minecraft.loot.function.FillPlayerHeadLootFunction.entity = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.FillPlayerHeadLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.FillPlayerHeadLootFunction.CODEC = value; }

// public FillPlayerHeadLootFunction(java.util.List conditions,Object entity) { this.wrapperContained = new net.minecraft.loot.function.FillPlayerHeadLootFunction(conditions,entity); }
// public Object builder(Object target) { return wrapperContained.builder(target); }
// public static Object builder(Object target, ) { return net.minecraft.loot.function.FillPlayerHeadLootFunction.builder(target); }
// public yarnwrap.loot.function.LootFunction method_35523(Object conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_35523(conditions)); }
// public static yarnwrap.loot.function.LootFunction method_35523(Object conditions, ) { return new yarnwrap.loot.function.LootFunction(net.minecraft.loot.function.FillPlayerHeadLootFunction.method_35523(conditions)); }
// public Object method_53338(yarnwrap.loot.function.FillPlayerHeadLootFunction function) { return wrapperContained.method_53338(function.wrapperContained); }
// public static Object method_53338(yarnwrap.loot.function.FillPlayerHeadLootFunction function, ) { return net.minecraft.loot.function.FillPlayerHeadLootFunction.method_53338(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53339(Object instance) { return wrapperContained.method_53339(instance); }
// public static com.mojang.datafixers.kinds.App method_53339(Object instance, ) { return net.minecraft.loot.function.FillPlayerHeadLootFunction.method_53339(instance); }

}