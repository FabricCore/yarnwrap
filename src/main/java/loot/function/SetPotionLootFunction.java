package yarnwrap.loot.function;
public class SetPotionLootFunction { public net.minecraft.loot.function.SetPotionLootFunction wrapperContained; public SetPotionLootFunction(net.minecraft.loot.function.SetPotionLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry potion() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.potion); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(yarnwrap.registry.entry.RegistryEntry potion) { return wrapperContained.builder(potion.wrapperContained); }

}