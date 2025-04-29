package yarnwrap.client.render.entity.model;
public class AbstractZombieModel { public net.minecraft.client.render.entity.model.AbstractZombieModel wrapperContained; public AbstractZombieModel(net.minecraft.client.render.entity.model.AbstractZombieModel wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isAttacking(yarnwrap.entity.mob.HostileEntity entity) { return wrapperContained.isAttacking(entity.wrapperContained); }
// public static boolean isAttacking(yarnwrap.entity.mob.HostileEntity entity, ) { return net.minecraft.client.render.entity.model.AbstractZombieModel.isAttacking(entity.wrapperContained); }

}