package yarnwrap.loot.function;
public class SetEnchantmentsLootFunction { public net.minecraft.loot.function.SetEnchantmentsLootFunction wrapperContained; public SetEnchantmentsLootFunction(net.minecraft.loot.function.SetEnchantmentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map enchantments() { return wrapperContained.enchantments; }
// public boolean add() { return wrapperContained.add; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}