package yarnwrap.util.dynamic;
public class NullOps { public net.minecraft.util.dynamic.NullOps wrapperContained; public NullOps(net.minecraft.util.dynamic.NullOps wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.dynamic.NullOps INSTANCE() { return new yarnwrap.util.dynamic.NullOps(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.dynamic.NullOps value) { wrapperContained.INSTANCE = value.wrapperContained; }

}