package yarnwrap.client.util;
public class Handle { public net.minecraft.client.util.Handle wrapperContained; public Handle(net.minecraft.client.util.Handle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.Handle EMPTY() { return new yarnwrap.client.util.Handle(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.util.Handle value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.util.Handle EMPTY() { return new yarnwrap.client.util.Handle(net.minecraft.client.util.Handle.EMPTY); }
// public static void EMPTY(yarnwrap.client.util.Handle value, ) { net.minecraft.client.util.Handle.EMPTY = value.wrapperContained; }

// public yarnwrap.client.util.Handle empty() { return new yarnwrap.client.util.Handle(wrapperContained.empty()); }
public static yarnwrap.client.util.Handle empty() { return new yarnwrap.client.util.Handle(net.minecraft.client.util.Handle.empty()); }

}