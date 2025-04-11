package yarnwrap.block.entity;
public class DecoratedPotBlockEntity { public net.minecraft.block.entity.DecoratedPotBlockEntity wrapperContained; public DecoratedPotBlockEntity(net.minecraft.block.entity.DecoratedPotBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String SHERDS_NBT_KEY() { return wrapperContained.SHERDS_NBT_KEY; }
// public void SHERDS_NBT_KEY(java.lang.String value) { wrapperContained.SHERDS_NBT_KEY = value; }
// public yarnwrap.block.entity.Sherds sherds() { return new yarnwrap.block.entity.Sherds(wrapperContained.sherds); }
// public void sherds(yarnwrap.block.entity.Sherds value) { wrapperContained.sherds = value.wrapperContained; }
public java.lang.String ITEM_NBT_KEY() { return wrapperContained.ITEM_NBT_KEY; }
// public void ITEM_NBT_KEY(java.lang.String value) { wrapperContained.ITEM_NBT_KEY = value; }
public long lastWobbleTime() { return wrapperContained.lastWobbleTime; }
public void lastWobbleTime(long value) { wrapperContained.lastWobbleTime = value; }
public Object lastWobbleType() { return wrapperContained.lastWobbleType; }
// public void lastWobbleType(Object value) { wrapperContained.lastWobbleType = value; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey lootTableId() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTableId); }
// public void lootTableId(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTableId = value.wrapperContained; }
// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
// public void lootTableSeed(long value) { wrapperContained.lootTableSeed = value; }
public void readFrom(yarnwrap.item.ItemStack stack) { wrapperContained.readFrom(stack.wrapperContained); }
public yarnwrap.util.math.Direction getHorizontalFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getHorizontalFacing()); }
public yarnwrap.block.entity.Sherds getSherds() { return new yarnwrap.block.entity.Sherds(wrapperContained.getSherds()); }
public yarnwrap.item.ItemStack getStackWith(yarnwrap.block.entity.Sherds sherds) { return new yarnwrap.item.ItemStack(wrapperContained.getStackWith(sherds.wrapperContained)); }
public yarnwrap.item.ItemStack asStack() { return new yarnwrap.item.ItemStack(wrapperContained.asStack()); }
// public void wobble(Object wobbleType) { wrapperContained.wobble(wobbleType); }

}