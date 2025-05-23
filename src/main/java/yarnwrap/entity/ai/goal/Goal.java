package yarnwrap.entity.ai.goal;
public class Goal { public net.minecraft.entity.ai.goal.Goal wrapperContained; public Goal(net.minecraft.entity.ai.goal.Goal wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.EnumSet controls() { return wrapperContained.controls; }
// public void controls(java.util.EnumSet value) { wrapperContained.controls = value; }
// public static java.util.EnumSet controls() { return net.minecraft.entity.ai.goal.Goal.controls; }
// public static void controls(java.util.EnumSet value, ) { net.minecraft.entity.ai.goal.Goal.controls = value; }

public boolean canStart() { return wrapperContained.canStart(); }
// public static boolean canStart() { return net.minecraft.entity.ai.goal.Goal.canStart(); }
public void setControls(java.util.EnumSet controls) { wrapperContained.setControls(controls); }
// public static void setControls(java.util.EnumSet controls, ) { net.minecraft.entity.ai.goal.Goal.setControls(controls); }
public boolean shouldContinue() { return wrapperContained.shouldContinue(); }
// public static boolean shouldContinue() { return net.minecraft.entity.ai.goal.Goal.shouldContinue(); }
public boolean canStop() { return wrapperContained.canStop(); }
// public static boolean canStop() { return net.minecraft.entity.ai.goal.Goal.canStop(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.ai.goal.Goal.tick(); }
public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.entity.ai.goal.Goal.start(); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.entity.ai.goal.Goal.stop(); }
public java.util.EnumSet getControls() { return wrapperContained.getControls(); }
// public static java.util.EnumSet getControls() { return net.minecraft.entity.ai.goal.Goal.getControls(); }
public boolean shouldRunEveryTick() { return wrapperContained.shouldRunEveryTick(); }
// public static boolean shouldRunEveryTick() { return net.minecraft.entity.ai.goal.Goal.shouldRunEveryTick(); }
// public int getTickCount(int ticks) { return wrapperContained.getTickCount(ticks); }
// public static int getTickCount(int ticks, ) { return net.minecraft.entity.ai.goal.Goal.getTickCount(ticks); }
// public int toGoalTicks(int serverTicks) { return wrapperContained.toGoalTicks(serverTicks); }
// public static int toGoalTicks(int serverTicks, ) { return net.minecraft.entity.ai.goal.Goal.toGoalTicks(serverTicks); }
// public yarnwrap.server.world.ServerWorld getServerWorld(yarnwrap.entity.Entity entity) { return new yarnwrap.server.world.ServerWorld(wrapperContained.getServerWorld(entity.wrapperContained)); }
// public static yarnwrap.server.world.ServerWorld getServerWorld(yarnwrap.entity.Entity entity, ) { return new yarnwrap.server.world.ServerWorld(net.minecraft.entity.ai.goal.Goal.getServerWorld(entity.wrapperContained)); }
// public yarnwrap.server.world.ServerWorld castToServerWorld(yarnwrap.world.World world) { return new yarnwrap.server.world.ServerWorld(wrapperContained.castToServerWorld(world.wrapperContained)); }
// public static yarnwrap.server.world.ServerWorld castToServerWorld(yarnwrap.world.World world, ) { return new yarnwrap.server.world.ServerWorld(net.minecraft.entity.ai.goal.Goal.castToServerWorld(world.wrapperContained)); }

}