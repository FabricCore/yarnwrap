package yarnwrap.entity.ai.control;
public class JumpControl { public net.minecraft.entity.ai.control.JumpControl wrapperContained; public JumpControl(net.minecraft.entity.ai.control.JumpControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
public JumpControl(yarnwrap.entity.mob.MobEntity entity) { this.wrapperContained = new net.minecraft.entity.ai.control.JumpControl(entity.wrapperContained); }
public void setActive() { wrapperContained.setActive(); }
public void tick() { wrapperContained.tick(); }

}