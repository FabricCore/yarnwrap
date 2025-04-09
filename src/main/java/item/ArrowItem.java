package yarnwrap.item;
public class ArrowItem { public net.minecraft.item.ArrowItem wrapperContained; public ArrowItem(net.minecraft.item.ArrowItem wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.projectile.PersistentProjectileEntity createArrow(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity shooter,yarnwrap.item.ItemStack shotFrom) { return new yarnwrap.entity.projectile.PersistentProjectileEntity(wrapperContained.createArrow(world.wrapperContained,stack.wrapperContained,shooter.wrapperContained,shotFrom.wrapperContained)); }

}