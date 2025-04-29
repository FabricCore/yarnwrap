package yarnwrap.entity.ai.control;
public class JumpControl { public net.minecraft.entity.ai.control.JumpControl wrapperContained; public JumpControl(net.minecraft.entity.ai.control.JumpControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
// public static boolean active() { return net.minecraft.entity.ai.control.JumpControl.active; }
// public static void active(boolean value, ) { net.minecraft.entity.ai.control.JumpControl.active = value; }

// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.control.JumpControl.entity); }
// public static void entity(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.control.JumpControl.entity = value.wrapperContained; }

public JumpControl(yarnwrap.entity.mob.MobEntity entity) { this.wrapperContained = new net.minecraft.entity.ai.control.JumpControl(entity.wrapperContained); }
public void setActive() { wrapperContained.setActive(); }
// public static void setActive() { net.minecraft.entity.ai.control.JumpControl.setActive(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.ai.control.JumpControl.tick(); }

}