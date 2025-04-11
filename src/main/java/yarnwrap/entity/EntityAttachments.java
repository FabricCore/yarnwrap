package yarnwrap.entity;
public class EntityAttachments { public net.minecraft.entity.EntityAttachments wrapperContained; public EntityAttachments(net.minecraft.entity.EntityAttachments wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map points() { return wrapperContained.points; }
// public void points(java.util.Map value) { wrapperContained.points = value; }
public Object builder() { return wrapperContained.builder(); }
public yarnwrap.entity.EntityAttachments scale(float xScale,float yScale,float zScale) { return new yarnwrap.entity.EntityAttachments(wrapperContained.scale(xScale,yScale,zScale)); }
public yarnwrap.util.math.Vec3d getPointNullable(yarnwrap.entity.EntityAttachmentType type,int index,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPointNullable(type.wrapperContained,index,yaw)); }
// public yarnwrap.util.math.Vec3d rotatePoint(yarnwrap.util.math.Vec3d point,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.rotatePoint(point.wrapperContained,yaw)); }
// public java.util.List scalePoints(java.util.List points,float xScale,float yScale,float zScale) { return wrapperContained.scalePoints(points,xScale,yScale,zScale); }
public yarnwrap.util.math.Vec3d getPoint(yarnwrap.entity.EntityAttachmentType type,int index,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPoint(type.wrapperContained,index,yaw)); }
public yarnwrap.util.math.Vec3d getPointOrDefault(yarnwrap.entity.EntityAttachmentType type,int index,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPointOrDefault(type.wrapperContained,index,yaw)); }
public yarnwrap.entity.EntityAttachments of(float width,float height) { return new yarnwrap.entity.EntityAttachments(wrapperContained.of(width,height)); }

}