package yarnwrap.loot.condition;
public class TimeCheckLootCondition { public net.minecraft.loot.condition.TimeCheckLootCondition wrapperContained; public TimeCheckLootCondition(net.minecraft.loot.condition.TimeCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.TimeCheckLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.TimeCheckLootCondition.CODEC = value; }

// public TimeCheckLootCondition(java.util.Optional value) { this.wrapperContained = new net.minecraft.loot.condition.TimeCheckLootCondition(value); }
// public Object create(yarnwrap.loot.operator.BoundedIntUnaryOperator value) { return wrapperContained.create(value.wrapperContained); }
// public static Object create(yarnwrap.loot.operator.BoundedIntUnaryOperator value, ) { return net.minecraft.loot.condition.TimeCheckLootCondition.create(value.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53427(Object instance) { return wrapperContained.method_53427(instance); }
// public static com.mojang.datafixers.kinds.App method_53427(Object instance, ) { return net.minecraft.loot.condition.TimeCheckLootCondition.method_53427(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.TimeCheckLootCondition.test(context); }

}