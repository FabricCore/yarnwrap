package yarnwrap.client.render.debug;
public class GoalSelectorDebugRenderer { public net.minecraft.client.render.debug.GoalSelectorDebugRenderer wrapperContained; public GoalSelectorDebugRenderer(net.minecraft.client.render.debug.GoalSelectorDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap goalSelectors() { return wrapperContained.goalSelectors; }
// public void goalSelectors(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.goalSelectors = value; }
// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
public GoalSelectorDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.GoalSelectorDebugRenderer(client.wrapperContained); }
public void setGoalSelectorList(int index,yarnwrap.util.math.BlockPos pos,java.util.List goals) { wrapperContained.setGoalSelectorList(index,pos.wrapperContained,goals); }
public void removeGoalSelectorList(int index) { wrapperContained.removeGoalSelectorList(index); }

}