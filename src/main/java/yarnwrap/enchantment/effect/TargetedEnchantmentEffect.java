package yarnwrap.enchantment.effect;
public class TargetedEnchantmentEffect { public net.minecraft.enchantment.effect.TargetedEnchantmentEffect wrapperContained; public TargetedEnchantmentEffect(net.minecraft.enchantment.effect.TargetedEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec createPostAttackCodec(com.mojang.serialization.Codec effectCodec,yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createPostAttackCodec(effectCodec,lootContextType.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_60204(com.mojang.serialization.Codec instance) { return wrapperContained.method_60204(instance); }
// public com.mojang.serialization.DataResult method_60205(yarnwrap.enchantment.effect.EnchantmentEffectTarget enchanted) { return wrapperContained.method_60205(enchanted.wrapperContained); }
// public yarnwrap.enchantment.effect.TargetedEnchantmentEffect method_60206(yarnwrap.enchantment.effect.EnchantmentEffectTarget enchantedx,java.lang.Object effect,java.util.Optional requirements) { return new yarnwrap.enchantment.effect.TargetedEnchantmentEffect(wrapperContained.method_60206(enchantedx.wrapperContained,effect,requirements)); }
public boolean test(yarnwrap.loot.context.LootContext lootContext) { return wrapperContained.test(lootContext.wrapperContained); }
public com.mojang.serialization.Codec createEquipmentDropsCodec(com.mojang.serialization.Codec effectCodec,yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createEquipmentDropsCodec(effectCodec,lootContextType.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_60209(com.mojang.serialization.Codec instance) { return wrapperContained.method_60209(instance); }

}