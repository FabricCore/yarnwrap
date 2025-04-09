package yarnwrap.loot.condition;
public class DamageSourcePropertiesLootCondition { public net.minecraft.loot.condition.DamageSourcePropertiesLootCondition wrapperContained; public DamageSourcePropertiesLootCondition(net.minecraft.loot.condition.DamageSourcePropertiesLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object builder(Object builder) { return wrapperContained.builder(builder); }

}