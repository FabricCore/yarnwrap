package yarnwrap.loot.condition;
public class SurvivesExplosionLootCondition { public net.minecraft.loot.condition.SurvivesExplosionLootCondition wrapperContained; public SurvivesExplosionLootCondition(net.minecraft.loot.condition.SurvivesExplosionLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.condition.SurvivesExplosionLootCondition INSTANCE() { return new yarnwrap.loot.condition.SurvivesExplosionLootCondition(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.loot.condition.SurvivesExplosionLootCondition value) { wrapperContained.INSTANCE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder() { return wrapperContained.builder(); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }

}