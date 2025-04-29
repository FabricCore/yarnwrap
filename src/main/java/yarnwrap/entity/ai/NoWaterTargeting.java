package yarnwrap.entity.ai;
public class NoWaterTargeting { public net.minecraft.entity.ai.NoWaterTargeting wrapperContained; public NoWaterTargeting(net.minecraft.entity.ai.NoWaterTargeting wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d find(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange,int startHeight,yarnwrap.util.math.Vec3d direction,double angleRange) { return new yarnwrap.util.math.Vec3d(wrapperContained.find(entity.wrapperContained,horizontalRange,verticalRange,startHeight,direction.wrapperContained,angleRange)); }
// public static yarnwrap.util.math.Vec3d find(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange,int startHeight,yarnwrap.util.math.Vec3d direction,double angleRange, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.NoWaterTargeting.find(entity.wrapperContained,horizontalRange,verticalRange,startHeight,direction.wrapperContained,angleRange)); }

}