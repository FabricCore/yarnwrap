package yarnwrap.block.entity;
public class DecoratedPotBlockEntity { public net.minecraft.block.entity.DecoratedPotBlockEntity wrapperContained; public DecoratedPotBlockEntity(net.minecraft.block.entity.DecoratedPotBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String SHERDS_NBT_KEY() { return wrapperContained.SHERDS_NBT_KEY; }
// public void SHERDS_NBT_KEY(java.lang.String value) { wrapperContained.SHERDS_NBT_KEY = value; }
public static java.lang.String SHERDS_NBT_KEY() { return net.minecraft.block.entity.DecoratedPotBlockEntity.SHERDS_NBT_KEY; }
// public static void SHERDS_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.SHERDS_NBT_KEY = value; }

// public yarnwrap.block.entity.Sherds sherds() { return new yarnwrap.block.entity.Sherds(wrapperContained.sherds); }
// public void sherds(yarnwrap.block.entity.Sherds value) { wrapperContained.sherds = value.wrapperContained; }
// public static yarnwrap.block.entity.Sherds sherds() { return new yarnwrap.block.entity.Sherds(net.minecraft.block.entity.DecoratedPotBlockEntity.sherds); }
// public static void sherds(yarnwrap.block.entity.Sherds value, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.sherds = value.wrapperContained; }

// public java.lang.String ITEM_NBT_KEY() { return wrapperContained.ITEM_NBT_KEY; }
// public void ITEM_NBT_KEY(java.lang.String value) { wrapperContained.ITEM_NBT_KEY = value; }
public static java.lang.String ITEM_NBT_KEY() { return net.minecraft.block.entity.DecoratedPotBlockEntity.ITEM_NBT_KEY; }
// public static void ITEM_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.ITEM_NBT_KEY = value; }

public long lastWobbleTime() { return wrapperContained.lastWobbleTime; }
public void lastWobbleTime(long value) { wrapperContained.lastWobbleTime = value; }
// public static long lastWobbleTime() { return net.minecraft.block.entity.DecoratedPotBlockEntity.lastWobbleTime; }
// public static void lastWobbleTime(long value, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.lastWobbleTime = value; }

public Object lastWobbleType() { return wrapperContained.lastWobbleType; }
// public void lastWobbleType(Object value) { wrapperContained.lastWobbleType = value; }
// // public static Object lastWobbleType() { return net.minecraft.block.entity.DecoratedPotBlockEntity.lastWobbleType; }
// // public static void lastWobbleType(Object value, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.lastWobbleType = value; }

// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.DecoratedPotBlockEntity.stack); }
// public static void stack(yarnwrap.item.ItemStack value, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.stack = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey lootTableId() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTableId); }
// public void lootTableId(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTableId = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey lootTableId() { return new yarnwrap.registry.RegistryKey(net.minecraft.block.entity.DecoratedPotBlockEntity.lootTableId); }
// public static void lootTableId(yarnwrap.registry.RegistryKey value, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.lootTableId = value.wrapperContained; }

// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
// public void lootTableSeed(long value) { wrapperContained.lootTableSeed = value; }
// public static long lootTableSeed() { return net.minecraft.block.entity.DecoratedPotBlockEntity.lootTableSeed; }
// public static void lootTableSeed(long value, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.lootTableSeed = value; }

public DecoratedPotBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.DecoratedPotBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void readFrom(yarnwrap.item.ItemStack stack) { wrapperContained.readFrom(stack.wrapperContained); }
// public static void readFrom(yarnwrap.item.ItemStack stack, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.readFrom(stack.wrapperContained); }
public yarnwrap.util.math.Direction getHorizontalFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getHorizontalFacing()); }
// public static yarnwrap.util.math.Direction getHorizontalFacing() { return new yarnwrap.util.math.Direction(net.minecraft.block.entity.DecoratedPotBlockEntity.getHorizontalFacing()); }
public yarnwrap.block.entity.Sherds getSherds() { return new yarnwrap.block.entity.Sherds(wrapperContained.getSherds()); }
// public static yarnwrap.block.entity.Sherds getSherds() { return new yarnwrap.block.entity.Sherds(net.minecraft.block.entity.DecoratedPotBlockEntity.getSherds()); }
// public yarnwrap.item.ItemStack getStackWith(yarnwrap.block.entity.Sherds sherds) { return new yarnwrap.item.ItemStack(wrapperContained.getStackWith(sherds.wrapperContained)); }
// public static yarnwrap.item.ItemStack getStackWith(yarnwrap.block.entity.Sherds sherds, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.DecoratedPotBlockEntity.getStackWith(sherds.wrapperContained)); }
public yarnwrap.item.ItemStack asStack() { return new yarnwrap.item.ItemStack(wrapperContained.asStack()); }
// public static yarnwrap.item.ItemStack asStack() { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.DecoratedPotBlockEntity.asStack()); }
// public void wobble(Object wobbleType) { wrapperContained.wobble(wobbleType); }
// public static void wobble(Object wobbleType, ) { net.minecraft.block.entity.DecoratedPotBlockEntity.wobble(wobbleType); }

}