package yarnwrap.loot.condition;
public class EnchantmentActiveCheckLootCondition { public net.minecraft.loot.condition.EnchantmentActiveCheckLootCondition wrapperContained; public EnchantmentActiveCheckLootCondition(net.minecraft.loot.condition.EnchantmentActiveCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object requireActive() { return wrapperContained.requireActive(); }
public Object requireInactive() { return wrapperContained.requireInactive(); }

}