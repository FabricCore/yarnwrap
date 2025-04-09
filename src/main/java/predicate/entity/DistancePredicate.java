package yarnwrap.predicate.entity;
public class DistancePredicate { public net.minecraft.predicate.entity.DistancePredicate wrapperContained; public DistancePredicate(net.minecraft.predicate.entity.DistancePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.predicate.entity.DistancePredicate absolute(Object absolute) { return new yarnwrap.predicate.entity.DistancePredicate(wrapperContained.absolute(absolute)); }
// public yarnwrap.predicate.entity.DistancePredicate y(Object y) { return new yarnwrap.predicate.entity.DistancePredicate(wrapperContained.y(y)); }
public boolean test(double x0,double y0,double z0,double x1,double y1,double z1) { return wrapperContained.test(x0,y0,z0,x1,y1,z1); }
// public yarnwrap.predicate.entity.DistancePredicate horizontal(Object horizontal) { return new yarnwrap.predicate.entity.DistancePredicate(wrapperContained.horizontal(horizontal)); }

}