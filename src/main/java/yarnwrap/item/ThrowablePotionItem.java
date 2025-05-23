package yarnwrap.item;
public class ThrowablePotionItem { public net.minecraft.item.ThrowablePotionItem wrapperContained; public ThrowablePotionItem(net.minecraft.item.ThrowablePotionItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public float POWER() { return wrapperContained.POWER; }
// public void POWER(float value) { wrapperContained.POWER = value; }
public static float POWER() { return net.minecraft.item.ThrowablePotionItem.POWER; }
// public static void POWER(float value, ) { net.minecraft.item.ThrowablePotionItem.POWER = value; }

// public yarnwrap.entity.projectile.thrown.PotionEntity createEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.projectile.thrown.PotionEntity(wrapperContained.createEntity(world.wrapperContained,user.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.entity.projectile.thrown.PotionEntity createEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.entity.projectile.thrown.PotionEntity(net.minecraft.item.ThrowablePotionItem.createEntity(world.wrapperContained,user.wrapperContained,stack.wrapperContained)); }
// public yarnwrap.entity.projectile.thrown.PotionEntity createEntity(yarnwrap.world.World world,yarnwrap.util.math.Position pos,yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.projectile.thrown.PotionEntity(wrapperContained.createEntity(world.wrapperContained,pos.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.entity.projectile.thrown.PotionEntity createEntity(yarnwrap.world.World world,yarnwrap.util.math.Position pos,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.entity.projectile.thrown.PotionEntity(net.minecraft.item.ThrowablePotionItem.createEntity(world.wrapperContained,pos.wrapperContained,stack.wrapperContained)); }

}