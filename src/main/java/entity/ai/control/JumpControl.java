package yarnwrap.entity.ai.control;
public class JumpControl { public net.minecraft.entity.ai.control.JumpControl wrapperContained; public JumpControl(net.minecraft.entity.ai.control.JumpControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean active() { return wrapperContained.active; }
// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
public void setActive() { wrapperContained.setActive(); }
public void tick() { wrapperContained.tick(); }

}