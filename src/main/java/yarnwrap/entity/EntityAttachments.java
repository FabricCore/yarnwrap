package yarnwrap.entity;
public class EntityAttachments { public net.minecraft.entity.EntityAttachments wrapperContained; public EntityAttachments(net.minecraft.entity.EntityAttachments wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map points() { return wrapperContained.points; }
// public void points(java.util.Map value) { wrapperContained.points = value; }
// public static java.util.Map points() { return net.minecraft.entity.EntityAttachments.points; }
// public static void points(java.util.Map value, ) { net.minecraft.entity.EntityAttachments.points = value; }

// public EntityAttachments(java.util.Map points) { this.wrapperContained = new net.minecraft.entity.EntityAttachments(points); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.entity.EntityAttachments.builder(); }
public yarnwrap.entity.EntityAttachments scale(float xScale,float yScale,float zScale) { return new yarnwrap.entity.EntityAttachments(wrapperContained.scale(xScale,yScale,zScale)); }
// public static yarnwrap.entity.EntityAttachments scale(float xScale,float yScale,float zScale, ) { return new yarnwrap.entity.EntityAttachments(net.minecraft.entity.EntityAttachments.scale(xScale,yScale,zScale)); }
public yarnwrap.util.math.Vec3d getPointNullable(yarnwrap.entity.EntityAttachmentType type,int index,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPointNullable(type.wrapperContained,index,yaw)); }
// public static yarnwrap.util.math.Vec3d getPointNullable(yarnwrap.entity.EntityAttachmentType type,int index,float yaw, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.EntityAttachments.getPointNullable(type.wrapperContained,index,yaw)); }
// public yarnwrap.util.math.Vec3d rotatePoint(yarnwrap.util.math.Vec3d point,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.rotatePoint(point.wrapperContained,yaw)); }
// public static yarnwrap.util.math.Vec3d rotatePoint(yarnwrap.util.math.Vec3d point,float yaw, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.EntityAttachments.rotatePoint(point.wrapperContained,yaw)); }
// public java.util.List scalePoints(java.util.List points,float xScale,float yScale,float zScale) { return wrapperContained.scalePoints(points,xScale,yScale,zScale); }
// public static java.util.List scalePoints(java.util.List points,float xScale,float yScale,float zScale, ) { return net.minecraft.entity.EntityAttachments.scalePoints(points,xScale,yScale,zScale); }
public yarnwrap.util.math.Vec3d getPoint(yarnwrap.entity.EntityAttachmentType type,int index,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPoint(type.wrapperContained,index,yaw)); }
// public static yarnwrap.util.math.Vec3d getPoint(yarnwrap.entity.EntityAttachmentType type,int index,float yaw, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.EntityAttachments.getPoint(type.wrapperContained,index,yaw)); }
public yarnwrap.util.math.Vec3d getPointOrDefault(yarnwrap.entity.EntityAttachmentType type,int index,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPointOrDefault(type.wrapperContained,index,yaw)); }
// public static yarnwrap.util.math.Vec3d getPointOrDefault(yarnwrap.entity.EntityAttachmentType type,int index,float yaw, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.EntityAttachments.getPointOrDefault(type.wrapperContained,index,yaw)); }
// public yarnwrap.entity.EntityAttachments of(float width,float height) { return new yarnwrap.entity.EntityAttachments(wrapperContained.of(width,height)); }
// public static yarnwrap.entity.EntityAttachments of(float width,float height, ) { return new yarnwrap.entity.EntityAttachments(net.minecraft.entity.EntityAttachments.of(width,height)); }

}