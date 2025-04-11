package yarnwrap.block.entity;
public class Hopper { public net.minecraft.block.entity.Hopper wrapperContained; public Hopper(net.minecraft.block.entity.Hopper wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Box INPUT_AREA_SHAPE() { return new yarnwrap.util.math.Box(wrapperContained.INPUT_AREA_SHAPE); }
// public void INPUT_AREA_SHAPE(yarnwrap.util.math.Box value) { wrapperContained.INPUT_AREA_SHAPE = value.wrapperContained; }
public yarnwrap.util.math.Box getInputAreaShape() { return new yarnwrap.util.math.Box(wrapperContained.getInputAreaShape()); }
public double getHopperY() { return wrapperContained.getHopperY(); }
public double getHopperZ() { return wrapperContained.getHopperZ(); }
public double getHopperX() { return wrapperContained.getHopperX(); }
public boolean canBlockFromAbove() { return wrapperContained.canBlockFromAbove(); }

}