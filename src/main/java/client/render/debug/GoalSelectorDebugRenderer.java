package yarnwrap.client.render.debug;
public class GoalSelectorDebugRenderer { public net.minecraft.client.render.debug.GoalSelectorDebugRenderer wrapperContained; public GoalSelectorDebugRenderer(net.minecraft.client.render.debug.GoalSelectorDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap goalSelectors() { return wrapperContained.goalSelectors; }
// public int RANGE() { return wrapperContained.RANGE; }
public void setGoalSelectorList(int index,yarnwrap.util.math.BlockPos pos,java.util.List goals) { wrapperContained.setGoalSelectorList(index,pos.wrapperContained,goals); }
public void removeGoalSelectorList(int index) { wrapperContained.removeGoalSelectorList(index); }

}