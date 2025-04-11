package yarnwrap.entity;
public class EyeOfEnderEntity { public net.minecraft.entity.EyeOfEnderEntity wrapperContained; public EyeOfEnderEntity(net.minecraft.entity.EyeOfEnderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM = value.wrapperContained; }
// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public int lifespan() { return wrapperContained.lifespan; }
// public void lifespan(int value) { wrapperContained.lifespan = value; }
// public boolean dropsItem() { return wrapperContained.dropsItem; }
// public void dropsItem(boolean value) { wrapperContained.dropsItem = value; }
public EyeOfEnderEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.EyeOfEnderEntity(world.wrapperContained,x,y,z); }
// public void setItem() { wrapperContained.setItem(); }
// public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }
public void initTargetPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.initTargetPos(pos.wrapperContained); }

}