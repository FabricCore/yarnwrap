package yarnwrap.entity.mob;
public class AbstractPiglinEntity { public net.minecraft.entity.mob.AbstractPiglinEntity wrapperContained; public AbstractPiglinEntity(net.minecraft.entity.mob.AbstractPiglinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData IMMUNE_TO_ZOMBIFICATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.IMMUNE_TO_ZOMBIFICATION); }
// public void IMMUNE_TO_ZOMBIFICATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.IMMUNE_TO_ZOMBIFICATION = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData IMMUNE_TO_ZOMBIFICATION() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.AbstractPiglinEntity.IMMUNE_TO_ZOMBIFICATION); }
// public static void IMMUNE_TO_ZOMBIFICATION(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.AbstractPiglinEntity.IMMUNE_TO_ZOMBIFICATION = value.wrapperContained; }

// public int timeInOverworld() { return wrapperContained.timeInOverworld; }
// public void timeInOverworld(int value) { wrapperContained.timeInOverworld = value; }
// public static int timeInOverworld() { return net.minecraft.entity.mob.AbstractPiglinEntity.timeInOverworld; }
// public static void timeInOverworld(int value, ) { net.minecraft.entity.mob.AbstractPiglinEntity.timeInOverworld = value; }

// public int TIME_TO_ZOMBIFY() { return wrapperContained.TIME_TO_ZOMBIFY; }
// public void TIME_TO_ZOMBIFY(int value) { wrapperContained.TIME_TO_ZOMBIFY = value; }
public static int TIME_TO_ZOMBIFY() { return net.minecraft.entity.mob.AbstractPiglinEntity.TIME_TO_ZOMBIFY; }
// public static void TIME_TO_ZOMBIFY(int value, ) { net.minecraft.entity.mob.AbstractPiglinEntity.TIME_TO_ZOMBIFY = value; }

// public boolean DEFAULT_IS_IMMUNE_TO_ZOMBIFICATION() { return wrapperContained.DEFAULT_IS_IMMUNE_TO_ZOMBIFICATION; }
// public void DEFAULT_IS_IMMUNE_TO_ZOMBIFICATION(boolean value) { wrapperContained.DEFAULT_IS_IMMUNE_TO_ZOMBIFICATION = value; }
// public static boolean DEFAULT_IS_IMMUNE_TO_ZOMBIFICATION() { return net.minecraft.entity.mob.AbstractPiglinEntity.DEFAULT_IS_IMMUNE_TO_ZOMBIFICATION; }
// public static void DEFAULT_IS_IMMUNE_TO_ZOMBIFICATION(boolean value, ) { net.minecraft.entity.mob.AbstractPiglinEntity.DEFAULT_IS_IMMUNE_TO_ZOMBIFICATION = value; }

// public int DEFAULT_TIME_IN_OVERWORLD() { return wrapperContained.DEFAULT_TIME_IN_OVERWORLD; }
// public void DEFAULT_TIME_IN_OVERWORLD(int value) { wrapperContained.DEFAULT_TIME_IN_OVERWORLD = value; }
// public static int DEFAULT_TIME_IN_OVERWORLD() { return net.minecraft.entity.mob.AbstractPiglinEntity.DEFAULT_TIME_IN_OVERWORLD; }
// public static void DEFAULT_TIME_IN_OVERWORLD(int value, ) { net.minecraft.entity.mob.AbstractPiglinEntity.DEFAULT_TIME_IN_OVERWORLD = value; }

// public void zombify(yarnwrap.server.world.ServerWorld world) { wrapperContained.zombify(world.wrapperContained); }
// public static void zombify(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.mob.AbstractPiglinEntity.zombify(world.wrapperContained); }
public yarnwrap.entity.mob.PiglinActivity getActivity() { return new yarnwrap.entity.mob.PiglinActivity(wrapperContained.getActivity()); }
// public static yarnwrap.entity.mob.PiglinActivity getActivity() { return new yarnwrap.entity.mob.PiglinActivity(net.minecraft.entity.mob.AbstractPiglinEntity.getActivity()); }
// public boolean canHunt() { return wrapperContained.canHunt(); }
// public static boolean canHunt() { return net.minecraft.entity.mob.AbstractPiglinEntity.canHunt(); }
// public boolean isImmuneToZombification() { return wrapperContained.isImmuneToZombification(); }
// public static boolean isImmuneToZombification() { return net.minecraft.entity.mob.AbstractPiglinEntity.isImmuneToZombification(); }
public boolean shouldZombify() { return wrapperContained.shouldZombify(); }
// public static boolean shouldZombify() { return net.minecraft.entity.mob.AbstractPiglinEntity.shouldZombify(); }
public boolean isAdult() { return wrapperContained.isAdult(); }
// public static boolean isAdult() { return net.minecraft.entity.mob.AbstractPiglinEntity.isAdult(); }
// public boolean isHoldingTool() { return wrapperContained.isHoldingTool(); }
// public static boolean isHoldingTool() { return net.minecraft.entity.mob.AbstractPiglinEntity.isHoldingTool(); }
// public void playZombificationSound() { wrapperContained.playZombificationSound(); }
// public static void playZombificationSound() { net.minecraft.entity.mob.AbstractPiglinEntity.playZombificationSound(); }
// public void setCanPathThroughDoors() { wrapperContained.setCanPathThroughDoors(); }
// public static void setCanPathThroughDoors() { net.minecraft.entity.mob.AbstractPiglinEntity.setCanPathThroughDoors(); }
public void setImmuneToZombification(boolean immuneToZombification) { wrapperContained.setImmuneToZombification(immuneToZombification); }
// public static void setImmuneToZombification(boolean immuneToZombification, ) { net.minecraft.entity.mob.AbstractPiglinEntity.setImmuneToZombification(immuneToZombification); }
// public void method_63663(yarnwrap.entity.mob.ZombifiedPiglinEntity zombifiedPiglin) { wrapperContained.method_63663(zombifiedPiglin.wrapperContained); }
// public static void method_63663(yarnwrap.entity.mob.ZombifiedPiglinEntity zombifiedPiglin, ) { net.minecraft.entity.mob.AbstractPiglinEntity.method_63663(zombifiedPiglin.wrapperContained); }
public void setTimeInOverworld(int timeInOverworld) { wrapperContained.setTimeInOverworld(timeInOverworld); }
// public static void setTimeInOverworld(int timeInOverworld, ) { net.minecraft.entity.mob.AbstractPiglinEntity.setTimeInOverworld(timeInOverworld); }

}