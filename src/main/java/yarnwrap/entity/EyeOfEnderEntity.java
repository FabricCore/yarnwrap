package yarnwrap.entity;
public class EyeOfEnderEntity { public net.minecraft.entity.EyeOfEnderEntity wrapperContained; public EyeOfEnderEntity(net.minecraft.entity.EyeOfEnderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.EyeOfEnderEntity.ITEM); }
// public static void ITEM(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.EyeOfEnderEntity.ITEM = value.wrapperContained; }

// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public static double targetZ() { return net.minecraft.entity.EyeOfEnderEntity.targetZ; }
// public static void targetZ(double value, ) { net.minecraft.entity.EyeOfEnderEntity.targetZ = value; }

// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public static double targetY() { return net.minecraft.entity.EyeOfEnderEntity.targetY; }
// public static void targetY(double value, ) { net.minecraft.entity.EyeOfEnderEntity.targetY = value; }

// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public static double targetX() { return net.minecraft.entity.EyeOfEnderEntity.targetX; }
// public static void targetX(double value, ) { net.minecraft.entity.EyeOfEnderEntity.targetX = value; }

// public int lifespan() { return wrapperContained.lifespan; }
// public void lifespan(int value) { wrapperContained.lifespan = value; }
// public static int lifespan() { return net.minecraft.entity.EyeOfEnderEntity.lifespan; }
// public static void lifespan(int value, ) { net.minecraft.entity.EyeOfEnderEntity.lifespan = value; }

// public boolean dropsItem() { return wrapperContained.dropsItem; }
// public void dropsItem(boolean value) { wrapperContained.dropsItem = value; }
// public static boolean dropsItem() { return net.minecraft.entity.EyeOfEnderEntity.dropsItem; }
// public static void dropsItem(boolean value, ) { net.minecraft.entity.EyeOfEnderEntity.dropsItem = value; }

public EyeOfEnderEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.EyeOfEnderEntity(world.wrapperContained,x,y,z); }
// public void setItem() { wrapperContained.setItem(); }
// public static void setItem() { net.minecraft.entity.EyeOfEnderEntity.setItem(); }
// public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }
// public static yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(net.minecraft.entity.EyeOfEnderEntity.getItem()); }
public void initTargetPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.initTargetPos(pos.wrapperContained); }
// public static void initTargetPos(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.EyeOfEnderEntity.initTargetPos(pos.wrapperContained); }

}