package yarnwrap.entity.ai.brain.task;
public class SniffTask { public net.minecraft.entity.ai.brain.task.SniffTask wrapperContained; public SniffTask(net.minecraft.entity.ai.brain.task.SniffTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public double HORIZONTAL_RADIUS() { return wrapperContained.HORIZONTAL_RADIUS; }
// public void HORIZONTAL_RADIUS(double value) { wrapperContained.HORIZONTAL_RADIUS = value; }
// public double VERTICAL_RADIUS() { return wrapperContained.VERTICAL_RADIUS; }
// public void VERTICAL_RADIUS(double value) { wrapperContained.VERTICAL_RADIUS = value; }
public SniffTask(int runTime) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.SniffTask(runTime); }
// public void method_42159(yarnwrap.entity.mob.WardenEntity target) { wrapperContained.method_42159(target.wrapperContained); }

}