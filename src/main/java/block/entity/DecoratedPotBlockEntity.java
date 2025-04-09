package yarnwrap.block.entity;
public class DecoratedPotBlockEntity { public net.minecraft.block.entity.DecoratedPotBlockEntity wrapperContained; public DecoratedPotBlockEntity(net.minecraft.block.entity.DecoratedPotBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String SHERDS_NBT_KEY() { return wrapperContained.SHERDS_NBT_KEY; }
// public yarnwrap.block.entity.Sherds sherds() { return new yarnwrap.block.entity.Sherds(wrapperContained.sherds); }
public java.lang.String ITEM_NBT_KEY() { return wrapperContained.ITEM_NBT_KEY; }
public long lastWobbleTime() { return wrapperContained.lastWobbleTime; }
public Object lastWobbleType() { return wrapperContained.lastWobbleType; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public yarnwrap.registry.RegistryKey lootTableId() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTableId); }
// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
public void readFrom(yarnwrap.item.ItemStack stack) { wrapperContained.readFrom(stack.wrapperContained); }
public yarnwrap.util.math.Direction getHorizontalFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getHorizontalFacing()); }
public yarnwrap.block.entity.Sherds getSherds() { return new yarnwrap.block.entity.Sherds(wrapperContained.getSherds()); }
public yarnwrap.item.ItemStack getStackWith(yarnwrap.block.entity.Sherds sherds) { return new yarnwrap.item.ItemStack(wrapperContained.getStackWith(sherds.wrapperContained)); }
public yarnwrap.item.ItemStack asStack() { return new yarnwrap.item.ItemStack(wrapperContained.asStack()); }
// public void wobble(Object wobbleType) { wrapperContained.wobble(wobbleType); }

}