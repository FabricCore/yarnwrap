package yarnwrap.screen;
public class ScreenHandlerContext { public net.minecraft.screen.ScreenHandlerContext wrapperContained; public ScreenHandlerContext(net.minecraft.screen.ScreenHandlerContext wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.screen.ScreenHandlerContext EMPTY() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.EMPTY); }
// public yarnwrap.screen.ScreenHandlerContext create(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.create(world.wrapperContained,pos.wrapperContained)); }
public void run(java.util.function.BiConsumer function) { wrapperContained.run(function); }
public java.util.Optional get(java.util.function.BiFunction getter) { return wrapperContained.get(getter); }
public java.lang.Object get(java.util.function.BiFunction getter,java.lang.Object defaultValue) { return wrapperContained.get(getter,defaultValue); }

}