package yarnwrap.client.toast;
public class Toast { public net.minecraft.client.toast.Toast wrapperContained; public Toast(net.minecraft.client.toast.Toast wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object TYPE() { return wrapperContained.TYPE; }
// public void TYPE(java.lang.Object value) { wrapperContained.TYPE = value; }
// public static java.lang.Object TYPE() { return net.minecraft.client.toast.Toast.TYPE; }
// public static void TYPE(java.lang.Object value, ) { net.minecraft.client.toast.Toast.TYPE = value; }

// public int BASE_HEIGHT() { return wrapperContained.BASE_HEIGHT; }
// public void BASE_HEIGHT(int value) { wrapperContained.BASE_HEIGHT = value; }
public static int BASE_HEIGHT() { return net.minecraft.client.toast.Toast.BASE_HEIGHT; }
// public static void BASE_HEIGHT(int value, ) { net.minecraft.client.toast.Toast.BASE_HEIGHT = value; }

// public int BASE_WIDTH() { return wrapperContained.BASE_WIDTH; }
// public void BASE_WIDTH(int value) { wrapperContained.BASE_WIDTH = value; }
public static int BASE_WIDTH() { return net.minecraft.client.toast.Toast.BASE_WIDTH; }
// public static void BASE_WIDTH(int value, ) { net.minecraft.client.toast.Toast.BASE_WIDTH = value; }

public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,long startTime) { wrapperContained.draw(context.wrapperContained,textRenderer.wrapperContained,startTime); }
// public static void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,long startTime, ) { net.minecraft.client.toast.Toast.draw(context.wrapperContained,textRenderer.wrapperContained,startTime); }
public java.lang.Object getType() { return wrapperContained.getType(); }
// public static java.lang.Object getType() { return net.minecraft.client.toast.Toast.getType(); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.toast.Toast.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.toast.Toast.getHeight(); }
public int getRequiredSpaceCount() { return wrapperContained.getRequiredSpaceCount(); }
// public static int getRequiredSpaceCount() { return net.minecraft.client.toast.Toast.getRequiredSpaceCount(); }
public Object getVisibility() { return wrapperContained.getVisibility(); }
// public static Object getVisibility() { return net.minecraft.client.toast.Toast.getVisibility(); }
public void update(yarnwrap.client.toast.ToastManager manager,long time) { wrapperContained.update(manager.wrapperContained,time); }
// public static void update(yarnwrap.client.toast.ToastManager manager,long time, ) { net.minecraft.client.toast.Toast.update(manager.wrapperContained,time); }
public yarnwrap.sound.SoundEvent getSoundEvent() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSoundEvent()); }
// public static yarnwrap.sound.SoundEvent getSoundEvent() { return new yarnwrap.sound.SoundEvent(net.minecraft.client.toast.Toast.getSoundEvent()); }
// public float getYPos(int topIndex) { return wrapperContained.getYPos(topIndex); }
// public static float getYPos(int topIndex, ) { return net.minecraft.client.toast.Toast.getYPos(topIndex); }
// public float getXPos(int scaledWindowWidth,float visibleWidthPortion) { return wrapperContained.getXPos(scaledWindowWidth,visibleWidthPortion); }
// public static float getXPos(int scaledWindowWidth,float visibleWidthPortion, ) { return net.minecraft.client.toast.Toast.getXPos(scaledWindowWidth,visibleWidthPortion); }

}