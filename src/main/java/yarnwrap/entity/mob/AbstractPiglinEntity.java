package yarnwrap.entity.mob;
public class AbstractPiglinEntity { public net.minecraft.entity.mob.AbstractPiglinEntity wrapperContained; public AbstractPiglinEntity(net.minecraft.entity.mob.AbstractPiglinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData IMMUNE_TO_ZOMBIFICATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.IMMUNE_TO_ZOMBIFICATION); }
// public void IMMUNE_TO_ZOMBIFICATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.IMMUNE_TO_ZOMBIFICATION = value.wrapperContained; }
// public int timeInOverworld() { return wrapperContained.timeInOverworld; }
// public void timeInOverworld(int value) { wrapperContained.timeInOverworld = value; }
// public int TIME_TO_ZOMBIFY() { return wrapperContained.TIME_TO_ZOMBIFY; }
// public void TIME_TO_ZOMBIFY(int value) { wrapperContained.TIME_TO_ZOMBIFY = value; }
// public void zombify(yarnwrap.server.world.ServerWorld world) { wrapperContained.zombify(world.wrapperContained); }
public yarnwrap.entity.mob.PiglinActivity getActivity() { return new yarnwrap.entity.mob.PiglinActivity(wrapperContained.getActivity()); }
// public boolean canHunt() { return wrapperContained.canHunt(); }
// public boolean isImmuneToZombification() { return wrapperContained.isImmuneToZombification(); }
public boolean shouldZombify() { return wrapperContained.shouldZombify(); }
public boolean isAdult() { return wrapperContained.isAdult(); }
// public boolean isHoldingTool() { return wrapperContained.isHoldingTool(); }
// public void playZombificationSound() { wrapperContained.playZombificationSound(); }
// public void setCanPathThroughDoors() { wrapperContained.setCanPathThroughDoors(); }
public void setImmuneToZombification(boolean immuneToZombification) { wrapperContained.setImmuneToZombification(immuneToZombification); }

}