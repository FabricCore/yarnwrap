package yarnwrap.predicate;
public class LightPredicate { public net.minecraft.predicate.LightPredicate wrapperContained; public LightPredicate(net.minecraft.predicate.LightPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object range() { return wrapperContained.range; }
// // public void range(Object value) { wrapperContained.range = value; }
// // public static Object range() { return net.minecraft.predicate.LightPredicate.range; }
// // public static void range(Object value, ) { net.minecraft.predicate.LightPredicate.range = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.LightPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.LightPredicate.CODEC = value; }

// public LightPredicate(Object range) { this.wrapperContained = new net.minecraft.predicate.LightPredicate(range); }
// public Object range() { return wrapperContained.range(); }
// // public static Object range() { return net.minecraft.predicate.LightPredicate.range(); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }
// public static boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.predicate.LightPredicate.test(world.wrapperContained,pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53172(Object instance) { return wrapperContained.method_53172(instance); }
// public static com.mojang.datafixers.kinds.App method_53172(Object instance, ) { return net.minecraft.predicate.LightPredicate.method_53172(instance); }

}