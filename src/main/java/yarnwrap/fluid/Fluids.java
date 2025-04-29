package yarnwrap.fluid;
public class Fluids { public net.minecraft.fluid.Fluids wrapperContained; public Fluids(net.minecraft.fluid.Fluids wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.fluid.FlowableFluid FLOWING_LAVA() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.FLOWING_LAVA); }
// public void FLOWING_LAVA(yarnwrap.fluid.FlowableFluid value) { wrapperContained.FLOWING_LAVA = value.wrapperContained; }
public static yarnwrap.fluid.FlowableFluid FLOWING_LAVA() { return new yarnwrap.fluid.FlowableFluid(net.minecraft.fluid.Fluids.FLOWING_LAVA); }
// public static void FLOWING_LAVA(yarnwrap.fluid.FlowableFluid value, ) { net.minecraft.fluid.Fluids.FLOWING_LAVA = value.wrapperContained; }

// public yarnwrap.fluid.FlowableFluid LAVA() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.LAVA); }
// public void LAVA(yarnwrap.fluid.FlowableFluid value) { wrapperContained.LAVA = value.wrapperContained; }
public static yarnwrap.fluid.FlowableFluid LAVA() { return new yarnwrap.fluid.FlowableFluid(net.minecraft.fluid.Fluids.LAVA); }
// public static void LAVA(yarnwrap.fluid.FlowableFluid value, ) { net.minecraft.fluid.Fluids.LAVA = value.wrapperContained; }

// public yarnwrap.fluid.FlowableFluid FLOWING_WATER() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.FLOWING_WATER); }
// public void FLOWING_WATER(yarnwrap.fluid.FlowableFluid value) { wrapperContained.FLOWING_WATER = value.wrapperContained; }
public static yarnwrap.fluid.FlowableFluid FLOWING_WATER() { return new yarnwrap.fluid.FlowableFluid(net.minecraft.fluid.Fluids.FLOWING_WATER); }
// public static void FLOWING_WATER(yarnwrap.fluid.FlowableFluid value, ) { net.minecraft.fluid.Fluids.FLOWING_WATER = value.wrapperContained; }

// public yarnwrap.fluid.FlowableFluid WATER() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.WATER); }
// public void WATER(yarnwrap.fluid.FlowableFluid value) { wrapperContained.WATER = value.wrapperContained; }
public static yarnwrap.fluid.FlowableFluid WATER() { return new yarnwrap.fluid.FlowableFluid(net.minecraft.fluid.Fluids.WATER); }
// public static void WATER(yarnwrap.fluid.FlowableFluid value, ) { net.minecraft.fluid.Fluids.WATER = value.wrapperContained; }

// public yarnwrap.fluid.Fluid register(java.lang.String id,yarnwrap.fluid.Fluid value) { return new yarnwrap.fluid.Fluid(wrapperContained.register(id,value.wrapperContained)); }
// public static yarnwrap.fluid.Fluid register(java.lang.String id,yarnwrap.fluid.Fluid value, ) { return new yarnwrap.fluid.Fluid(net.minecraft.fluid.Fluids.register(id,value.wrapperContained)); }

}