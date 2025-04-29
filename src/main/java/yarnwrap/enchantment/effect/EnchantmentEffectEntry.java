package yarnwrap.enchantment.effect;
public class EnchantmentEffectEntry { public net.minecraft.enchantment.effect.EnchantmentEffectEntry wrapperContained; public EnchantmentEffectEntry(net.minecraft.enchantment.effect.EnchantmentEffectEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec effectCodec,yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createCodec(effectCodec,lootContextType.wrapperContained); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec effectCodec,yarnwrap.loot.context.LootContextType lootContextType, ) { return net.minecraft.enchantment.effect.EnchantmentEffectEntry.createCodec(effectCodec,lootContextType.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_60005(com.mojang.serialization.Codec instance) { return wrapperContained.method_60005(instance); }
// public static com.mojang.datafixers.kinds.App method_60005(com.mojang.serialization.Codec instance, ) { return net.minecraft.enchantment.effect.EnchantmentEffectEntry.method_60005(instance); }
public boolean test(yarnwrap.loot.context.LootContext context) { return wrapperContained.test(context.wrapperContained); }
// public static boolean test(yarnwrap.loot.context.LootContext context, ) { return net.minecraft.enchantment.effect.EnchantmentEffectEntry.test(context.wrapperContained); }
// public com.mojang.serialization.Codec createRequirementsCodec(yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createRequirementsCodec(lootContextType.wrapperContained); }
// public static com.mojang.serialization.Codec createRequirementsCodec(yarnwrap.loot.context.LootContextType lootContextType, ) { return net.minecraft.enchantment.effect.EnchantmentEffectEntry.createRequirementsCodec(lootContextType.wrapperContained); }
// public com.mojang.serialization.DataResult method_60008(yarnwrap.loot.context.LootContextType condition) { return wrapperContained.method_60008(condition.wrapperContained); }
// public static com.mojang.serialization.DataResult method_60008(yarnwrap.loot.context.LootContextType condition, ) { return net.minecraft.enchantment.effect.EnchantmentEffectEntry.method_60008(condition.wrapperContained); }
// public com.mojang.serialization.DataResult method_60010(java.lang.String errors) { return wrapperContained.method_60010(errors); }
// public static com.mojang.serialization.DataResult method_60010(java.lang.String errors, ) { return net.minecraft.enchantment.effect.EnchantmentEffectEntry.method_60010(errors); }

}