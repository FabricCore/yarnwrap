package yarnwrap.entity.projectile;
public class TridentEntity { public net.minecraft.entity.projectile.TridentEntity wrapperContained; public TridentEntity(net.minecraft.entity.projectile.TridentEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData LOYALTY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LOYALTY); }
// public void LOYALTY(yarnwrap.entity.data.TrackedData value) { wrapperContained.LOYALTY = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData LOYALTY() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.TridentEntity.LOYALTY); }
// public static void LOYALTY(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.TridentEntity.LOYALTY = value.wrapperContained; }

// public boolean dealtDamage() { return wrapperContained.dealtDamage; }
// public void dealtDamage(boolean value) { wrapperContained.dealtDamage = value; }
// public static boolean dealtDamage() { return net.minecraft.entity.projectile.TridentEntity.dealtDamage; }
// public static void dealtDamage(boolean value, ) { net.minecraft.entity.projectile.TridentEntity.dealtDamage = value; }

public int returnTimer() { return wrapperContained.returnTimer; }
public void returnTimer(int value) { wrapperContained.returnTimer = value; }
// public static int returnTimer() { return net.minecraft.entity.projectile.TridentEntity.returnTimer; }
// public static void returnTimer(int value, ) { net.minecraft.entity.projectile.TridentEntity.returnTimer = value; }

// public yarnwrap.entity.data.TrackedData ENCHANTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ENCHANTED); }
// public void ENCHANTED(yarnwrap.entity.data.TrackedData value) { wrapperContained.ENCHANTED = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ENCHANTED() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.TridentEntity.ENCHANTED); }
// public static void ENCHANTED(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.TridentEntity.ENCHANTED = value.wrapperContained; }

// public float DRAG_IN_WATER() { return wrapperContained.DRAG_IN_WATER; }
// public void DRAG_IN_WATER(float value) { wrapperContained.DRAG_IN_WATER = value; }
// public static float DRAG_IN_WATER() { return net.minecraft.entity.projectile.TridentEntity.DRAG_IN_WATER; }
// public static void DRAG_IN_WATER(float value, ) { net.minecraft.entity.projectile.TridentEntity.DRAG_IN_WATER = value; }

// public boolean DEFAULT_DEALT_DAMAGE() { return wrapperContained.DEFAULT_DEALT_DAMAGE; }
// public void DEFAULT_DEALT_DAMAGE(boolean value) { wrapperContained.DEFAULT_DEALT_DAMAGE = value; }
// public static boolean DEFAULT_DEALT_DAMAGE() { return net.minecraft.entity.projectile.TridentEntity.DEFAULT_DEALT_DAMAGE; }
// public static void DEFAULT_DEALT_DAMAGE(boolean value, ) { net.minecraft.entity.projectile.TridentEntity.DEFAULT_DEALT_DAMAGE = value; }

public TridentEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.TridentEntity(world.wrapperContained,x,y,z,stack.wrapperContained); }
public TridentEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.TridentEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained); }
// public boolean isOwnerAlive() { return wrapperContained.isOwnerAlive(); }
// public static boolean isOwnerAlive() { return net.minecraft.entity.projectile.TridentEntity.isOwnerAlive(); }
public boolean isEnchanted() { return wrapperContained.isEnchanted(); }
// public static boolean isEnchanted() { return net.minecraft.entity.projectile.TridentEntity.isEnchanted(); }
// public byte getLoyalty(yarnwrap.item.ItemStack stack) { return wrapperContained.getLoyalty(stack.wrapperContained); }
// public static byte getLoyalty(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.projectile.TridentEntity.getLoyalty(stack.wrapperContained); }
// public void method_63013(yarnwrap.server.world.ServerWorld item) { wrapperContained.method_63013(item.wrapperContained); }
// public static void method_63013(yarnwrap.server.world.ServerWorld item, ) { net.minecraft.entity.projectile.TridentEntity.method_63013(item.wrapperContained); }

}