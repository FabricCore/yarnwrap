package yarnwrap.predicate.entity;
public class DistancePredicate { public net.minecraft.predicate.entity.DistancePredicate wrapperContained; public DistancePredicate(net.minecraft.predicate.entity.DistancePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.DistancePredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.DistancePredicate.CODEC = value; }

// public DistancePredicate(Object x,Object y,Object z,Object horizontal,Object absolute) { this.wrapperContained = new net.minecraft.predicate.entity.DistancePredicate(x,y,z,horizontal,absolute); }
// public yarnwrap.predicate.entity.DistancePredicate absolute(Object absolute) { return new yarnwrap.predicate.entity.DistancePredicate(wrapperContained.absolute(absolute)); }
// public static yarnwrap.predicate.entity.DistancePredicate absolute(Object absolute, ) { return new yarnwrap.predicate.entity.DistancePredicate(net.minecraft.predicate.entity.DistancePredicate.absolute(absolute)); }
// public com.mojang.datafixers.kinds.App method_53118(Object instance) { return wrapperContained.method_53118(instance); }
// public static com.mojang.datafixers.kinds.App method_53118(Object instance, ) { return net.minecraft.predicate.entity.DistancePredicate.method_53118(instance); }
// public yarnwrap.predicate.entity.DistancePredicate y(Object y) { return new yarnwrap.predicate.entity.DistancePredicate(wrapperContained.y(y)); }
// public static yarnwrap.predicate.entity.DistancePredicate y(Object y, ) { return new yarnwrap.predicate.entity.DistancePredicate(net.minecraft.predicate.entity.DistancePredicate.y(y)); }
public boolean test(double x0,double y0,double z0,double x1,double y1,double z1) { return wrapperContained.test(x0,y0,z0,x1,y1,z1); }
// public static boolean test(double x0,double y0,double z0,double x1,double y1,double z1, ) { return net.minecraft.predicate.entity.DistancePredicate.test(x0,y0,z0,x1,y1,z1); }
// public yarnwrap.predicate.entity.DistancePredicate horizontal(Object horizontal) { return new yarnwrap.predicate.entity.DistancePredicate(wrapperContained.horizontal(horizontal)); }
// public static yarnwrap.predicate.entity.DistancePredicate horizontal(Object horizontal, ) { return new yarnwrap.predicate.entity.DistancePredicate(net.minecraft.predicate.entity.DistancePredicate.horizontal(horizontal)); }

}