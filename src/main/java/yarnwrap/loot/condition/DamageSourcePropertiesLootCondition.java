package yarnwrap.loot.condition;
public class DamageSourcePropertiesLootCondition { public net.minecraft.loot.condition.DamageSourcePropertiesLootCondition wrapperContained; public DamageSourcePropertiesLootCondition(net.minecraft.loot.condition.DamageSourcePropertiesLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.DamageSourcePropertiesLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.DamageSourcePropertiesLootCondition.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_53412(Object instance) { return wrapperContained.method_53412(instance); }
// public static com.mojang.datafixers.kinds.App method_53412(Object instance, ) { return net.minecraft.loot.condition.DamageSourcePropertiesLootCondition.method_53412(instance); }
// public Object builder(Object builder) { return wrapperContained.builder(builder); }
// public static Object builder(Object builder, ) { return net.minecraft.loot.condition.DamageSourcePropertiesLootCondition.builder(builder); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.DamageSourcePropertiesLootCondition.test(context); }

}