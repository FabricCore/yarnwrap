package yarnwrap.resource;
public class SinglePreparationResourceReloader { public net.minecraft.resource.SinglePreparationResourceReloader wrapperContained; public SinglePreparationResourceReloader(net.minecraft.resource.SinglePreparationResourceReloader wrapperContained) { this.wrapperContained = wrapperContained; }

// public void apply(java.lang.Object prepared,yarnwrap.resource.ResourceManager manager,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.apply(prepared,manager.wrapperContained,profiler.wrapperContained); }
// public static void apply(java.lang.Object prepared,yarnwrap.resource.ResourceManager manager,yarnwrap.util.profiler.Profiler profiler, ) { net.minecraft.resource.SinglePreparationResourceReloader.apply(prepared,manager.wrapperContained,profiler.wrapperContained); }
// public java.lang.Object prepare(yarnwrap.resource.ResourceManager manager,yarnwrap.util.profiler.Profiler profiler) { return wrapperContained.prepare(manager.wrapperContained,profiler.wrapperContained); }
// public static java.lang.Object prepare(yarnwrap.resource.ResourceManager manager,yarnwrap.util.profiler.Profiler profiler, ) { return net.minecraft.resource.SinglePreparationResourceReloader.prepare(manager.wrapperContained,profiler.wrapperContained); }
// public void method_18790(yarnwrap.resource.ResourceManager prepared) { wrapperContained.method_18790(prepared.wrapperContained); }
// public static void method_18790(yarnwrap.resource.ResourceManager prepared, ) { net.minecraft.resource.SinglePreparationResourceReloader.method_18790(prepared.wrapperContained); }

}