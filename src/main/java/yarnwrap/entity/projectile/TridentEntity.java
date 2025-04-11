package yarnwrap.entity.projectile;
public class TridentEntity { public net.minecraft.entity.projectile.TridentEntity wrapperContained; public TridentEntity(net.minecraft.entity.projectile.TridentEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ENCHANTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ENCHANTED); }
// public void ENCHANTED(yarnwrap.entity.data.TrackedData value) { wrapperContained.ENCHANTED = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData LOYALTY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LOYALTY); }
// public void LOYALTY(yarnwrap.entity.data.TrackedData value) { wrapperContained.LOYALTY = value.wrapperContained; }
// public boolean dealtDamage() { return wrapperContained.dealtDamage; }
// public void dealtDamage(boolean value) { wrapperContained.dealtDamage = value; }
public int returnTimer() { return wrapperContained.returnTimer; }
public void returnTimer(int value) { wrapperContained.returnTimer = value; }
public TridentEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.TridentEntity(world.wrapperContained,x,y,z,stack.wrapperContained); }
public TridentEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.TridentEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained); }
public boolean isEnchanted() { return wrapperContained.isEnchanted(); }
// public byte getLoyalty(yarnwrap.item.ItemStack stack) { return wrapperContained.getLoyalty(stack.wrapperContained); }
// public void method_60616(yarnwrap.item.Item item) { wrapperContained.method_60616(item.wrapperContained); }
// public boolean isOwnerAlive() { return wrapperContained.isOwnerAlive(); }

}