package yarnwrap.predicate.entity;
public class DamageSourcePredicate { public net.minecraft.predicate.entity.DamageSourcePredicate wrapperContained; public DamageSourcePredicate(net.minecraft.predicate.entity.DamageSourcePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public DamageSourcePredicate(java.util.List tagPredicates) { this.wrapperContained = new net.minecraft.predicate.entity.DamageSourcePredicate(tagPredicates); }
// public com.mojang.datafixers.kinds.App method_53116(Object instance) { return wrapperContained.method_53116(instance); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained,damageSource.wrapperContained); }
public boolean test(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.test(player.wrapperContained,damageSource.wrapperContained); }

}