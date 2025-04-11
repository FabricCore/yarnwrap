package yarnwrap.entity.ai;
public class NoPenaltySolidTargeting { public net.minecraft.entity.ai.NoPenaltySolidTargeting wrapperContained; public NoPenaltySolidTargeting(net.minecraft.entity.ai.NoPenaltySolidTargeting wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Vec3d find(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange,int startHeight,double directionX,double directionZ,double rangeAngle) { return new yarnwrap.util.math.Vec3d(wrapperContained.find(entity.wrapperContained,horizontalRange,verticalRange,startHeight,directionX,directionZ,rangeAngle)); }
public yarnwrap.util.math.BlockPos tryMake(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange,int startHeight,double directionX,double directionZ,double rangeAngle,boolean posTargetInRange) { return new yarnwrap.util.math.BlockPos(wrapperContained.tryMake(entity.wrapperContained,horizontalRange,verticalRange,startHeight,directionX,directionZ,rangeAngle,posTargetInRange)); }

}