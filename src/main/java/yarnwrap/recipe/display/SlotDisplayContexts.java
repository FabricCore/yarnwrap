package yarnwrap.recipe.display;
public class SlotDisplayContexts { public net.minecraft.recipe.display.SlotDisplayContexts wrapperContained; public SlotDisplayContexts(net.minecraft.recipe.display.SlotDisplayContexts wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.context.ContextParameter FUEL_REGISTRY() { return new yarnwrap.util.context.ContextParameter(wrapperContained.FUEL_REGISTRY); }
// public void FUEL_REGISTRY(yarnwrap.util.context.ContextParameter value) { wrapperContained.FUEL_REGISTRY = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter FUEL_REGISTRY() { return new yarnwrap.util.context.ContextParameter(net.minecraft.recipe.display.SlotDisplayContexts.FUEL_REGISTRY); }
// public static void FUEL_REGISTRY(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.recipe.display.SlotDisplayContexts.FUEL_REGISTRY = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter REGISTRIES() { return new yarnwrap.util.context.ContextParameter(wrapperContained.REGISTRIES); }
// public void REGISTRIES(yarnwrap.util.context.ContextParameter value) { wrapperContained.REGISTRIES = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter REGISTRIES() { return new yarnwrap.util.context.ContextParameter(net.minecraft.recipe.display.SlotDisplayContexts.REGISTRIES); }
// public static void REGISTRIES(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.recipe.display.SlotDisplayContexts.REGISTRIES = value.wrapperContained; }

// public yarnwrap.util.context.ContextType CONTEXT_TYPE() { return new yarnwrap.util.context.ContextType(wrapperContained.CONTEXT_TYPE); }
// public void CONTEXT_TYPE(yarnwrap.util.context.ContextType value) { wrapperContained.CONTEXT_TYPE = value.wrapperContained; }
public static yarnwrap.util.context.ContextType CONTEXT_TYPE() { return new yarnwrap.util.context.ContextType(net.minecraft.recipe.display.SlotDisplayContexts.CONTEXT_TYPE); }
// public static void CONTEXT_TYPE(yarnwrap.util.context.ContextType value, ) { net.minecraft.recipe.display.SlotDisplayContexts.CONTEXT_TYPE = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameterMap createParameters(yarnwrap.world.World world) { return new yarnwrap.util.context.ContextParameterMap(wrapperContained.createParameters(world.wrapperContained)); }
// public static yarnwrap.util.context.ContextParameterMap createParameters(yarnwrap.world.World world, ) { return new yarnwrap.util.context.ContextParameterMap(net.minecraft.recipe.display.SlotDisplayContexts.createParameters(world.wrapperContained)); }

}