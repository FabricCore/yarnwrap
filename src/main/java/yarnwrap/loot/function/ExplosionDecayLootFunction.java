package yarnwrap.loot.function;
public class ExplosionDecayLootFunction { public net.minecraft.loot.function.ExplosionDecayLootFunction wrapperContained; public ExplosionDecayLootFunction(net.minecraft.loot.function.ExplosionDecayLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.ExplosionDecayLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.ExplosionDecayLootFunction.CODEC = value; }

// public ExplosionDecayLootFunction(java.util.List conditions) { this.wrapperContained = new net.minecraft.loot.function.ExplosionDecayLootFunction(conditions); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.loot.function.ExplosionDecayLootFunction.builder(); }
// public com.mojang.datafixers.kinds.App method_53309(Object instance) { return wrapperContained.method_53309(instance); }
// public static com.mojang.datafixers.kinds.App method_53309(Object instance, ) { return net.minecraft.loot.function.ExplosionDecayLootFunction.method_53309(instance); }

}