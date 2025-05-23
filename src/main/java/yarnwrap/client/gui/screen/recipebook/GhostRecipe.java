package yarnwrap.client.gui.screen.recipebook;
public class GhostRecipe { public net.minecraft.client.gui.screen.recipebook.GhostRecipe wrapperContained; public GhostRecipe(net.minecraft.client.gui.screen.recipebook.GhostRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Reference2ObjectMap items() { return wrapperContained.items; }
// public void items(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value) { wrapperContained.items = value; }
// public static it.unimi.dsi.fastutil.objects.Reference2ObjectMap items() { return net.minecraft.client.gui.screen.recipebook.GhostRecipe.items; }
// public static void items(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value, ) { net.minecraft.client.gui.screen.recipebook.GhostRecipe.items = value; }

// public yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider currentIndexProvider() { return new yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider(wrapperContained.currentIndexProvider); }
// public void currentIndexProvider(yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider value) { wrapperContained.currentIndexProvider = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider currentIndexProvider() { return new yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider(net.minecraft.client.gui.screen.recipebook.GhostRecipe.currentIndexProvider); }
// public static void currentIndexProvider(yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider value, ) { net.minecraft.client.gui.screen.recipebook.GhostRecipe.currentIndexProvider = value.wrapperContained; }

public GhostRecipe(yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider currentIndexProvider) { this.wrapperContained = new net.minecraft.client.gui.screen.recipebook.GhostRecipe(currentIndexProvider.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.gui.screen.recipebook.GhostRecipe.clear(); }
// public void method_62030(boolean slot,yarnwrap.client.gui.DrawContext item) { wrapperContained.method_62030(slot,item.wrapperContained); }
// public static void method_62030(boolean slot,yarnwrap.client.gui.DrawContext item, ) { net.minecraft.client.gui.screen.recipebook.GhostRecipe.method_62030(slot,item.wrapperContained); }
public void drawTooltip(yarnwrap.client.gui.DrawContext context,yarnwrap.client.MinecraftClient client,int x,int y,yarnwrap.screen.slot.Slot slot) { wrapperContained.drawTooltip(context.wrapperContained,client.wrapperContained,x,y,slot.wrapperContained); }
// public static void drawTooltip(yarnwrap.client.gui.DrawContext context,yarnwrap.client.MinecraftClient client,int x,int y,yarnwrap.screen.slot.Slot slot, ) { net.minecraft.client.gui.screen.recipebook.GhostRecipe.drawTooltip(context.wrapperContained,client.wrapperContained,x,y,slot.wrapperContained); }
public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.MinecraftClient client,boolean resultHasPadding) { wrapperContained.draw(context.wrapperContained,client.wrapperContained,resultHasPadding); }
// public static void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.MinecraftClient client,boolean resultHasPadding, ) { net.minecraft.client.gui.screen.recipebook.GhostRecipe.draw(context.wrapperContained,client.wrapperContained,resultHasPadding); }
// public void addInputs(yarnwrap.screen.slot.Slot slot,yarnwrap.util.context.ContextParameterMap context,yarnwrap.recipe.display.SlotDisplay display) { wrapperContained.addInputs(slot.wrapperContained,context.wrapperContained,display.wrapperContained); }
// public static void addInputs(yarnwrap.screen.slot.Slot slot,yarnwrap.util.context.ContextParameterMap context,yarnwrap.recipe.display.SlotDisplay display, ) { net.minecraft.client.gui.screen.recipebook.GhostRecipe.addInputs(slot.wrapperContained,context.wrapperContained,display.wrapperContained); }
// public void addItems(yarnwrap.screen.slot.Slot slot,yarnwrap.util.context.ContextParameterMap context,yarnwrap.recipe.display.SlotDisplay display,boolean resultSlot) { wrapperContained.addItems(slot.wrapperContained,context.wrapperContained,display.wrapperContained,resultSlot); }
// public static void addItems(yarnwrap.screen.slot.Slot slot,yarnwrap.util.context.ContextParameterMap context,yarnwrap.recipe.display.SlotDisplay display,boolean resultSlot, ) { net.minecraft.client.gui.screen.recipebook.GhostRecipe.addItems(slot.wrapperContained,context.wrapperContained,display.wrapperContained,resultSlot); }
// public void addResults(yarnwrap.screen.slot.Slot slot,yarnwrap.util.context.ContextParameterMap context,yarnwrap.recipe.display.SlotDisplay display) { wrapperContained.addResults(slot.wrapperContained,context.wrapperContained,display.wrapperContained); }
// public static void addResults(yarnwrap.screen.slot.Slot slot,yarnwrap.util.context.ContextParameterMap context,yarnwrap.recipe.display.SlotDisplay display, ) { net.minecraft.client.gui.screen.recipebook.GhostRecipe.addResults(slot.wrapperContained,context.wrapperContained,display.wrapperContained); }

}