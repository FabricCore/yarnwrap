package yarnwrap.loot.function;
public class CopyNameLootFunction { public net.minecraft.loot.function.CopyNameLootFunction wrapperContained; public CopyNameLootFunction(net.minecraft.loot.function.CopyNameLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object source() { return wrapperContained.source; }
// // public void source(Object value) { wrapperContained.source = value; }
// // public static Object source() { return net.minecraft.loot.function.CopyNameLootFunction.source; }
// // public static void source(Object value, ) { net.minecraft.loot.function.CopyNameLootFunction.source = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.CopyNameLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.CopyNameLootFunction.CODEC = value; }

// public CopyNameLootFunction(java.util.List conditions,Object source) { this.wrapperContained = new net.minecraft.loot.function.CopyNameLootFunction(conditions,source); }
// public Object builder(Object source) { return wrapperContained.builder(source); }
// public static Object builder(Object source, ) { return net.minecraft.loot.function.CopyNameLootFunction.builder(source); }
// public yarnwrap.loot.function.LootFunction method_474(Object conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_474(conditions)); }
// public static yarnwrap.loot.function.LootFunction method_474(Object conditions, ) { return new yarnwrap.loot.function.LootFunction(net.minecraft.loot.function.CopyNameLootFunction.method_474(conditions)); }
// public Object method_53313(yarnwrap.loot.function.CopyNameLootFunction function) { return wrapperContained.method_53313(function.wrapperContained); }
// public static Object method_53313(yarnwrap.loot.function.CopyNameLootFunction function, ) { return net.minecraft.loot.function.CopyNameLootFunction.method_53313(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53314(Object instance) { return wrapperContained.method_53314(instance); }
// public static com.mojang.datafixers.kinds.App method_53314(Object instance, ) { return net.minecraft.loot.function.CopyNameLootFunction.method_53314(instance); }

}