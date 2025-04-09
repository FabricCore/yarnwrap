package yarnwrap.entity.ai.pathing;
public class PathNodeType { public net.minecraft.entity.ai.pathing.PathNodeType wrapperContained; public PathNodeType(net.minecraft.entity.ai.pathing.PathNodeType wrapperContained) { this.wrapperContained = wrapperContained; }

// public float defaultPenalty() { return wrapperContained.defaultPenalty; }
public float getDefaultPenalty() { return wrapperContained.getDefaultPenalty(); }

}