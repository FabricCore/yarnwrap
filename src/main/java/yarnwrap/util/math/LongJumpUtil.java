package yarnwrap.util.math;
public class LongJumpUtil { public net.minecraft.util.math.LongJumpUtil wrapperContained; public LongJumpUtil(net.minecraft.util.math.LongJumpUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isPathClear(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.EntityDimensions dimensions,yarnwrap.util.math.Vec3d lastPos,yarnwrap.util.math.Vec3d nextPos) { return wrapperContained.isPathClear(entity.wrapperContained,dimensions.wrapperContained,lastPos.wrapperContained,nextPos.wrapperContained); }
// public static boolean isPathClear(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.EntityDimensions dimensions,yarnwrap.util.math.Vec3d lastPos,yarnwrap.util.math.Vec3d nextPos, ) { return net.minecraft.util.math.LongJumpUtil.isPathClear(entity.wrapperContained,dimensions.wrapperContained,lastPos.wrapperContained,nextPos.wrapperContained); }
// public java.util.Optional getJumpingVelocity(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.Vec3d jumpTarget,float maxVelocity,int angle,boolean requireClearPath) { return wrapperContained.getJumpingVelocity(entity.wrapperContained,jumpTarget.wrapperContained,maxVelocity,angle,requireClearPath); }
// public static java.util.Optional getJumpingVelocity(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.Vec3d jumpTarget,float maxVelocity,int angle,boolean requireClearPath, ) { return net.minecraft.util.math.LongJumpUtil.getJumpingVelocity(entity.wrapperContained,jumpTarget.wrapperContained,maxVelocity,angle,requireClearPath); }

}