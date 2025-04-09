package yarnwrap.world.dimension;
public class YLevels { public net.minecraft.world.dimension.YLevels wrapperContained; public YLevels(net.minecraft.world.dimension.YLevels wrapperContained) { this.wrapperContained = wrapperContained; }

public int OVERWORLD_MIN_Y() { return wrapperContained.OVERWORLD_MIN_Y; }
public int OVERWORLD_HEIGHT() { return wrapperContained.OVERWORLD_HEIGHT; }
public int OVERWORLD_GENERATION_HEIGHT() { return wrapperContained.OVERWORLD_GENERATION_HEIGHT; }
public int OVERWORLD_LOGICAL_HEIGHT() { return wrapperContained.OVERWORLD_LOGICAL_HEIGHT; }
public int NETHER_MIN_Y() { return wrapperContained.NETHER_MIN_Y; }
public int NETHER_HEIGHT() { return wrapperContained.NETHER_HEIGHT; }
public int NETHER_GENERATION_HEIGHT() { return wrapperContained.NETHER_GENERATION_HEIGHT; }
public int NETHER_LOGICAL_HEIGHT() { return wrapperContained.NETHER_LOGICAL_HEIGHT; }
public int END_MIN_Y() { return wrapperContained.END_MIN_Y; }
public int END_HEIGHT() { return wrapperContained.END_HEIGHT; }
public int END_GENERATION_HEIGHT() { return wrapperContained.END_GENERATION_HEIGHT; }
public int END_LOGICAL_HEIGHT() { return wrapperContained.END_LOGICAL_HEIGHT; }

}