package yarnwrap.screen;
public class PlayerScreenHandler { public net.minecraft.screen.PlayerScreenHandler wrapperContained; public PlayerScreenHandler(net.minecraft.screen.PlayerScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier BLOCK_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BLOCK_ATLAS_TEXTURE); }
public yarnwrap.util.Identifier EMPTY_HELMET_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_HELMET_SLOT_TEXTURE); }
public yarnwrap.util.Identifier EMPTY_CHESTPLATE_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_CHESTPLATE_SLOT_TEXTURE); }
public yarnwrap.util.Identifier EMPTY_LEGGINGS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_LEGGINGS_SLOT_TEXTURE); }
public yarnwrap.util.Identifier EMPTY_BOOTS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_BOOTS_SLOT_TEXTURE); }
public yarnwrap.util.Identifier EMPTY_OFFHAND_ARMOR_SLOT() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_OFFHAND_ARMOR_SLOT); }
public int CRAFTING_RESULT_ID() { return wrapperContained.CRAFTING_RESULT_ID; }
public int CRAFTING_INPUT_START() { return wrapperContained.CRAFTING_INPUT_START; }
public int CRAFTING_INPUT_END() { return wrapperContained.CRAFTING_INPUT_END; }
public int EQUIPMENT_START() { return wrapperContained.EQUIPMENT_START; }
public int EQUIPMENT_END() { return wrapperContained.EQUIPMENT_END; }
public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
public int OFFHAND_ID() { return wrapperContained.OFFHAND_ID; }
public int CRAFTING_INPUT_COUNT() { return wrapperContained.CRAFTING_INPUT_COUNT; }
public int EQUIPMENT_COUNT() { return wrapperContained.EQUIPMENT_COUNT; }
public boolean onServer() { return wrapperContained.onServer; }
// public yarnwrap.entity.player.PlayerEntity owner() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.owner); }
// public java.util.Map EMPTY_ARMOR_SLOT_TEXTURES() { return wrapperContained.EMPTY_ARMOR_SLOT_TEXTURES; }
// public yarnwrap.inventory.CraftingResultInventory craftingResult() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.craftingResult); }
// public yarnwrap.inventory.RecipeInputInventory craftingInput() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.craftingInput); }
// public net.minecraft.entity.EquipmentSlot[] EQUIPMENT_SLOT_ORDER() { return wrapperContained.EQUIPMENT_SLOT_ORDER; }
public yarnwrap.inventory.RecipeInputInventory getCraftingInput() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.getCraftingInput()); }
public boolean isInHotbar(int slot) { return wrapperContained.isInHotbar(slot); }

}