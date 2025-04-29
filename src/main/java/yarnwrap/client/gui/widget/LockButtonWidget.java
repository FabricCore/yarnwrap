package yarnwrap.client.gui.widget;
public class LockButtonWidget { public net.minecraft.client.gui.widget.LockButtonWidget wrapperContained; public LockButtonWidget(net.minecraft.client.gui.widget.LockButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean locked() { return wrapperContained.locked; }
// public void locked(boolean value) { wrapperContained.locked = value; }
// public static boolean locked() { return net.minecraft.client.gui.widget.LockButtonWidget.locked; }
// public static void locked(boolean value, ) { net.minecraft.client.gui.widget.LockButtonWidget.locked = value; }

// public LockButtonWidget(int x,int y,Object action) { this.wrapperContained = new net.minecraft.client.gui.widget.LockButtonWidget(x,y,action); }
public void setLocked(boolean locked) { wrapperContained.setLocked(locked); }
// public static void setLocked(boolean locked, ) { net.minecraft.client.gui.widget.LockButtonWidget.setLocked(locked); }
public boolean isLocked() { return wrapperContained.isLocked(); }
// public static boolean isLocked() { return net.minecraft.client.gui.widget.LockButtonWidget.isLocked(); }

}