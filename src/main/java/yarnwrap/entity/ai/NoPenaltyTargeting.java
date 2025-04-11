package yarnwrap.entity.ai;
public class NoPenaltyTargeting { public net.minecraft.entity.ai.NoPenaltyTargeting wrapperContained; public NoPenaltyTargeting(net.minecraft.entity.ai.NoPenaltyTargeting wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Vec3d find(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange) { return new yarnwrap.util.math.Vec3d(wrapperContained.find(entity.wrapperContained,horizontalRange,verticalRange)); }
public yarnwrap.util.math.Vec3d findFrom(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange,yarnwrap.util.math.Vec3d start) { return new yarnwrap.util.math.Vec3d(wrapperContained.findFrom(entity.wrapperContained,horizontalRange,verticalRange,start.wrapperContained)); }
public yarnwrap.util.math.Vec3d findTo(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange,yarnwrap.util.math.Vec3d end,double angleRange) { return new yarnwrap.util.math.Vec3d(wrapperContained.findTo(entity.wrapperContained,horizontalRange,verticalRange,end.wrapperContained,angleRange)); }
// public yarnwrap.util.math.BlockPos tryMake(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,boolean posTargetInRange,yarnwrap.util.math.BlockPos fuzz) { return new yarnwrap.util.math.BlockPos(wrapperContained.tryMake(entity.wrapperContained,horizontalRange,posTargetInRange,fuzz.wrapperContained)); }

}