package yarnwrap.datafixer.fix;
public class TooltipDisplayComponentFix { public net.minecraft.datafixer.fix.TooltipDisplayComponentFix wrapperContained; public TooltipDisplayComponentFix(net.minecraft.datafixer.fix.TooltipDisplayComponentFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List HIDE_ADDITIONAL_TOOLTIP_COMPONENTS() { return wrapperContained.HIDE_ADDITIONAL_TOOLTIP_COMPONENTS; }
// public void HIDE_ADDITIONAL_TOOLTIP_COMPONENTS(java.util.List value) { wrapperContained.HIDE_ADDITIONAL_TOOLTIP_COMPONENTS = value; }
// public static java.util.List HIDE_ADDITIONAL_TOOLTIP_COMPONENTS() { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.HIDE_ADDITIONAL_TOOLTIP_COMPONENTS; }
// public static void HIDE_ADDITIONAL_TOOLTIP_COMPONENTS(java.util.List value, ) { net.minecraft.datafixer.fix.TooltipDisplayComponentFix.HIDE_ADDITIONAL_TOOLTIP_COMPONENTS = value; }

public TooltipDisplayComponentFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.TooltipDisplayComponentFix(outputSchema); }
// public com.mojang.datafixers.Typed method_67104(com.mojang.datafixers.OpticFinder typed) { return wrapperContained.method_67104(typed); }
// public static com.mojang.datafixers.Typed method_67104(com.mojang.datafixers.OpticFinder typed, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.method_67104(typed); }
// public com.mojang.datafixers.Typed fix(com.mojang.datafixers.Typed typed,com.mojang.datafixers.OpticFinder canPlaceOnOpticFinder,com.mojang.datafixers.OpticFinder canBreakOpticFinder,com.mojang.datafixers.types.Type canPlaceOnType,com.mojang.datafixers.types.Type canBreakType) { return wrapperContained.fix(typed,canPlaceOnOpticFinder,canBreakOpticFinder,canPlaceOnType,canBreakType); }
// public static com.mojang.datafixers.Typed fix(com.mojang.datafixers.Typed typed,com.mojang.datafixers.OpticFinder canPlaceOnOpticFinder,com.mojang.datafixers.OpticFinder canBreakOpticFinder,com.mojang.datafixers.types.Type canPlaceOnType,com.mojang.datafixers.types.Type canBreakType, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.fix(typed,canPlaceOnOpticFinder,canBreakOpticFinder,canPlaceOnType,canBreakType); }
// public com.mojang.datafixers.Typed fixAdventureModePredicate(com.mojang.datafixers.Typed typed,com.mojang.datafixers.OpticFinder opticFinder,com.mojang.datafixers.types.Type type,java.lang.String id,java.util.Set toHide) { return wrapperContained.fixAdventureModePredicate(typed,opticFinder,type,id,toHide); }
// public static com.mojang.datafixers.Typed fixAdventureModePredicate(com.mojang.datafixers.Typed typed,com.mojang.datafixers.OpticFinder opticFinder,com.mojang.datafixers.types.Type type,java.lang.String id,java.util.Set toHide, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.fixAdventureModePredicate(typed,opticFinder,type,id,toHide); }
// public com.mojang.datafixers.Typed method_67107(com.mojang.datafixers.types.Type typedx) { return wrapperContained.method_67107(typedx); }
// public static com.mojang.datafixers.Typed method_67107(com.mojang.datafixers.types.Type typedx, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.method_67107(typedx); }
// public com.mojang.serialization.Dynamic fixAndInlineComponent(com.mojang.serialization.Dynamic dynamic,java.lang.String id,java.lang.String toInline,java.util.Set toHide) { return wrapperContained.fixAndInlineComponent(dynamic,id,toInline,toHide); }
// public static com.mojang.serialization.Dynamic fixAndInlineComponent(com.mojang.serialization.Dynamic dynamic,java.lang.String id,java.lang.String toInline,java.util.Set toHide, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.fixAndInlineComponent(dynamic,id,toInline,toHide); }
// public com.mojang.serialization.Dynamic fixComponent(com.mojang.serialization.Dynamic dynamic,java.lang.String id,java.util.Set toHide) { return wrapperContained.fixComponent(dynamic,id,toHide); }
// public static com.mojang.serialization.Dynamic fixComponent(com.mojang.serialization.Dynamic dynamic,java.lang.String id,java.util.Set toHide, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.fixComponent(dynamic,id,toHide); }
// public com.mojang.serialization.Dynamic fixComponent(com.mojang.serialization.Dynamic dynamic,java.lang.String id,java.util.Set toHide,java.util.function.UnaryOperator fixer) { return wrapperContained.fixComponent(dynamic,id,toHide,fixer); }
// public static com.mojang.serialization.Dynamic fixComponent(com.mojang.serialization.Dynamic dynamic,java.lang.String id,java.util.Set toHide,java.util.function.UnaryOperator fixer, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.fixComponent(dynamic,id,toHide,fixer); }
// public com.mojang.serialization.Dynamic method_67111(java.lang.String dynamicx) { return wrapperContained.method_67111(dynamicx); }
// public static com.mojang.serialization.Dynamic method_67111(java.lang.String dynamicx, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.method_67111(dynamicx); }
// public com.mojang.serialization.Dynamic method_67112(java.util.Set dynamic) { return wrapperContained.method_67112(dynamic); }
// public static com.mojang.serialization.Dynamic method_67112(java.util.Set dynamic, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.method_67112(dynamic); }
// public com.mojang.serialization.Dynamic method_67113(java.util.Set dynamic) { return wrapperContained.method_67113(dynamic); }
// public static com.mojang.serialization.Dynamic method_67113(java.util.Set dynamic, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.method_67113(dynamic); }
// public com.mojang.serialization.Dynamic method_67114(java.util.Set dynamicx) { return wrapperContained.method_67114(dynamicx); }
// public static com.mojang.serialization.Dynamic method_67114(java.util.Set dynamicx, ) { return net.minecraft.datafixer.fix.TooltipDisplayComponentFix.method_67114(dynamicx); }

}