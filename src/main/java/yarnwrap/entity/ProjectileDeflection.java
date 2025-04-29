package yarnwrap.entity;
public class ProjectileDeflection { public net.minecraft.entity.ProjectileDeflection wrapperContained; public ProjectileDeflection(net.minecraft.entity.ProjectileDeflection wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ProjectileDeflection NONE() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.NONE); }
// public void NONE(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.entity.ProjectileDeflection NONE() { return new yarnwrap.entity.ProjectileDeflection(net.minecraft.entity.ProjectileDeflection.NONE); }
// public static void NONE(yarnwrap.entity.ProjectileDeflection value, ) { net.minecraft.entity.ProjectileDeflection.NONE = value.wrapperContained; }

// public yarnwrap.entity.ProjectileDeflection SIMPLE() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.SIMPLE); }
// public void SIMPLE(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.SIMPLE = value.wrapperContained; }
public static yarnwrap.entity.ProjectileDeflection SIMPLE() { return new yarnwrap.entity.ProjectileDeflection(net.minecraft.entity.ProjectileDeflection.SIMPLE); }
// public static void SIMPLE(yarnwrap.entity.ProjectileDeflection value, ) { net.minecraft.entity.ProjectileDeflection.SIMPLE = value.wrapperContained; }

// public yarnwrap.entity.ProjectileDeflection REDIRECTED() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.REDIRECTED); }
// public void REDIRECTED(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.REDIRECTED = value.wrapperContained; }
public static yarnwrap.entity.ProjectileDeflection REDIRECTED() { return new yarnwrap.entity.ProjectileDeflection(net.minecraft.entity.ProjectileDeflection.REDIRECTED); }
// public static void REDIRECTED(yarnwrap.entity.ProjectileDeflection value, ) { net.minecraft.entity.ProjectileDeflection.REDIRECTED = value.wrapperContained; }

// public yarnwrap.entity.ProjectileDeflection TRANSFER_VELOCITY_DIRECTION() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.TRANSFER_VELOCITY_DIRECTION); }
// public void TRANSFER_VELOCITY_DIRECTION(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.TRANSFER_VELOCITY_DIRECTION = value.wrapperContained; }
public static yarnwrap.entity.ProjectileDeflection TRANSFER_VELOCITY_DIRECTION() { return new yarnwrap.entity.ProjectileDeflection(net.minecraft.entity.ProjectileDeflection.TRANSFER_VELOCITY_DIRECTION); }
// public static void TRANSFER_VELOCITY_DIRECTION(yarnwrap.entity.ProjectileDeflection value, ) { net.minecraft.entity.ProjectileDeflection.TRANSFER_VELOCITY_DIRECTION = value.wrapperContained; }

public void deflect(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random) { wrapperContained.deflect(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public static void deflect(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random, ) { net.minecraft.entity.ProjectileDeflection.deflect(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public void method_56095(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random) { wrapperContained.method_56095(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public static void method_56095(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random, ) { net.minecraft.entity.ProjectileDeflection.method_56095(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public void method_56096(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random) { wrapperContained.method_56096(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public static void method_56096(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random, ) { net.minecraft.entity.ProjectileDeflection.method_56096(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public void method_59861(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random) { wrapperContained.method_59861(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public static void method_59861(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random, ) { net.minecraft.entity.ProjectileDeflection.method_59861(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public void method_59862(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random) { wrapperContained.method_59862(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public static void method_59862(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random, ) { net.minecraft.entity.ProjectileDeflection.method_59862(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }

}