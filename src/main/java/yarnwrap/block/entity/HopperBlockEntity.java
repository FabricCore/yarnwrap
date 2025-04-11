package yarnwrap.block.entity;
public class HopperBlockEntity { public net.minecraft.block.entity.HopperBlockEntity wrapperContained; public HopperBlockEntity(net.minecraft.block.entity.HopperBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastTickTime() { return wrapperContained.lastTickTime; }
// public void lastTickTime(long value) { wrapperContained.lastTickTime = value; }
// public int transferCooldown() { return wrapperContained.transferCooldown; }
// public void transferCooldown(int value) { wrapperContained.transferCooldown = value; }
// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
public int TRANSFER_COOLDOWN() { return wrapperContained.TRANSFER_COOLDOWN; }
// public void TRANSFER_COOLDOWN(int value) { wrapperContained.TRANSFER_COOLDOWN = value; }
public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public void INVENTORY_SIZE(int value) { wrapperContained.INVENTORY_SIZE = value; }
// public int[][] AVAILABLE_SLOTS_CACHE() { return wrapperContained.AVAILABLE_SLOTS_CACHE; }
// public void AVAILABLE_SLOTS_CACHE(int[][] value) { wrapperContained.AVAILABLE_SLOTS_CACHE = value; }
// public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
// public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
public HopperBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.HopperBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void onEntityCollided(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.Entity entity,yarnwrap.block.entity.HopperBlockEntity blockEntity) { wrapperContained.onEntityCollided(world.wrapperContained,pos.wrapperContained,state.wrapperContained,entity.wrapperContained,blockEntity.wrapperContained); }
public java.util.List getInputItemEntities(yarnwrap.world.World world,yarnwrap.block.entity.Hopper hopper) { return wrapperContained.getInputItemEntities(world.wrapperContained,hopper.wrapperContained); }
// public void setTransferCooldown(int transferCooldown) { wrapperContained.setTransferCooldown(transferCooldown); }
// public boolean needsCooldown() { return wrapperContained.needsCooldown(); }
public boolean extract(yarnwrap.world.World world,yarnwrap.block.entity.Hopper hopper) { return wrapperContained.extract(world.wrapperContained,hopper.wrapperContained); }
// public boolean isDisabled() { return wrapperContained.isDisabled(); }
// public boolean insertAndExtract(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.HopperBlockEntity blockEntity) { return wrapperContained.insertAndExtract(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public boolean canInsert(yarnwrap.inventory.Inventory inventory,yarnwrap.item.ItemStack stack,int slot,yarnwrap.util.math.Direction side) { return wrapperContained.canInsert(inventory.wrapperContained,stack.wrapperContained,slot,side.wrapperContained); }
// public boolean insert(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.HopperBlockEntity blockEntity) { return wrapperContained.insert(world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained); }
public boolean extract(yarnwrap.inventory.Inventory inventory,yarnwrap.entity.ItemEntity itemEntity) { return wrapperContained.extract(inventory.wrapperContained,itemEntity.wrapperContained); }
// public yarnwrap.inventory.Inventory getInputInventory(yarnwrap.world.World world,yarnwrap.block.entity.Hopper hopper,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.inventory.Inventory(wrapperContained.getInputInventory(world.wrapperContained,hopper.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
public yarnwrap.inventory.Inventory getInventoryAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.inventory.Inventory(wrapperContained.getInventoryAt(world.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.inventory.Inventory getInventoryAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,double x,double y,double z) { return new yarnwrap.inventory.Inventory(wrapperContained.getInventoryAt(world.wrapperContained,pos.wrapperContained,state.wrapperContained,x,y,z)); }
// public boolean canExtract(yarnwrap.inventory.Inventory hopperInventory,yarnwrap.inventory.Inventory fromInventory,yarnwrap.item.ItemStack stack,int slot,yarnwrap.util.math.Direction facing) { return wrapperContained.canExtract(hopperInventory.wrapperContained,fromInventory.wrapperContained,stack.wrapperContained,slot,facing.wrapperContained); }
// public yarnwrap.item.ItemStack transfer(yarnwrap.inventory.Inventory from,yarnwrap.inventory.Inventory to,yarnwrap.item.ItemStack stack,int slot,yarnwrap.util.math.Direction side) { return new yarnwrap.item.ItemStack(wrapperContained.transfer(from.wrapperContained,to.wrapperContained,stack.wrapperContained,slot,side.wrapperContained)); }
// public boolean canMergeItems(yarnwrap.item.ItemStack first,yarnwrap.item.ItemStack second) { return wrapperContained.canMergeItems(first.wrapperContained,second.wrapperContained); }
// public yarnwrap.inventory.Inventory getOutputInventory(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.HopperBlockEntity blockEntity) { return new yarnwrap.inventory.Inventory(wrapperContained.getOutputInventory(world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained)); }
// public boolean isFull() { return wrapperContained.isFull(); }
// public boolean isInventoryFull(yarnwrap.inventory.Inventory inventory,yarnwrap.util.math.Direction direction) { return wrapperContained.isInventoryFull(inventory.wrapperContained,direction.wrapperContained); }
public yarnwrap.item.ItemStack transfer(yarnwrap.inventory.Inventory from,yarnwrap.inventory.Inventory to,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Direction side) { return new yarnwrap.item.ItemStack(wrapperContained.transfer(from.wrapperContained,to.wrapperContained,stack.wrapperContained,side.wrapperContained)); }
// public boolean extract(yarnwrap.block.entity.Hopper hopper,yarnwrap.inventory.Inventory inventory,int slot,yarnwrap.util.math.Direction side) { return wrapperContained.extract(hopper.wrapperContained,inventory.wrapperContained,slot,side.wrapperContained); }
// public int[] getAvailableSlots(yarnwrap.inventory.Inventory inventory,yarnwrap.util.math.Direction side) { return wrapperContained.getAvailableSlots(inventory.wrapperContained,side.wrapperContained); }
public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.HopperBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public yarnwrap.inventory.Inventory getEntityInventoryAt(yarnwrap.world.World world,double x,double y,double z) { return new yarnwrap.inventory.Inventory(wrapperContained.getEntityInventoryAt(world.wrapperContained,x,y,z)); }
// public yarnwrap.inventory.Inventory getBlockInventoryAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.inventory.Inventory(wrapperContained.getBlockInventoryAt(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public int[] indexArray(int size) { return wrapperContained.indexArray(size); }

}