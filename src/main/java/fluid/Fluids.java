package yarnwrap.fluid;
public class Fluids { public net.minecraft.fluid.Fluids wrapperContained; public Fluids(net.minecraft.fluid.Fluids wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.fluid.FlowableFluid FLOWING_LAVA() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.FLOWING_LAVA); }
public yarnwrap.fluid.FlowableFluid LAVA() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.LAVA); }
public yarnwrap.fluid.FlowableFluid FLOWING_WATER() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.FLOWING_WATER); }
public yarnwrap.fluid.FlowableFluid WATER() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.WATER); }
// public yarnwrap.fluid.Fluid register(java.lang.String id,yarnwrap.fluid.Fluid value) { return new yarnwrap.fluid.Fluid(wrapperContained.register(id,value.wrapperContained)); }

}