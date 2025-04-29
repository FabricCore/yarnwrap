package yarnwrap.block.dispenser;
public class ProjectileDispenserBehavior { public net.minecraft.block.dispenser.ProjectileDispenserBehavior wrapperContained; public ProjectileDispenserBehavior(net.minecraft.block.dispenser.ProjectileDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ProjectileItem projectile() { return new yarnwrap.item.ProjectileItem(wrapperContained.projectile); }
// public void projectile(yarnwrap.item.ProjectileItem value) { wrapperContained.projectile = value.wrapperContained; }
// public static yarnwrap.item.ProjectileItem projectile() { return new yarnwrap.item.ProjectileItem(net.minecraft.block.dispenser.ProjectileDispenserBehavior.projectile); }
// public static void projectile(yarnwrap.item.ProjectileItem value, ) { net.minecraft.block.dispenser.ProjectileDispenserBehavior.projectile = value.wrapperContained; }

// public Object projectileSettings() { return wrapperContained.projectileSettings; }
// // public void projectileSettings(Object value) { wrapperContained.projectileSettings = value; }
// // public static Object projectileSettings() { return net.minecraft.block.dispenser.ProjectileDispenserBehavior.projectileSettings; }
// // public static void projectileSettings(Object value, ) { net.minecraft.block.dispenser.ProjectileDispenserBehavior.projectileSettings = value; }

public ProjectileDispenserBehavior(yarnwrap.item.Item item) { this.wrapperContained = new net.minecraft.block.dispenser.ProjectileDispenserBehavior(item.wrapperContained); }

}