package yarnwrap.loot.function;
public class SetEnchantmentsLootFunction { public net.minecraft.loot.function.SetEnchantmentsLootFunction wrapperContained; public SetEnchantmentsLootFunction(net.minecraft.loot.function.SetEnchantmentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map enchantments() { return wrapperContained.enchantments; }
// public void enchantments(java.util.Map value) { wrapperContained.enchantments = value; }
// public boolean add() { return wrapperContained.add; }
// public void add(boolean value) { wrapperContained.add = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public SetEnchantmentsLootFunction(java.util.List conditions,java.util.Map enchantments,boolean add) { this.wrapperContained = new net.minecraft.loot.function.SetEnchantmentsLootFunction(conditions,enchantments,add); }
// public java.util.stream.Stream method_32409(yarnwrap.loot.provider.number.LootNumberProvider numberProvider) { return wrapperContained.method_32409(numberProvider.wrapperContained); }
// public java.lang.Boolean method_53370(yarnwrap.loot.function.SetEnchantmentsLootFunction function) { return wrapperContained.method_53370(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53371(Object instance) { return wrapperContained.method_53371(instance); }
// public java.util.Map method_53372(yarnwrap.loot.function.SetEnchantmentsLootFunction function) { return wrapperContained.method_53372(function.wrapperContained); }
// public void method_57656(Object enchantment,yarnwrap.loot.context.LootContext level) { wrapperContained.method_57656(enchantment,level.wrapperContained); }
// public void method_57657(yarnwrap.loot.context.LootContext builder) { wrapperContained.method_57657(builder.wrapperContained); }
// public void method_60297(Object enchantment,yarnwrap.loot.context.LootContext level) { wrapperContained.method_60297(enchantment,level.wrapperContained); }

}