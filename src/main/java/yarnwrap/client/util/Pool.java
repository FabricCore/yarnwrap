package yarnwrap.client.util;
public class Pool { public net.minecraft.client.util.Pool wrapperContained; public Pool(net.minecraft.client.util.Pool wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lifespan() { return wrapperContained.lifespan; }
// public void lifespan(int value) { wrapperContained.lifespan = value; }
// public static int lifespan() { return net.minecraft.client.util.Pool.lifespan; }
// public static void lifespan(int value, ) { net.minecraft.client.util.Pool.lifespan = value; }

// public java.util.Deque entries() { return wrapperContained.entries; }
// public void entries(java.util.Deque value) { wrapperContained.entries = value; }
// public static java.util.Deque entries() { return net.minecraft.client.util.Pool.entries; }
// public static void entries(java.util.Deque value, ) { net.minecraft.client.util.Pool.entries = value; }

public Pool(int lifespan) { this.wrapperContained = new net.minecraft.client.util.Pool(lifespan); }
public void decrementLifespan() { wrapperContained.decrementLifespan(); }
// public static void decrementLifespan() { net.minecraft.client.util.Pool.decrementLifespan(); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.util.Pool.clear(); }
// public java.util.Collection getEntries() { return wrapperContained.getEntries(); }
// public static java.util.Collection getEntries() { return net.minecraft.client.util.Pool.getEntries(); }
// public java.lang.Object acquireUnprepared(yarnwrap.client.util.ClosableFactory factory) { return wrapperContained.acquireUnprepared(factory.wrapperContained); }
// public static java.lang.Object acquireUnprepared(yarnwrap.client.util.ClosableFactory factory, ) { return net.minecraft.client.util.Pool.acquireUnprepared(factory.wrapperContained); }

}