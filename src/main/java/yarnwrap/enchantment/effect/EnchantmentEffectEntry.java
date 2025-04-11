package yarnwrap.enchantment.effect;
public class EnchantmentEffectEntry { public net.minecraft.enchantment.effect.EnchantmentEffectEntry wrapperContained; public EnchantmentEffectEntry(net.minecraft.enchantment.effect.EnchantmentEffectEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec effectCodec,yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createCodec(effectCodec,lootContextType.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_60005(com.mojang.serialization.Codec instance) { return wrapperContained.method_60005(instance); }
public boolean test(yarnwrap.loot.context.LootContext context) { return wrapperContained.test(context.wrapperContained); }
public com.mojang.serialization.Codec createRequirementsCodec(yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createRequirementsCodec(lootContextType.wrapperContained); }
// public com.mojang.serialization.DataResult method_60008(yarnwrap.loot.context.LootContextType condition) { return wrapperContained.method_60008(condition.wrapperContained); }
// public com.mojang.serialization.DataResult method_60010(java.lang.String errors) { return wrapperContained.method_60010(errors); }

}