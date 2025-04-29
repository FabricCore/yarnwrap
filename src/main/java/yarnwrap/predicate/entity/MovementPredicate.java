package yarnwrap.predicate.entity;
public class MovementPredicate { public net.minecraft.predicate.entity.MovementPredicate wrapperContained; public MovementPredicate(net.minecraft.predicate.entity.MovementPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.MovementPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.MovementPredicate.CODEC = value; }

public boolean test(double x,double y,double z,double fallDistance) { return wrapperContained.test(x,y,z,fallDistance); }
// public static boolean test(double x,double y,double z,double fallDistance, ) { return net.minecraft.predicate.entity.MovementPredicate.test(x,y,z,fallDistance); }
// public com.mojang.datafixers.kinds.App method_60278(Object instance) { return wrapperContained.method_60278(instance); }
// public static com.mojang.datafixers.kinds.App method_60278(Object instance, ) { return net.minecraft.predicate.entity.MovementPredicate.method_60278(instance); }
// public yarnwrap.predicate.entity.MovementPredicate speed(Object speed) { return new yarnwrap.predicate.entity.MovementPredicate(wrapperContained.speed(speed)); }
// public static yarnwrap.predicate.entity.MovementPredicate speed(Object speed, ) { return new yarnwrap.predicate.entity.MovementPredicate(net.minecraft.predicate.entity.MovementPredicate.speed(speed)); }
// public yarnwrap.predicate.entity.MovementPredicate horizontalSpeed(Object horizontalSpeed) { return new yarnwrap.predicate.entity.MovementPredicate(wrapperContained.horizontalSpeed(horizontalSpeed)); }
// public static yarnwrap.predicate.entity.MovementPredicate horizontalSpeed(Object horizontalSpeed, ) { return new yarnwrap.predicate.entity.MovementPredicate(net.minecraft.predicate.entity.MovementPredicate.horizontalSpeed(horizontalSpeed)); }
// public yarnwrap.predicate.entity.MovementPredicate verticalSpeed(Object verticalSpeed) { return new yarnwrap.predicate.entity.MovementPredicate(wrapperContained.verticalSpeed(verticalSpeed)); }
// public static yarnwrap.predicate.entity.MovementPredicate verticalSpeed(Object verticalSpeed, ) { return new yarnwrap.predicate.entity.MovementPredicate(net.minecraft.predicate.entity.MovementPredicate.verticalSpeed(verticalSpeed)); }
// public yarnwrap.predicate.entity.MovementPredicate fallDistance(Object fallDistance) { return new yarnwrap.predicate.entity.MovementPredicate(wrapperContained.fallDistance(fallDistance)); }
// public static yarnwrap.predicate.entity.MovementPredicate fallDistance(Object fallDistance, ) { return new yarnwrap.predicate.entity.MovementPredicate(net.minecraft.predicate.entity.MovementPredicate.fallDistance(fallDistance)); }

}