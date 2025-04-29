package yarnwrap.entity.ai.pathing;
public class BirdNavigation { public net.minecraft.entity.ai.pathing.BirdNavigation wrapperContained; public BirdNavigation(net.minecraft.entity.ai.pathing.BirdNavigation wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canEnterOpenDoors() { return wrapperContained.canEnterOpenDoors(); }
// public static boolean canEnterOpenDoors() { return net.minecraft.entity.ai.pathing.BirdNavigation.canEnterOpenDoors(); }
public void setCanEnterOpenDoors(boolean canEnterOpenDoors) { wrapperContained.setCanEnterOpenDoors(canEnterOpenDoors); }
// public static void setCanEnterOpenDoors(boolean canEnterOpenDoors, ) { net.minecraft.entity.ai.pathing.BirdNavigation.setCanEnterOpenDoors(canEnterOpenDoors); }
public void setCanPathThroughDoors(boolean canPathThroughDoors) { wrapperContained.setCanPathThroughDoors(canPathThroughDoors); }
// public static void setCanPathThroughDoors(boolean canPathThroughDoors, ) { net.minecraft.entity.ai.pathing.BirdNavigation.setCanPathThroughDoors(canPathThroughDoors); }

}