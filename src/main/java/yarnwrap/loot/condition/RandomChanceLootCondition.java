package yarnwrap.loot.condition;
public class RandomChanceLootCondition { public net.minecraft.loot.condition.RandomChanceLootCondition wrapperContained; public RandomChanceLootCondition(net.minecraft.loot.condition.RandomChanceLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_53424(Object instance) { return wrapperContained.method_53424(instance); }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider chance) { return wrapperContained.builder(chance.wrapperContained); }
public Object builder(float chance) { return wrapperContained.builder(chance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }

}