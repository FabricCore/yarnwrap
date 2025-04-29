package yarnwrap.screen.slot;
public class FurnaceOutputSlot { public net.minecraft.screen.slot.FurnaceOutputSlot wrapperContained; public FurnaceOutputSlot(net.minecraft.screen.slot.FurnaceOutputSlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.screen.slot.FurnaceOutputSlot.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.screen.slot.FurnaceOutputSlot.player = value.wrapperContained; }

// public int amount() { return wrapperContained.amount; }
// public void amount(int value) { wrapperContained.amount = value; }
// public static int amount() { return net.minecraft.screen.slot.FurnaceOutputSlot.amount; }
// public static void amount(int value, ) { net.minecraft.screen.slot.FurnaceOutputSlot.amount = value; }

public FurnaceOutputSlot(yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.Inventory inventory,int index,int x,int y) { this.wrapperContained = new net.minecraft.screen.slot.FurnaceOutputSlot(player.wrapperContained,inventory.wrapperContained,index,x,y); }

}