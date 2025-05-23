package yarnwrap.client.gui.screen.ingame;
public class InventoryScreen { public net.minecraft.client.gui.screen.ingame.InventoryScreen wrapperContained; public InventoryScreen(net.minecraft.client.gui.screen.ingame.InventoryScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean mouseDown() { return wrapperContained.mouseDown; }
// public void mouseDown(boolean value) { wrapperContained.mouseDown = value; }
// public static boolean mouseDown() { return net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseDown; }
// public static void mouseDown(boolean value, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseDown = value; }

// public float mouseY() { return wrapperContained.mouseY; }
// public void mouseY(float value) { wrapperContained.mouseY = value; }
// public static float mouseY() { return net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseY; }
// public static void mouseY(float value, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseY = value; }

// public float mouseX() { return wrapperContained.mouseX; }
// public void mouseX(float value) { wrapperContained.mouseX = value; }
// public static float mouseX() { return net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseX; }
// public static void mouseX(float value, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseX = value; }

// public yarnwrap.client.gui.screen.ingame.StatusEffectsDisplay statusEffectsDisplay() { return new yarnwrap.client.gui.screen.ingame.StatusEffectsDisplay(wrapperContained.statusEffectsDisplay); }
// public void statusEffectsDisplay(yarnwrap.client.gui.screen.ingame.StatusEffectsDisplay value) { wrapperContained.statusEffectsDisplay = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.ingame.StatusEffectsDisplay statusEffectsDisplay() { return new yarnwrap.client.gui.screen.ingame.StatusEffectsDisplay(net.minecraft.client.gui.screen.ingame.InventoryScreen.statusEffectsDisplay); }
// public static void statusEffectsDisplay(yarnwrap.client.gui.screen.ingame.StatusEffectsDisplay value, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.statusEffectsDisplay = value.wrapperContained; }

public InventoryScreen(yarnwrap.entity.player.PlayerEntity player) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.InventoryScreen(player.wrapperContained); }
// public void drawEntity(yarnwrap.client.gui.DrawContext context,int x1,int y1,int x2,int y2,int size,float scale,float mouseX,float mouseY,yarnwrap.entity.LivingEntity entity) { wrapperContained.drawEntity(context.wrapperContained,x1,y1,x2,y2,size,scale,mouseX,mouseY,entity.wrapperContained); }
// public static void drawEntity(yarnwrap.client.gui.DrawContext context,int x1,int y1,int x2,int y2,int size,float scale,float mouseX,float mouseY,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.drawEntity(context.wrapperContained,x1,y1,x2,y2,size,scale,mouseX,mouseY,entity.wrapperContained); }
// public void drawEntity(yarnwrap.client.gui.DrawContext drawer,int x1,int y1,int x2,int y2,float scale,org.joml.Vector3f translation,org.joml.Quaternionf rotation,org.joml.Quaternionf overrideCameraAngle,yarnwrap.entity.LivingEntity entity) { wrapperContained.drawEntity(drawer.wrapperContained,x1,y1,x2,y2,scale,translation,rotation,overrideCameraAngle,entity.wrapperContained); }
// public static void drawEntity(yarnwrap.client.gui.DrawContext drawer,int x1,int y1,int x2,int y2,float scale,org.joml.Vector3f translation,org.joml.Quaternionf rotation,org.joml.Quaternionf overrideCameraAngle,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.drawEntity(drawer.wrapperContained,x1,y1,x2,y2,scale,translation,rotation,overrideCameraAngle,entity.wrapperContained); }

}