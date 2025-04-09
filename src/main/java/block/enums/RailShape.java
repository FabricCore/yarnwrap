package yarnwrap.block.enums;
public class RailShape { public net.minecraft.block.enums.RailShape wrapperContained; public RailShape(net.minecraft.block.enums.RailShape wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
public boolean isAscending() { return wrapperContained.isAscending(); }
public java.lang.String getName() { return wrapperContained.getName(); }

}