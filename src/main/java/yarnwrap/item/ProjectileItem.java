package yarnwrap.item;
public class ProjectileItem { public net.minecraft.item.ProjectileItem wrapperContained; public ProjectileItem(net.minecraft.item.ProjectileItem wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.projectile.ProjectileEntity createEntity(yarnwrap.world.World world,yarnwrap.util.math.Position pos,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Direction direction) { return new yarnwrap.entity.projectile.ProjectileEntity(wrapperContained.createEntity(world.wrapperContained,pos.wrapperContained,stack.wrapperContained,direction.wrapperContained)); }
// public static yarnwrap.entity.projectile.ProjectileEntity createEntity(yarnwrap.world.World world,yarnwrap.util.math.Position pos,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Direction direction, ) { return new yarnwrap.entity.projectile.ProjectileEntity(net.minecraft.item.ProjectileItem.createEntity(world.wrapperContained,pos.wrapperContained,stack.wrapperContained,direction.wrapperContained)); }
public Object getProjectileSettings() { return wrapperContained.getProjectileSettings(); }
// public static Object getProjectileSettings() { return net.minecraft.item.ProjectileItem.getProjectileSettings(); }
public void initializeProjectile(yarnwrap.entity.projectile.ProjectileEntity entity,double x,double y,double z,float power,float uncertainty) { wrapperContained.initializeProjectile(entity.wrapperContained,x,y,z,power,uncertainty); }
// public static void initializeProjectile(yarnwrap.entity.projectile.ProjectileEntity entity,double x,double y,double z,float power,float uncertainty, ) { net.minecraft.item.ProjectileItem.initializeProjectile(entity.wrapperContained,x,y,z,power,uncertainty); }

}