package yarnwrap.entity.ai.brain;
public class LookTarget { public net.minecraft.entity.ai.brain.LookTarget wrapperContained; public LookTarget(net.minecraft.entity.ai.brain.LookTarget wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
public boolean isSeenBy(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isSeenBy(entity.wrapperContained); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }

}