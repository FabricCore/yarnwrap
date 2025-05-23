package yarnwrap.client.world;
public class DataCache { public net.minecraft.client.world.DataCache wrapperContained; public DataCache(net.minecraft.client.world.DataCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function dataFunction() { return wrapperContained.dataFunction; }
// public void dataFunction(java.util.function.Function value) { wrapperContained.dataFunction = value; }
// public static java.util.function.Function dataFunction() { return net.minecraft.client.world.DataCache.dataFunction; }
// public static void dataFunction(java.util.function.Function value, ) { net.minecraft.client.world.DataCache.dataFunction = value; }

// public Object context() { return wrapperContained.context; }
// // public void context(Object value) { wrapperContained.context = value; }
// // public static Object context() { return net.minecraft.client.world.DataCache.context; }
// // public static void context(Object value, ) { net.minecraft.client.world.DataCache.context = value; }

// public java.lang.Object data() { return wrapperContained.data; }
// public void data(java.lang.Object value) { wrapperContained.data = value; }
// // public static java.lang.Object data() { return net.minecraft.client.world.DataCache.data; }
// public static void data(java.lang.Object value, ) { net.minecraft.client.world.DataCache.data = value; }

public DataCache(java.util.function.Function dataFunction) { this.wrapperContained = new net.minecraft.client.world.DataCache(dataFunction); }
public void clean() { wrapperContained.clean(); }
// public static void clean() { net.minecraft.client.world.DataCache.clean(); }
// public java.lang.Object compute(Object context) { return wrapperContained.compute(context); }
// public static java.lang.Object compute(Object context, ) { return net.minecraft.client.world.DataCache.compute(context); }

}