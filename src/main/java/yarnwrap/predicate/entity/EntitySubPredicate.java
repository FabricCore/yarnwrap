package yarnwrap.predicate.entity;
public class EntitySubPredicate { public net.minecraft.predicate.entity.EntitySubPredicate wrapperContained; public EntitySubPredicate(net.minecraft.predicate.entity.EntitySubPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.EntitySubPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.EntitySubPredicate.CODEC = value; }

public boolean test(yarnwrap.entity.Entity entity,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos) { return wrapperContained.test(entity.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean test(yarnwrap.entity.Entity entity,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.predicate.entity.EntitySubPredicate.test(entity.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.predicate.entity.EntitySubPredicate.getCodec(); }

}