package yarnwrap.entity;
public class RideableInventory { public net.minecraft.entity.RideableInventory wrapperContained; public RideableInventory(net.minecraft.entity.RideableInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public void openInventory(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.openInventory(player.wrapperContained); }

}