package yarnwrap.entity.ai.brain.task;
public class PlayDeadTimerTask { public net.minecraft.entity.ai.brain.task.PlayDeadTimerTask wrapperContained; public PlayDeadTimerTask(net.minecraft.entity.ai.brain.task.PlayDeadTimerTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}