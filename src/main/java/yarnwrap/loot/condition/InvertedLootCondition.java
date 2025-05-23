package yarnwrap.loot.condition;
public class InvertedLootCondition { public net.minecraft.loot.condition.InvertedLootCondition wrapperContained; public InvertedLootCondition(net.minecraft.loot.condition.InvertedLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.InvertedLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.InvertedLootCondition.CODEC = value; }

public InvertedLootCondition(yarnwrap.loot.condition.LootCondition term) { this.wrapperContained = new net.minecraft.loot.condition.InvertedLootCondition(term.wrapperContained); }
// public Object builder(Object term) { return wrapperContained.builder(term); }
// public static Object builder(Object term, ) { return net.minecraft.loot.condition.InvertedLootCondition.builder(term); }
// public com.mojang.datafixers.kinds.App method_53414(Object instance) { return wrapperContained.method_53414(instance); }
// public static com.mojang.datafixers.kinds.App method_53414(Object instance, ) { return net.minecraft.loot.condition.InvertedLootCondition.method_53414(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.InvertedLootCondition.test(context); }

}