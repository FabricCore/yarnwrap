package yarnwrap.entity.ai.goal;
public class FormCaravanGoal { public net.minecraft.entity.ai.goal.FormCaravanGoal wrapperContained; public FormCaravanGoal(net.minecraft.entity.ai.goal.FormCaravanGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_CARAVAN_LENGTH() { return wrapperContained.MAX_CARAVAN_LENGTH; }
// public double speed() { return wrapperContained.speed; }
public yarnwrap.entity.passive.LlamaEntity llama() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.llama); }
// public int counter() { return wrapperContained.counter; }
// public boolean canFollow(yarnwrap.entity.passive.LlamaEntity llama,int length) { return wrapperContained.canFollow(llama.wrapperContained,length); }

}