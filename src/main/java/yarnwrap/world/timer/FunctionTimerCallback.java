package yarnwrap.world.timer;
public class FunctionTimerCallback { public net.minecraft.world.timer.FunctionTimerCallback wrapperContained; public FunctionTimerCallback(net.minecraft.world.timer.FunctionTimerCallback wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public void name(yarnwrap.util.Identifier value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(net.minecraft.world.timer.FunctionTimerCallback.name); }
// public static void name(yarnwrap.util.Identifier value, ) { net.minecraft.world.timer.FunctionTimerCallback.name = value.wrapperContained; }

public FunctionTimerCallback(yarnwrap.util.Identifier name) { this.wrapperContained = new net.minecraft.world.timer.FunctionTimerCallback(name.wrapperContained); }
// public void method_17938(yarnwrap.server.function.CommandFunctionManager function) { wrapperContained.method_17938(function.wrapperContained); }
// public static void method_17938(yarnwrap.server.function.CommandFunctionManager function, ) { net.minecraft.world.timer.FunctionTimerCallback.method_17938(function.wrapperContained); }

}