package yarnwrap.entity.boss.dragon.phase;
public class AbstractPhase { public net.minecraft.entity.boss.dragon.phase.AbstractPhase wrapperContained; public AbstractPhase(net.minecraft.entity.boss.dragon.phase.AbstractPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.boss.dragon.EnderDragonEntity dragon() { return new yarnwrap.entity.boss.dragon.EnderDragonEntity(wrapperContained.dragon); }
// public void dragon(yarnwrap.entity.boss.dragon.EnderDragonEntity value) { wrapperContained.dragon = value.wrapperContained; }

}