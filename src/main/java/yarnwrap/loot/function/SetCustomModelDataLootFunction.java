package yarnwrap.loot.function;
public class SetCustomModelDataLootFunction { public net.minecraft.loot.function.SetCustomModelDataLootFunction wrapperContained; public SetCustomModelDataLootFunction(net.minecraft.loot.function.SetCustomModelDataLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetCustomModelDataLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetCustomModelDataLootFunction.CODEC = value; }

// public com.mojang.serialization.Codec COLOR_CODEC() { return wrapperContained.COLOR_CODEC; }
// public void COLOR_CODEC(com.mojang.serialization.Codec value) { wrapperContained.COLOR_CODEC = value; }
// public static com.mojang.serialization.Codec COLOR_CODEC() { return net.minecraft.loot.function.SetCustomModelDataLootFunction.COLOR_CODEC; }
// public static void COLOR_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.function.SetCustomModelDataLootFunction.COLOR_CODEC = value; }

// public java.util.Optional floats() { return wrapperContained.floats; }
// public void floats(java.util.Optional value) { wrapperContained.floats = value; }
// public static java.util.Optional floats() { return net.minecraft.loot.function.SetCustomModelDataLootFunction.floats; }
// public static void floats(java.util.Optional value, ) { net.minecraft.loot.function.SetCustomModelDataLootFunction.floats = value; }

// public java.util.Optional flags() { return wrapperContained.flags; }
// public void flags(java.util.Optional value) { wrapperContained.flags = value; }
// public static java.util.Optional flags() { return net.minecraft.loot.function.SetCustomModelDataLootFunction.flags; }
// public static void flags(java.util.Optional value, ) { net.minecraft.loot.function.SetCustomModelDataLootFunction.flags = value; }

// public java.util.Optional strings() { return wrapperContained.strings; }
// public void strings(java.util.Optional value) { wrapperContained.strings = value; }
// public static java.util.Optional strings() { return net.minecraft.loot.function.SetCustomModelDataLootFunction.strings; }
// public static void strings(java.util.Optional value, ) { net.minecraft.loot.function.SetCustomModelDataLootFunction.strings = value; }

// public java.util.Optional colors() { return wrapperContained.colors; }
// public void colors(java.util.Optional value) { wrapperContained.colors = value; }
// public static java.util.Optional colors() { return net.minecraft.loot.function.SetCustomModelDataLootFunction.colors; }
// public static void colors(java.util.Optional value, ) { net.minecraft.loot.function.SetCustomModelDataLootFunction.colors = value; }

public SetCustomModelDataLootFunction(java.util.List conditions,java.util.Optional floats,java.util.Optional flags,java.util.Optional strings,java.util.Optional colors) { this.wrapperContained = new net.minecraft.loot.function.SetCustomModelDataLootFunction(conditions,floats,flags,strings,colors); }
// public java.util.Optional method_59747(yarnwrap.loot.function.SetCustomModelDataLootFunction lootFunction) { return wrapperContained.method_59747(lootFunction.wrapperContained); }
// public static java.util.Optional method_59747(yarnwrap.loot.function.SetCustomModelDataLootFunction lootFunction, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_59747(lootFunction.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_59748(Object instance) { return wrapperContained.method_59748(instance); }
// public static com.mojang.datafixers.kinds.App method_59748(Object instance, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_59748(instance); }
// public java.lang.Integer method_65374(yarnwrap.loot.context.LootContext provider) { return wrapperContained.method_65374(provider.wrapperContained); }
// public static java.lang.Integer method_65374(yarnwrap.loot.context.LootContext provider, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_65374(provider.wrapperContained); }
// public java.util.stream.Stream method_65375(Object operation) { return wrapperContained.method_65375(operation); }
// public static java.util.stream.Stream method_65375(Object operation, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_65375(operation); }
// public java.util.Optional method_65376(yarnwrap.loot.function.SetCustomModelDataLootFunction lootFunction) { return wrapperContained.method_65376(lootFunction.wrapperContained); }
// public static java.util.Optional method_65376(yarnwrap.loot.function.SetCustomModelDataLootFunction lootFunction, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_65376(lootFunction.wrapperContained); }
// public java.util.stream.Stream method_65377(yarnwrap.loot.provider.number.LootNumberProvider value) { return wrapperContained.method_65377(value.wrapperContained); }
// public static java.util.stream.Stream method_65377(yarnwrap.loot.provider.number.LootNumberProvider value, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_65377(value.wrapperContained); }
// public java.util.List method_65378(java.util.List operation) { return wrapperContained.method_65378(operation); }
// public static java.util.List method_65378(java.util.List operation, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_65378(operation); }
// public java.util.List apply(java.util.Optional values,java.util.List current) { return wrapperContained.apply(values,current); }
// public static java.util.List apply(java.util.Optional values,java.util.List current, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.apply(values,current); }
// public java.util.List apply(java.util.Optional values,java.util.List current,java.util.function.Function operationValueToAppliedValue) { return wrapperContained.apply(values,current,operationValueToAppliedValue); }
// public static java.util.List apply(java.util.Optional values,java.util.List current,java.util.function.Function operationValueToAppliedValue, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.apply(values,current,operationValueToAppliedValue); }
// public java.util.List method_65381(java.util.function.Function operation) { return wrapperContained.method_65381(operation); }
// public static java.util.List method_65381(java.util.function.Function operation, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_65381(operation); }
// public java.lang.Float method_65382(yarnwrap.loot.context.LootContext provider) { return wrapperContained.method_65382(provider.wrapperContained); }
// public static java.lang.Float method_65382(yarnwrap.loot.context.LootContext provider, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_65382(provider.wrapperContained); }
// public java.util.Optional method_65383(yarnwrap.loot.function.SetCustomModelDataLootFunction lootFunction) { return wrapperContained.method_65383(lootFunction.wrapperContained); }
// public static java.util.Optional method_65383(yarnwrap.loot.function.SetCustomModelDataLootFunction lootFunction, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_65383(lootFunction.wrapperContained); }
// public java.util.Optional method_65384(yarnwrap.loot.function.SetCustomModelDataLootFunction lootFunction) { return wrapperContained.method_65384(lootFunction.wrapperContained); }
// public static java.util.Optional method_65384(yarnwrap.loot.function.SetCustomModelDataLootFunction lootFunction, ) { return net.minecraft.loot.function.SetCustomModelDataLootFunction.method_65384(lootFunction.wrapperContained); }

}