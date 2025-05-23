package yarnwrap.entity.ai.pathing;
public class MobNavigation { public net.minecraft.entity.ai.pathing.MobNavigation wrapperContained; public MobNavigation(net.minecraft.entity.ai.pathing.MobNavigation wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean avoidSunlight() { return wrapperContained.avoidSunlight; }
// public void avoidSunlight(boolean value) { wrapperContained.avoidSunlight = value; }
// public static boolean avoidSunlight() { return net.minecraft.entity.ai.pathing.MobNavigation.avoidSunlight; }
// public static void avoidSunlight(boolean value, ) { net.minecraft.entity.ai.pathing.MobNavigation.avoidSunlight = value; }

public void setAvoidSunlight(boolean avoidSunlight) { wrapperContained.setAvoidSunlight(avoidSunlight); }
// public static void setAvoidSunlight(boolean avoidSunlight, ) { net.minecraft.entity.ai.pathing.MobNavigation.setAvoidSunlight(avoidSunlight); }
// public int getPathfindingY() { return wrapperContained.getPathfindingY(); }
// public static int getPathfindingY() { return net.minecraft.entity.ai.pathing.MobNavigation.getPathfindingY(); }
// public boolean canWalkOnPath(yarnwrap.entity.ai.pathing.PathNodeType pathType) { return wrapperContained.canWalkOnPath(pathType.wrapperContained); }
// public static boolean canWalkOnPath(yarnwrap.entity.ai.pathing.PathNodeType pathType, ) { return net.minecraft.entity.ai.pathing.MobNavigation.canWalkOnPath(pathType.wrapperContained); }
public void setCanWalkOverFences(boolean canWalkOverFences) { wrapperContained.setCanWalkOverFences(canWalkOverFences); }
// public static void setCanWalkOverFences(boolean canWalkOverFences, ) { net.minecraft.entity.ai.pathing.MobNavigation.setCanWalkOverFences(canWalkOverFences); }

}