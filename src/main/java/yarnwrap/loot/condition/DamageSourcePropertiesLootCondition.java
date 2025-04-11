package yarnwrap.loot.condition;
public class DamageSourcePropertiesLootCondition { public net.minecraft.loot.condition.DamageSourcePropertiesLootCondition wrapperContained; public DamageSourcePropertiesLootCondition(net.minecraft.loot.condition.DamageSourcePropertiesLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_53412(Object instance) { return wrapperContained.method_53412(instance); }
// public Object builder(Object builder) { return wrapperContained.builder(builder); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }

}