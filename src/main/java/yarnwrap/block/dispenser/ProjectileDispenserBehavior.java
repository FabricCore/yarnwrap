package yarnwrap.block.dispenser;
public class ProjectileDispenserBehavior { public net.minecraft.block.dispenser.ProjectileDispenserBehavior wrapperContained; public ProjectileDispenserBehavior(net.minecraft.block.dispenser.ProjectileDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ProjectileItem projectile() { return new yarnwrap.item.ProjectileItem(wrapperContained.projectile); }
// public void projectile(yarnwrap.item.ProjectileItem value) { wrapperContained.projectile = value.wrapperContained; }
// public Object projectileSettings() { return wrapperContained.projectileSettings; }
// // public void projectileSettings(Object value) { wrapperContained.projectileSettings = value; }

}