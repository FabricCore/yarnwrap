package yarnwrap.screen;
public class PlayerScreenHandler { public net.minecraft.screen.PlayerScreenHandler wrapperContained; public PlayerScreenHandler(net.minecraft.screen.PlayerScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier BLOCK_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BLOCK_ATLAS_TEXTURE); }
// public void BLOCK_ATLAS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BLOCK_ATLAS_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier BLOCK_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.screen.PlayerScreenHandler.BLOCK_ATLAS_TEXTURE); }
// public static void BLOCK_ATLAS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.screen.PlayerScreenHandler.BLOCK_ATLAS_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_HELMET_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_HELMET_SLOT_TEXTURE); }
// public void EMPTY_HELMET_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_HELMET_SLOT_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier EMPTY_HELMET_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.screen.PlayerScreenHandler.EMPTY_HELMET_SLOT_TEXTURE); }
// public static void EMPTY_HELMET_SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.screen.PlayerScreenHandler.EMPTY_HELMET_SLOT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_CHESTPLATE_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_CHESTPLATE_SLOT_TEXTURE); }
// public void EMPTY_CHESTPLATE_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_CHESTPLATE_SLOT_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier EMPTY_CHESTPLATE_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.screen.PlayerScreenHandler.EMPTY_CHESTPLATE_SLOT_TEXTURE); }
// public static void EMPTY_CHESTPLATE_SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.screen.PlayerScreenHandler.EMPTY_CHESTPLATE_SLOT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_LEGGINGS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_LEGGINGS_SLOT_TEXTURE); }
// public void EMPTY_LEGGINGS_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_LEGGINGS_SLOT_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier EMPTY_LEGGINGS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.screen.PlayerScreenHandler.EMPTY_LEGGINGS_SLOT_TEXTURE); }
// public static void EMPTY_LEGGINGS_SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.screen.PlayerScreenHandler.EMPTY_LEGGINGS_SLOT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_BOOTS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_BOOTS_SLOT_TEXTURE); }
// public void EMPTY_BOOTS_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_BOOTS_SLOT_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier EMPTY_BOOTS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.screen.PlayerScreenHandler.EMPTY_BOOTS_SLOT_TEXTURE); }
// public static void EMPTY_BOOTS_SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.screen.PlayerScreenHandler.EMPTY_BOOTS_SLOT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_OFFHAND_ARMOR_SLOT() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_OFFHAND_ARMOR_SLOT); }
// public void EMPTY_OFFHAND_ARMOR_SLOT(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_OFFHAND_ARMOR_SLOT = value.wrapperContained; }
public static yarnwrap.util.Identifier EMPTY_OFFHAND_ARMOR_SLOT() { return new yarnwrap.util.Identifier(net.minecraft.screen.PlayerScreenHandler.EMPTY_OFFHAND_ARMOR_SLOT); }
// public static void EMPTY_OFFHAND_ARMOR_SLOT(yarnwrap.util.Identifier value, ) { net.minecraft.screen.PlayerScreenHandler.EMPTY_OFFHAND_ARMOR_SLOT = value.wrapperContained; }

// public int CRAFTING_RESULT_ID() { return wrapperContained.CRAFTING_RESULT_ID; }
// public void CRAFTING_RESULT_ID(int value) { wrapperContained.CRAFTING_RESULT_ID = value; }
public static int CRAFTING_RESULT_ID() { return net.minecraft.screen.PlayerScreenHandler.CRAFTING_RESULT_ID; }
// public static void CRAFTING_RESULT_ID(int value, ) { net.minecraft.screen.PlayerScreenHandler.CRAFTING_RESULT_ID = value; }

// public int CRAFTING_INPUT_START() { return wrapperContained.CRAFTING_INPUT_START; }
// public void CRAFTING_INPUT_START(int value) { wrapperContained.CRAFTING_INPUT_START = value; }
public static int CRAFTING_INPUT_START() { return net.minecraft.screen.PlayerScreenHandler.CRAFTING_INPUT_START; }
// public static void CRAFTING_INPUT_START(int value, ) { net.minecraft.screen.PlayerScreenHandler.CRAFTING_INPUT_START = value; }

// public int CRAFTING_INPUT_END() { return wrapperContained.CRAFTING_INPUT_END; }
// public void CRAFTING_INPUT_END(int value) { wrapperContained.CRAFTING_INPUT_END = value; }
public static int CRAFTING_INPUT_END() { return net.minecraft.screen.PlayerScreenHandler.CRAFTING_INPUT_END; }
// public static void CRAFTING_INPUT_END(int value, ) { net.minecraft.screen.PlayerScreenHandler.CRAFTING_INPUT_END = value; }

// public int EQUIPMENT_START() { return wrapperContained.EQUIPMENT_START; }
// public void EQUIPMENT_START(int value) { wrapperContained.EQUIPMENT_START = value; }
public static int EQUIPMENT_START() { return net.minecraft.screen.PlayerScreenHandler.EQUIPMENT_START; }
// public static void EQUIPMENT_START(int value, ) { net.minecraft.screen.PlayerScreenHandler.EQUIPMENT_START = value; }

// public int EQUIPMENT_END() { return wrapperContained.EQUIPMENT_END; }
// public void EQUIPMENT_END(int value) { wrapperContained.EQUIPMENT_END = value; }
public static int EQUIPMENT_END() { return net.minecraft.screen.PlayerScreenHandler.EQUIPMENT_END; }
// public static void EQUIPMENT_END(int value, ) { net.minecraft.screen.PlayerScreenHandler.EQUIPMENT_END = value; }

// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
public static int INVENTORY_START() { return net.minecraft.screen.PlayerScreenHandler.INVENTORY_START; }
// public static void INVENTORY_START(int value, ) { net.minecraft.screen.PlayerScreenHandler.INVENTORY_START = value; }

// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
public static int INVENTORY_END() { return net.minecraft.screen.PlayerScreenHandler.INVENTORY_END; }
// public static void INVENTORY_END(int value, ) { net.minecraft.screen.PlayerScreenHandler.INVENTORY_END = value; }

// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
public static int HOTBAR_START() { return net.minecraft.screen.PlayerScreenHandler.HOTBAR_START; }
// public static void HOTBAR_START(int value, ) { net.minecraft.screen.PlayerScreenHandler.HOTBAR_START = value; }

// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
public static int HOTBAR_END() { return net.minecraft.screen.PlayerScreenHandler.HOTBAR_END; }
// public static void HOTBAR_END(int value, ) { net.minecraft.screen.PlayerScreenHandler.HOTBAR_END = value; }

// public int OFFHAND_ID() { return wrapperContained.OFFHAND_ID; }
// public void OFFHAND_ID(int value) { wrapperContained.OFFHAND_ID = value; }
public static int OFFHAND_ID() { return net.minecraft.screen.PlayerScreenHandler.OFFHAND_ID; }
// public static void OFFHAND_ID(int value, ) { net.minecraft.screen.PlayerScreenHandler.OFFHAND_ID = value; }

// public int CRAFTING_INPUT_COUNT() { return wrapperContained.CRAFTING_INPUT_COUNT; }
// public void CRAFTING_INPUT_COUNT(int value) { wrapperContained.CRAFTING_INPUT_COUNT = value; }
public static int CRAFTING_INPUT_COUNT() { return net.minecraft.screen.PlayerScreenHandler.CRAFTING_INPUT_COUNT; }
// public static void CRAFTING_INPUT_COUNT(int value, ) { net.minecraft.screen.PlayerScreenHandler.CRAFTING_INPUT_COUNT = value; }

// public int EQUIPMENT_COUNT() { return wrapperContained.EQUIPMENT_COUNT; }
// public void EQUIPMENT_COUNT(int value) { wrapperContained.EQUIPMENT_COUNT = value; }
public static int EQUIPMENT_COUNT() { return net.minecraft.screen.PlayerScreenHandler.EQUIPMENT_COUNT; }
// public static void EQUIPMENT_COUNT(int value, ) { net.minecraft.screen.PlayerScreenHandler.EQUIPMENT_COUNT = value; }

public boolean onServer() { return wrapperContained.onServer; }
// public void onServer(boolean value) { wrapperContained.onServer = value; }
// public static boolean onServer() { return net.minecraft.screen.PlayerScreenHandler.onServer; }
// public static void onServer(boolean value, ) { net.minecraft.screen.PlayerScreenHandler.onServer = value; }

// public yarnwrap.entity.player.PlayerEntity owner() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.owner); }
// public void owner(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.owner = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity owner() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.screen.PlayerScreenHandler.owner); }
// public static void owner(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.screen.PlayerScreenHandler.owner = value.wrapperContained; }

// public java.util.Map EMPTY_ARMOR_SLOT_TEXTURES() { return wrapperContained.EMPTY_ARMOR_SLOT_TEXTURES; }
// public void EMPTY_ARMOR_SLOT_TEXTURES(java.util.Map value) { wrapperContained.EMPTY_ARMOR_SLOT_TEXTURES = value; }
// public static java.util.Map EMPTY_ARMOR_SLOT_TEXTURES() { return net.minecraft.screen.PlayerScreenHandler.EMPTY_ARMOR_SLOT_TEXTURES; }
// public static void EMPTY_ARMOR_SLOT_TEXTURES(java.util.Map value, ) { net.minecraft.screen.PlayerScreenHandler.EMPTY_ARMOR_SLOT_TEXTURES = value; }

// public yarnwrap.inventory.CraftingResultInventory craftingResult() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.craftingResult); }
// public void craftingResult(yarnwrap.inventory.CraftingResultInventory value) { wrapperContained.craftingResult = value.wrapperContained; }
// public static yarnwrap.inventory.CraftingResultInventory craftingResult() { return new yarnwrap.inventory.CraftingResultInventory(net.minecraft.screen.PlayerScreenHandler.craftingResult); }
// public static void craftingResult(yarnwrap.inventory.CraftingResultInventory value, ) { net.minecraft.screen.PlayerScreenHandler.craftingResult = value.wrapperContained; }

// public yarnwrap.inventory.RecipeInputInventory craftingInput() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.craftingInput); }
// public void craftingInput(yarnwrap.inventory.RecipeInputInventory value) { wrapperContained.craftingInput = value.wrapperContained; }
// public static yarnwrap.inventory.RecipeInputInventory craftingInput() { return new yarnwrap.inventory.RecipeInputInventory(net.minecraft.screen.PlayerScreenHandler.craftingInput); }
// public static void craftingInput(yarnwrap.inventory.RecipeInputInventory value, ) { net.minecraft.screen.PlayerScreenHandler.craftingInput = value.wrapperContained; }

// public net.minecraft.entity.EquipmentSlot[] EQUIPMENT_SLOT_ORDER() { return wrapperContained.EQUIPMENT_SLOT_ORDER; }
// public void EQUIPMENT_SLOT_ORDER(net.minecraft.entity.EquipmentSlot[] value) { wrapperContained.EQUIPMENT_SLOT_ORDER = value; }
// public static net.minecraft.entity.EquipmentSlot[] EQUIPMENT_SLOT_ORDER() { return net.minecraft.screen.PlayerScreenHandler.EQUIPMENT_SLOT_ORDER; }
// public static void EQUIPMENT_SLOT_ORDER(net.minecraft.entity.EquipmentSlot[] value, ) { net.minecraft.screen.PlayerScreenHandler.EQUIPMENT_SLOT_ORDER = value; }

public PlayerScreenHandler(yarnwrap.entity.player.PlayerInventory inventory,boolean onServer,yarnwrap.entity.player.PlayerEntity owner) { this.wrapperContained = new net.minecraft.screen.PlayerScreenHandler(inventory.wrapperContained,onServer,owner.wrapperContained); }
public yarnwrap.inventory.RecipeInputInventory getCraftingInput() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.getCraftingInput()); }
// public static yarnwrap.inventory.RecipeInputInventory getCraftingInput() { return new yarnwrap.inventory.RecipeInputInventory(net.minecraft.screen.PlayerScreenHandler.getCraftingInput()); }
// public boolean isInHotbar(int slot) { return wrapperContained.isInHotbar(slot); }
// public static boolean isInHotbar(int slot, ) { return net.minecraft.screen.PlayerScreenHandler.isInHotbar(slot); }

}