package yarnwrap.entity;
public class EntityDimensions { public net.minecraft.entity.EntityDimensions wrapperContained; public EntityDimensions(net.minecraft.entity.EntityDimensions wrapperContained) { this.wrapperContained = wrapperContained; }

// public EntityDimensions(float width,float height,boolean fixed) { this.wrapperContained = new net.minecraft.entity.EntityDimensions(width,height,fixed); }
public yarnwrap.entity.EntityDimensions scaled(float ratio) { return new yarnwrap.entity.EntityDimensions(wrapperContained.scaled(ratio)); }
public yarnwrap.entity.EntityDimensions changing(float width,float height) { return new yarnwrap.entity.EntityDimensions(wrapperContained.changing(width,height)); }
public yarnwrap.entity.EntityDimensions fixed(float width,float height) { return new yarnwrap.entity.EntityDimensions(wrapperContained.fixed(width,height)); }
public yarnwrap.entity.EntityDimensions scaled(float widthRatio,float heightRatio) { return new yarnwrap.entity.EntityDimensions(wrapperContained.scaled(widthRatio,heightRatio)); }
public yarnwrap.util.math.Box getBoxAt(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.getBoxAt(x,y,z)); }
public yarnwrap.util.math.Box getBoxAt(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Box(wrapperContained.getBoxAt(pos.wrapperContained)); }
// public yarnwrap.entity.EntityDimensions withAttachments(Object attachments) { return new yarnwrap.entity.EntityDimensions(wrapperContained.withAttachments(attachments)); }
public yarnwrap.entity.EntityDimensions withEyeHeight(float eyeHeight) { return new yarnwrap.entity.EntityDimensions(wrapperContained.withEyeHeight(eyeHeight)); }
// public float getDefaultEyeHeight(float height) { return wrapperContained.getDefaultEyeHeight(height); }

}