package yarnwrap.entity.boss.dragon.phase;
public class AbstractPhase { public net.minecraft.entity.boss.dragon.phase.AbstractPhase wrapperContained; public AbstractPhase(net.minecraft.entity.boss.dragon.phase.AbstractPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.boss.dragon.EnderDragonEntity dragon() { return new yarnwrap.entity.boss.dragon.EnderDragonEntity(wrapperContained.dragon); }
// public void dragon(yarnwrap.entity.boss.dragon.EnderDragonEntity value) { wrapperContained.dragon = value.wrapperContained; }
// public static yarnwrap.entity.boss.dragon.EnderDragonEntity dragon() { return new yarnwrap.entity.boss.dragon.EnderDragonEntity(net.minecraft.entity.boss.dragon.phase.AbstractPhase.dragon); }
// public static void dragon(yarnwrap.entity.boss.dragon.EnderDragonEntity value, ) { net.minecraft.entity.boss.dragon.phase.AbstractPhase.dragon = value.wrapperContained; }

// public AbstractPhase(yarnwrap.entity.boss.dragon.EnderDragonEntity dragon) { this.wrapperContained = new net.minecraft.entity.boss.dragon.phase.AbstractPhase(dragon.wrapperContained); }

}