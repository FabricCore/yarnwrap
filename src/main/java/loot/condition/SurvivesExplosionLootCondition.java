package yarnwrap.loot.condition;
public class SurvivesExplosionLootCondition { public net.minecraft.loot.condition.SurvivesExplosionLootCondition wrapperContained; public SurvivesExplosionLootCondition(net.minecraft.loot.condition.SurvivesExplosionLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.condition.SurvivesExplosionLootCondition INSTANCE() { return new yarnwrap.loot.condition.SurvivesExplosionLootCondition(wrapperContained.INSTANCE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder() { return wrapperContained.builder(); }

}