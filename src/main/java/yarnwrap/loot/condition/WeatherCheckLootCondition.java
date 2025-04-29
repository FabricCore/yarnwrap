package yarnwrap.loot.condition;
public class WeatherCheckLootCondition { public net.minecraft.loot.condition.WeatherCheckLootCondition wrapperContained; public WeatherCheckLootCondition(net.minecraft.loot.condition.WeatherCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional raining() { return wrapperContained.raining; }
// public void raining(java.util.Optional value) { wrapperContained.raining = value; }
// public static java.util.Optional raining() { return net.minecraft.loot.condition.WeatherCheckLootCondition.raining; }
// public static void raining(java.util.Optional value, ) { net.minecraft.loot.condition.WeatherCheckLootCondition.raining = value; }

// public java.util.Optional thundering() { return wrapperContained.thundering; }
// public void thundering(java.util.Optional value) { wrapperContained.thundering = value; }
// public static java.util.Optional thundering() { return net.minecraft.loot.condition.WeatherCheckLootCondition.thundering; }
// public static void thundering(java.util.Optional value, ) { net.minecraft.loot.condition.WeatherCheckLootCondition.thundering = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.WeatherCheckLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.WeatherCheckLootCondition.CODEC = value; }

// public java.util.Optional raining() { return wrapperContained.raining(); }
// // public static java.util.Optional raining() { return net.minecraft.loot.condition.WeatherCheckLootCondition.raining(); }
// public java.util.Optional thundering() { return wrapperContained.thundering(); }
// // public static java.util.Optional thundering() { return net.minecraft.loot.condition.WeatherCheckLootCondition.thundering(); }
// public Object create() { return wrapperContained.create(); }
public static Object create() { return net.minecraft.loot.condition.WeatherCheckLootCondition.create(); }
// public com.mojang.datafixers.kinds.App method_53429(Object instance) { return wrapperContained.method_53429(instance); }
// public static com.mojang.datafixers.kinds.App method_53429(Object instance, ) { return net.minecraft.loot.condition.WeatherCheckLootCondition.method_53429(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.WeatherCheckLootCondition.test(context); }

}