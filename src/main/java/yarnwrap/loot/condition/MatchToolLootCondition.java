package yarnwrap.loot.condition;
public class MatchToolLootCondition { public net.minecraft.loot.condition.MatchToolLootCondition wrapperContained; public MatchToolLootCondition(net.minecraft.loot.condition.MatchToolLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.MatchToolLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.MatchToolLootCondition.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_53426(Object instance) { return wrapperContained.method_53426(instance); }
// public static com.mojang.datafixers.kinds.App method_53426(Object instance, ) { return net.minecraft.loot.condition.MatchToolLootCondition.method_53426(instance); }
// public Object builder(Object predicate) { return wrapperContained.builder(predicate); }
// public static Object builder(Object predicate, ) { return net.minecraft.loot.condition.MatchToolLootCondition.builder(predicate); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.MatchToolLootCondition.test(context); }

}