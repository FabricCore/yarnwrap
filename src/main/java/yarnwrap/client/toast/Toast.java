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

public Object draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.toast.ToastManager manager,long startTime) { return wrapperContained.draw(context.wrapperContained,manager.wrapperContained,startTime); }
// public static Object draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.toast.ToastManager manager,long startTime, ) { return net.minecraft.client.toast.Toast.draw(context.wrapperContained,manager.wrapperContained,startTime); }
public java.lang.Object getType() { return wrapperContained.getType(); }
// public static java.lang.Object getType() { return net.minecraft.client.toast.Toast.getType(); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.toast.Toast.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.toast.Toast.getHeight(); }
public int getRequiredSpaceCount() { return wrapperContained.getRequiredSpaceCount(); }
// public static int getRequiredSpaceCount() { return net.minecraft.client.toast.Toast.getRequiredSpaceCount(); }

}