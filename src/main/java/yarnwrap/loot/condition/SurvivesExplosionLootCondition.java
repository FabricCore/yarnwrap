package yarnwrap.loot.condition;
public class SurvivesExplosionLootCondition { public net.minecraft.loot.condition.SurvivesExplosionLootCondition wrapperContained; public SurvivesExplosionLootCondition(net.minecraft.loot.condition.SurvivesExplosionLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.condition.SurvivesExplosionLootCondition INSTANCE() { return new yarnwrap.loot.condition.SurvivesExplosionLootCondition(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.loot.condition.SurvivesExplosionLootCondition value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public static yarnwrap.loot.condition.SurvivesExplosionLootCondition INSTANCE() { return new yarnwrap.loot.condition.SurvivesExplosionLootCondition(net.minecraft.loot.condition.SurvivesExplosionLootCondition.INSTANCE); }
// public static void INSTANCE(yarnwrap.loot.condition.SurvivesExplosionLootCondition value, ) { net.minecraft.loot.condition.SurvivesExplosionLootCondition.INSTANCE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.SurvivesExplosionLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.SurvivesExplosionLootCondition.CODEC = value; }

// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.loot.condition.SurvivesExplosionLootCondition.builder(); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.SurvivesExplosionLootCondition.test(context); }

}