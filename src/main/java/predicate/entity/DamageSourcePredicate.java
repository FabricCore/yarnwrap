package yarnwrap.predicate.entity;
public class DamageSourcePredicate { public net.minecraft.predicate.entity.DamageSourcePredicate wrapperContained; public DamageSourcePredicate(net.minecraft.predicate.entity.DamageSourcePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained,damageSource.wrapperContained); }
public boolean test(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.test(player.wrapperContained,damageSource.wrapperContained); }

}