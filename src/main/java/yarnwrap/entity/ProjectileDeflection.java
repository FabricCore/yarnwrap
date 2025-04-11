package yarnwrap.entity;
public class ProjectileDeflection { public net.minecraft.entity.ProjectileDeflection wrapperContained; public ProjectileDeflection(net.minecraft.entity.ProjectileDeflection wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ProjectileDeflection NONE() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.NONE); }
// public void NONE(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.NONE = value.wrapperContained; }
public yarnwrap.entity.ProjectileDeflection SIMPLE() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.SIMPLE); }
// public void SIMPLE(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.SIMPLE = value.wrapperContained; }
public yarnwrap.entity.ProjectileDeflection REDIRECTED() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.REDIRECTED); }
// public void REDIRECTED(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.REDIRECTED = value.wrapperContained; }
public yarnwrap.entity.ProjectileDeflection TRANSFER_VELOCITY_DIRECTION() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.TRANSFER_VELOCITY_DIRECTION); }
// public void TRANSFER_VELOCITY_DIRECTION(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.TRANSFER_VELOCITY_DIRECTION = value.wrapperContained; }

}