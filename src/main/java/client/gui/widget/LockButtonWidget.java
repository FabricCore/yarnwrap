package yarnwrap.client.gui.widget;
public class LockButtonWidget { public net.minecraft.client.gui.widget.LockButtonWidget wrapperContained; public LockButtonWidget(net.minecraft.client.gui.widget.LockButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean locked() { return wrapperContained.locked; }
public void setLocked(boolean locked) { wrapperContained.setLocked(locked); }
public boolean isLocked() { return wrapperContained.isLocked(); }

}