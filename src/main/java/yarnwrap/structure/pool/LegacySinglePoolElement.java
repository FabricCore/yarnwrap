package yarnwrap.structure.pool;
public class LegacySinglePoolElement { public net.minecraft.structure.pool.LegacySinglePoolElement wrapperContained; public LegacySinglePoolElement(net.minecraft.structure.pool.LegacySinglePoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.pool.LegacySinglePoolElement.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.pool.LegacySinglePoolElement.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_28874(Object instance) { return wrapperContained.method_28874(instance); }
// public static com.mojang.datafixers.kinds.App method_28874(Object instance, ) { return net.minecraft.structure.pool.LegacySinglePoolElement.method_28874(instance); }

}