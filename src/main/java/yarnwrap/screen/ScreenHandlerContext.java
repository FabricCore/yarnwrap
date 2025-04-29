package yarnwrap.screen;
public class ScreenHandlerContext { public net.minecraft.screen.ScreenHandlerContext wrapperContained; public ScreenHandlerContext(net.minecraft.screen.ScreenHandlerContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.ScreenHandlerContext EMPTY() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.screen.ScreenHandlerContext EMPTY() { return new yarnwrap.screen.ScreenHandlerContext(net.minecraft.screen.ScreenHandlerContext.EMPTY); }
// public static void EMPTY(yarnwrap.screen.ScreenHandlerContext value, ) { net.minecraft.screen.ScreenHandlerContext.EMPTY = value.wrapperContained; }

// public yarnwrap.screen.ScreenHandlerContext create(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.create(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.screen.ScreenHandlerContext create(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.screen.ScreenHandlerContext(net.minecraft.screen.ScreenHandlerContext.create(world.wrapperContained,pos.wrapperContained)); }
public void run(java.util.function.BiConsumer function) { wrapperContained.run(function); }
// public static void run(java.util.function.BiConsumer function, ) { net.minecraft.screen.ScreenHandlerContext.run(function); }
// public java.util.Optional method_17394(java.util.function.BiConsumer world,yarnwrap.world.World pos) { return wrapperContained.method_17394(world,pos.wrapperContained); }
// public static java.util.Optional method_17394(java.util.function.BiConsumer world,yarnwrap.world.World pos, ) { return net.minecraft.screen.ScreenHandlerContext.method_17394(world,pos.wrapperContained); }
public java.util.Optional get(java.util.function.BiFunction getter) { return wrapperContained.get(getter); }
// public static java.util.Optional get(java.util.function.BiFunction getter, ) { return net.minecraft.screen.ScreenHandlerContext.get(getter); }
// public java.lang.Object get(java.util.function.BiFunction getter,java.lang.Object defaultValue) { return wrapperContained.get(getter,defaultValue); }
// public static java.lang.Object get(java.util.function.BiFunction getter,java.lang.Object defaultValue, ) { return net.minecraft.screen.ScreenHandlerContext.get(getter,defaultValue); }

}