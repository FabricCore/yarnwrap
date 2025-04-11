package yarnwrap.block.enums;
public class Orientation { public net.minecraft.block.enums.Orientation wrapperContained; public Orientation(net.minecraft.block.enums.Orientation wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap BY_INDEX() { return wrapperContained.BY_INDEX; }
// public void BY_INDEX(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.BY_INDEX = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public yarnwrap.util.math.Direction rotation() { return new yarnwrap.util.math.Direction(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.math.Direction value) { wrapperContained.rotation = value.wrapperContained; }
// public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
// public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
public yarnwrap.block.enums.Orientation byDirections(yarnwrap.util.math.Direction facing,yarnwrap.util.math.Direction rotation) { return new yarnwrap.block.enums.Orientation(wrapperContained.byDirections(facing.wrapperContained,rotation.wrapperContained)); }
public yarnwrap.util.math.Direction getFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getFacing()); }
// public int getIndex(yarnwrap.util.math.Direction facing,yarnwrap.util.math.Direction rotation) { return wrapperContained.getIndex(facing.wrapperContained,rotation.wrapperContained); }
public yarnwrap.util.math.Direction getRotation() { return new yarnwrap.util.math.Direction(wrapperContained.getRotation()); }

}