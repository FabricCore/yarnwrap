package yarnwrap.loot.function;
public class SetInstrumentLootFunction { public net.minecraft.loot.function.SetInstrumentLootFunction wrapperContained; public SetInstrumentLootFunction(net.minecraft.loot.function.SetInstrumentLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey options() { return new yarnwrap.registry.tag.TagKey(wrapperContained.options); }
// public void options(yarnwrap.registry.tag.TagKey value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagKey options() { return new yarnwrap.registry.tag.TagKey(net.minecraft.loot.function.SetInstrumentLootFunction.options); }
// public static void options(yarnwrap.registry.tag.TagKey value, ) { net.minecraft.loot.function.SetInstrumentLootFunction.options = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetInstrumentLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetInstrumentLootFunction.CODEC = value; }

// public SetInstrumentLootFunction(java.util.List conditions,yarnwrap.registry.tag.TagKey options) { this.wrapperContained = new net.minecraft.loot.function.SetInstrumentLootFunction(conditions,options.wrapperContained); }
// public Object builder(yarnwrap.registry.tag.TagKey options) { return wrapperContained.builder(options.wrapperContained); }
// public static Object builder(yarnwrap.registry.tag.TagKey options, ) { return net.minecraft.loot.function.SetInstrumentLootFunction.builder(options.wrapperContained); }
// public yarnwrap.loot.function.LootFunction method_43743(yarnwrap.registry.tag.TagKey conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_43743(conditions.wrapperContained)); }
// public static yarnwrap.loot.function.LootFunction method_43743(yarnwrap.registry.tag.TagKey conditions, ) { return new yarnwrap.loot.function.LootFunction(net.minecraft.loot.function.SetInstrumentLootFunction.method_43743(conditions.wrapperContained)); }
// public yarnwrap.registry.tag.TagKey method_53373(yarnwrap.loot.function.SetInstrumentLootFunction function) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_53373(function.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_53373(yarnwrap.loot.function.SetInstrumentLootFunction function, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.loot.function.SetInstrumentLootFunction.method_53373(function.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53374(Object instance) { return wrapperContained.method_53374(instance); }
// public static com.mojang.datafixers.kinds.App method_53374(Object instance, ) { return net.minecraft.loot.function.SetInstrumentLootFunction.method_53374(instance); }

}