package yarnwrap.world.gen.blockpredicate;
public class HasSturdyFacePredicate { public net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate wrapperContained; public HasSturdyFacePredicate(net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.CODEC = value; }

// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.Vec3i value) { wrapperContained.offset = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.offset); }
// public static void offset(yarnwrap.util.math.Vec3i value, ) { net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.offset = value.wrapperContained; }

// public yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(wrapperContained.face); }
// public void face(yarnwrap.util.math.Direction value) { wrapperContained.face = value.wrapperContained; }
// public static yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.face); }
// public static void face(yarnwrap.util.math.Direction value, ) { net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.face = value.wrapperContained; }

public HasSturdyFacePredicate(yarnwrap.util.math.Vec3i offset,yarnwrap.util.math.Direction face) { this.wrapperContained = new net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate(offset.wrapperContained,face.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_39912(Object instance) { return wrapperContained.method_39912(instance); }
// public static com.mojang.datafixers.kinds.App method_39912(Object instance, ) { return net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.method_39912(instance); }
// public yarnwrap.util.math.Direction method_39913(yarnwrap.world.gen.blockpredicate.HasSturdyFacePredicate predicate) { return new yarnwrap.util.math.Direction(wrapperContained.method_39913(predicate.wrapperContained)); }
// public static yarnwrap.util.math.Direction method_39913(yarnwrap.world.gen.blockpredicate.HasSturdyFacePredicate predicate, ) { return new yarnwrap.util.math.Direction(net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.method_39913(predicate.wrapperContained)); }
// public yarnwrap.util.math.Vec3i method_39914(yarnwrap.world.gen.blockpredicate.HasSturdyFacePredicate predicate) { return new yarnwrap.util.math.Vec3i(wrapperContained.method_39914(predicate.wrapperContained)); }
// public static yarnwrap.util.math.Vec3i method_39914(yarnwrap.world.gen.blockpredicate.HasSturdyFacePredicate predicate, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.method_39914(predicate.wrapperContained)); }
// public boolean test(java.lang.Object world,java.lang.Object pos) { return wrapperContained.test(world,pos); }
// public static boolean test(java.lang.Object world,java.lang.Object pos, ) { return net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate.test(world,pos); }

}