package yarnwrap.entity.ai.brain.task;
public class BreezeMovementUtil { public net.minecraft.entity.ai.brain.task.BreezeMovementUtil wrapperContained; public BreezeMovementUtil(net.minecraft.entity.ai.brain.task.BreezeMovementUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public double MAX_MOVE_DISTANCE() { return wrapperContained.MAX_MOVE_DISTANCE; }
public yarnwrap.util.math.Vec3d getRandomPosBehindTarget(yarnwrap.entity.LivingEntity target,yarnwrap.util.math.random.Random random) { return new yarnwrap.util.math.Vec3d(wrapperContained.getRandomPosBehindTarget(target.wrapperContained,random.wrapperContained)); }
public boolean canMoveTo(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.util.math.Vec3d pos) { return wrapperContained.canMoveTo(breeze.wrapperContained,pos.wrapperContained); }

}