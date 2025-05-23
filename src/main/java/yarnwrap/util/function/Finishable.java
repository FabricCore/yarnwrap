package yarnwrap.util.function;
public class Finishable { public net.minecraft.util.function.Finishable wrapperContained; public Finishable(net.minecraft.util.function.Finishable wrapperContained) { this.wrapperContained = wrapperContained; }

public void finish(boolean success) { wrapperContained.finish(success); }
// public static void finish(boolean success, ) { net.minecraft.util.function.Finishable.finish(success); }

}