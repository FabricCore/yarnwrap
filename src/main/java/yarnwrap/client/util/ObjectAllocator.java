package yarnwrap.client.util;
public class ObjectAllocator { public net.minecraft.client.util.ObjectAllocator wrapperContained; public ObjectAllocator(net.minecraft.client.util.ObjectAllocator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.ObjectAllocator TRIVIAL() { return new yarnwrap.client.util.ObjectAllocator(wrapperContained.TRIVIAL); }
// public void TRIVIAL(yarnwrap.client.util.ObjectAllocator value) { wrapperContained.TRIVIAL = value.wrapperContained; }
public static yarnwrap.client.util.ObjectAllocator TRIVIAL() { return new yarnwrap.client.util.ObjectAllocator(net.minecraft.client.util.ObjectAllocator.TRIVIAL); }
// public static void TRIVIAL(yarnwrap.client.util.ObjectAllocator value, ) { net.minecraft.client.util.ObjectAllocator.TRIVIAL = value.wrapperContained; }

public java.lang.Object acquire(yarnwrap.client.util.ClosableFactory factory) { return wrapperContained.acquire(factory.wrapperContained); }
// public static java.lang.Object acquire(yarnwrap.client.util.ClosableFactory factory, ) { return net.minecraft.client.util.ObjectAllocator.acquire(factory.wrapperContained); }
public void release(yarnwrap.client.util.ClosableFactory factory,java.lang.Object value) { wrapperContained.release(factory.wrapperContained,value); }
// public static void release(yarnwrap.client.util.ClosableFactory factory,java.lang.Object value, ) { net.minecraft.client.util.ObjectAllocator.release(factory.wrapperContained,value); }

}