package yarnwrap.inventory;
public class EnderChestInventory { public net.minecraft.inventory.EnderChestInventory wrapperContained; public EnderChestInventory(net.minecraft.inventory.EnderChestInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.EnderChestBlockEntity activeBlockEntity() { return new yarnwrap.block.entity.EnderChestBlockEntity(wrapperContained.activeBlockEntity); }
// public void activeBlockEntity(yarnwrap.block.entity.EnderChestBlockEntity value) { wrapperContained.activeBlockEntity = value.wrapperContained; }
// public static yarnwrap.block.entity.EnderChestBlockEntity activeBlockEntity() { return new yarnwrap.block.entity.EnderChestBlockEntity(net.minecraft.inventory.EnderChestInventory.activeBlockEntity); }
// public static void activeBlockEntity(yarnwrap.block.entity.EnderChestBlockEntity value, ) { net.minecraft.inventory.EnderChestInventory.activeBlockEntity = value.wrapperContained; }

public boolean isActiveBlockEntity(yarnwrap.block.entity.EnderChestBlockEntity blockEntity) { return wrapperContained.isActiveBlockEntity(blockEntity.wrapperContained); }
// public static boolean isActiveBlockEntity(yarnwrap.block.entity.EnderChestBlockEntity blockEntity, ) { return net.minecraft.inventory.EnderChestInventory.isActiveBlockEntity(blockEntity.wrapperContained); }
public void setActiveBlockEntity(yarnwrap.block.entity.EnderChestBlockEntity blockEntity) { wrapperContained.setActiveBlockEntity(blockEntity.wrapperContained); }
// public static void setActiveBlockEntity(yarnwrap.block.entity.EnderChestBlockEntity blockEntity, ) { net.minecraft.inventory.EnderChestInventory.setActiveBlockEntity(blockEntity.wrapperContained); }

}