package yarnwrap.entity.spawn;
public class StructureSpawnCondition { public net.minecraft.entity.spawn.StructureSpawnCondition wrapperContained; public StructureSpawnCondition(net.minecraft.entity.spawn.StructureSpawnCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.entity.spawn.StructureSpawnCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.entity.spawn.StructureSpawnCondition.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_67172(Object instance) { return wrapperContained.method_67172(instance); }
// public static com.mojang.datafixers.kinds.App method_67172(Object instance, ) { return net.minecraft.entity.spawn.StructureSpawnCondition.method_67172(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.entity.spawn.StructureSpawnCondition.test(context); }

}