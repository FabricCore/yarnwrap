package yarnwrap.world.border;
public class WorldBorderStage { public net.minecraft.world.border.WorldBorderStage wrapperContained; public WorldBorderStage(net.minecraft.world.border.WorldBorderStage wrapperContained) { this.wrapperContained = wrapperContained; }

// public int color() { return wrapperContained.color; }
public int getColor() { return wrapperContained.getColor(); }

}