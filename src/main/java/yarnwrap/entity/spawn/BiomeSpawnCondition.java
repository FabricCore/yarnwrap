package yarnwrap.entity.spawn;
public class BiomeSpawnCondition { public net.minecraft.entity.spawn.BiomeSpawnCondition wrapperContained; public BiomeSpawnCondition(net.minecraft.entity.spawn.BiomeSpawnCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.entity.spawn.BiomeSpawnCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.entity.spawn.BiomeSpawnCondition.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_67152(Object instance) { return wrapperContained.method_67152(instance); }
// public static com.mojang.datafixers.kinds.App method_67152(Object instance, ) { return net.minecraft.entity.spawn.BiomeSpawnCondition.method_67152(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.entity.spawn.BiomeSpawnCondition.test(context); }

}