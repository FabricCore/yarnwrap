package yarnwrap.screen;
public class HorseScreenHandler { public net.minecraft.screen.HorseScreenHandler wrapperContained; public HorseScreenHandler(net.minecraft.screen.HorseScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory horseArmorInventory() { return new yarnwrap.inventory.Inventory(wrapperContained.horseArmorInventory); }
// public void horseArmorInventory(yarnwrap.inventory.Inventory value) { wrapperContained.horseArmorInventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory horseArmorInventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.HorseScreenHandler.horseArmorInventory); }
// public static void horseArmorInventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.HorseScreenHandler.horseArmorInventory = value.wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.HorseScreenHandler.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.HorseScreenHandler.inventory = value.wrapperContained; }

// public yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.passive.AbstractHorseEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(net.minecraft.screen.HorseScreenHandler.entity); }
// public static void entity(yarnwrap.entity.passive.AbstractHorseEntity value, ) { net.minecraft.screen.HorseScreenHandler.entity = value.wrapperContained; }

public HorseScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory,yarnwrap.entity.passive.AbstractHorseEntity entity,int slotColumnCount) { this.wrapperContained = new net.minecraft.screen.HorseScreenHandler(syncId,playerInventory.wrapperContained,inventory.wrapperContained,entity.wrapperContained,slotColumnCount); }

}