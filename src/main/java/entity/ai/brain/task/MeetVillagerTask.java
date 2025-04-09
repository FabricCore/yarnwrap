package yarnwrap.entity.ai.brain.task;
public class MeetVillagerTask { public net.minecraft.entity.ai.brain.task.MeetVillagerTask wrapperContained; public MeetVillagerTask(net.minecraft.entity.ai.brain.task.MeetVillagerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public float WALK_SPEED() { return wrapperContained.WALK_SPEED; }
public yarnwrap.entity.ai.brain.task.SingleTickTask create() { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create()); }

}