package yarnwrap.client.gui.screen.ingame;
public class SmithingScreen { public net.minecraft.client.gui.screen.ingame.SmithingScreen wrapperContained; public SmithingScreen(net.minecraft.client.gui.screen.ingame.SmithingScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Quaternionf ARMOR_STAND_ROTATION() { return wrapperContained.ARMOR_STAND_ROTATION; }
// public void ARMOR_STAND_ROTATION(org.joml.Quaternionf value) { wrapperContained.ARMOR_STAND_ROTATION = value; }
// public yarnwrap.util.Identifier EMPTY_SLOT_SMITHING_TEMPLATE_ARMOR_TRIM_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_SLOT_SMITHING_TEMPLATE_ARMOR_TRIM_TEXTURE); }
// public void EMPTY_SLOT_SMITHING_TEMPLATE_ARMOR_TRIM_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_SLOT_SMITHING_TEMPLATE_ARMOR_TRIM_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier EMPTY_SLOT_SMITHING_TEMPLATE_NETHERITE_UPGRADE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_SLOT_SMITHING_TEMPLATE_NETHERITE_UPGRADE_TEXTURE); }
// public void EMPTY_SLOT_SMITHING_TEMPLATE_NETHERITE_UPGRADE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_SLOT_SMITHING_TEMPLATE_NETHERITE_UPGRADE_TEXTURE = value.wrapperContained; }
// public yarnwrap.text.Text MISSING_TEMPLATE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.MISSING_TEMPLATE_TOOLTIP); }
// public void MISSING_TEMPLATE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.MISSING_TEMPLATE_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text ERROR_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.ERROR_TOOLTIP); }
// public void ERROR_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.ERROR_TOOLTIP = value.wrapperContained; }
// public java.util.List EMPTY_SLOT_TEXTURES() { return wrapperContained.EMPTY_SLOT_TEXTURES; }
// public void EMPTY_SLOT_TEXTURES(java.util.List value) { wrapperContained.EMPTY_SLOT_TEXTURES = value; }
// public yarnwrap.client.gui.screen.ingame.CyclingSlotIcon templateSlotIcon() { return new yarnwrap.client.gui.screen.ingame.CyclingSlotIcon(wrapperContained.templateSlotIcon); }
// public void templateSlotIcon(yarnwrap.client.gui.screen.ingame.CyclingSlotIcon value) { wrapperContained.templateSlotIcon = value.wrapperContained; }
// public yarnwrap.client.gui.screen.ingame.CyclingSlotIcon baseSlotIcon() { return new yarnwrap.client.gui.screen.ingame.CyclingSlotIcon(wrapperContained.baseSlotIcon); }
// public void baseSlotIcon(yarnwrap.client.gui.screen.ingame.CyclingSlotIcon value) { wrapperContained.baseSlotIcon = value.wrapperContained; }
// public yarnwrap.client.gui.screen.ingame.CyclingSlotIcon additionsSlotIcon() { return new yarnwrap.client.gui.screen.ingame.CyclingSlotIcon(wrapperContained.additionsSlotIcon); }
// public void additionsSlotIcon(yarnwrap.client.gui.screen.ingame.CyclingSlotIcon value) { wrapperContained.additionsSlotIcon = value.wrapperContained; }
// public yarnwrap.entity.decoration.ArmorStandEntity armorStand() { return new yarnwrap.entity.decoration.ArmorStandEntity(wrapperContained.armorStand); }
// public void armorStand(yarnwrap.entity.decoration.ArmorStandEntity value) { wrapperContained.armorStand = value.wrapperContained; }
// public yarnwrap.util.Identifier ERROR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ERROR_TEXTURE); }
// public void ERROR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ERROR_TEXTURE = value.wrapperContained; }
public SmithingScreen(yarnwrap.screen.SmithingScreenHandler handler,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.SmithingScreen(handler.wrapperContained,playerInventory.wrapperContained,title.wrapperContained); }
// public java.util.Optional getSmithingTemplate() { return wrapperContained.getSmithingTemplate(); }
// public boolean hasInvalidRecipe() { return wrapperContained.hasInvalidRecipe(); }
// public void method_48475(yarnwrap.client.gui.DrawContext text) { wrapperContained.method_48475(text.wrapperContained); }
// public void renderSlotTooltip(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY) { wrapperContained.renderSlotTooltip(context.wrapperContained,mouseX,mouseY); }
// public void equipArmorStand(yarnwrap.item.ItemStack stack) { wrapperContained.equipArmorStand(stack.wrapperContained); }

}