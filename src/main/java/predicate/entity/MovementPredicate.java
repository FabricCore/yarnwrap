package yarnwrap.predicate.entity;
public class MovementPredicate { public net.minecraft.predicate.entity.MovementPredicate wrapperContained; public MovementPredicate(net.minecraft.predicate.entity.MovementPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public boolean test(double x,double y,double z,double fallDistance) { return wrapperContained.test(x,y,z,fallDistance); }
// public yarnwrap.predicate.entity.MovementPredicate speed(Object speed) { return new yarnwrap.predicate.entity.MovementPredicate(wrapperContained.speed(speed)); }
// public yarnwrap.predicate.entity.MovementPredicate horizontalSpeed(Object horizontalSpeed) { return new yarnwrap.predicate.entity.MovementPredicate(wrapperContained.horizontalSpeed(horizontalSpeed)); }
// public yarnwrap.predicate.entity.MovementPredicate verticalSpeed(Object verticalSpeed) { return new yarnwrap.predicate.entity.MovementPredicate(wrapperContained.verticalSpeed(verticalSpeed)); }
// public yarnwrap.predicate.entity.MovementPredicate fallDistance(Object fallDistance) { return new yarnwrap.predicate.entity.MovementPredicate(wrapperContained.fallDistance(fallDistance)); }

}