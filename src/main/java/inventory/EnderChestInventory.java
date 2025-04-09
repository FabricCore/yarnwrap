package yarnwrap.inventory;
public class EnderChestInventory { public net.minecraft.inventory.EnderChestInventory wrapperContained; public EnderChestInventory(net.minecraft.inventory.EnderChestInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.EnderChestBlockEntity activeBlockEntity() { return new yarnwrap.block.entity.EnderChestBlockEntity(wrapperContained.activeBlockEntity); }
public boolean isActiveBlockEntity(yarnwrap.block.entity.EnderChestBlockEntity blockEntity) { return wrapperContained.isActiveBlockEntity(blockEntity.wrapperContained); }
public void setActiveBlockEntity(yarnwrap.block.entity.EnderChestBlockEntity blockEntity) { wrapperContained.setActiveBlockEntity(blockEntity.wrapperContained); }

}