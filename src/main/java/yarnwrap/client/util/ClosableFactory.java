package yarnwrap.client.util;
public class ClosableFactory { public net.minecraft.client.util.ClosableFactory wrapperContained; public ClosableFactory(net.minecraft.client.util.ClosableFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public void close(java.lang.Object value) { wrapperContained.close(value); }
// public static void close(java.lang.Object value, ) { net.minecraft.client.util.ClosableFactory.close(value); }
public java.lang.Object create() { return wrapperContained.create(); }
// public static java.lang.Object create() { return net.minecraft.client.util.ClosableFactory.create(); }
public boolean equals(yarnwrap.client.util.ClosableFactory factory) { return wrapperContained.equals(factory.wrapperContained); }
// public static boolean equals(yarnwrap.client.util.ClosableFactory factory, ) { return net.minecraft.client.util.ClosableFactory.equals(factory.wrapperContained); }
public void prepare(java.lang.Object value) { wrapperContained.prepare(value); }
// public static void prepare(java.lang.Object value, ) { net.minecraft.client.util.ClosableFactory.prepare(value); }

}