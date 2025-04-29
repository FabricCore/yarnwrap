package yarnwrap.loot.condition;
public class KilledByPlayerLootCondition { public net.minecraft.loot.condition.KilledByPlayerLootCondition wrapperContained; public KilledByPlayerLootCondition(net.minecraft.loot.condition.KilledByPlayerLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.condition.KilledByPlayerLootCondition INSTANCE() { return new yarnwrap.loot.condition.KilledByPlayerLootCondition(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.loot.condition.KilledByPlayerLootCondition value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public static yarnwrap.loot.condition.KilledByPlayerLootCondition INSTANCE() { return new yarnwrap.loot.condition.KilledByPlayerLootCondition(net.minecraft.loot.condition.KilledByPlayerLootCondition.INSTANCE); }
// public static void INSTANCE(yarnwrap.loot.condition.KilledByPlayerLootCondition value, ) { net.minecraft.loot.condition.KilledByPlayerLootCondition.INSTANCE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.KilledByPlayerLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.KilledByPlayerLootCondition.CODEC = value; }

// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.loot.condition.KilledByPlayerLootCondition.builder(); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.KilledByPlayerLootCondition.test(context); }

}