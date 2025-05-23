package yarnwrap.entity;
public class EyeOfEnderEntity { public net.minecraft.entity.EyeOfEnderEntity wrapperContained; public EyeOfEnderEntity(net.minecraft.entity.EyeOfEnderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lifespan() { return wrapperContained.lifespan; }
// public void lifespan(int value) { wrapperContained.lifespan = value; }
// public static int lifespan() { return net.minecraft.entity.EyeOfEnderEntity.lifespan; }
// public static void lifespan(int value, ) { net.minecraft.entity.EyeOfEnderEntity.lifespan = value; }

// public boolean dropsItem() { return wrapperContained.dropsItem; }
// public void dropsItem(boolean value) { wrapperContained.dropsItem = value; }
// public static boolean dropsItem() { return net.minecraft.entity.EyeOfEnderEntity.dropsItem; }
// public static void dropsItem(boolean value, ) { net.minecraft.entity.EyeOfEnderEntity.dropsItem = value; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.EyeOfEnderEntity.ITEM); }
// public static void ITEM(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.EyeOfEnderEntity.ITEM = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d targetPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.targetPos); }
// public void targetPos(yarnwrap.util.math.Vec3d value) { wrapperContained.targetPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d targetPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.EyeOfEnderEntity.targetPos); }
// public static void targetPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.EyeOfEnderEntity.targetPos = value.wrapperContained; }

public EyeOfEnderEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.EyeOfEnderEntity(world.wrapperContained,x,y,z); }
// public void initTargetPos(yarnwrap.util.math.Vec3d pos) { wrapperContained.initTargetPos(pos.wrapperContained); }
// public static void initTargetPos(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.EyeOfEnderEntity.initTargetPos(pos.wrapperContained); }
public void setItem(yarnwrap.item.ItemStack stack) { wrapperContained.setItem(stack.wrapperContained); }
// public static void setItem(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.EyeOfEnderEntity.setItem(stack.wrapperContained); }
// public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }
// public static yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(net.minecraft.entity.EyeOfEnderEntity.getItem()); }
// public yarnwrap.util.math.Vec3d updateVelocity(yarnwrap.util.math.Vec3d velocity,yarnwrap.util.math.Vec3d currentPos,yarnwrap.util.math.Vec3d targetPos) { return new yarnwrap.util.math.Vec3d(wrapperContained.updateVelocity(velocity.wrapperContained,currentPos.wrapperContained,targetPos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d updateVelocity(yarnwrap.util.math.Vec3d velocity,yarnwrap.util.math.Vec3d currentPos,yarnwrap.util.math.Vec3d targetPos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.EyeOfEnderEntity.updateVelocity(velocity.wrapperContained,currentPos.wrapperContained,targetPos.wrapperContained)); }
// public void addParticles(yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d velocity) { wrapperContained.addParticles(pos.wrapperContained,velocity.wrapperContained); }
// public static void addParticles(yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d velocity, ) { net.minecraft.entity.EyeOfEnderEntity.addParticles(pos.wrapperContained,velocity.wrapperContained); }

}