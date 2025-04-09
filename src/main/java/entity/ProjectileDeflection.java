package yarnwrap.entity;
public class ProjectileDeflection { public net.minecraft.entity.ProjectileDeflection wrapperContained; public ProjectileDeflection(net.minecraft.entity.ProjectileDeflection wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ProjectileDeflection NONE() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.NONE); }
public yarnwrap.entity.ProjectileDeflection SIMPLE() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.SIMPLE); }
public yarnwrap.entity.ProjectileDeflection REDIRECTED() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.REDIRECTED); }
public yarnwrap.entity.ProjectileDeflection TRANSFER_VELOCITY_DIRECTION() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.TRANSFER_VELOCITY_DIRECTION); }

}