package yarnwrap.client.realms.gui.screen;
public class RealmsLongRunningTickableTaskScreen { public net.minecraft.client.realms.gui.screen.RealmsLongRunningTickableTaskScreen wrapperContained; public RealmsLongRunningTickableTaskScreen(net.minecraft.client.realms.gui.screen.RealmsLongRunningTickableTaskScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.task.LongRunningTask tickableTask() { return new yarnwrap.client.realms.task.LongRunningTask(wrapperContained.tickableTask); }
// public void tickableTask(yarnwrap.client.realms.task.LongRunningTask value) { wrapperContained.tickableTask = value.wrapperContained; }
public RealmsLongRunningTickableTaskScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.realms.task.LongRunningTask tickableTask) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsLongRunningTickableTaskScreen(parent.wrapperContained,tickableTask.wrapperContained); }

}