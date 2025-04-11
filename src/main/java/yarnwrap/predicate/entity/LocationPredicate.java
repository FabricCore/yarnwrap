package yarnwrap.predicate.entity;
public class LocationPredicate { public net.minecraft.predicate.entity.LocationPredicate wrapperContained; public LocationPredicate(net.minecraft.predicate.entity.LocationPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_53178(Object instance) { return wrapperContained.method_53178(instance); }
public boolean test(yarnwrap.server.world.ServerWorld world,double x,double y,double z) { return wrapperContained.test(world.wrapperContained,x,y,z); }

}