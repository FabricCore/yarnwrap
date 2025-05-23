package yarnwrap.client.toast;
public class ToastManager { public net.minecraft.client.toast.ToastManager wrapperContained; public ToastManager(net.minecraft.client.toast.ToastManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.toast.ToastManager.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.toast.ToastManager.client = value.wrapperContained; }

// public java.util.List visibleEntries() { return wrapperContained.visibleEntries; }
// public void visibleEntries(java.util.List value) { wrapperContained.visibleEntries = value; }
// public static java.util.List visibleEntries() { return net.minecraft.client.toast.ToastManager.visibleEntries; }
// public static void visibleEntries(java.util.List value, ) { net.minecraft.client.toast.ToastManager.visibleEntries = value; }

// public java.util.Deque toastQueue() { return wrapperContained.toastQueue; }
// public void toastQueue(java.util.Deque value) { wrapperContained.toastQueue = value; }
// public static java.util.Deque toastQueue() { return net.minecraft.client.toast.ToastManager.toastQueue; }
// public static void toastQueue(java.util.Deque value, ) { net.minecraft.client.toast.ToastManager.toastQueue = value; }

// public int SPACES() { return wrapperContained.SPACES; }
// public void SPACES(int value) { wrapperContained.SPACES = value; }
// public static int SPACES() { return net.minecraft.client.toast.ToastManager.SPACES; }
// public static void SPACES(int value, ) { net.minecraft.client.toast.ToastManager.SPACES = value; }

// public java.util.BitSet occupiedSpaces() { return wrapperContained.occupiedSpaces; }
// public void occupiedSpaces(java.util.BitSet value) { wrapperContained.occupiedSpaces = value; }
// public static java.util.BitSet occupiedSpaces() { return net.minecraft.client.toast.ToastManager.occupiedSpaces; }
// public static void occupiedSpaces(java.util.BitSet value, ) { net.minecraft.client.toast.ToastManager.occupiedSpaces = value; }

// public java.util.Set queuedToastSounds() { return wrapperContained.queuedToastSounds; }
// public void queuedToastSounds(java.util.Set value) { wrapperContained.queuedToastSounds = value; }
// public static java.util.Set queuedToastSounds() { return net.minecraft.client.toast.ToastManager.queuedToastSounds; }
// public static void queuedToastSounds(java.util.Set value, ) { net.minecraft.client.toast.ToastManager.queuedToastSounds = value; }

// public Object nowPlayingToast() { return wrapperContained.nowPlayingToast; }
// public void nowPlayingToast(Object value) { wrapperContained.nowPlayingToast = value; }
// // public static Object nowPlayingToast() { return net.minecraft.client.toast.ToastManager.nowPlayingToast; }
// public static void nowPlayingToast(Object value, ) { net.minecraft.client.toast.ToastManager.nowPlayingToast = value; }

// public ToastManager(yarnwrap.client.MinecraftClient client,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.toast.ToastManager(client.wrapperContained,gameOptions.wrapperContained); }
public yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(wrapperContained.getClient()); }
// public static yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.toast.ToastManager.getClient()); }
public void draw(yarnwrap.client.gui.DrawContext context) { wrapperContained.draw(context.wrapperContained); }
// public static void draw(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.toast.ToastManager.draw(context.wrapperContained); }
public yarnwrap.client.toast.Toast getToast(java.lang.Class toastClass,java.lang.Object type) { return new yarnwrap.client.toast.Toast(wrapperContained.getToast(toastClass,type)); }
// public static yarnwrap.client.toast.Toast getToast(java.lang.Class toastClass,java.lang.Object type, ) { return new yarnwrap.client.toast.Toast(net.minecraft.client.toast.ToastManager.getToast(toastClass,type)); }
public void add(yarnwrap.client.toast.Toast toast) { wrapperContained.add(toast.wrapperContained); }
// public static void add(yarnwrap.client.toast.Toast toast, ) { net.minecraft.client.toast.ToastManager.add(toast.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.toast.ToastManager.clear(); }
// public int getTopIndex(int requiredSpaces) { return wrapperContained.getTopIndex(requiredSpaces); }
// public static int getTopIndex(int requiredSpaces, ) { return net.minecraft.client.toast.ToastManager.getTopIndex(requiredSpaces); }
// public int getEmptySpaceCount() { return wrapperContained.getEmptySpaceCount(); }
// public static int getEmptySpaceCount() { return net.minecraft.client.toast.ToastManager.getEmptySpaceCount(); }
public double getNotificationDisplayTimeMultiplier() { return wrapperContained.getNotificationDisplayTimeMultiplier(); }
// public static double getNotificationDisplayTimeMultiplier() { return net.minecraft.client.toast.ToastManager.getNotificationDisplayTimeMultiplier(); }
public void update() { wrapperContained.update(); }
// public static void update() { net.minecraft.client.toast.ToastManager.update(); }
// public boolean method_61991(org.apache.commons.lang3.mutable.MutableBoolean entry) { return wrapperContained.method_61991(entry); }
// public static boolean method_61991(org.apache.commons.lang3.mutable.MutableBoolean entry, ) { return net.minecraft.client.toast.ToastManager.method_61991(entry); }
// public boolean method_61992(yarnwrap.client.toast.Toast toast) { return wrapperContained.method_61992(toast.wrapperContained); }
// public static boolean method_61992(yarnwrap.client.toast.Toast toast, ) { return net.minecraft.client.toast.ToastManager.method_61992(toast.wrapperContained); }
// public void onMusicTrackStart() { wrapperContained.onMusicTrackStart(); }
// public static void onMusicTrackStart() { net.minecraft.client.toast.ToastManager.onMusicTrackStart(); }
// public void onMusicTrackStop() { wrapperContained.onMusicTrackStop(); }
// public static void onMusicTrackStop() { net.minecraft.client.toast.ToastManager.onMusicTrackStop(); }
// public void showNowPlayingToast() { wrapperContained.showNowPlayingToast(); }
// public static void showNowPlayingToast() { net.minecraft.client.toast.ToastManager.showNowPlayingToast(); }
// public void hideNowPlayingToast() { wrapperContained.hideNowPlayingToast(); }
// public static void hideNowPlayingToast() { net.minecraft.client.toast.ToastManager.hideNowPlayingToast(); }

}