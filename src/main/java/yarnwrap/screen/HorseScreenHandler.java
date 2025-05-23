package yarnwrap.screen;
public class HorseScreenHandler { public net.minecraft.screen.HorseScreenHandler wrapperContained; public HorseScreenHandler(net.minecraft.screen.HorseScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.HorseScreenHandler.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.HorseScreenHandler.inventory = value.wrapperContained; }

// public yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.passive.AbstractHorseEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(net.minecraft.screen.HorseScreenHandler.entity); }
// public static void entity(yarnwrap.entity.passive.AbstractHorseEntity value, ) { net.minecraft.screen.HorseScreenHandler.entity = value.wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_SADDLE_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_SADDLE_SLOT_TEXTURE); }
// public void EMPTY_SADDLE_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_SADDLE_SLOT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier EMPTY_SADDLE_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.screen.HorseScreenHandler.EMPTY_SADDLE_SLOT_TEXTURE); }
// public static void EMPTY_SADDLE_SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.screen.HorseScreenHandler.EMPTY_SADDLE_SLOT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_LLAMA_ARMOR_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_LLAMA_ARMOR_SLOT_TEXTURE); }
// public void EMPTY_LLAMA_ARMOR_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_LLAMA_ARMOR_SLOT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier EMPTY_LLAMA_ARMOR_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.screen.HorseScreenHandler.EMPTY_LLAMA_ARMOR_SLOT_TEXTURE); }
// public static void EMPTY_LLAMA_ARMOR_SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.screen.HorseScreenHandler.EMPTY_LLAMA_ARMOR_SLOT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_HORSE_ARMOR_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_HORSE_ARMOR_SLOT_TEXTURE); }
// public void EMPTY_HORSE_ARMOR_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_HORSE_ARMOR_SLOT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier EMPTY_HORSE_ARMOR_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.screen.HorseScreenHandler.EMPTY_HORSE_ARMOR_SLOT_TEXTURE); }
// public static void EMPTY_HORSE_ARMOR_SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.screen.HorseScreenHandler.EMPTY_HORSE_ARMOR_SLOT_TEXTURE = value.wrapperContained; }

public HorseScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory,yarnwrap.entity.passive.AbstractHorseEntity entity,int slotColumnCount) { this.wrapperContained = new net.minecraft.screen.HorseScreenHandler(syncId,playerInventory.wrapperContained,inventory.wrapperContained,entity.wrapperContained,slotColumnCount); }

}