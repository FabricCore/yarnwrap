package yarnwrap.entity.ai.pathing;
public class BirdNavigation { public net.minecraft.entity.ai.pathing.BirdNavigation wrapperContained; public BirdNavigation(net.minecraft.entity.ai.pathing.BirdNavigation wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canEnterOpenDoors() { return wrapperContained.canEnterOpenDoors(); }
public void setCanEnterOpenDoors(boolean canEnterOpenDoors) { wrapperContained.setCanEnterOpenDoors(canEnterOpenDoors); }
public void setCanPathThroughDoors(boolean canPathThroughDoors) { wrapperContained.setCanPathThroughDoors(canPathThroughDoors); }

}