package yarnwrap.world.border;
public class WorldBorderStage { public net.minecraft.world.border.WorldBorderStage wrapperContained; public WorldBorderStage(net.minecraft.world.border.WorldBorderStage wrapperContained) { this.wrapperContained = wrapperContained; }

// public int color() { return wrapperContained.color; }
// public void color(int value) { wrapperContained.color = value; }
// // public WorldBorderStage(java.lang.String color) { this.wrapperContained = new net.minecraft.world.border.WorldBorderStage(color); }
public int getColor() { return wrapperContained.getColor(); }

}