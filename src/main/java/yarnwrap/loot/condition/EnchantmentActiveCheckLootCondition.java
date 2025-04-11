package yarnwrap.loot.condition;
public class EnchantmentActiveCheckLootCondition { public net.minecraft.loot.condition.EnchantmentActiveCheckLootCondition wrapperContained; public EnchantmentActiveCheckLootCondition(net.minecraft.loot.condition.EnchantmentActiveCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60303(Object instance) { return wrapperContained.method_60303(instance); }
public Object requireActive() { return wrapperContained.requireActive(); }
public Object requireInactive() { return wrapperContained.requireInactive(); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }

}