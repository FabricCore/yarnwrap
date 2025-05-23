package yarnwrap.loot.condition;
public class LocationCheckLootCondition { public net.minecraft.loot.condition.LocationCheckLootCondition wrapperContained; public LocationCheckLootCondition(net.minecraft.loot.condition.LocationCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.LocationCheckLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.LocationCheckLootCondition.CODEC = value; }

// public com.mojang.serialization.MapCodec OFFSET_CODEC() { return wrapperContained.OFFSET_CODEC; }
// public void OFFSET_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.OFFSET_CODEC = value; }
// public static com.mojang.serialization.MapCodec OFFSET_CODEC() { return net.minecraft.loot.condition.LocationCheckLootCondition.OFFSET_CODEC; }
// public static void OFFSET_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.LocationCheckLootCondition.OFFSET_CODEC = value; }

// public LocationCheckLootCondition(java.util.Optional offset) { this.wrapperContained = new net.minecraft.loot.condition.LocationCheckLootCondition(offset); }
// public Object builder(Object predicateBuilder) { return wrapperContained.builder(predicateBuilder); }
// public static Object builder(Object predicateBuilder, ) { return net.minecraft.loot.condition.LocationCheckLootCondition.builder(predicateBuilder); }
// public Object builder(Object predicateBuilder,yarnwrap.util.math.BlockPos pos) { return wrapperContained.builder(predicateBuilder,pos.wrapperContained); }
// public static Object builder(Object predicateBuilder,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.loot.condition.LocationCheckLootCondition.builder(predicateBuilder,pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53415(Object instance) { return wrapperContained.method_53415(instance); }
// public static com.mojang.datafixers.kinds.App method_53415(Object instance, ) { return net.minecraft.loot.condition.LocationCheckLootCondition.method_53415(instance); }
// public com.mojang.datafixers.kinds.App method_53416(Object instance) { return wrapperContained.method_53416(instance); }
// public static com.mojang.datafixers.kinds.App method_53416(Object instance, ) { return net.minecraft.loot.condition.LocationCheckLootCondition.method_53416(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.LocationCheckLootCondition.test(context); }

}