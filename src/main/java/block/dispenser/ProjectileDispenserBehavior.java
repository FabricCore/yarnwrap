package yarnwrap.block.dispenser;
public class ProjectileDispenserBehavior { public net.minecraft.block.dispenser.ProjectileDispenserBehavior wrapperContained; public ProjectileDispenserBehavior(net.minecraft.block.dispenser.ProjectileDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ProjectileItem projectile() { return new yarnwrap.item.ProjectileItem(wrapperContained.projectile); }
// public Object projectileSettings() { return wrapperContained.projectileSettings; }

}