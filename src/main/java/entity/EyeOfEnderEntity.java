package yarnwrap.entity;
public class EyeOfEnderEntity { public net.minecraft.entity.EyeOfEnderEntity wrapperContained; public EyeOfEnderEntity(net.minecraft.entity.EyeOfEnderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public double targetZ() { return wrapperContained.targetZ; }
// public double targetY() { return wrapperContained.targetY; }
// public double targetX() { return wrapperContained.targetX; }
// public int lifespan() { return wrapperContained.lifespan; }
// public boolean dropsItem() { return wrapperContained.dropsItem; }
// public void setItem() { wrapperContained.setItem(); }
// public yarnwrap.item.ItemStack getItem() { return new yarnwrap.item.ItemStack(wrapperContained.getItem()); }
public void initTargetPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.initTargetPos(pos.wrapperContained); }

}