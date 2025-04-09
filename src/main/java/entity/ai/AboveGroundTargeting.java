package yarnwrap.entity.ai;
public class AboveGroundTargeting { public net.minecraft.entity.ai.AboveGroundTargeting wrapperContained; public AboveGroundTargeting(net.minecraft.entity.ai.AboveGroundTargeting wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Vec3d find(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange,double x,double z,float angle,int maxAboveSolid,int minAboveSolid) { return new yarnwrap.util.math.Vec3d(wrapperContained.find(entity.wrapperContained,horizontalRange,verticalRange,x,z,angle,maxAboveSolid,minAboveSolid)); }

}