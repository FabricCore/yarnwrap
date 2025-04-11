package yarnwrap.entity.ai.goal;
public class FormCaravanGoal { public net.minecraft.entity.ai.goal.FormCaravanGoal wrapperContained; public FormCaravanGoal(net.minecraft.entity.ai.goal.FormCaravanGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_CARAVAN_LENGTH() { return wrapperContained.MAX_CARAVAN_LENGTH; }
// public void MAX_CARAVAN_LENGTH(int value) { wrapperContained.MAX_CARAVAN_LENGTH = value; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
public yarnwrap.entity.passive.LlamaEntity llama() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.llama); }
// public void llama(yarnwrap.entity.passive.LlamaEntity value) { wrapperContained.llama = value.wrapperContained; }
// public int counter() { return wrapperContained.counter; }
// public void counter(int value) { wrapperContained.counter = value; }
public FormCaravanGoal(yarnwrap.entity.passive.LlamaEntity llama,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.FormCaravanGoal(llama.wrapperContained,speed); }
// public boolean method_19616(yarnwrap.entity.Entity entity) { return wrapperContained.method_19616(entity.wrapperContained); }
// public boolean canFollow(yarnwrap.entity.passive.LlamaEntity llama,int length) { return wrapperContained.canFollow(llama.wrapperContained,length); }

}