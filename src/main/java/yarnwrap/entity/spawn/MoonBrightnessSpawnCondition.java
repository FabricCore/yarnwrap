package yarnwrap.entity.spawn;
public class MoonBrightnessSpawnCondition { public net.minecraft.entity.spawn.MoonBrightnessSpawnCondition wrapperContained; public MoonBrightnessSpawnCondition(net.minecraft.entity.spawn.MoonBrightnessSpawnCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.entity.spawn.MoonBrightnessSpawnCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.entity.spawn.MoonBrightnessSpawnCondition.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_67157(Object instance) { return wrapperContained.method_67157(instance); }
// public static com.mojang.datafixers.kinds.App method_67157(Object instance, ) { return net.minecraft.entity.spawn.MoonBrightnessSpawnCondition.method_67157(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.entity.spawn.MoonBrightnessSpawnCondition.test(context); }

}