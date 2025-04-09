package yarnwrap.client.toast;
public class ToastManager { public net.minecraft.client.toast.ToastManager wrapperContained; public ToastManager(net.minecraft.client.toast.ToastManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.List visibleEntries() { return wrapperContained.visibleEntries; }
// public java.util.Deque toastQueue() { return wrapperContained.toastQueue; }
// public int SPACES() { return wrapperContained.SPACES; }
// public int ALL_OCCUPIED() { return wrapperContained.ALL_OCCUPIED; }
// public java.util.BitSet occupiedSpaces() { return wrapperContained.occupiedSpaces; }
public yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(wrapperContained.getClient()); }
public void draw(yarnwrap.client.gui.DrawContext context) { wrapperContained.draw(context.wrapperContained); }
public yarnwrap.client.toast.Toast getToast(java.lang.Class toastClass,java.lang.Object type) { return new yarnwrap.client.toast.Toast(wrapperContained.getToast(toastClass,type)); }
public void add(yarnwrap.client.toast.Toast toast) { wrapperContained.add(toast.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public int getTopIndex(int requiredSpaces) { return wrapperContained.getTopIndex(requiredSpaces); }
// public int getEmptySpaceCount() { return wrapperContained.getEmptySpaceCount(); }
public double getNotificationDisplayTimeMultiplier() { return wrapperContained.getNotificationDisplayTimeMultiplier(); }

}