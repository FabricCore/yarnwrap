package yarnwrap.client.toast;
public class Toast { public net.minecraft.client.toast.Toast wrapperContained; public Toast(net.minecraft.client.toast.Toast wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object TYPE() { return wrapperContained.TYPE; }
// public void TYPE(java.lang.Object value) { wrapperContained.TYPE = value; }
public int BASE_HEIGHT() { return wrapperContained.BASE_HEIGHT; }
// public void BASE_HEIGHT(int value) { wrapperContained.BASE_HEIGHT = value; }
public Object draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.toast.ToastManager manager,long startTime) { return wrapperContained.draw(context.wrapperContained,manager.wrapperContained,startTime); }
public java.lang.Object getType() { return wrapperContained.getType(); }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
public int getRequiredSpaceCount() { return wrapperContained.getRequiredSpaceCount(); }

}