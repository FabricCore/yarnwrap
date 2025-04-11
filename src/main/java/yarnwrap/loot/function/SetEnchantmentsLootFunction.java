package yarnwrap.loot.function;
public class SetEnchantmentsLootFunction { public net.minecraft.loot.function.SetEnchantmentsLootFunction wrapperContained; public SetEnchantmentsLootFunction(net.minecraft.loot.function.SetEnchantmentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map enchantments() { return wrapperContained.enchantments; }
// public void enchantments(java.util.Map value) { wrapperContained.enchantments = value; }
// public boolean add() { return wrapperContained.add; }
// public void add(boolean value) { wrapperContained.add = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}