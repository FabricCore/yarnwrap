package yarnwrap.enchantment.effect;
public class TargetedEnchantmentEffect { public net.minecraft.enchantment.effect.TargetedEnchantmentEffect wrapperContained; public TargetedEnchantmentEffect(net.minecraft.enchantment.effect.TargetedEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec createPostAttackCodec(com.mojang.serialization.Codec effectCodec,yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createPostAttackCodec(effectCodec,lootContextType.wrapperContained); }
public boolean test(yarnwrap.loot.context.LootContext lootContext) { return wrapperContained.test(lootContext.wrapperContained); }
public com.mojang.serialization.Codec createEquipmentDropsCodec(com.mojang.serialization.Codec effectCodec,yarnwrap.loot.context.LootContextType lootContextType) { return wrapperContained.createEquipmentDropsCodec(effectCodec,lootContextType.wrapperContained); }

}