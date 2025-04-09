package yarnwrap.entity.ai.pathing;
public class MobNavigation { public net.minecraft.entity.ai.pathing.MobNavigation wrapperContained; public MobNavigation(net.minecraft.entity.ai.pathing.MobNavigation wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean avoidSunlight() { return wrapperContained.avoidSunlight; }
// public boolean canWalkOnPath(yarnwrap.entity.ai.pathing.PathNodeType pathType) { return wrapperContained.canWalkOnPath(pathType.wrapperContained); }
public void setCanEnterOpenDoors(boolean canEnterOpenDoors) { wrapperContained.setCanEnterOpenDoors(canEnterOpenDoors); }
public void setCanWalkOverFences(boolean canWalkOverFences) { wrapperContained.setCanWalkOverFences(canWalkOverFences); }
public void setAvoidSunlight(boolean avoidSunlight) { wrapperContained.setAvoidSunlight(avoidSunlight); }
// public int getPathfindingY() { return wrapperContained.getPathfindingY(); }
public void setCanPathThroughDoors(boolean canPathThroughDoors) { wrapperContained.setCanPathThroughDoors(canPathThroughDoors); }
public boolean canEnterOpenDoors() { return wrapperContained.canEnterOpenDoors(); }

}