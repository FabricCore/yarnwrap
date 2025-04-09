package yarnwrap.enchantment.effect;
public class EnchantmentEffectEntry { public net.minecraft.enchantment.effect.EnchantmentEffectEntry wrapperContained; public EnchantmentEffectEntry(net.minecraft.enchantment.effect.EnchantmentEffectEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec effectCodec,yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createCodec(effectCodec,lootContextType.wrapperContained); }
public boolean test(yarnwrap.loot.context.LootContext context) { return wrapperContained.test(context.wrapperContained); }
public com.mojang.serialization.Codec createRequirementsCodec(yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createRequirementsCodec(lootContextType.wrapperContained); }

}