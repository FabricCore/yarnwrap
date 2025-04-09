package yarnwrap.client.util;
public class Untracker { public net.minecraft.client.util.Untracker wrapperContained; public Untracker(net.minecraft.client.util.Untracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.invoke.MethodHandle ALLOCATOR_UNTRACK() { return wrapperContained.ALLOCATOR_UNTRACK; }
public void untrack(org.lwjgl.system.Pointer pointer) { wrapperContained.untrack(pointer); }
public void untrack(long address) { wrapperContained.untrack(address); }

}