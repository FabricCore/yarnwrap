package yarnwrap.screen.sync;
public class TrackedSlot { public net.minecraft.screen.sync.TrackedSlot wrapperContained; public TrackedSlot(net.minecraft.screen.sync.TrackedSlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.sync.TrackedSlot ALWAYS_IN_SYNC() { return new yarnwrap.screen.sync.TrackedSlot(wrapperContained.ALWAYS_IN_SYNC); }
// public void ALWAYS_IN_SYNC(yarnwrap.screen.sync.TrackedSlot value) { wrapperContained.ALWAYS_IN_SYNC = value.wrapperContained; }
public static yarnwrap.screen.sync.TrackedSlot ALWAYS_IN_SYNC() { return new yarnwrap.screen.sync.TrackedSlot(net.minecraft.screen.sync.TrackedSlot.ALWAYS_IN_SYNC); }
// public static void ALWAYS_IN_SYNC(yarnwrap.screen.sync.TrackedSlot value, ) { net.minecraft.screen.sync.TrackedSlot.ALWAYS_IN_SYNC = value.wrapperContained; }

public void setReceivedStack(yarnwrap.item.ItemStack receivedStack) { wrapperContained.setReceivedStack(receivedStack.wrapperContained); }
// public static void setReceivedStack(yarnwrap.item.ItemStack receivedStack, ) { net.minecraft.screen.sync.TrackedSlot.setReceivedStack(receivedStack.wrapperContained); }
public void setReceivedHash(yarnwrap.screen.sync.ItemStackHash receivedHash) { wrapperContained.setReceivedHash(receivedHash.wrapperContained); }
// public static void setReceivedHash(yarnwrap.screen.sync.ItemStackHash receivedHash, ) { net.minecraft.screen.sync.TrackedSlot.setReceivedHash(receivedHash.wrapperContained); }
public boolean isInSync(yarnwrap.item.ItemStack actualStack) { return wrapperContained.isInSync(actualStack.wrapperContained); }
// public static boolean isInSync(yarnwrap.item.ItemStack actualStack, ) { return net.minecraft.screen.sync.TrackedSlot.isInSync(actualStack.wrapperContained); }

}