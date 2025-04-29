package yarnwrap.entity.ai;
public class AboveGroundTargeting { public net.minecraft.entity.ai.AboveGroundTargeting wrapperContained; public AboveGroundTargeting(net.minecraft.entity.ai.AboveGroundTargeting wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d find(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange,double x,double z,float angle,int maxAboveSolid,int minAboveSolid) { return new yarnwrap.util.math.Vec3d(wrapperContained.find(entity.wrapperContained,horizontalRange,verticalRange,x,z,angle,maxAboveSolid,minAboveSolid)); }
// public static yarnwrap.util.math.Vec3d find(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,int verticalRange,double x,double z,float angle,int maxAboveSolid,int minAboveSolid, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.AboveGroundTargeting.find(entity.wrapperContained,horizontalRange,verticalRange,x,z,angle,maxAboveSolid,minAboveSolid)); }
// public boolean method_31526(yarnwrap.entity.mob.PathAwareEntity pos) { return wrapperContained.method_31526(pos.wrapperContained); }
// public static boolean method_31526(yarnwrap.entity.mob.PathAwareEntity pos, ) { return net.minecraft.entity.ai.AboveGroundTargeting.method_31526(pos.wrapperContained); }

}