package yarnwrap.client.render.debug;
public class GoalSelectorDebugRenderer { public net.minecraft.client.render.debug.GoalSelectorDebugRenderer wrapperContained; public GoalSelectorDebugRenderer(net.minecraft.client.render.debug.GoalSelectorDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.GoalSelectorDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.GoalSelectorDebugRenderer.client = value.wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap goalSelectors() { return wrapperContained.goalSelectors; }
// public void goalSelectors(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.goalSelectors = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap goalSelectors() { return net.minecraft.client.render.debug.GoalSelectorDebugRenderer.goalSelectors; }
// public static void goalSelectors(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.client.render.debug.GoalSelectorDebugRenderer.goalSelectors = value; }

// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
// public static int RANGE() { return net.minecraft.client.render.debug.GoalSelectorDebugRenderer.RANGE; }
// public static void RANGE(int value, ) { net.minecraft.client.render.debug.GoalSelectorDebugRenderer.RANGE = value; }

public GoalSelectorDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.GoalSelectorDebugRenderer(client.wrapperContained); }
public void setGoalSelectorList(int index,yarnwrap.util.math.BlockPos pos,java.util.List goals) { wrapperContained.setGoalSelectorList(index,pos.wrapperContained,goals); }
// public static void setGoalSelectorList(int index,yarnwrap.util.math.BlockPos pos,java.util.List goals, ) { net.minecraft.client.render.debug.GoalSelectorDebugRenderer.setGoalSelectorList(index,pos.wrapperContained,goals); }
public void removeGoalSelectorList(int index) { wrapperContained.removeGoalSelectorList(index); }
// public static void removeGoalSelectorList(int index, ) { net.minecraft.client.render.debug.GoalSelectorDebugRenderer.removeGoalSelectorList(index); }

}