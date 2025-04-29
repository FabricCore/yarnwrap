package yarnwrap.entity.ai.pathing;
public class AmphibiousPathNodeMaker { public net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker wrapperContained; public AmphibiousPathNodeMaker(net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean penalizeDeepWater() { return wrapperContained.penalizeDeepWater; }
// public void penalizeDeepWater(boolean value) { wrapperContained.penalizeDeepWater = value; }
// public static boolean penalizeDeepWater() { return net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker.penalizeDeepWater; }
// public static void penalizeDeepWater(boolean value, ) { net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker.penalizeDeepWater = value; }

// public float oldWaterBorderPenalty() { return wrapperContained.oldWaterBorderPenalty; }
// public void oldWaterBorderPenalty(float value) { wrapperContained.oldWaterBorderPenalty = value; }
// public static float oldWaterBorderPenalty() { return net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker.oldWaterBorderPenalty; }
// public static void oldWaterBorderPenalty(float value, ) { net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker.oldWaterBorderPenalty = value; }

// public float oldWalkablePenalty() { return wrapperContained.oldWalkablePenalty; }
// public void oldWalkablePenalty(float value) { wrapperContained.oldWalkablePenalty = value; }
// public static float oldWalkablePenalty() { return net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker.oldWalkablePenalty; }
// public static void oldWalkablePenalty(float value, ) { net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker.oldWalkablePenalty = value; }

public AmphibiousPathNodeMaker(boolean penalizeDeepWater) { this.wrapperContained = new net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker(penalizeDeepWater); }
// public boolean isValidAquaticAdjacentSuccessor(yarnwrap.entity.ai.pathing.PathNode node,yarnwrap.entity.ai.pathing.PathNode successor) { return wrapperContained.isValidAquaticAdjacentSuccessor(node.wrapperContained,successor.wrapperContained); }
// public static boolean isValidAquaticAdjacentSuccessor(yarnwrap.entity.ai.pathing.PathNode node,yarnwrap.entity.ai.pathing.PathNode successor, ) { return net.minecraft.entity.ai.pathing.AmphibiousPathNodeMaker.isValidAquaticAdjacentSuccessor(node.wrapperContained,successor.wrapperContained); }

}