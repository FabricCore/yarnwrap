package yarnwrap.client.gui.tooltip;
public class BundleTooltipSubmenuHandler { public net.minecraft.client.gui.tooltip.BundleTooltipSubmenuHandler wrapperContained; public BundleTooltipSubmenuHandler(net.minecraft.client.gui.tooltip.BundleTooltipSubmenuHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.tooltip.BundleTooltipSubmenuHandler.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.tooltip.BundleTooltipSubmenuHandler.client = value.wrapperContained; }

// public yarnwrap.client.input.Scroller scroller() { return new yarnwrap.client.input.Scroller(wrapperContained.scroller); }
// public void scroller(yarnwrap.client.input.Scroller value) { wrapperContained.scroller = value.wrapperContained; }
// public static yarnwrap.client.input.Scroller scroller() { return new yarnwrap.client.input.Scroller(net.minecraft.client.gui.tooltip.BundleTooltipSubmenuHandler.scroller); }
// public static void scroller(yarnwrap.client.input.Scroller value, ) { net.minecraft.client.gui.tooltip.BundleTooltipSubmenuHandler.scroller = value.wrapperContained; }

public BundleTooltipSubmenuHandler(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.gui.tooltip.BundleTooltipSubmenuHandler(client.wrapperContained); }
public void reset(yarnwrap.item.ItemStack item,int slotId) { wrapperContained.reset(item.wrapperContained,slotId); }
// public static void reset(yarnwrap.item.ItemStack item,int slotId, ) { net.minecraft.client.gui.tooltip.BundleTooltipSubmenuHandler.reset(item.wrapperContained,slotId); }
// public void sendPacket(yarnwrap.item.ItemStack item,int slotId,int selectedItemIndex) { wrapperContained.sendPacket(item.wrapperContained,slotId,selectedItemIndex); }
// public static void sendPacket(yarnwrap.item.ItemStack item,int slotId,int selectedItemIndex, ) { net.minecraft.client.gui.tooltip.BundleTooltipSubmenuHandler.sendPacket(item.wrapperContained,slotId,selectedItemIndex); }

}