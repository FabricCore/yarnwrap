package yarnwrap.world.gen.blockpredicate;
public class SolidBlockPredicate { public net.minecraft.world.gen.blockpredicate.SolidBlockPredicate wrapperContained; public SolidBlockPredicate(net.minecraft.world.gen.blockpredicate.SolidBlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.blockpredicate.SolidBlockPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.blockpredicate.SolidBlockPredicate.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_39590(Object instance) { return wrapperContained.method_39590(instance); }
// public static com.mojang.datafixers.kinds.App method_39590(Object instance, ) { return net.minecraft.world.gen.blockpredicate.SolidBlockPredicate.method_39590(instance); }

}