package yarnwrap.world.timer;
public class FunctionTagTimerCallback { public net.minecraft.world.timer.FunctionTagTimerCallback wrapperContained; public FunctionTagTimerCallback(net.minecraft.world.timer.FunctionTagTimerCallback wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public void name(yarnwrap.util.Identifier value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(net.minecraft.world.timer.FunctionTagTimerCallback.name); }
// public static void name(yarnwrap.util.Identifier value, ) { net.minecraft.world.timer.FunctionTagTimerCallback.name = value.wrapperContained; }

public FunctionTagTimerCallback(yarnwrap.util.Identifier name) { this.wrapperContained = new net.minecraft.world.timer.FunctionTagTimerCallback(name.wrapperContained); }

}