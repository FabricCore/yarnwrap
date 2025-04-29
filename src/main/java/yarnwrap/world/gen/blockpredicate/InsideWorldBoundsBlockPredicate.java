package yarnwrap.world.gen.blockpredicate;
public class InsideWorldBoundsBlockPredicate { public net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate wrapperContained; public InsideWorldBoundsBlockPredicate(net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate.CODEC = value; }

// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.Vec3i value) { wrapperContained.offset = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate.offset); }
// public static void offset(yarnwrap.util.math.Vec3i value, ) { net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate.offset = value.wrapperContained; }

public InsideWorldBoundsBlockPredicate(yarnwrap.util.math.Vec3i offset) { this.wrapperContained = new net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate(offset.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_39588(Object instance) { return wrapperContained.method_39588(instance); }
// public static com.mojang.datafixers.kinds.App method_39588(Object instance, ) { return net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate.method_39588(instance); }
// public yarnwrap.util.math.Vec3i method_39589(yarnwrap.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate predicate) { return new yarnwrap.util.math.Vec3i(wrapperContained.method_39589(predicate.wrapperContained)); }
// public static yarnwrap.util.math.Vec3i method_39589(yarnwrap.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate predicate, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate.method_39589(predicate.wrapperContained)); }
// public boolean test(java.lang.Object world,java.lang.Object pos) { return wrapperContained.test(world,pos); }
// public static boolean test(java.lang.Object world,java.lang.Object pos, ) { return net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate.test(world,pos); }

}